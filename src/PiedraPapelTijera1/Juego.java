package PiedraPapelTijera1;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Juego extends javax.swing.JFrame {

    PiedraPapelTijera ppt = new PiedraPapelTijera();
    Icon normalDer = new ImageIcon("src/PiedraPapelTijera/Imagenes/piedra_izquierda.jpg");
    Icon normalIzq = new ImageIcon("src/PiedraPapelTijera/Imagenes/piedra_derecha.jpg");
    Icon piedraDer = new ImageIcon("src/PiedraPapelTijera/Imagenes/piedra_izquierda.jpg");
    Icon piedraIzq = new ImageIcon("src/PiedraPapelTijera/Imagenes/piedra_derecha.jpg");
    Icon papelDer = new ImageIcon("src/PiedraPapelTijera/Imagenes/papel_derecha.jpg");
    Icon papelIzq = new ImageIcon("src/PiedraPapelTijera/Imagenes/papel_izquierda.jpg");
    Icon tijeraDer = new ImageIcon("src/PiedraPapelTijera/Imagenes/tijera_derecha.jpg");
    Icon tijeraIzq = new ImageIcon("src/PiedraPapelTijera/Imagenes/tijera_izquierda.jpg");
    int opcion;
    
    public Juego() {
        initComponents();
        ppt.generarJugada();
        this.jugar.setEnabled(false);
        this.setLocationRelativeTo(this);
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreJugador = new javax.swing.JLabel();
        manoJ1icon = new javax.swing.JLabel();
        manoCPUicon = new javax.swing.JLabel();
        piedrabtn = new javax.swing.JButton();
        papelbtn = new javax.swing.JButton();
        tijerabtn = new javax.swing.JButton();
        jugar = new javax.swing.JButton();
        eleccionJ1 = new javax.swing.JLabel();
        eleccionCPU = new javax.swing.JLabel();
        nombreCPU = new javax.swing.JLabel();
        nuevo_juego = new javax.swing.JButton();
        Fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreJugador.setBackground(new java.awt.Color(255, 255, 51));
        nombreJugador.setFont(new java.awt.Font("Yu Mincho Light", 1, 14)); // NOI18N
        nombreJugador.setForeground(new java.awt.Color(255, 255, 51));
        nombreJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreJugador.setText("Player 1");

        manoJ1icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PiedraPapelTijera/Imagenes/piedra_derecha.jpg"))); // NOI18N

        manoCPUicon.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        manoCPUicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PiedraPapelTijera/Imagenes/piedra_izquierda.jpg"))); // NOI18N

        piedrabtn.setBackground(new java.awt.Color(204, 204, 255));
        piedrabtn.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        piedrabtn.setText("PIEDRA");
        piedrabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piedrabtnActionPerformed(evt);
            }
        });

        papelbtn.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        papelbtn.setText("PAPEL");
        papelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papelbtnActionPerformed(evt);
            }
        });

        tijerabtn.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        tijerabtn.setText("TIJERA");
        tijerabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tijerabtnActionPerformed(evt);
            }
        });

        jugar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jugar.setText("JUGAR");
        jugar.setPreferredSize(new java.awt.Dimension(77, 23));
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });

        eleccionJ1.setBackground(new java.awt.Color(255, 255, 255));
        eleccionJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eleccionJ1.setOpaque(true);

        eleccionCPU.setBackground(new java.awt.Color(255, 255, 255));
        eleccionCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eleccionCPU.setOpaque(true);

        nombreCPU.setFont(new java.awt.Font("Yu Mincho Light", 1, 11)); // NOI18N
        nombreCPU.setForeground(new java.awt.Color(255, 255, 51));
        nombreCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreCPU.setText("CPU");

        nuevo_juego.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        nuevo_juego.setText("NUEVO JUEGO");
        nuevo_juego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_juegoActionPerformed(evt);
            }
        });

        Fondo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PiedraPapelTijera/Imagenes/fondo_pricipal.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(manoJ1icon, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(manoCPUicon, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(eleccionJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(nombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(eleccionCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nombreCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(piedrabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nuevo_juego, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(papelbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(116, 116, 116)
                .addComponent(tijerabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Fondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreCPU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eleccionCPU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eleccionJ1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manoCPUicon, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manoJ1icon, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tijerabtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(papelbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(piedrabtn, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(nuevo_juego, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Fondo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void piedrabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piedrabtnActionPerformed
        ppt.setJugadaPlayer(ppt.PIEDRA);
        eleccionJ1.setText(ppt.getJugadaPlayer1());
        this.jugar.setEnabled(true);
    }//GEN-LAST:event_piedrabtnActionPerformed

    private void papelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papelbtnActionPerformed
        ppt.setJugadaPlayer(ppt.PAPEL);
        eleccionJ1.setText(ppt.getJugadaPlayer1());
        this.jugar.setEnabled(true);
    }//GEN-LAST:event_papelbtnActionPerformed

    private void tijerabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tijerabtnActionPerformed
        ppt.setJugadaPlayer(ppt.TIJERA);
        eleccionJ1.setText(ppt.getJugadaPlayer1());
        this.jugar.setEnabled(true);
    }//GEN-LAST:event_tijerabtnActionPerformed

    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed

        ppt.comparaJugada();

        switch (ppt.getJugadaPlayer()) {
            case 1:
            manoJ1icon.setIcon(piedraIzq);
            break;
            case 2:
            manoJ1icon.setIcon(papelIzq);
            break;
            case 3:
            manoJ1icon.setIcon(tijeraIzq);
            break;
        }
        switch (ppt.getIntJugadaCPU()) {
            case 1:
            manoCPUicon.setIcon(piedraDer);
            break;
            case 2:
            manoCPUicon.setIcon(papelDer);
            break;
            case 3:
            manoCPUicon.setIcon(tijeraDer);
            break;
        }
        this.piedrabtn.setEnabled(false);
        this.papelbtn.setEnabled(false);
        this.tijerabtn.setEnabled(false);


        eleccionCPU.setText(ppt.getJugadaCPU());
        jugar.setEnabled(false);

    }//GEN-LAST:event_jugarActionPerformed

    private void nuevo_juegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_juegoActionPerformed
        ppt.generarJugada();
        eleccionJ1.setText(null);
        eleccionCPU.setText(null);
        this.piedrabtn.setEnabled(true);
        this.papelbtn.setEnabled(true);
        this.tijerabtn.setEnabled(true);

        manoJ1icon.setIcon(normalIzq);
        manoCPUicon.setIcon(normalDer);
    }//GEN-LAST:event_nuevo_juegoActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo2;
    private javax.swing.JLabel eleccionCPU;
    private javax.swing.JLabel eleccionJ1;
    private javax.swing.JButton jugar;
    private javax.swing.JLabel manoCPUicon;
    private javax.swing.JLabel manoJ1icon;
    private javax.swing.JLabel nombreCPU;
    private javax.swing.JLabel nombreJugador;
    private javax.swing.JButton nuevo_juego;
    private javax.swing.JButton papelbtn;
    private javax.swing.JButton piedrabtn;
    private javax.swing.JButton tijerabtn;
    // End of variables declaration//GEN-END:variables
}