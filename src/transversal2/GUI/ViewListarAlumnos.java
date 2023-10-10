package transversal2.GUI;

import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import transversal2.entidades.Alumno;
import transversal2.persistencia.AlumnoGestion;

/**
 *
 * @author Julian Rios
 */
public class ViewListarAlumnos extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ViewListarAlumnos() {
        initComponents();
        armarCabecera();
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radTodos);
        buttonGroup.add(radActiv);
        buttonGroup.add(radNoAct);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        radActiv = new javax.swing.JRadioButton();
        radNoAct = new javax.swing.JRadioButton();
        radTodos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 80));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setText("LISTAR ALUMNOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 321, 85));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 30, -1, -1));

        radActiv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        radActiv.setText("ACTIVOS");
        radActiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radActivActionPerformed(evt);
            }
        });
        getContentPane().add(radActiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        radNoAct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        radNoAct.setText("NO ACTIVOS");
        radNoAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radNoActActionPerformed(evt);
            }
        });
        getContentPane().add(radNoAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        radTodos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        radTodos.setText("TODOS");
        radTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTodosActionPerformed(evt);
            }
        });
        getContentPane().add(radTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 109, 790, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transversal2/sources/fondoabst2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void radTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTodosActionPerformed
        actualizarTabla(0);
    }//GEN-LAST:event_radTodosActionPerformed

    private void radActivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radActivActionPerformed
        actualizarTabla(1);
    }//GEN-LAST:event_radActivActionPerformed

    private void radNoActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radNoActActionPerformed
        actualizarTabla(2);
    }//GEN-LAST:event_radNoActActionPerformed

    private void actualizarTabla(int estado) {
        int orden = 0;
        switch (estado) {
            case 0:
                // Orden predeterminado
                break;
            case 1:
                // Orden para alumnos activos
                orden = 1; // Aquí defines el orden para alumnos activos
                break;
            case 2:
                // Orden para alumnos no activos
                orden = 2; // Aquí defines el orden para alumnos no activos
                break;
            default:
                // Manejar otros casos de estado aquí
                break;
        }

        borrarFilas();
        AlumnoGestion zzz = new AlumnoGestion();
        List<Alumno> lista = zzz.obtenerListaAlumnos(estado, orden);
        for (Alumno alum : lista) {
            modelo.addRow(new Object[]{
                alum.getIdAlumno(),
                alum.getDni(),
                alum.getApellido(),
                alum.getNombre(),
                alum.getFechaNacimiento(),
                alum.isEstado()
            });
        }
    }

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha Nac.");
        modelo.addColumn("Estado");
        jTable1.setModel(modelo);
    }

    private void borrarFilas() {
        int f = jTable1.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radActiv;
    private javax.swing.JRadioButton radNoAct;
    private javax.swing.JRadioButton radTodos;
    // End of variables declaration//GEN-END:variables
}
