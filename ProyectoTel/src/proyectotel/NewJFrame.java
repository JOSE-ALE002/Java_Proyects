/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotel;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author joseibanez
 */
public class NewJFrame extends javax.swing.JFrame {
    
    public static ArrayList<Telefonia> lista = new ArrayList<Telefonia>();
    private int acum = 1;

    private void limpiarCajas(){
        txtId.setText(null);
        txtNombre.setText(null);
        txtMinutos.setText(null);
        txtTel.setText(null);
        txtText.setText(null);
        list_region.setSelectedIndex(0);  
    }
      
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @throws ParseException 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMinutos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        //mascara = new javax.swing.text.MaskFormatter("####-####");
        //txtTel = new javax.swing.JFormattedTextField(mascara);
        txtTel = new javax.swing.JFormattedTextField();
        list_region = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtText = new javax.swing.JTextPane();
        bttGenerar = new javax.swing.JButton();
        bttBuscar = new javax.swing.JButton();
        bttClena = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setText("Formulario Factura");

        jLabel2.setText("Nombre Cliente:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel3.setText("Min de llamada:");

        txtMinutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMinutosKeyTyped(evt);
            }
        });

        jLabel4.setText("Telefono:");

        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });

        list_region.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Nacional", "Internacional" }));

        jLabel5.setText("Region:");

        jScrollPane1.setViewportView(txtText);

        bttGenerar.setText("Generar");
        bttGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttGenerarActionPerformed(evt);
            }
        });

        bttBuscar.setText("Buscar");
        bttBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttBuscarActionPerformed(evt);
            }
        });

        bttClena.setMnemonic('n');
        bttClena.setText("Limpiar");
        bttClena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttClenaActionPerformed(evt);
            }
        });

        jLabel6.setText("ID_Factura:");

        txtId.setEnabled(false);
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(bttGenerar)
                        .addGap(18, 18, 18)
                        .addComponent(bttClena)
                        .addGap(18, 18, 18)
                        .addComponent(bttBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(22, 22, 22))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(25, 25, 25)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTel)
                            .addComponent(txtNombre)
                            .addComponent(list_region, 0, 142, Short.MAX_VALUE)
                            .addComponent(txtId))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(list_region, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttGenerar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bttClena)
                        .addComponent(bttBuscar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttGenerarActionPerformed
        
        Telefonia t1 = new Telefonia();
        t1.setId_factura(acum);
        t1.setNombre(txtNombre.getText());
        t1.setMinutos(Integer.parseInt(txtMinutos.getText()));
        t1.setTelefono(Integer.parseInt(txtTel.getText()));
        t1.setRegion(list_region.getSelectedItem().toString());
        
        switch(list_region.getSelectedItem().toString()){
            case "Nacional":{
                t1.facturaNacional();
                break;
            }
            
            case "Internacional":{
                t1.facturainternacional();
                break;
            }
        }
        
        lista.add(t1);
        txtText.setText(t1.toString());
        txtId.setText(Integer.toString(t1.getId_factura()));
        
        try {
            FileWriter file = new FileWriter("Clientes/Cliente"+acum + ".txt");
            String texto = txtText.getText().replace("\n", "\r\n");
            PrintWriter imprime = new PrintWriter(file);
            imprime.print(texto);
            file.close();
            
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        acum++;
    }//GEN-LAST:event_bttGenerarActionPerformed

    private void bttClenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttClenaActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_bttClenaActionPerformed

    private void bttBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttBuscarActionPerformed
        txtId.setEnabled(true);
        if(lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se han encontrado registros", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        /*else{
            //JOptionPane.showMessageDialog(null, "Esta llena", "Warning", JOptionPane.WARNING_MESSAGE);
        }*/
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getId_factura() == Integer.parseInt(txtId.getText())){
                //JOptionPane.showMessageDialog(null, "Proveedores con el codigo: " + "\n" + lista.get(i));
                txtNombre.setText(lista.get(i).getNombre());
                txtMinutos.setText(Integer.toString(lista.get(i).getMinutos()));
                txtTel.setText(Integer.toString(lista.get(i).getTelefono()));
                list_region.setSelectedItem(lista.get(i).getRegion());
                txtText.setText(lista.get(i).toString());
            }else{
                JOptionPane.showMessageDialog(null, "No iguales", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        
        txtId.setEnabled(false);
    }//GEN-LAST:event_bttBuscarActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        char aux = evt.getKeyChar();

        if(Character.isLetter(aux))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char aux = evt.getKeyChar();

        if(Character.isDigit(aux))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtMinutosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinutosKeyTyped
        char aux = evt.getKeyChar();

        if(Character.isLetter(aux))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtMinutosKeyTyped

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        char aux = evt.getKeyChar();

        if(Character.isLetter(aux))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelKeyTyped

    /**
     * @param args the command line arguments
     */
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
    private javax.swing.JButton bttBuscar;
    private javax.swing.JButton bttClena;
    private javax.swing.JButton bttGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> list_region;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMinutos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtTel;
    private javax.swing.JTextPane txtText;
    //private javax.swing.text.MaskFormatter mascara;
    // End of variables declaration//GEN-END:variables
}
