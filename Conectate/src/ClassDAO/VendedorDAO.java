/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import ClassVO.VendedorVo;
import Connection.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VendedorDAO {
    public static String registrarVendedor(VendedorVo v1) {
        String result = null, last = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "INSERT INTO Vendedor values(null,?)";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, v1.getNombre());
            pst.execute();
            pst = cn.prepareStatement("SELECT MAX(id_vendedor) AS id FROM Vendedor");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                last = rs.getString(1);
            }
            result = "Vendedor registrado con exito, ID:" + last;
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

    public static String actualizarVendedor(VendedorVo v1) {
        String result = null, last = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "UPDATE Vendedor SET Nombre_Vendedor=? WHERE id_vendedor=?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, v1.getNombre());
            pst.setString(2, Integer.toString(v1.getId_vendedor()));
            pst.execute();

            result = "Vendedor actualizado con exito, ID:" + v1.getId_vendedor();
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
    
    public static VendedorVo buscarVendedor(String clave) {
        VendedorVo v1 = new VendedorVo();
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "SELECT * FROM Vendedor WHERE Nombre_Vendedor = ?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, clave);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                v1.setId_vendedor(Integer.parseInt(rs.getString(1)));
                v1.setNombre(rs.getString(2));
                v1.setResultado("Busqueda exitosa");
            }else{
                v1.setResultado("No encontrado");
            }
            
        } catch (SQLException e) {
            v1.setResultado("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                v1.setResultado("Error: " + e);
            }
        }
        return v1;
    }

    public static String eliminarVendedor(String clave) {
        String result = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "DELETE FROM Vendedor WHERE Nombre_Vendedor = ?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, clave);
            pst.executeUpdate();
            result = "Vendedor eliminado con exito";
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

    public static ArrayList<VendedorVo> getListVendedor() {
        ArrayList<VendedorVo> arrProv = new ArrayList<VendedorVo>();
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        VendedorVo v1 = null;
        String sql = "SELECT * FROM Vendedor";
        try {
            pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                v1 = new VendedorVo();
                v1.setId_vendedor(rs.getInt(1));
                v1.setNombre(rs.getString(2));
                if (arrProv.isEmpty()) {
                    arrProv.add(0, v1);
                } else {
                    arrProv.add(v1);
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
