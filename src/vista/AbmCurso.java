/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AbmCurso.java
 *
 * Created on 19-ago-2011, 12:54:52
 */
package vista;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import paqueteCurso.ServicioAbmCurso;
import paqueteCurso.ServicioAbmCurso_Service;
import vista.ModeloTabla;

/**
 *
 * @author oscarribera
 */
public class AbmCurso extends javax.swing.JPanel {

    private ModeloTabla modeloCursos = new ModeloTabla(new String[]{"codigo", "titulo", "tema", "horas"});
    private DefaultListModel modeloRequisitos = new DefaultListModel();
//    private ServicioAbmCurso controlCurso = new ServicioAbmCurso_Service().getServicioAbmCursoPort();

    /** Creates new form AbmCurso */
    public AbmCurso() {
        initComponents();
        init();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCursos = new javax.swing.JTable();
        panelRequisitos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaRequisitos = new javax.swing.JList();
        comboCursos = new javax.swing.JComboBox();
        btnAddRequisito = new javax.swing.JButton();
        btnDelRequisito = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtTema = new javax.swing.JTextField();
        spinHora = new javax.swing.JSpinner();
        lbCodigo = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbTema = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();

        tablaCursos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCursosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCursos);

        panelRequisitos.setBorder(javax.swing.BorderFactory.createTitledBorder("Requisitos"));

        listaRequisitos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaRequisitos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaRequisitosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaRequisitos);

        comboCursos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCursosActionPerformed(evt);
            }
        });

        btnAddRequisito.setText("Agregar");
        btnAddRequisito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRequisitoActionPerformed(evt);
            }
        });

        btnDelRequisito.setText("Quitar");
        btnDelRequisito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelRequisitoActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout panelRequisitosLayout = new org.jdesktop.layout.GroupLayout(panelRequisitos);
        panelRequisitos.setLayout(panelRequisitosLayout);
        panelRequisitosLayout.setHorizontalGroup(
            panelRequisitosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelRequisitosLayout.createSequentialGroup()
                .addContainerGap()
                .add(panelRequisitosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(comboCursos, 0, 103, Short.MAX_VALUE)
                    .add(panelRequisitosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(btnDelRequisito, 0, 0, Short.MAX_VALUE)
                        .add(btnAddRequisito, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .add(11, 11, 11)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 167, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        panelRequisitosLayout.setVerticalGroup(
            panelRequisitosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelRequisitosLayout.createSequentialGroup()
                .addContainerGap()
                .add(panelRequisitosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .add(panelRequisitosLayout.createSequentialGroup()
                        .add(comboCursos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnAddRequisito)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnDelRequisito)))
                .addContainerGap())
        );

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        spinHora.setValue(5);

        lbCodigo.setText("Código:");

        lbTitulo.setText("Titulo:");

        lbTema.setText("Tema:");

        lbHora.setText("Horas:");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lbCodigo)
                    .add(lbTitulo)
                    .add(lbTema)
                    .add(lbHora))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(txtTitulo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 259, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 259, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtTema, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 259, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(spinHora, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lbCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lbTitulo)
                    .add(txtTitulo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lbTema, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtTema, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lbHora)
                    .add(spinHora, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, panelRequisitos, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .add(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(panelRequisitos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    addCurso();
}//GEN-LAST:event_btnAgregarActionPerformed

private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtCodigoActionPerformed

private void tablaCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCursosMouseClicked
    selectCurso();
}//GEN-LAST:event_tablaCursosMouseClicked

private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
    crearNuevo();
}//GEN-LAST:event_btnNuevoActionPerformed

private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
// TODO add your handling code here:
    modificarCurso();
}//GEN-LAST:event_btnModificarActionPerformed

private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    delCurso();
}//GEN-LAST:event_btnEliminarActionPerformed

private void btnAddRequisitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRequisitoActionPerformed
    addRequisito();
}//GEN-LAST:event_btnAddRequisitoActionPerformed

private void listaRequisitosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaRequisitosValueChanged
}//GEN-LAST:event_listaRequisitosValueChanged

private void btnDelRequisitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelRequisitoActionPerformed
    delRequisito();
}//GEN-LAST:event_btnDelRequisitoActionPerformed

private void comboCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCursosActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_comboCursosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRequisito;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnDelRequisito;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox comboCursos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbTema;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JList listaRequisitos;
    private javax.swing.JPanel panelRequisitos;
    private javax.swing.JSpinner spinHora;
    private javax.swing.JTable tablaCursos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtTema;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.tablaCursos.setModel(modeloCursos);
        this.listaRequisitos.setModel(modeloRequisitos);
        this.modeloRequisitos.clear();
        this.comboCursos.removeAllItems();
        cargarDatos();
        loadRequisitos();
    }

    private void cargarDatos() {
//        this.modeloCursos.setDatos(controlCurso.getCursos());
    }

    private void addCurso() {
        Integer horas = Integer.parseInt(spinHora.getValue().toString());
        String codigo = txtCodigo.getText();
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campo Codigo no debe estar vacio");
        } else {
//            String resultado = controlCurso.addCurso(codigo, txtTitulo.getText(), txtTema.getText(), horas, modeloRequisitos.toArray());
            cargarDatos();
//            JOptionPane.showMessageDialog(this, resultado);
        }
        btnModificar.setEnabled(false);
        btnAgregar.setEnabled(true);
    }

    private void selectCurso() {
        int indexFila = this.tablaCursos.getSelectedRow();
        if (indexFila > -1) {
            Object[] fila = this.modeloCursos.getRow(indexFila);
            this.txtCodigo.setText(fila[0].toString());
            this.txtTitulo.setText(fila[1] + "");
            this.txtTema.setText(fila[2] + "");
            if (fila[3] != null) {
                this.spinHora.setValue(fila[3]);
            }
            this.txtCodigo.setEditable(false);
        }
        enableModificar(true);
        loadRequisitos();
    }

    private void crearNuevo() {
        this.txtCodigo.setEditable(true);
        txtCodigo.setText("");
        txtTitulo.setText("");
        txtTema.setText("");
        loadRequisitos();
        enableModificar(false);
    }

    private void enableModificar(boolean enable) {
        this.btnAgregar.setEnabled(!enable);
        this.btnModificar.setEnabled(enable);
        this.btnEliminar.setEnabled(enable);
    }

    private void modificarCurso() {
        Integer horas = Integer.parseInt(spinHora.getValue().toString());
        String codigo = txtCodigo.getText();

        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campo Codigo no debe estar vacio");
        } else {
//            String resultado = controlCurso.modificarCurso(codigo, txtTitulo.getText(), txtTema.getText(), horas, modeloRequisitos.toArray());
            cargarDatos();
//            JOptionPane.showMessageDialog(this, resultado);
        }
    }

    private void delCurso() {
        String codigo = txtCodigo.getText();
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campo Codigo no debe estar vacio ");
        } else {
//            String resultado = controlCurso.delCurso(codigo);
            cargarDatos();
//            JOptionPane.showMessageDialog(this, resultado);
        }
    }

    private void loadRequisitos() {
        this.comboCursos.removeAllItems();
        this.modeloRequisitos.clear();
//        List<Object[]> requisitos = controlCurso.getRequisitos(txtCodigo.getText());

        boolean isModificacion = !this.txtCodigo.getText().isEmpty();
        if (isModificacion) {
            this.modeloRequisitos.addElement(this.txtCodigo.getText());
        }

//        for (Object[] item : requisitos) {
//            this.modeloRequisitos.addElement(item[0]);
//        }

//        Object[] codigosExistentes = modeloRequisitos.toArray();
//        List<Object[]> cursosDisponibles = controlCurso.filtrarCursos(codigosExistentes);
//        for (Object[] item : cursosDisponibles) {
//            this.comboCursos.addItem(item[0]);
//        }
        if (isModificacion) {
            this.modeloRequisitos.removeElement(this.txtCodigo.getText());
        }
    }

    private void addRequisito() {
        Object requisito = comboCursos.getSelectedItem();
        if (requisito != null) {
            this.modeloRequisitos.addElement(requisito);
            this.comboCursos.removeItem(requisito);
        }
    }

    private void delRequisito() {
        Object requisito = listaRequisitos.getSelectedValue();
        if (requisito != null) {
            this.modeloRequisitos.removeElement(requisito);
            this.comboCursos.addItem(requisito);
        }
    }
}
