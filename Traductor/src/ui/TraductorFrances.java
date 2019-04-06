
package ui;

import connection.DBConnection;
import dao.FrancesOP;
import java.awt.Image;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import vo.Frances;


/**
 * Clase que genera los distintos componentes del a interfaz gráfica del traductor frances - espanol
 * @version 1.0
 * @author manue
 */
public class TraductorFrances extends javax.swing.JFrame {

    /**
     * Constructor que carga los componentes e indico que se muestre en el centro de la pantalla
     */
    public TraductorFrances() {
        initComponents();
        setLocationRelativeTo(null);
        Image imagen = new ImageIcon("src/Imagenes/worlwide.png").getImage();
        this.setIconImage(imagen);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Traducir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTraducido = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaFrances = new javax.swing.JTextArea();
        añadirPalabras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Distribuciones = new javax.swing.JMenu();
        gestionDistribuciones = new javax.swing.JMenuItem();
        Programas = new javax.swing.JMenu();
        gestionProgramas = new javax.swing.JMenuItem();
        Programas1 = new javax.swing.JMenu();
        gestionProgramas1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Traducir.setText("Traducir");
        Traducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraducirActionPerformed(evt);
            }
        });

        areaTraducido.setEditable(false);
        areaTraducido.setColumns(20);
        areaTraducido.setRows(5);
        jScrollPane1.setViewportView(areaTraducido);

        areaFrances.setColumns(20);
        areaFrances.setRows(5);
        jScrollPane2.setViewportView(areaFrances);

        añadirPalabras.setText("Añadir Palabras");
        añadirPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirPalabrasActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spain.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/france.png"))); // NOI18N

        Distribuciones.setText("Inglés");

        gestionDistribuciones.setText("Traducir al Inglés");
        gestionDistribuciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionDistribucionesActionPerformed(evt);
            }
        });
        Distribuciones.add(gestionDistribuciones);

        jMenuBar1.add(Distribuciones);

        Programas.setText("Francés");

        gestionProgramas.setText("Traducir al Francés");
        gestionProgramas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionProgramasActionPerformed(evt);
            }
        });
        Programas.add(gestionProgramas);

        jMenuBar1.add(Programas);

        Programas1.setText("Informes");

        gestionProgramas1.setText("Palabras en Francés");
        gestionProgramas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionProgramas1ActionPerformed(evt);
            }
        });
        Programas1.add(gestionProgramas1);

        jMenuBar1.add(Programas1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Traducir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(añadirPalabras)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Traducir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(añadirPalabras)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Componente del menu que llama al JFrame encargado de cargar los componentes del traductor Ingles - Espanol
     * @param evt 
     */
    private void gestionDistribucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionDistribucionesActionPerformed
        TraductorIngles ti = new TraductorIngles();
        ti.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_gestionDistribucionesActionPerformed

    private void gestionProgramasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionProgramasActionPerformed


    }//GEN-LAST:event_gestionProgramasActionPerformed

    /**
     * Componente del menu que usando la clase JasperPrint y JasperViewer cargamos en una ventana el informe creado por iReport
     * @param evt 
     */
    private void gestionProgramas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionProgramas1ActionPerformed
        try {
            DBConnection conexion = new DBConnection();
            JasperReport informe = (JasperReport) JRLoader.loadObject("Informe_frances.jasper");
            Map<String, Object> parametros = new HashMap<String, Object>();

            JasperPrint jasperPrint = JasperFillManager.fillReport(informe, parametros, conexion.getConnection());

            JasperViewer jrViewer = new JasperViewer(jasperPrint, true);
            JDialog viewer = new JDialog(new javax.swing.JFrame(), "Palabras en Frances", true);
            viewer.setSize(1000, 600);
            viewer.setLocationRelativeTo(null);
            viewer.getContentPane().add(jrViewer.getContentPane());
            viewer.setVisible(true);

            conexion.desconectar();
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_gestionProgramas1ActionPerformed

    /**
     * Componente del menu que llama al JDialog encargado de mostrar una ventana para insertar palabras en la base de datos
     * @param evt 
     */
    private void añadirPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirPalabrasActionPerformed
        añadirPalabrasFrances apf = new añadirPalabrasFrances(this, true);
        apf.setVisible(true);
    }//GEN-LAST:event_añadirPalabrasActionPerformed
    /**
     * Función del componente JButton que realiza la traducción del texto de un textArea a otro y escribiendo "----" por cada palabra que no se encuentre en la base de datos
     * @param evt 
     */
    private void TraducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraducirActionPerformed
        FrancesOP fop = new FrancesOP();
        ArrayList<Frances> palabras_frances = fop.selectFrances();
        String[] palabras_traducir = areaFrances.getText().split(" ");
        areaTraducido.setText("");
        boolean comprobar_existe = false;
        for (int i = 0; i < palabras_traducir.length; i++) {
            comprobar_existe = false;
            for (int j = 0; j < palabras_frances.size(); j++) {
                if (palabras_frances.get(j).getOriginal().equals(palabras_traducir[i])) {
                    areaTraducido.append(palabras_frances.get(j).getTraduccion()+" ");
                    comprobar_existe = true;
                }
            }
            if(!comprobar_existe ){
                areaTraducido.append("----");
            }

        }
    }//GEN-LAST:event_TraducirActionPerformed

    
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
            java.util.logging.Logger.getLogger(TraductorFrances.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TraductorFrances.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TraductorFrances.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TraductorFrances.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TraductorFrances().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Distribuciones;
    private javax.swing.JMenu Programas;
    private javax.swing.JMenu Programas1;
    private javax.swing.JButton Traducir;
    private javax.swing.JTextArea areaFrances;
    private javax.swing.JTextArea areaTraducido;
    private javax.swing.JButton añadirPalabras;
    private javax.swing.JMenuItem gestionDistribuciones;
    private javax.swing.JMenuItem gestionProgramas;
    private javax.swing.JMenuItem gestionProgramas1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
