package ClassDAO;

import ClassVO.ArticuloVo;
import Connection.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author joseibanez
 */
public class ArticuloDAO {
    public static String registrarArticulo(ArticuloVo a1) {
        String result = null, last = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "INSERT INTO Articulo values(null,?,?,?,?)";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, a1.getNombre());
            pst.setString(2, a1.getDescripcion());
            pst.setDouble(3, a1.getPrecioUnitario());
            pst.setInt(4, a1.getCantidad());
            pst.execute();
            pst = cn.prepareStatement("SELECT MAX(id_articulo) AS id FROM Articulo");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                last = rs.getString(1);
            }
            result = "Articulo registrado con exito, ID:" + last;
        } catch (SQLException e) {
            result = "Error en la consulta: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                result = "Error: " + e;
            }
        }
        return result;
    }

    public static String actualizarArticulo(ArticuloVo a1) {
        String result = null, last = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "UPDATE Articulo SET Nombre_Art=?, Descripcion_Articulo=?, Precio_Unitario_Articulo= ?, Cantidad = ? WHERE id_articulo=?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, a1.getNombre());
            pst.setString(2, a1.getDescripcion());
            pst.setDouble(3, a1.getPrecioUnitario());
            pst.setInt(4, a1.getCantidad());
            pst.setInt(5, a1.getId_articulo());
            pst.execute();

            result = "Articulo actualizado con exito, ID:" + a1.getId_articulo();
        } catch (SQLException e) {
            result = "Error en la consulta: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                result = "Error: " + e;
            }
        }
        return result;
    }
    
    public static ArticuloVo buscarArticulo(String clave) {
        ArticuloVo a1 = new ArticuloVo();
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "SELECT * FROM Articulo WHERE Nombre_Art = ?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, clave);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                a1.setId_articulo(rs.getInt(1));
                a1.setNombre(rs.getString(2));
                a1.setDescripcion(rs.getString(3));
                a1.setPrecioUnitario(rs.getDouble(4));
                a1.setCantidad(rs.getInt(5));
                a1.setResultado("Busqueda exitosa");
            }else{
                a1.setResultado("No encontrado");
            }
            
        } catch (SQLException e) {
            a1.setResultado("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                a1.setResultado("Error: " + e);
            }
        }
        return a1;
    }

    public static String eliminarArticulo(String clave) {
        String result = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "DELETE FROM Articulo WHERE Nombre_Art = ?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, clave);
            pst.executeUpdate();
            result = "Articulo eliminado con exito";
        } catch (SQLException e) {
            result = "Error en la consulta: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                result = "Error: " + e;
            }
        }
        return result;
    }

    public static ArrayList<ArticuloVo> getListArticulo() {
        ArrayList<ArticuloVo> arrProv = new ArrayList<ArticuloVo>();
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        ArticuloVo a1 = null;
        String sql = "SELECT * FROM Articulo";
        try {
            pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                a1 = new ArticuloVo();
                a1.setId_articulo(rs.getInt(1));
                a1.setNombre(rs.getString(2));
                a1.setDescripcion(rs.getString(3));
                a1.setPrecioUnitario(rs.getDouble(4));
                a1.setCantidad(rs.getInt(5));
                if (arrProv.isEmpty()) {
                    arrProv.add(0, a1);
                } else {
                    arrProv.add(a1);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        return arrProv;
    }
}
