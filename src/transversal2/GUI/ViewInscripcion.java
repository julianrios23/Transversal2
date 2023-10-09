
package transversal2.GUI;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import transversal2.entidades.Alumno;
import transversal2.entidades.Inscripcion;
import transversal2.entidades.Materia;
import transversal2.persistencia.AlumnoGestion;
import transversal2.persistencia.InscripcionGestion;

/**
 *
 * @author Julian Rios
 */
public class ViewInscripcion extends javax.swing.JFrame {

  
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    public ViewInscripcion() {
        initComponents();
        armarCabecera();
        cargarCombo();
        btnAnular.setEnabled(false);
        btnInsc.setEnabled(false);
    }
    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        tableInsc.setModel(modelo);
    }

    private void cargarCombo() {
        AlumnoGestion ad = new AlumnoGestion();
        List<Alumno> list = ad.obtenerAlumnos();
        for (Object alum : list) {
            cmbAlum.addItem((Alumno) alum);
        }
        cmbAlum.setSelectedIndex(-1);
    }

    private void borrarFilas() {
        int f = tableInsc.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void actualizarTabla() {
        borrarFilas();
        InscripcionGestion ins = new InscripcionGestion();
        Alumno alum = new Alumno();
        if (cmbAlum.getSelectedItem() != null) {
            alum = (Alumno) cmbAlum.getSelectedItem();
            if (radAct.isSelected()) {
                List<Materia> lista = ins.obtenerMateriasCursadas(alum.getIdAlumno());
                for (Materia mat : lista) {
                    modelo.addRow(new Object[]{
                        mat.getIdMateria(),
                        mat.getNombre(),
                        mat.getAño()
                    });
                }
            } else if (radNoAct.isSelected()) {
                List<Materia> lista = ins.obtenerMateriasNoCursadas(alum.getIdAlumno());
                for (Materia mat : lista) {
                    modelo.addRow(new Object[]{
                        mat.getIdMateria(),
                        mat.getNombre(),
                        mat.getAño()
                    });
                }
            }
        }
    }

    private Materia seleccionJTable(int fila) {
        Materia mat = new Materia();
        mat.setIdMateria((int) tableInsc.getValueAt(fila, 0));
        mat.setNombre((String) tableInsc.getValueAt(fila, 1));
        return mat;
    }

    private void jcAlumnosActionPerformed(java.awt.event.ActionEvent evt) {
        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInsc = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbAlum = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        radAct = new javax.swing.JRadioButton();
        radNoAct = new javax.swing.JRadioButton();
        btnInsc = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 80));
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setText("GESTION INSCRIPCIONES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 28, -1, -1));

        tableInsc.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableInsc);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 94, 783, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Haga click en la fila que desea editar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 527, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("SELECCIONE UN ALUMNO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 136, -1, -1));

        cmbAlum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlumActionPerformed(evt);
            }
        });
        getContentPane().add(cmbAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 179, 222, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("MATERIAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 280, -1, -1));

        radAct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radAct.setText("ACTIVOS");
        radAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radActActionPerformed(evt);
            }
        });
        getContentPane().add(radAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 340, -1, -1));

        radNoAct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radNoAct.setText("NO ACTIVOS");
        radNoAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radNoActActionPerformed(evt);
            }
        });
        getContentPane().add(radNoAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 340, -1, -1));

        btnInsc.setBackground(new java.awt.Color(102, 51, 0));
        btnInsc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInsc.setForeground(new java.awt.Color(255, 255, 255));
        btnInsc.setText("INSCRIBIR");
        btnInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 432, -1, -1));

        btnAnular.setBackground(new java.awt.Color(102, 51, 0));
        btnAnular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAnular.setForeground(new java.awt.Color(255, 255, 255));
        btnAnular.setText("ANULAR");
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnular, new org.netbeans.lib.awtextra.AbsoluteConstraints(1088, 432, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transversal2/sources/fondoabst3.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscActionPerformed
       if (cmbAlum.getSelectedIndex() >= 0) {
            if (tableInsc.getSelectedRow() >= 0) {
                InscripcionGestion idata = new InscripcionGestion();
                Inscripcion insc = new Inscripcion();
                insc.setNota(0);
                insc.setAlumno((Alumno) cmbAlum.getSelectedItem());
                insc.setMateria(seleccionJTable(tableInsc.getSelectedRow()));
                idata.cargarInscripcion(insc);
                actualizarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione la fila a modificar nota");
            }
        } else {

            JOptionPane.showMessageDialog(this, "Antes debe seleccionar un alumno");
        }
    }//GEN-LAST:event_btnInscActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        if (cmbAlum.getSelectedIndex() >= 0) {
            if (tableInsc.getSelectedRow() >= 0) {
                InscripcionGestion cc = new InscripcionGestion();
                Inscripcion insc = new Inscripcion();
                insc.setNota(0);
                insc.setAlumno((Alumno) cmbAlum.getSelectedItem());
                insc.setMateria(seleccionJTable(tableInsc.getSelectedRow()));

                String mensaje = """
                             Desea anular la inscripci\u00f3n de:
                             Alumno: """ + insc.getAlumno().getApellido() + ", " + insc.getAlumno().getNombre() + "\n"
                        + "Materia: " + insc.getMateria().getNombre() + "?";

                int opc = JOptionPane.showConfirmDialog(this, mensaje, "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (opc == JOptionPane.YES_OPTION) {
                    cc.borrarInscripcionMateriaAlumno(insc.getAlumno().getIdAlumno(), insc.getMateria().getIdMateria());
                    actualizarTabla();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione la fila para anular la inscripción");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un alumno");
        }
    }//GEN-LAST:event_btnAnularActionPerformed

    private void radActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radActActionPerformed
        btnInsc.setEnabled(false);
        btnAnular.setEnabled(true);
        actualizarTabla();
    }//GEN-LAST:event_radActActionPerformed

    private void radNoActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radNoActActionPerformed
        btnInsc.setEnabled(true);
        btnAnular.setEnabled(false);
        actualizarTabla();
    }//GEN-LAST:event_radNoActActionPerformed

    private void cmbAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlumActionPerformed
        actualizarTabla();
    }//GEN-LAST:event_cmbAlumActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnInsc;
    private javax.swing.JComboBox<Alumno> cmbAlum;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radAct;
    private javax.swing.JRadioButton radNoAct;
    private javax.swing.JTable tableInsc;
    // End of variables declaration//GEN-END:variables
}
