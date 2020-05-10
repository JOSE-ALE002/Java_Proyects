/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassVO;

public class FacturaVo {
    private Integer id_factura;
    private String fechaFactura;
    private Integer id_vendedor;
    private Integer id_cliente;
    private Integer id_articulo;
    private String pago;
    private Double total;
    private String Resultado;

    public Integer getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(Integer id_articulo) {
        this.id_articulo = id_articulo;
    }
    

    public String getResultado() {
        return Resultado;
    }

    public void setResultado(String Resultado) {
        this.Resultado = Resultado;
    }

    public Integer getId_factura() {
        return id_factura;
    }

    public void setId_factura(Integer id_factura) {
        this.id_factura = id_factura;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Integer getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(Integer id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    
}
