/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VistaPrincipal.java
 *
 * Created on 19-ago-2011, 13:26:29
 */
package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.WindowConstants;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 *
 * @author oscarribera
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /** Creates new form VistaPrincipal */
    public VistaPrincipal() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPanel = new JTabbedPane();
        jToolBar1 = new JToolBar();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        menuItemCursos = new JMenuItem();
        jMenu2 = new JMenu();
        menuItemAulas = new JMenuItem();
        menuItemEdiciones = new JMenuItem();
        jMenu3 = new JMenu();
        menuItemEmpleados = new JMenuItem();
        jMenu4 = new JMenu();
        menuItemInscripcion = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("totai3capas");

        jToolBar1.setRollover(true);

        jMenu1.setText("Cursos");

        menuItemCursos.setText("Editar cursos");
        menuItemCursos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuItemCursosActionPerformed1(evt);
            }
        });
        jMenu1.add(menuItemCursos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Aulas y ediciones");

        menuItemAulas.setText("Editar aulas");
        menuItemAulas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuItemAulasActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemAulas);

        menuItemEdiciones.setText("Editar ediciones");
        menuItemEdiciones.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuItemEdicionesActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemEdiciones);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Empleados");

        menuItemEmpleados.setText("Editar empleados");
        menuItemEmpleados.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuItemEmpleadosActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemEmpleados);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Inscripcion");

        menuItemInscripcion.setText("Editar Inscripcion");
        menuItemInscripcion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuItemInscripcionActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemInscripcion);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.LEADING)
            .add(jToolBar1, GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
            .add(GroupLayout.TRAILING, tabPanel, GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.LEADING)
            .add(GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(tabPanel, GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.UNRELATED)
                .add(jToolBar1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void menuItemCursosActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuItemCursosActionPerformed
    addTabCurso();
}//GEN-LAST:event_menuItemCursosActionPerformed

private void menuItemAulasActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuItemAulasActionPerformed
    addTabAulas();
}//GEN-LAST:event_menuItemAulasActionPerformed

private void menuItemEmpleadosActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuItemEmpleadosActionPerformed
    //addTabEmpleados();
}//GEN-LAST:event_menuItemEmpleadosActionPerformed

private void menuItemEdicionesActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuItemEdicionesActionPerformed
    //addTabEdiciones();

}//GEN-LAST:event_menuItemEdicionesActionPerformed

private void menuItemCursosActionPerformed1(ActionEvent evt) {//GEN-FIRST:event_menuItemCursosActionPerformed1
    //addTabCurso();
}//GEN-LAST:event_menuItemCursosActionPerformed1

private void menuItemInscripcionActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuItemInscripcionActionPerformed
    //addTabInscripcion();
}//GEN-LAST:event_menuItemInscripcionActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VistaPrincipal().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenu jMenu3;
    private JMenu jMenu4;
    private JMenuBar jMenuBar1;
    private JToolBar jToolBar1;
    private JMenuItem menuItemAulas;
    private JMenuItem menuItemCursos;
    private JMenuItem menuItemEdiciones;
    private JMenuItem menuItemEmpleados;
    private JMenuItem menuItemInscripcion;
    private JTabbedPane tabPanel;
    // End of variables declaration//GEN-END:variables

    private void addTabCurso() {
        AbmCurso tabCurso = new AbmCurso();
        this.tabPanel.addTab("Cursos", new JScrollPane(tabCurso));
    }

    private void addTabAulas() {
        AbmAula tabAula = new AbmAula();
        this.tabPanel.addTab("Aulas", new JScrollPane(tabAula));
    }

    private void addTabEmpleados() {
        //AbmEmpleado tabEmpleado = new AbmEmpleado();
        //this.tabPanel.addTab("Empleados", new JScrollPane(tabEmpleado));
    }

    private void addTabInscripcion() {
        //AbmInscripcion tabInscripcion = new AbmInscripcion();
        //this.tabPanel.addTab("Inscripcion", new JScrollPane(tabInscripcion));

    }

    private void addTabEdiciones() {
        //AbmEdicion tabEdicion = new AbmEdicion();
        //this.tabPanel.addTab("Ediciones", new JScrollPane(tabEdicion));
    }
}
