package transversal2.GUI;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import transversal2.entidades.Alumno;
import transversal2.persistencia.AlumnoGestion;

/**
 *
 * @author Julian Rios
 */
public class ViewAlumno extends javax.swing.JFrame {

    private static int contador = 0;

    public ViewAlumno() {
        initComponents();
    }

    private void limpiar() {
        txtDni.setText("");
        txtApellido.setText("");
        txtNombre.setText("");
        radioActivo.setSelected(true);
        jDateChooser1.setDate(null);
        contador = 0;
    }

    public static LocalDate convertirLocalDate(Date d) {
        LocalDate xx = null;
        if (d != null) {
            Instant instant = d.toInstant();
            ZoneId zonaHoraria = ZoneId.systemDefault();
            xx = instant.atZone(zonaHoraria).toLocalDate();
        }
        return xx;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        radioActivo = new javax.swing.JRadioButton();
        btnBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(270, 120));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTION ALUMNO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        btnCargar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCargar.setText("CARGAR");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));

        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DNI");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("APELLIDO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ESTADO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("FECHA NACIMIENTO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 285, -1, 40));

        txtDni.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 140, -1));

        txtApellido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 280, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 280, -1));

        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 280, 30));

        radioActivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        radioActivo.setForeground(new java.awt.Color(255, 255, 255));
        radioActivo.setText("ACTIVO / NO ACTIVO");
        getContentPane().add(radioActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, 50));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transversal2/sources/busqueda24.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 50, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transversal2/sources/alumnos.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        if (txtDni.getText().equals("") || txtApellido.getText().equals("") || txtNombre.getText().equals("") || jDateChooser1.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        } else {
            AlumnoGestion adata = new AlumnoGestion();
            Alumno alum = new Alumno();
            try {
                alum.setDni(Integer.parseInt(txtDni.getText()));
                alum.setApellido(txtApellido.getText());
                alum.setNombre(txtNombre.getText());
                alum.setEstado(true);
                alum.setFechaNacimiento(convertirLocalDate(jDateChooser1.getDate()));
                adata.guardarAlumno(alum);
               // JOptionPane.showMessageDialog(this, "Alumno cargado exitosamente");
                limpiar();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo puede ingresar números en el documento");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
            }
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (contador == 0) {
            JOptionPane.showMessageDialog(this, "Debe buscar un alumno por DNI primero, antes de efectuar una modificación.");
        } else {
            if (txtDni.getText().equals("") || txtApellido.getText().equals("") || txtNombre.getText().equals("") || jDateChooser1.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
            } else {
                AlumnoGestion adata = new AlumnoGestion();
                Alumno alum = new Alumno();
                try {
                    alum = adata.buscarAlumnoPorDni(Integer.parseInt(txtDni.getText()));
                    alum.setDni(Integer.parseInt(txtDni.getText()));
                    alum.setApellido(txtApellido.getText());
                    alum.setNombre(txtNombre.getText());
                    alum.setEstado(radioActivo.isSelected());
                    alum.setFechaNacimiento(convertirLocalDate(jDateChooser1.getDate()));
                    adata.modificarAlumno(alum);

                    JOptionPane.showMessageDialog(this, "Alumno modificado exitosamente");
                    limpiar();
                    contador = 0;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Solo puede ingresar números en el documento");
                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
                }
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Debe buscar un alumno por DNI primero, para eliminarlo.");
        } else {
            if (txtDni.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo DNI");
            } else {
                AlumnoGestion adata = new AlumnoGestion();
                Alumno alum = new Alumno();
                try {
                    int dni = Integer.parseInt(txtDni.getText());
                    alum = adata.buscarAlumnoPorDni(dni);
                    Object[] options = {"Aceptar", "Cancelar"};
                    int choice = JOptionPane.showOptionDialog(this, "¿Está seguro que desea dar de baja al alumno: " + alum.stringEliminar(), "¡Atención!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, "Aceptar");
                    if (choice == JOptionPane.YES_OPTION) {
                        adata.eliminarAlumno(alum.getIdAlumno());
                        contador = 0;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Solo puede ingresar números en el documento");
                } catch (NullPointerException ex) {
                    limpiar();
                }
                limpiar();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (txtDni.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe completar el campo DNI");
        } else {
            AlumnoGestion adata = new AlumnoGestion();
            Alumno alum = new Alumno();
            try {
                int dni = Integer.parseInt(txtDni.getText());
                alum = adata.buscarAlumnoPorDni(dni);

                if (alum != null) {
                   
                    txtApellido.setText(alum.getApellido());
                    txtNombre.setText(alum.getNombre());
                    jDateChooser1.setDate(convertirDate(alum.getFechaNacimiento()));
                    radioActivo.setSelected(alum.isEstado());
                 
                    contador = 1;
                } else {
                    
                    JOptionPane.showMessageDialog(this, "No se encontró ningún alumno con ese DNI");
                    limpiar();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo puede ingresar números en el campo DNI");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    public static Date convertirDate(LocalDate localDate) {
    if (localDate != null) {
        return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }
    return null;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton radioActivo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
