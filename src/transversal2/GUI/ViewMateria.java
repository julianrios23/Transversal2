package transversal2.GUI;

import javax.swing.JOptionPane;
import transversal2.entidades.Materia;
import transversal2.persistencia.MateriaGestion;

/**
 *
 * @author Julian Rios
 */
public class ViewMateria extends javax.swing.JFrame {

    public ViewMateria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        radActiv = new javax.swing.JRadioButton();
        radModif = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        radEstado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnModif = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(270, 120));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GESTION MATERIA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 28, -1, 40));

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transversal2/sources/volver-24.png"))); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        radActiv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radActiv.setForeground(new java.awt.Color(255, 255, 255));
        radActiv.setText("NUEVA");
        radActiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radActivActionPerformed(evt);
            }
        });
        getContentPane().add(radActiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, -1));

        radModif.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radModif.setForeground(new java.awt.Color(255, 255, 255));
        radModif.setText("MODIFICAR");
        radModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radModifActionPerformed(evt);
            }
        });
        getContentPane().add(radModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 30, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APELLIDO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AÑO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        radEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radEstado.setForeground(new java.awt.Color(255, 255, 255));
        radEstado.setText("ACTIVO / NO ACTIVO");
        getContentPane().add(radEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ESTADO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 200, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 250, -1));
        getContentPane().add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 250, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transversal2/sources/busqueda24.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        btnCargar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCargar.setText("CARGAR");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        btnModif.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModif.setText("MODIFICAR");
        btnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifActionPerformed(evt);
            }
        });
        getContentPane().add(btnModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transversal2/sources/fondoabst4A.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            MateriaGestion md = new MateriaGestion();
            Materia mater = new Materia();
            if (txtID.getText().equals("") && txtNombre.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese codigo o nombre de materia para buscar");

            } else if (txtID.getText().equals("")) {
                mater.setIdMateria(0);
                mater.setNombre(txtNombre.getText());
                md.buscarMateria(mater);
            } else {
                mater.setIdMateria(Integer.parseInt(txtID.getText()));
                mater.setNombre(txtNombre.getText());
                md.buscarMateria(mater);
            }
            if (mater.getIdMateria() == 0) {
                limpiar();
            } else {
                txtID.setText(mater.getIdMateria() + "");
                txtNombre.setText(mater.getNombre());
                txtAño.setText(mater.getAño() + "");
                radEstado.setEnabled(false);
                if (mater.isEstado() == true) {
                    radEstado.setSelected(true);
                } else {
                    radEstado.setSelected(false);
                }
                btnModif.setEnabled(true);
            }
        } catch (NumberFormatException ex) {
            limpiar();
            JOptionPane.showMessageDialog(this, "Ingrese numeros donde corresponda");

        } catch (NullPointerException ex) {

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void radActivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radActivActionPerformed
        nueva();
        limpiar();
    }//GEN-LAST:event_radActivActionPerformed

    private void radModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radModifActionPerformed
        modificar();
        limpiar();
    }//GEN-LAST:event_radModifActionPerformed

    private void btnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifActionPerformed
        if (txtNombre.getText().equals("") || txtAño.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos");
        } else {
            MateriaGestion md = new MateriaGestion();
            Materia mater = new Materia();
            try {
                mater.setIdMateria(Integer.parseInt(txtID.getText()));
                mater.setNombre(txtNombre.getText());
                mater.setAño(Integer.parseInt(txtAño.getText()));
                mater.setEstado(radEstado.isSelected());
                md.modificarMateria(mater);
                limpiar();
                modificar();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Solo ingrese numeros en los campos correspondientes");
            }
        }
    }//GEN-LAST:event_btnModifActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        if (txtNombre.getText().equals("") || txtAño.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Complete los campos");
        } else {
            MateriaGestion mg = new MateriaGestion();
            Materia mater = new Materia();
            try {
                mater.setNombre(txtNombre.getText());
                mater.setAño(Integer.parseInt(txtAño.getText()));
                mater.setEstado(true);
                mg.cargarMateria(mater);
                limpiar();
            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(this, "Datos no validos, ingrese solo numeros");
            } catch (NullPointerException ex) {

                JOptionPane.showMessageDialog(this, "Debe cargar el campo año");
            }
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void limpiar() {
        txtID.setText("");
        txtNombre.setText("");
        txtAño.setText("");
        radEstado.setSelected(true);
    }

    public void nueva() {
        radActiv.setSelected(true);
        radModif.setSelected(false);
        radEstado.setEnabled(false);
        radEstado.setSelected(true);
        txtID.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnCargar.setEnabled(true);
        btnModif.setEnabled(false);
    }

    public void modificar() {
        radActiv.setSelected(false);
        radModif.setSelected(true);
        radEstado.setEnabled(true);
        txtID.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnCargar.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModif;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton radActiv;
    private javax.swing.JRadioButton radEstado;
    private javax.swing.JRadioButton radModif;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
