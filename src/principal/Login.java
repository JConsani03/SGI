package principal;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerContrastIJTheme;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;

/**
 * Este es la primera interfaz visualizada por el usuario.
 * <p>
 *
 * En esta interfaz el usuario puede ingresar en el sistema al colocar su
 * <strong>nombre de usuario</strong> y <strong>contraseña</strong>
 * en los campos correspondientes, como también recuperar su cuenta si olvidó
 * alguno de los datos de la misma.
 *
 * @author Andrés García
 * @version Alpha 0.1.0
 */
public class Login extends JFrame {

    /**
     * Constructor de la clase. Inicializa los componentes y les agrega
     * propiedades Look and Feel.
     */
    public Login() {
        initComponents();
        txt_nombre.putClientProperty("JTextField.placeholderText", "Ingresa tu nombre de usuario");
        txt_pass.putClientProperty("JTextField.placeholderText", "xxxxxxxxx");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_banner = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_login = new javax.swing.JPanel();
        boton_salir = new javax.swing.JButton();
        separador_1 = new javax.swing.JSeparator();
        txt_nombre = new javax.swing.JTextField();
        label_nombre = new javax.swing.JLabel();
        label_pass = new javax.swing.JLabel();
        separador_2 = new javax.swing.JSeparator();
        txt_pass = new javax.swing.JPasswordField();
        label_titulo = new javax.swing.JLabel();
        boton_olvPass = new javax.swing.JButton();
        boton_Ingresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_banner.setBackground(new java.awt.Color(206, 207, 201));
        panel_banner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create by T.S.U. Andrés García");
        panel_banner.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 400));

        jPanel1.add(panel_banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 400));

        panel_login.setBackground(new java.awt.Color(10, 49, 67));
        panel_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_salir.setBackground(new java.awt.Color(186, 26, 26));
        boton_salir.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        boton_salir.setForeground(new java.awt.Color(255, 255, 255));
        boton_salir.setText("X");
        boton_salir.setToolTipText("Cerrar");
        boton_salir.setBorderPainted(false);
        boton_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_salirActionPerformed(evt);
            }
        });
        panel_login.add(boton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 30, 30));

        separador_1.setForeground(new java.awt.Color(187, 187, 188));
        panel_login.add(separador_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 220, 10));

        txt_nombre.setBackground(new java.awt.Color(10, 49, 67));
        txt_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_nombre.setToolTipText("");
        txt_nombre.setBorder(null);
        panel_login.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 220, 30));

        label_nombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        label_nombre.setForeground(new java.awt.Color(239, 239, 239));
        label_nombre.setText("Nombre");
        panel_login.add(label_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        label_pass.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        label_pass.setForeground(new java.awt.Color(239, 239, 239));
        label_pass.setText("Contraseña");
        panel_login.add(label_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        separador_2.setForeground(new java.awt.Color(187, 187, 188));
        panel_login.add(separador_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 220, 10));

        txt_pass.setBackground(new java.awt.Color(10, 49, 67));
        txt_pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_pass.setBorder(null);
        panel_login.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 220, 30));

        label_titulo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 32)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(239, 239, 239));
        label_titulo.setText("Iniciar Sesión");
        panel_login.add(label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        boton_olvPass.setBackground(new java.awt.Color(10, 49, 67));
        boton_olvPass.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        boton_olvPass.setText("¿Olvidaste la contraseña?");
        boton_olvPass.setBorder(null);
        boton_olvPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_olvPass.setFocusable(false);
        boton_olvPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_olvPassActionPerformed(evt);
            }
        });
        panel_login.add(boton_olvPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        boton_Ingresar.setBackground(new java.awt.Color(39, 110, 144));
        boton_Ingresar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        boton_Ingresar.setForeground(new java.awt.Color(239, 239, 239));
        boton_Ingresar.setText("Ingresar");
        boton_Ingresar.setBorderPainted(false);
        boton_Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_IngresarActionPerformed(evt);
            }
        });
        panel_login.add(boton_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, 35));

        jPanel1.add(panel_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 280, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Este evento cierra el programa.
     *
     * @param evt {@linkplain ActionEvent} con el evento generado.
     * @see JButton
     * @see ActionListener
     * @see ActionEvent
     */
    private void boton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_salirActionPerformed
        System.out.println(evt);
        System.exit(0);
    }//GEN-LAST:event_boton_salirActionPerformed

    /**
     * Este evento comprueba la existencia del usuario en la base de datos. Si
     * el usuario existe, da acceso al <strong>JFrame</strong>
     * <strong>Dashboard</strong>.
     *
     * @param evt {@linkplain ActionEvent} con el evento generado.
     * @see Dashboard
     * @see JButton
     * @see JFrame
     * @see ActionListener
     * @see ActionEvent
     */
    private void boton_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_IngresarActionPerformed
        System.out.println(evt);
        this.setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_boton_IngresarActionPerformed

    private void boton_olvPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_olvPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_olvPassActionPerformed

    /**
     * Este método {@link main} inicializa el Look and Feel
     * <strong>FlatMaterialDarkerContrast</strong>, agrega propiedades a los
     * componentes <strong>JButton</strong>
     * e inicia un nuevo <strong>Thread</strong> donde se establece en
     * {@code true} la visibilidad del <strong>JFrame</strong> de la clase.
     *
     * @param args {@linkplain String} con los argumentos de la línea de
     * comando.
     * @see JButton
     * @see Thread
     * @see EventQueue
     * @see FlatMaterialDarkerContrastIJTheme
     */
    public static void main(String args[]) {

        FlatMaterialDarkerContrastIJTheme.setup();
        UIManager.put("Button.arc", 25);
        //UIManager.put("TableHeader.background", new Color(206, 207, 201));
        UIManager.put("TableHeader.foreground", new Color(239,239,239));

        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Ingresar;
    private javax.swing.JButton boton_olvPass;
    private javax.swing.JButton boton_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_pass;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JPanel panel_banner;
    private javax.swing.JPanel panel_login;
    private javax.swing.JSeparator separador_1;
    private javax.swing.JSeparator separador_2;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
