/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import ClassVO.FacturaVo;
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
public class FacturaDAO {
    public static String registrarFactura(FacturaVo f1) {
        String result = null, last = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "INSERT INTO Factura VALUES(null,?,?,?,?,?,?)";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setString(1, f1.getFechaFactura());
                pst.setInt(2, f1.getId_vendedor());
                pst.setInt(3, f1.getId_cliente());
                pst.setInt(4, f1.getId_articulo());
                pst.setString(5, f1.getPago());
                pst.setDouble(6, f1.getTotal());
                pst.executeUpdate();
                pst = cn.prepareStatement("SELECT MAX(id_factura) AS id FROM Factura");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    last = rs.getString(1);
                }
                result = "Factura registrada con exito, ID: " + last;
            }
        } catch (SQLException e) {
            result = "Error durante el registro: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                result = "Error " + e;
            }
        }
        return result;
    }

    public static String actualizarFactura(FacturaVo f1) {
        String result = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "UPDATE Factura SET Fecha_Factura=?, id_vendedor=?,id_cliente=?, id_articulo=? ,Condicion_Pago=?, Importe_Neto_Factura=? WHERE id_factura=?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setString(1, f1.getFechaFactura());
                pst.setInt(2, f1.getId_vendedor());
                pst.setInt(3, f1.getId_cliente());
                pst.setInt(4, f1.getId_articulo());
                pst.setString(5, f1.getPago());
                pst.setDouble(6, f1.getTotal());
                pst.setInt(7, f1.getId_factura());
                pst.executeUpdate();
                result = "Factura Actualizada con exito, ID: " + f1.getId_factura();
            }
        } catch (SQLException e) {
            result = "Error durante el registro: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                result = "Error " + e;
            }
        }
        return result;
    }

    public static FacturaVo buscarFactura(String clave) {
        FacturaVo f1 = new FacturaVo();
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "SELECT * FROM Factura WHERE id_factura = ?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(clave));
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    f1.setId_factura(Integer.parseInt(rs.getString(1)));
                    f1.setFechaFactura(rs.getString(2));
                    f1.setId_vendedor(rs.getInt(3));
                    f1.setId_cliente(rs.getInt(4));
                    f1.setId_articulo(rs.getInt(5));
                    f1.setPago(rs.getString(6));
                    f1.setTotal(Double.parseDouble(rs.getString(7)));
                    f1.setResultado("Busqueda exitosa");
                }else{
                    f1.setResultado("No encontrado");
                }
                
            }
        } catch (SQLException e) {
            f1.setResultado("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                f1.setResultado("Error " + e);
            }
        }
        return f1;
    }
    
    public static String eliminarFactura(String clave) {
        String result = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "DELETE FROM Factura WHERE id_factura = ?";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(clave));
                pst.executeUpdate();
                result = "Factura eliminada con exito";
            }
        } catch (SQLException e) {
            result = "Error en la consulta: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                result = "Error " + e;
            }
        }
        return result;
    }
    
    public static ArrayList<FacturaVo> getListFactura(){
        ArrayList<FacturaVo> arrDiscos = new ArrayList<FacturaVo>();
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        FacturaVo f1 = null;
        String sql = "SELECT * FROM Factura";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while(rs.next()) {
                    f1 = new FacturaVo();
                    f1.setId_factura(Integer.parseInt(rs.getString(1)));
                    f1.setFechaFactura(rs.getString(2));
                    f1.setId_vendedor(rs.getInt(3));
                    f1.setId_cliente(rs.getInt(4));
                    f1.setId_articulo(rs.getInt(4));
                    f1.setPago(rs.getString(6));
                    f1.setTotal(rs.getDouble(7));
                    arrDiscos.add(f1);
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
                System.out.println("Error " + e);
            }
        }
        return arrDiscos;
    }
}
