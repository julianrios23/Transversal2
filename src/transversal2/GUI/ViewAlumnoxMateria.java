package transversal2.GUI;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import transversal2.entidades.Alumno;
import transversal2.entidades.Materia;
import transversal2.persistencia.InscripcionGestion;
import transversal2.persistencia.MateriaGestion;

/**
 *
 * @author Julian Rios
 */
public class ViewAlumnoxMateria extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ViewAlumnoxMateria() {
        initComponents();
        armarCabecera();
        cargarCombo();
    }

    private void armarCabecera() {
        modelo.addColumn("DNI");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("NOMBRE");
        jTable1.setModel(modelo);

    }

   
    private void cargarCombo() {
        cmbMateria.removeAllItems();
        Materia matVacia = new Materia();
        matVacia.setNombre("Seleccione una materia");
        cmbMateria.addItem(matVacia);
        MateriaGestion xx = new MateriaGestion();
        List<Materia> list = xx.listarMateria();
        for (Materia mat : list) {
            cmbMateria.addItem(mat);
        }
    }

    private void borrarFilas() {
        int f = jTable1.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void actualizarTabla() {
        borrarFilas();
        InscripcionGestion xx = new InscripcionGestion();
        Alumno alum = new Alumno();
        Materia mat = new Materia();
        if (cmbMateria.getSelectedIndex() >= 1) {
            mat = (Materia) cmbMateria.getSelectedItem();
            
            List<Alumno> lista = xx.obtenerAlumnosPorMateria(mat.getIdMateria());
            
            for (Alumno alumn : lista) {
                modelo.addRow(new Object[]{
                    alumn.getDni(),
                    alumn.getApellido(),
                    alumn.getNombre()
                });
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cmbMateria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 80));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setText("ALUMNOS POR MATERIA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

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

        cmbMateria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cmbMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMateriaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 131, 320, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("SELECCIONE MATERIA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 225, 1070, 330));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transversal2/sources/fondoabstrac1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMateriaActionPerformed
        if (cmbMateria.getSelectedIndex() >= 1) {
            actualizarTabla();
        } else if (cmbMateria.getSelectedIndex() == 0) {
            borrarFilas();
        }
    }//GEN-LAST:event_cmbMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Materia> cmbMateria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
