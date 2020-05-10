/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import ClassVO.ClienteVo;
import Connection.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {
    
    public static String registrarCliente(ClienteVo c1) {
        String result = null, last = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "INSERT INTO Cliente values(null,?,?,?,?,?,?,?)";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, c1.getNombre());
            pst.setString(2, c1.getDomicilio());
            pst.setString(3, c1.getTelefono());
            pst.setString(4, c1.getFechaNacimiento());
            pst.setString(5, c1.getCorreo());
            pst.setInt(6, c1.getPostal());
            pst.setString(7, c1.getGenero());
            pst.execute();
            pst = cn.prepareStatement("SELECT MAX(id_cliente) AS id FROM Cliente");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                last = rs.getString(1);
            }
            result = "Cliente registrado con exito, ID:" + last;
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

    public static String actualizarCliente(ClienteVo c1) {
        String result = null, last = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "UPDATE Cliente SET Nombre=?, Domicilio=?, Telefono=?, FechaNacimiento=?, Correo=?, Postal = ?, Genero = ? WHERE id_cliente=?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, c1.getNombre());
            pst.setString(2, c1.getDomicilio());
            pst.setString(3, c1.getTelefono());
            pst.setString(4, c1.getFechaNacimiento());
            pst.setString(5, c1.getCorreo());
            pst.setInt(6, c1.getPostal());
            pst.setString(7, c1.getGenero());
            pst.setInt(8, c1.getId_cliente());
            pst.execute();

            result = "Cliente actualizado con exito, ID:" + c1.getId_cliente();
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
    
    public static ClienteVo buscarCliente(String clave) {
        ClienteVo c1 = new ClienteVo();
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "SELECT * FROM Cliente WHERE Nombre = ?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, clave);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                c1.setId_cliente(Integer.parseInt(rs.getString(1)));
                c1.setNombre(rs.getString(2));
                c1.setDomicilio(rs.getString(3));
                c1.setTelefono(rs.getString(4));
                c1.setFechaNacimiento(rs.getString(5));
                c1.setCorreo(rs.getString(6));
                c1.setPostal(rs.getInt(7));
                c1.setGenero(rs.getString(8));
                c1.setResultado("Busqueda exitosa");
            }else{
                c1.setResultado("No encontrado");
            }
            
        } catch (SQLException e) {
            c1.setResultado("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                c1.setResultado("Error: " + e);
            }
        }
        return c1;
    }

    public static String eliminarCliente(String clave) {
        String result = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "DELETE FROM Cliente WHERE Nombre = ?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, clave);
            pst.executeUpdate();
            result = "Cliente eliminado con exito";
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

    public static ArrayList<ClienteVo> getListClientes() {
        ArrayList<ClienteVo> arrProv = new ArrayList<ClienteVo>();
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        ClienteVo c1 = null;
        String sql = "SELECT * FROM Cliente";
        try {
            pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                c1 = new ClienteVo();
                c1.setId_cliente(rs.getInt(1));
                c1.setNombre(rs.getString(2));
                c1.setDomicilio(rs.getString(3));
                c1.setTelefono(rs.getString(4));
                c1.setFechaNacimiento(rs.getString(5));
                c1.setCorreo(rs.getString(6));
                c1.setPostal(rs.getInt(7));
                c1.setGenero(rs.getString(8));
                if (arrProv.isEmpty()) {
                    arrProv.add(0, c1);
                } else {
                    arrProv.add(c1);
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
