/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Actividad3;

/**
 *
 * @author Nava
 */
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Formulario extends javax.swing.JFrame {
    public int control = 1;

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        
        
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
        jTextField3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        jTextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        jTextField5.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        jTextField6.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        jTextField7.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        jLabel11.setText("Círculo");
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField3.setVisible(false);
        jTextField7.setVisible(false);
        jLabel12.setText("Radio del círculo");
        jPanel5.setVisible(false);
        jPanel12.setVisible(false);
        jPanel13.setVisible(false);
        jPanel15.setVisible(false);
        
        //jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel5.setVisible(false);
        
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Sitka Heading", 2, 18)); // NOI18N
        jLabel4.setText("                     Figura a calcular");
        jLabel4.setPreferredSize(new java.awt.Dimension(184, 22));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 340, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 2, 18)); // NOI18N
        jLabel5.setText("-----------------------------------------------------");
        jLabel5.setPreferredSize(new java.awt.Dimension(184, 22));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 370, -1));

        jLabel12.setFont(new java.awt.Font("Sitka Heading", 2, 18)); // NOI18N
        jLabel12.setText("--------------------------------------------------");
        jLabel12.setPreferredSize(new java.awt.Dimension(184, 22));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 340, -1));

        jLabel13.setFont(new java.awt.Font("Sitka Heading", 2, 18)); // NOI18N
        jLabel13.setText("--------------------------------------------------");
        jLabel13.setPreferredSize(new java.awt.Dimension(184, 22));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 340, -1));

        jLabel14.setFont(new java.awt.Font("Sitka Heading", 2, 18)); // NOI18N
        jLabel14.setText("---------------------------------------------------");
        jLabel14.setPreferredSize(new java.awt.Dimension(184, 22));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 340, -1));

        jLabel15.setFont(new java.awt.Font("Sitka Heading", 2, 18)); // NOI18N
        jLabel15.setText("---------------------------------------------------");
        jLabel15.setPreferredSize(new java.awt.Dimension(184, 22));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 340, -1));

        jLabel16.setFont(new java.awt.Font("Sitka Heading", 2, 18)); // NOI18N
        jLabel16.setText("¡Todos los datos ingresados deben ser enteros!");
        jLabel16.setPreferredSize(new java.awt.Dimension(184, 22));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 360, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 360));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField3.setBackground(new java.awt.Color(210, 255, 255));
        jTextField3.setToolTipText("Ingrese el dato indicado");
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 310, -1));

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setForeground(new java.awt.Color(255, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 310, 3));

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("             Enviar");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 1, 140, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 140, 30));

        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("            Limpiar");
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 140, 30));

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 140, 30));

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("           Círculo");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 30));

        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("       Cuadrado");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 100, 30));

        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("       Rectangulo");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 100, 30));

        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("            Rombo");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 110, 30));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 110, 30));

        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("        Trapecio");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 100, 30));

        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("  Triangulo Rect.");
        jPanel11.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 100, 30));

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 100, 30));

        jLabel11.setText("jLabel11");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jPanel12.setBackground(new java.awt.Color(153, 153, 255));
        jPanel12.setForeground(new java.awt.Color(255, 204, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 310, 3));

        jTextField4.setBackground(new java.awt.Color(210, 255, 255));
        jTextField4.setToolTipText("Ingrese el dato indicado");
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 310, -1));

        jTextField5.setBackground(new java.awt.Color(210, 255, 255));
        jTextField5.setToolTipText("Ingrese el dato indicado");
        jTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 310, 20));

        jPanel13.setBackground(new java.awt.Color(153, 153, 255));
        jPanel13.setForeground(new java.awt.Color(255, 204, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 310, 3));

        jPanel14.setBackground(new java.awt.Color(153, 153, 255));
        jPanel14.setForeground(new java.awt.Color(255, 204, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 310, 3));

        jTextField6.setBackground(new java.awt.Color(210, 255, 255));
        jTextField6.setToolTipText("Ingrese el dato indicado");
        jTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 310, -1));

        jPanel15.setBackground(new java.awt.Color(153, 153, 255));
        jPanel15.setForeground(new java.awt.Color(255, 204, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 310, 3));

        jTextField7.setBackground(new java.awt.Color(210, 255, 255));
        jTextField7.setToolTipText("Ingrese el dato indicado");
        jTextField7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 310, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 310, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        //evento limpiar     
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
    }//GEN-LAST:event_jPanel10MouseClicked
    
    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // evento enviar
        try{
            switch(control){
                case 1 -> {
                    int radio = Integer.parseInt(jTextField6.getText());
                    Circulo circulo = new Circulo(radio);
                    JOptionPane.showMessageDialog(null, "El area del círculo es : " + circulo.calcularArea());
                    JOptionPane.showMessageDialog(null, "El perimetro del circulo es  : "+ circulo.calcularPerimetro());
                    
                }
                case 2 -> {
                    int lado = Integer.parseInt(jTextField6.getText());
                    Cuadrado cuadrado = new Cuadrado(lado);
                    JOptionPane.showMessageDialog(null, "El area del cuadrado es : "+ cuadrado.calcularArea());
                    JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es : "+ cuadrado.calcularPerimetro());
                    
                }
                case 3 -> {
                    int base = Integer.parseInt(jTextField6.getText());
                    int altura = Integer.parseInt(jTextField4.getText());
                    Rectangulo rectangulo = new Rectangulo(base,altura);
                    JOptionPane.showMessageDialog(null, "El area del rectangulo es : "+ rectangulo.calcularArea());
                    JOptionPane.showMessageDialog(null, "El perimetro del rectangulo es : "+ rectangulo.calcularPerimetro());

                }
                case 4 -> {
                    int diagonalmenor = Integer.parseInt(jTextField6.getText());
                    int diagonalmayor = Integer.parseInt(jTextField4.getText());
                    Rombo rombo = new Rombo(diagonalmenor, diagonalmayor);
                    JOptionPane.showMessageDialog(null, "El area del rombo es : "+ rombo.calcularArea());
                    JOptionPane.showMessageDialog(null, "El perimetro del rombo es : "+ rombo.calcularPerimetro());
                
                }
                case 5 -> {
                    int basemenor = Integer.parseInt(jTextField6.getText());
                    int basemayor = Integer.parseInt(jTextField4.getText());
                    int altura = Integer.parseInt(jTextField5.getText());
                    int lado1 = Integer.parseInt(jTextField3.getText());
                    int lado2 = Integer.parseInt(jTextField7.getText());
                    Trapecio trapecio = new Trapecio(basemenor, basemayor, altura, lado1, lado2);
                    JOptionPane.showMessageDialog(null, "El area del trapecio es : "+ trapecio.calcularArea());
                    JOptionPane.showMessageDialog(null, "El perimetro del trapecio es : "+ trapecio.calcularPerimetro());             
                }
                case 6 -> {
                    int base = Integer.parseInt(jTextField6.getText());
                    int altura = Integer.parseInt(jTextField4.getText());
                    TrianguloRectangulo triang = new TrianguloRectangulo(base,altura);
                    JOptionPane.showMessageDialog(null, "El area del triangulo es : "+ triang.calcularArea());
                    JOptionPane.showMessageDialog(null, "El perimetro del triangulo es : "+ triang.calcularPerimetro());
                
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Error al ingresar los datos (verificar entradas)");
                }
            
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al ingresar los datos (verificar entradas)");
        }
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // círculo 
        control = 1;
        jLabel11.setText("Circulo");        
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField3.setVisible(false);
        jTextField7.setVisible(false);
        jLabel12.setText("Radio del círculo");
        jPanel5.setVisible(false);
        jPanel12.setVisible(false);
        jPanel13.setVisible(false);
        jPanel15.setVisible(false);
        
        //jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel5.setVisible(false);
        
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // Cuadrado
        control = 2;
        jLabel11.setText("Cuadrado");
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField3.setVisible(false);
        jTextField7.setVisible(false);
        jLabel12.setText("Lado del cuadrado");
        jPanel5.setVisible(false);
        jPanel12.setVisible(false);
        jPanel13.setVisible(false);
        jPanel15.setVisible(false);
        
        //jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel5.setVisible(false);
        
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // rectángulo
        control = 3;
        jLabel11.setText("Rectángulo");
        jTextField4.setVisible(true);
        jTextField5.setVisible(false);
        jTextField3.setVisible(false);
        jTextField7.setVisible(false);
        jLabel12.setText("Base del rectangulo");
        jLabel13.setText("Altura del rectangulo");
        jPanel5.setVisible(false);
        jPanel12.setVisible(true);
        jPanel13.setVisible(false);
        jPanel15.setVisible(false);
        
        //jLabel12.setVisible(false);
        jLabel13.setVisible(true);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel5.setVisible(false);
        
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        //rombo
        control = 4;
        jLabel11.setText("Rombo");
        jTextField4.setVisible(true);
        jTextField5.setVisible(false);
        jTextField3.setVisible(false);
        jTextField7.setVisible(false);
        jLabel12.setText("Diagonal menor");
        jLabel13.setText("Diagonal mayor");
        jPanel5.setVisible(false);
        jPanel12.setVisible(true);
        jPanel13.setVisible(false);
        jPanel15.setVisible(false);
        
        //jLabel12.setVisible(false);
        jLabel13.setVisible(true);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel5.setVisible(false);
        
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        // trapecio
        control = 5;
        jLabel11.setText("Trapecio");
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
        jTextField3.setVisible(true);
        jTextField7.setVisible(true);
        jLabel12.setText("Base menor");
        jLabel13.setText("Base mayor");
        jLabel14.setText("Altura del trapecio");
        jLabel15.setText("Longitud lado 1");
        jLabel5.setText("Longitud lado 2");
        jPanel5.setVisible(true);
        jPanel12.setVisible(true);
        jPanel13.setVisible(true);
        jPanel15.setVisible(true);
        
        //jLabel12.setVisible(false);
        jLabel13.setVisible(true);
        jLabel14.setVisible(true);
        jLabel15.setVisible(true);
        jLabel5.setVisible(true);
        
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        // triangulo rect
        control = 6;
        jLabel11.setText("Triángulo Rectángulo");
        jTextField4.setVisible(true);
        jTextField5.setVisible(false);
        jTextField3.setVisible(false);
        jTextField7.setVisible(false);
        jLabel12.setText("Base del triangulo");
        jLabel13.setText("Altura del triangulo");
        jPanel5.setVisible(false);
        jPanel12.setVisible(true);
        jPanel13.setVisible(false);
        jPanel15.setVisible(false);
        
        //jLabel12.setVisible(false);
        jLabel13.setVisible(true);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel5.setVisible(false);
        
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
    }//GEN-LAST:event_jPanel11MouseClicked
    
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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
