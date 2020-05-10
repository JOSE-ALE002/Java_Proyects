package Conectate;

import ClassDAO.ArticuloDAO;
import ClassDAO.ClienteDAO;
import ClassDAO.FacturaDAO;
import ClassDAO.VendedorDAO;
import ClassVO.ArticuloVo;
import ClassVO.ClienteVo;
import ClassVO.FacturaVo;
import ClassVO.VendedorVo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame {
     
    private void limpiarCajas(){
         txtNombre.setText(null);
         txtDomicilio.setText(null);
         txtTelefono.setText(null);
         txtFN.setText(null);
         txtCorreo.setText(null);
         txtCP.setText(null);
         cbSeleccionarGenero.setSelectedIndex(0);   
    }
    
    private void limpiarCajasVendedor(){
         txtNombreVendedor.setText(null);
         textIdVendedor.setText(null);
    }
     
    private void limpiarCajasArt(){
         textIdArt.setText(null);
         txtNombreArt.setText(null);
         txtDescripcionArt.setText(null);
         txtPrecioUnitario.setText(null);
         txtCantidadV.setText(null);
    }
    
    private void limpiarCajasFactura(){
         textIdFactura.setText(null);
         txtFechaFactura.setText(null);
         List_Vendedores.setSelectedIndex(0);   
         List_Clientes.setSelectedIndex(0);   
         List_Articulos.setSelectedIndex(0);   
         List_Pago.setSelectedIndex(0);   
         txttotalFactura.setText(null);
    }
    
    public void cargarCliente(int busca){
        int index = 1;
        List_Clientes.removeAllItems();
        List_Clientes.addItem("Selecciona un Cliente");
        for(ClienteVo c1: ClienteDAO.getListClientes()){
            List_Clientes.addItem(c1);
            if(c1.getId_cliente() == busca){
                List_Clientes.setSelectedIndex(index);
            }
            index++;
        }
    }
    
    public void cargarVendedor(int busca){
        int index = 1;
        List_Vendedores.removeAllItems();
        List_Vendedores.addItem("Selecciona un Vendedor");
        for(VendedorVo v1: VendedorDAO.getListVendedor()){
            List_Vendedores.addItem(v1);
            if(v1.getId_vendedor() == busca){
                List_Vendedores.setSelectedIndex(index);
            }
            index++;
        }
    }
    
    
    public void cargarArticulo(int busca){
        int index = 1;
        List_Articulos.removeAllItems();
        List_Articulos.addItem("Selecciona un Articulo");
        for(ArticuloVo a1: ArticuloDAO.getListArticulo()){
            List_Articulos.addItem(a1);
            if(a1.getId_articulo() == busca){
                List_Articulos.setSelectedIndex(index);
            }
            index++;
        }
    }
    
    public NewJFrame() {
        initComponents();
        cargarCliente(0);
        cargarVendedor(0);
        cargarArticulo(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_clientes = new javax.swing.JTabbedPane();
        formularioClientes = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        EtiquetaTelefono = new javax.swing.JLabel();
        EtiquetaDomicilio = new javax.swing.JLabel();
        EtiquetaNombre = new javax.swing.JLabel();
        temaC = new javax.swing.JLabel();
        EtiFechaNacimiento = new javax.swing.JLabel();
        EtiquetaCorreo = new javax.swing.JLabel();
        EtiquetaCodigoP = new javax.swing.JLabel();
        EtiquetaGenero = new javax.swing.JLabel();
        bttGuardar = new javax.swing.JButton();
        bttModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtFN = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtCP = new javax.swing.JTextField();
        cbSeleccionarGenero = new javax.swing.JComboBox<>();
        bttLimpiar = new javax.swing.JButton();
        code = new javax.swing.JLabel();
        bttBuscar = new javax.swing.JButton();
        textId = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        MostrarTC = new javax.swing.JButton();
        menu_Vendedores = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        EtiquetaNombre1 = new javax.swing.JLabel();
        temaC1 = new javax.swing.JLabel();
        bttGuardarVendedor = new javax.swing.JButton();
        bttModificarVendedor = new javax.swing.JButton();
        btEliminarVendedor = new javax.swing.JButton();
        txtNombreVendedor = new javax.swing.JTextField();
        bttLimpiarVendedor = new javax.swing.JButton();
        bttBuscarVendedor = new javax.swing.JButton();
        textIdVendedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtStatusVendedor = new javax.swing.JTextField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaVendedores = new javax.swing.JTable();
        MostrarTV = new javax.swing.JButton();
        menu_Articulos = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        EtiquetaTelefono2 = new javax.swing.JLabel();
        EtiquetaDomicilio2 = new javax.swing.JLabel();
        EtiquetaNombre3 = new javax.swing.JLabel();
        temaC3 = new javax.swing.JLabel();
        bttGuardarArt = new javax.swing.JButton();
        bttModificarArt = new javax.swing.JButton();
        btEliminarArt = new javax.swing.JButton();
        txtNombreArt = new javax.swing.JTextField();
        txtDescripcionArt = new javax.swing.JTextField();
        txtPrecioUnitario = new javax.swing.JTextField();
        txtCantidadV = new javax.swing.JTextField();
        bttLimpiarArt = new javax.swing.JButton();
        bttBuscarArt = new javax.swing.JButton();
        textIdArt = new javax.swing.JTextField();
        txtStatusArt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaArticulos = new javax.swing.JTable();
        MostrarTA = new javax.swing.JButton();
        menu_Factura = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        EtiquetaTelefono1 = new javax.swing.JLabel();
        EtiquetaDomicilio1 = new javax.swing.JLabel();
        EtiquetaNombre2 = new javax.swing.JLabel();
        temaC2 = new javax.swing.JLabel();
        EtiFechaNacimiento1 = new javax.swing.JLabel();
        EtiquetaCorreo1 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        bttGuardarFactura = new javax.swing.JButton();
        bttModificarFactura = new javax.swing.JButton();
        btEliminarFactura = new javax.swing.JButton();
        txtFechaFactura = new javax.swing.JTextField();
        txttotalFactura = new javax.swing.JTextField();
        bttLimpiarFactura = new javax.swing.JButton();
        bttBuscarFactura = new javax.swing.JButton();
        textIdFactura = new javax.swing.JTextField();
        List_Articulos = new javax.swing.JComboBox();
        List_Vendedores = new javax.swing.JComboBox();
        List_Clientes = new javax.swing.JComboBox();
        EtiquetaCorreo2 = new javax.swing.JLabel();
        List_Pago = new javax.swing.JComboBox<>();
        txtStatusFactura = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaFacturas = new javax.swing.JTable();
        MostrarTF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(471, 487));

        EtiquetaTelefono.setText("Telefono:");

        EtiquetaDomicilio.setText("Domicilio:");

        EtiquetaNombre.setText("Nombre:");

        temaC.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        temaC.setText("Formulario Clientes");

        EtiFechaNacimiento.setText("FechaNacimiento:");

        EtiquetaCorreo.setText("Correo:");

        EtiquetaCodigoP.setText("Codigo Postal:");

        EtiquetaGenero.setText("Genero:");

        bttGuardar.setText("Guardar");
        bttGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttGuardarActionPerformed(evt);
            }
        });

        bttModificar.setText("Modificar");
        bttModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttModificarActionPerformed(evt);
            }
        });

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtFN.setText("Example: 2000-01-01");
        txtFN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFNKeyTyped(evt);
            }
        });

        txtCP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCPKeyTyped(evt);
            }
        });

        cbSeleccionarGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Masculino", "Femenino" }));
        cbSeleccionarGenero.setToolTipText("");

        bttLimpiar.setText("Limpiar");
        bttLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLimpiarActionPerformed(evt);
            }
        });

        code.setText("+");

        bttBuscar.setText("Buscar");
        bttBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttBuscarActionPerformed(evt);
            }
        });

        textId.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EtiquetaNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bttBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(temaC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EtiFechaNacimiento)
                                    .addComponent(EtiquetaTelefono)
                                    .addComponent(EtiquetaDomicilio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(txtFN)
                                    .addComponent(txtTelefono)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EtiquetaCorreo)
                                    .addComponent(EtiquetaGenero)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(EtiquetaCodigoP)
                                        .addGap(18, 18, 18)
                                        .addComponent(code)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbSeleccionarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCP, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                        .addComponent(txtCorreo)))))
                        .addGap(24, 24, 24)))
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bttGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(bttLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(bttModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btEliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temaC)
                    .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaNombre)
                    .addComponent(bttBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaDomicilio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaTelefono))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiFechaNacimiento))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaCorreo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(code)
                    .addComponent(EtiquetaCodigoP))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSeleccionarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaGenero))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttLimpiar)
                    .addComponent(bttGuardar)
                    .addComponent(bttModificar)
                    .addComponent(btEliminar))
                .addGap(18, 18, 18)
                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        formularioClientes.addTab("Registrate", jPanel1);

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tablaClientes);

        MostrarTC.setText("Cargar Registros");
        MostrarTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarTCActionPerformed(evt);
            }
        });

        jLayeredPane4.setLayer(jScrollPane7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(MostrarTC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(MostrarTC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MostrarTC)
                .addGap(0, 220, Short.MAX_VALUE))
        );

        formularioClientes.addTab("Mostrar Tabla Clientes", jLayeredPane4);

        menu_clientes.addTab("Cliente", formularioClientes);

        jPanel2.setPreferredSize(new java.awt.Dimension(471, 487));

        EtiquetaNombre1.setText("Nombre:");

        temaC1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        temaC1.setText("Formulario Vendedor");

        bttGuardarVendedor.setText("Guardar");
        bttGuardarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttGuardarVendedorActionPerformed(evt);
            }
        });

        bttModificarVendedor.setText("Modificar");
        bttModificarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttModificarVendedorActionPerformed(evt);
            }
        });

        btEliminarVendedor.setText("Eliminar");
        btEliminarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarVendedorActionPerformed(evt);
            }
        });

        txtNombreVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreVendedorKeyTyped(evt);
            }
        });

        bttLimpiarVendedor.setText("Limpiar");
        bttLimpiarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLimpiarVendedorActionPerformed(evt);
            }
        });

        bttBuscarVendedor.setText("Buscar");
        bttBuscarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttBuscarVendedorActionPerformed(evt);
            }
        });

        textIdVendedor.setEnabled(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/img21.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(bttGuardarVendedor)
                .addGap(18, 18, 18)
                .addComponent(bttLimpiarVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttModificarVendedor)
                .addGap(18, 18, 18)
                .addComponent(btEliminarVendedor)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(textIdVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(temaC1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStatusVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(EtiquetaNombre1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttBuscarVendedor)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(temaC1)
                    .addComponent(textIdVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaNombre1)
                    .addComponent(bttBuscarVendedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(txtStatusVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttGuardarVendedor)
                    .addComponent(bttLimpiarVendedor)
                    .addComponent(bttModificarVendedor)
                    .addComponent(btEliminarVendedor))
                .addGap(50, 50, 50))
        );

        menu_Vendedores.addTab("Registrate", jPanel2);

        tablaVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tablaVendedores);

        MostrarTV.setText("Cargar Registros");
        MostrarTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarTVActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(jScrollPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(MostrarTV, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(MostrarTV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MostrarTV)
                .addGap(0, 220, Short.MAX_VALUE))
        );

        menu_Vendedores.addTab("Mostrar Tabla Vendedores", jLayeredPane3);

        menu_clientes.addTab("Vendedor", menu_Vendedores);

        jPanel4.setPreferredSize(new java.awt.Dimension(471, 487));

        EtiquetaTelefono2.setText("PrecioUnitario:");

        EtiquetaDomicilio2.setText("Descripcion:");

        EtiquetaNombre3.setText("NombreArticulo:");

        temaC3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        temaC3.setText("Formulario Articulos");

        bttGuardarArt.setText("Guardar");
        bttGuardarArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttGuardarArtActionPerformed(evt);
            }
        });

        bttModificarArt.setText("Modificar");
        bttModificarArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttModificarArtActionPerformed(evt);
            }
        });

        btEliminarArt.setText("Eliminar");
        btEliminarArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarArtActionPerformed(evt);
            }
        });

        txtNombreArt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreArtKeyTyped(evt);
            }
        });

        txtPrecioUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioUnitarioKeyTyped(evt);
            }
        });

        txtCantidadV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadVKeyTyped(evt);
            }
        });

        bttLimpiarArt.setText("Limpiar");
        bttLimpiarArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLimpiarArtActionPerformed(evt);
            }
        });

        bttBuscarArt.setText("Buscar");
        bttBuscarArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttBuscarArtActionPerformed(evt);
            }
        });

        textIdArt.setEnabled(false);

        jLabel1.setText("Cantidad:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/img5.jpeg"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(EtiquetaTelefono2)
                            .addComponent(EtiquetaDomicilio2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtDescripcionArt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtPrecioUnitario)
                            .addComponent(txtCantidadV))
                        .addGap(98, 98, 98))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(EtiquetaNombre3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreArt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(bttBuscarArt)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStatusArt, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(bttGuardarArt)
                                .addGap(18, 18, 18)
                                .addComponent(bttLimpiarArt)
                                .addGap(18, 18, 18)
                                .addComponent(bttModificarArt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btEliminarArt))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(temaC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textIdArt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(temaC3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textIdArt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaNombre3)
                    .addComponent(txtNombreArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttBuscarArt))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaDomicilio2)
                    .addComponent(txtDescripcionArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaTelefono2)
                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCantidadV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttLimpiarArt)
                    .addComponent(bttModificarArt)
                    .addComponent(bttGuardarArt)
                    .addComponent(btEliminarArt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtStatusArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        menu_Articulos.addTab("Registrate", jPanel4);

        tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tablaArticulos);

        MostrarTA.setText("Cargar Registros");
        MostrarTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarTAActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(MostrarTA, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(MostrarTA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MostrarTA)
                .addGap(0, 220, Short.MAX_VALUE))
        );

        menu_Articulos.addTab("Mostrar Tabla Articulos", jLayeredPane2);

        menu_clientes.addTab("Articulo", menu_Articulos);

        jPanel3.setPreferredSize(new java.awt.Dimension(471, 487));

        EtiquetaTelefono1.setText("Id_Vendedor:");

        EtiquetaDomicilio1.setText("FechaFactura:");

        EtiquetaNombre2.setText("Id_Factura");

        temaC2.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        temaC2.setText("Formulario Factura");

        EtiFechaNacimiento1.setText("Id_Cliente");

        EtiquetaCorreo1.setText("id_Articulo");

        labelTotal.setText("Total:");

        bttGuardarFactura.setText("Guardar");
        bttGuardarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttGuardarFacturaActionPerformed(evt);
            }
        });

        bttModificarFactura.setText("Modificar");
        bttModificarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttModificarFacturaActionPerformed(evt);
            }
        });

        btEliminarFactura.setText("Eliminar");
        btEliminarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarFacturaActionPerformed(evt);
            }
        });

        txtFechaFactura.setText("Ej: 2000-01-01");
        txtFechaFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaFacturaKeyTyped(evt);
            }
        });

        bttLimpiarFactura.setText("Limpiar");
        bttLimpiarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLimpiarFacturaActionPerformed(evt);
            }
        });

        bttBuscarFactura.setText("Buscar");
        bttBuscarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttBuscarFacturaActionPerformed(evt);
            }
        });

        textIdFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textIdFacturaKeyTyped(evt);
            }
        });

        EtiquetaCorreo2.setText("Pago");

        List_Pago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Efectivo", "Targeta de Credito" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(temaC2)
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(EtiquetaNombre2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textIdFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttBuscarFactura)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EtiquetaDomicilio1)
                            .addComponent(EtiquetaTelefono1)
                            .addComponent(EtiFechaNacimiento1)
                            .addComponent(EtiquetaCorreo1)
                            .addComponent(EtiquetaCorreo2)
                            .addComponent(labelTotal))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(List_Pago, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(List_Articulos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(List_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(List_Vendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStatusFactura)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bttGuardarFactura)
                        .addGap(18, 18, 18)
                        .addComponent(bttLimpiarFactura)
                        .addGap(18, 18, 18)
                        .addComponent(bttModificarFactura)
                        .addGap(18, 18, 18)
                        .addComponent(btEliminarFactura)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(temaC2)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaNombre2)
                    .addComponent(textIdFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttBuscarFactura))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaDomicilio1)
                    .addComponent(txtFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaTelefono1)
                    .addComponent(List_Vendedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiFechaNacimiento1)
                    .addComponent(List_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaCorreo1)
                    .addComponent(List_Articulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaCorreo2)
                    .addComponent(List_Pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotal)
                    .addComponent(txttotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttLimpiarFactura)
                    .addComponent(bttModificarFactura)
                    .addComponent(btEliminarFactura)
                    .addComponent(bttGuardarFactura))
                .addGap(27, 27, 27)
                .addComponent(txtStatusFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        menu_Factura.addTab("Registrate", jPanel3);

        tablaFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablaFacturas);

        MostrarTF.setText("Cargar Registros");
        MostrarTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarTFActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(MostrarTF, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(MostrarTF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MostrarTF)
                .addGap(0, 220, Short.MAX_VALUE))
        );

        menu_Factura.addTab("Mostrar Tabla Factura", jLayeredPane1);

        menu_clientes.addTab("Factura", menu_Factura);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textIdFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIdFacturaKeyTyped
        char aux = evt.getKeyChar();

        if(Character.isLetter(aux))
        {
            evt.consume();
        }
    }//GEN-LAST:event_textIdFacturaKeyTyped

//--------------------------------------------FACTURA----------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------    
    private void bttBuscarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttBuscarFacturaActionPerformed
        FacturaVo f1 = FacturaDAO.buscarFactura(textIdFactura.getText());
        textIdFactura.setText(f1.getId_factura()+"");
        txtFechaFactura.setText(f1.getFechaFactura());
        cargarVendedor(f1.getId_vendedor());
        cargarCliente(f1.getId_cliente());
        cargarArticulo(f1.getId_articulo());
        List_Pago.setSelectedItem(f1.getPago());
        txttotalFactura.setText(f1.getTotal()+"");
        txtStatusFactura.setText(f1.getResultado());
    }//GEN-LAST:event_bttBuscarFacturaActionPerformed

    private void bttLimpiarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLimpiarFacturaActionPerformed
        limpiarCajasFactura();
    }//GEN-LAST:event_bttLimpiarFacturaActionPerformed

    private void txtFechaFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaFacturaKeyTyped
        char aux = evt.getKeyChar();

        if(Character.isLetter(aux))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtFechaFacturaKeyTyped

    private void btEliminarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarFacturaActionPerformed
        String resp =FacturaDAO.eliminarFactura(textIdFactura.getText());
        limpiarCajasFactura();
        txtStatusFactura.setText(resp);
        cargarVendedor(0);
        cargarCliente(0);
        cargarArticulo(0);
    }//GEN-LAST:event_btEliminarFacturaActionPerformed

    private void bttModificarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttModificarFacturaActionPerformed
        ClienteVo c1 = (ClienteVo) List_Clientes.getSelectedItem();
        VendedorVo v1 = (VendedorVo) List_Vendedores.getSelectedItem();
        ArticuloVo a1 = (ArticuloVo) List_Articulos.getSelectedItem();
        FacturaVo f1 = new FacturaVo();
        Integer f1_Fact = c1.getId_cliente();
        Integer f2_Fact = v1.getId_vendedor();
        Integer f3_Fact = a1.getId_articulo();
        f1.setId_factura(Integer.parseInt(textIdFactura.getText()));
        f1.setFechaFactura(txtFechaFactura.getText());
        f1.setId_vendedor(f2_Fact);
        f1.setId_cliente(f1_Fact);
        f1.setId_articulo(f3_Fact);
        f1.setPago(List_Pago.getSelectedItem().toString());
        f1.setTotal(Double.parseDouble(txttotalFactura.getText()));
        String resp = FacturaDAO.actualizarFactura(f1);
        limpiarCajasFactura();
        txtStatusFactura.setText(resp);
        cargarVendedor(0);
        cargarCliente(0);
        cargarArticulo(0);
    }//GEN-LAST:event_bttModificarFacturaActionPerformed

    private void bttGuardarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttGuardarFacturaActionPerformed
        ClienteVo c1 = (ClienteVo) List_Clientes.getSelectedItem();
        VendedorVo v1 = (VendedorVo) List_Vendedores.getSelectedItem();
        ArticuloVo a1 = (ArticuloVo) List_Articulos.getSelectedItem();
        FacturaVo f1 = new FacturaVo();
        Integer f1_Fact = c1.getId_cliente();
        Integer f2_Fact = v1.getId_vendedor();
        Integer f3_Fact = a1.getId_articulo();
        f1.setFechaFactura(txtFechaFactura.getText());
        f1.setId_vendedor(f2_Fact);
        f1.setId_cliente(f1_Fact);
        f1.setId_articulo(f3_Fact);
        f1.setPago(List_Pago.getSelectedItem().toString());
        f1.setTotal(Double.parseDouble(txttotalFactura.getText()));
        String resp = FacturaDAO.registrarFactura(f1);
        limpiarCajasFactura();
        txtStatusFactura.setText(resp);
        cargarVendedor(0);
        cargarCliente(0);
        cargarArticulo(0);
    }//GEN-LAST:event_bttGuardarFacturaActionPerformed

    private void bttBuscarArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttBuscarArtActionPerformed
        ArticuloVo a1 = ArticuloDAO.buscarArticulo(txtNombreArt.getText());
        textIdArt.setText(a1.getId_articulo()+"");
        txtNombreArt.setText(a1.getNombre());
        txtDescripcionArt.setText(a1.getDescripcion());
        txtPrecioUnitario.setText(Double.toString(a1.getPrecioUnitario()));
        txtCantidadV.setText(Integer.toString(a1.getCantidad()));
        txtStatusArt.setText(a1.getResultado());
    }//GEN-LAST:event_bttBuscarArtActionPerformed

    private void bttLimpiarArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLimpiarArtActionPerformed
        limpiarCajasArt();
    }//GEN-LAST:event_bttLimpiarArtActionPerformed

    private void txtCantidadVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVKeyTyped
        char aux = evt.getKeyChar();

        if(Character.isLetter(aux))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadVKeyTyped

    private void txtPrecioUnitarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioUnitarioKeyTyped
        char aux = evt.getKeyChar();

        if(Character.isLetter(aux))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioUnitarioKeyTyped

    private void txtNombreArtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreArtKeyTyped
        char aux = evt.getKeyChar();

        if(Character.isDigit(aux))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreArtKeyTyped

    private void btEliminarArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarArtActionPerformed
        String resp = ArticuloDAO.eliminarArticulo(txtNombreArt.getText());
        txtStatusArt.setText(resp);
        limpiarCajasArt();
        cargarArticulo(0);
    }//GEN-LAST:event_btEliminarArtActionPerformed

    private void bttModificarArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttModificarArtActionPerformed
        ArticuloVo a1 = new ArticuloVo();
        a1.setId_articulo(Integer.parseInt(textIdArt.getText()));
        a1.setNombre(txtNombreArt.getText());
        a1.setDescripcion(txtDescripcionArt.getText());
        a1.setPrecioUnitario(Double.parseDouble(txtPrecioUnitario.getText()));
        a1.setCantidad(Integer.parseInt(txtCantidadV.getText()));
        String resp = ArticuloDAO.actualizarArticulo(a1);
        txtStatusArt.setText(resp);
        limpiarCajasArt();
        cargarArticulo(0);
    }//GEN-LAST:event_bttModificarArtActionPerformed

//-----------------------------------------ARTICULO-----------------------------------------------------------
//------------------------------------------------------------------------------------------------------------    
    private void bttGuardarArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttGuardarArtActionPerformed
        ArticuloVo a1 = new ArticuloVo();
        a1.setNombre(txtNombreArt.getText());
        a1.setDescripcion(txtDescripcionArt.getText());
        a1.setPrecioUnitario(Double.parseDouble(txtPrecioUnitario.getText()));
        a1.setCantidad(Integer.parseInt(txtCantidadV.getText()));
        String resp = ArticuloDAO.registrarArticulo(a1);
        txtStatusArt.setText(resp);
        limpiarCajasArt();
        cargarArticulo(0);
    }//GEN-LAST:event_bttGuardarArtActionPerformed

//----------------------------------------VENDEDOR-----------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------    
    private void bttBuscarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttBuscarVendedorActionPerformed
        VendedorVo v1 = VendedorDAO.buscarVendedor(txtNombreVendedor.getText());
        textIdVendedor.setText(v1.getId_vendedor()+"");
        txtNombreVendedor.setText(v1.getNombre());
        txtStatusVendedor.setText(v1.getResultado());
    }//GEN-LAST:event_bttBuscarVendedorActionPerformed

    private void bttLimpiarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLimpiarVendedorActionPerformed
        limpiarCajasVendedor();
    }//GEN-LAST:event_bttLimpiarVendedorActionPerformed

    private void txtNombreVendedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreVendedorKeyTyped
        char aux = evt.getKeyChar();

        if(Character.isDigit(aux))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreVendedorKeyTyped

    private void btEliminarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarVendedorActionPerformed
        String resp = VendedorDAO.eliminarVendedor(txtNombreVendedor.getText());
        txtStatusVendedor.setText(resp);
        limpiarCajasVendedor();
        cargarVendedor(0);
    }//GEN-LAST:event_btEliminarVendedorActionPerformed

    private void bttModificarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttModificarVendedorActionPerformed
        VendedorVo v1 = new VendedorVo();
        v1.setId_vendedor(Integer.parseInt(textIdVendedor.getText()));
        v1.setNombre(txtNombreVendedor.getText());
        String resp = VendedorDAO.actualizarVendedor(v1);
        txtStatusVendedor.setText(resp);
        limpiarCajasVendedor();
        cargarVendedor(0);
    }//GEN-LAST:event_bttModificarVendedorActionPerformed

    private void bttGuardarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttGuardarVendedorActionPerformed
        VendedorVo v1 = new VendedorVo();
        v1.setNombre(txtNombreVendedor.getText());
        String resp = VendedorDAO.registrarVendedor(v1);
        txtStatusVendedor.setText(resp);
        limpiarCajasVendedor();
        cargarVendedor(0);
    }//GEN-LAST:event_bttGuardarVendedorActionPerformed

//--------------------------------------------CLIENTE--------------------------------------------------------    
//-----------------------------------------------------------------------------------------------------------
    private void bttBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttBuscarActionPerformed
        ClienteVo c1 = ClienteDAO.buscarCliente(txtNombre.getText());
        textId.setText(c1.getId_cliente()+"");
        txtNombre.setText(c1.getNombre());
        txtTelefono.setText(c1.getTelefono());
        txtFN.setText(c1.getFechaNacimiento());
        txtDomicilio.setText(c1.getDomicilio());
        txtCorreo.setText(c1.getCorreo());
        txtCP.setText(Integer.toString(c1.getPostal()));
        cbSeleccionarGenero.setSelectedItem(c1.getGenero());
        txtStatus.setText(c1.getResultado());
    }//GEN-LAST:event_bttBuscarActionPerformed

    private void bttLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLimpiarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_bttLimpiarActionPerformed

    private void txtCPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPKeyTyped
        char aux = evt.getKeyChar();

        if(Character.isLetter(aux))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtCPKeyTyped

    private void txtFNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFNKeyTyped
        char aux = evt.getKeyChar();

        if(Character.isLetter(aux))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtFNKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char aux = evt.getKeyChar();

        if(Character.isLetter(aux))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char aux = evt.getKeyChar();

        if(Character.isDigit(aux))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        String resp = ClienteDAO.eliminarCliente(txtNombre.getText());
        txtStatus.setText(resp);
        limpiarCajas();
        cargarCliente(0);
    }//GEN-LAST:event_btEliminarActionPerformed

    private void bttModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttModificarActionPerformed
        ClienteVo c1 = new ClienteVo();
        c1.setId_cliente(Integer.parseInt(textId.getText()));
        c1.setNombre(txtNombre.getText());
        c1.setTelefono(txtTelefono.getText());
        c1.setDomicilio(txtDomicilio.getText());
        c1.setCorreo(txtCorreo.getText());
        c1.setFechaNacimiento(txtFN.getText());
        c1.setPostal(Integer.parseInt(txtCP.getText()));
        c1.setGenero(cbSeleccionarGenero.getSelectedItem().toString());
        String resp = ClienteDAO.actualizarCliente(c1);
        txtStatus.setText(resp);
        limpiarCajas();
        cargarCliente(0);
    }//GEN-LAST:event_bttModificarActionPerformed

    private void bttGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttGuardarActionPerformed
        ClienteVo c1 = new ClienteVo();
        c1.setNombre(txtNombre.getText());
        c1.setTelefono(txtTelefono.getText());
        c1.setDomicilio(txtDomicilio.getText());
        c1.setCorreo(txtCorreo.getText());
        c1.setFechaNacimiento(txtFN.getText());
        c1.setPostal(Integer.parseInt(txtCP.getText()));
        c1.setGenero(cbSeleccionarGenero.getSelectedItem().toString());
        String resp = ClienteDAO.registrarCliente(c1);
        txtStatus.setText(resp);
        limpiarCajas();
        cargarCliente(0);
    }//GEN-LAST:event_bttGuardarActionPerformed

    private void MostrarTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTCActionPerformed
        DefaultTableModel modelo = new DefaultTableModel(){ //instancia del modelo de la tabla  
            @Override
            public boolean isCellEditable(int row, int col) //metodo para evitar que se edite los campos de la tabla
            {
                return false;
            }
        };
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Telefono");
        //modelo.addColumn("FechaNacimiento");
        modelo.addColumn("Correo");
        modelo.addColumn("Postal");
        //modelo.addColumn("Genero");
        tablaClientes.setModel(modelo);
        Object[] arrDiscos = new Object[8];
        for(ClienteVo c1: ClienteDAO.getListClientes()){
            arrDiscos[0] = c1.getId_cliente();
            arrDiscos[1] = c1.getNombre();
            arrDiscos[2] = c1.getDomicilio();
            arrDiscos[3] = c1.getTelefono();
          //  arrDiscos[4] = c1.getFechaNacimiento();
            arrDiscos[4] = c1.getCorreo();
            arrDiscos[5] = c1.getPostal();
          //  arrDiscos[7] = c1.getGenero();
            modelo.addRow(arrDiscos);
        }
        tablaClientes.setModel(modelo);
    }//GEN-LAST:event_MostrarTCActionPerformed

    private void MostrarTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTVActionPerformed
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int col) //metodo para evitar que se edite los campos de la tabla
            {
                return false;
            }
        };
        
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        tablaVendedores.setModel(modelo);
        Object[] arrPro = new Object[2];
        for(VendedorVo po: VendedorDAO.getListVendedor()){
            arrPro[0] = po.getId_vendedor();
            arrPro[1] = po.getNombre();
            modelo.addRow(arrPro);
        }
        tablaVendedores.setModel(modelo);
    }//GEN-LAST:event_MostrarTVActionPerformed

    private void MostrarTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTAActionPerformed
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int col) //metodo para evitar que se edite los campos de la tabla
            {
                return false;
            }
        };
            
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio Unitario");
        modelo.addColumn("Cantidad");
        tablaArticulos.setModel(modelo);
        Object[] arrPro = new Object[5];
        for(ArticuloVo po: ArticuloDAO.getListArticulo()){
            arrPro[0] = po.getId_articulo();
            arrPro[1] = po.getNombre();
            arrPro[2] = po.getDescripcion();
            arrPro[3] = po.getPrecioUnitario();
            arrPro[4] = po.getCantidad();
            modelo.addRow(arrPro);
        }
        tablaArticulos.setModel(modelo);
    }//GEN-LAST:event_MostrarTAActionPerformed

    private void MostrarTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTFActionPerformed
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int col) //metodo para evitar que se edite los campos de la tabla
            {
                return false;
            }
        };
        
        modelo.addColumn("ID");
        modelo.addColumn("FechaFactura");
        modelo.addColumn("ID_Vendedor");
        modelo.addColumn("ID_Cliente");
        modelo.addColumn("ID_Articulo");
        modelo.addColumn("Pago");
        modelo.addColumn("Total");
        tablaFacturas.setModel(modelo);
        Object[] arrDiscos = new Object[7];
        for(FacturaVo c1: FacturaDAO.getListFactura()){
            arrDiscos[0] = c1.getId_factura();
            arrDiscos[1] = c1.getFechaFactura();
            arrDiscos[2] = c1.getId_vendedor();
            arrDiscos[3] = c1.getId_cliente();
            arrDiscos[4] = c1.getId_articulo();
            arrDiscos[5] = c1.getPago();
            arrDiscos[6] = c1.getTotal();
            modelo.addRow(arrDiscos);
        }
        tablaFacturas.setModel(modelo);
    }//GEN-LAST:event_MostrarTFActionPerformed

//-------------------------------------METODO MAIN------------------------------------------------------------
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiFechaNacimiento;
    private javax.swing.JLabel EtiFechaNacimiento1;
    private javax.swing.JLabel EtiquetaCodigoP;
    private javax.swing.JLabel EtiquetaCorreo;
    private javax.swing.JLabel EtiquetaCorreo1;
    private javax.swing.JLabel EtiquetaCorreo2;
    private javax.swing.JLabel EtiquetaDomicilio;
    private javax.swing.JLabel EtiquetaDomicilio1;
    private javax.swing.JLabel EtiquetaDomicilio2;
    private javax.swing.JLabel EtiquetaGenero;
    private javax.swing.JLabel EtiquetaNombre;
    private javax.swing.JLabel EtiquetaNombre1;
    private javax.swing.JLabel EtiquetaNombre2;
    private javax.swing.JLabel EtiquetaNombre3;
    private javax.swing.JLabel EtiquetaTelefono;
    private javax.swing.JLabel EtiquetaTelefono1;
    private javax.swing.JLabel EtiquetaTelefono2;
    private javax.swing.JComboBox List_Articulos;
    private javax.swing.JComboBox List_Clientes;
    private javax.swing.JComboBox<String> List_Pago;
    private javax.swing.JComboBox List_Vendedores;
    private javax.swing.JButton MostrarTA;
    private javax.swing.JButton MostrarTC;
    private javax.swing.JButton MostrarTF;
    private javax.swing.JButton MostrarTV;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btEliminarArt;
    private javax.swing.JButton btEliminarFactura;
    private javax.swing.JButton btEliminarVendedor;
    private javax.swing.JButton bttBuscar;
    private javax.swing.JButton bttBuscarArt;
    private javax.swing.JButton bttBuscarFactura;
    private javax.swing.JButton bttBuscarVendedor;
    private javax.swing.JButton bttGuardar;
    private javax.swing.JButton bttGuardarArt;
    private javax.swing.JButton bttGuardarFactura;
    private javax.swing.JButton bttGuardarVendedor;
    private javax.swing.JButton bttLimpiar;
    private javax.swing.JButton bttLimpiarArt;
    private javax.swing.JButton bttLimpiarFactura;
    private javax.swing.JButton bttLimpiarVendedor;
    private javax.swing.JButton bttModificar;
    private javax.swing.JButton bttModificarArt;
    private javax.swing.JButton bttModificarFactura;
    private javax.swing.JButton bttModificarVendedor;
    private javax.swing.JComboBox<String> cbSeleccionarGenero;
    private javax.swing.JLabel code;
    private javax.swing.JTabbedPane formularioClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTabbedPane menu_Articulos;
    private javax.swing.JTabbedPane menu_Factura;
    private javax.swing.JTabbedPane menu_Vendedores;
    private javax.swing.JTabbedPane menu_clientes;
    private javax.swing.JTable tablaArticulos;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaFacturas;
    private javax.swing.JTable tablaVendedores;
    private javax.swing.JLabel temaC;
    private javax.swing.JLabel temaC1;
    private javax.swing.JLabel temaC2;
    private javax.swing.JLabel temaC3;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textIdArt;
    private javax.swing.JTextField textIdFactura;
    private javax.swing.JTextField textIdVendedor;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCantidadV;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDescripcionArt;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtFN;
    private javax.swing.JTextField txtFechaFactura;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreArt;
    private javax.swing.JTextField txtNombreVendedor;
    private javax.swing.JTextField txtPrecioUnitario;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtStatusArt;
    private javax.swing.JTextField txtStatusFactura;
    private javax.swing.JTextField txtStatusVendedor;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txttotalFactura;
    // End of variables declaration//GEN-END:variables
}
