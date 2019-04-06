
package ui;

import connection.DBConnection;
import dao.InglesOP;
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
import vo.Ingles;

/**
 * Clase que genera los distintos componentes del a interfaz gráfica del traductor ingles - espanol
 * @version 1.0
 * @author manue
 */
public class TraductorIngles extends javax.swing.JFrame {

    /**
     * Constructor que carga los componentes e indico que se muestre en el centro de la pantalla
     */
    public TraductorIngles() {
        initComponents();
        this.setLocationRelativeTo(null);
        Image imagen = new ImageIcon("src/Imagenes/worlwide.png").getImage();
        this.setIconImage(imagen);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        areaTraducido = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaIngles = new javax.swing.JTextArea();
        añadirPalabras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Traducir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Distribuciones = new javax.swing.JMenu();
        gestionDistribuciones = new javax.swing.JMenuItem();
        Programas = new javax.swing.JMenu();
        gestionProgramas = new javax.swing.JMenuItem();
        Programas1 = new javax.swing.JMenu();
        gestionProgramas1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaTraducido.setEditable(false);
        areaTraducido.setColumns(20);
        areaTraducido.setRows(5);
        jScrollPane1.setViewportView(areaTraducido);

        areaIngles.setColumns(20);
        areaIngles.setRows(5);
        jScrollPane2.setViewportView(areaIngles);

        añadirPalabras.setText("Añadir Palabras");
        añadirPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirPalabrasActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/united-states.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spain.png"))); // NOI18N

        Traducir.setText("Traducir");
        Traducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraducirActionPerformed(evt);
            }
        });

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

        gestionProgramas1.setText("Palabras en Inglés");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(añadirPalabras)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Traducir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Traducir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(añadirPalabras)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gestionDistribucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionDistribucionesActionPerformed


    }//GEN-LAST:event_gestionDistribucionesActionPerformed
    /**
    * Componente del menu que llama al JFrame encargado de cargar los componentes del traductor Frances - Espanol
    * @param evt 
    */
    private void gestionProgramasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionProgramasActionPerformed
        TraductorFrances tf = new TraductorFrances();
        tf.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_gestionProgramasActionPerformed
    /**
     * Componente del menu que usando la clase JasperPrint y JasperViewer cargamos en una ventana el informe creado por iReport
     * @param evt 
     */
    private void gestionProgramas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionProgramas1ActionPerformed
        
        try {
            DBConnection conexion = new DBConnection();
            JasperReport informe = (JasperReport) JRLoader.loadObject("Informe_ingles.jasper");
            Map<String, Object> parametros = new HashMap<String, Object>();

            JasperPrint jasperPrint = JasperFillManager.fillReport(informe, parametros, conexion.getConnection());

            JasperViewer jrViewer = new JasperViewer(jasperPrint, true);
            JDialog viewer = new JDialog(new javax.swing.JFrame(), "Palabras en Ingles", true);
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
        
        
        añadirPalabrasIngles api = new añadirPalabrasIngles(this, true);
        api.setVisible(true);
        
    }//GEN-LAST:event_añadirPalabrasActionPerformed
/**
 * Función del componente JButton que realiza la traducción del texto de un textArea a otro y escribiendo "----" por cada palabra que no se encuentre en la base de datos
 * @param evt 
 */
    private void TraducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraducirActionPerformed
        InglesOP iop = new InglesOP();
        ArrayList<Ingles> palabras_ingles = iop.selectIngles();
        String[] palabras_traducir = areaIngles.getText().split(" ");
        areaTraducido.setText("");
        boolean comprobar_existe = false;
        for (int i = 0; i < palabras_traducir.length; i++) {
            comprobar_existe = false;
            for (int j = 0; j < palabras_ingles.size(); j++) {
                if (palabras_ingles.get(j).getOriginal().equals(palabras_traducir[i])) {
                    areaTraducido.append(palabras_ingles.get(j).getTraduccion()+" ");
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
            java.util.logging.Logger.getLogger(TraductorIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TraductorIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TraductorIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TraductorIngles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TraductorIngles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Distribuciones;
    private javax.swing.JMenu Programas;
    private javax.swing.JMenu Programas1;
    private javax.swing.JButton Traducir;
    private javax.swing.JTextArea areaIngles;
    private javax.swing.JTextArea areaTraducido;
    private javax.swing.JButton añadirPalabras;
    private javax.swing.JMenuItem gestionDistribuciones;
    private javax.swing.JMenuItem gestionProgramas;
    private javax.swing.JMenuItem gestionProgramas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
