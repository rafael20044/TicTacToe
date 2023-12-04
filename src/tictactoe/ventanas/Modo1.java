
package tictactoe.ventanas;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

public class Modo1 extends javax.swing.JPanel {
    boolean gameOver=false;
    int player,siguiente=0;
    
    public Modo1() {
        initComponents();
        primerTurno();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butt9 = new javax.swing.JButton();
        txtTurno = new javax.swing.JTextField();
        butt4 = new javax.swing.JButton();
        butt1 = new javax.swing.JButton();
        butt7 = new javax.swing.JButton();
        butt2 = new javax.swing.JButton();
        butt5 = new javax.swing.JButton();
        butt8 = new javax.swing.JButton();
        butt3 = new javax.swing.JButton();
        butt6 = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        butt9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        butt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt9ActionPerformed(evt);
            }
        });

        txtTurno.setEditable(false);
        txtTurno.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtTurno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        butt4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        butt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt4ActionPerformed(evt);
            }
        });

        butt1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        butt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt1ActionPerformed(evt);
            }
        });

        butt7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        butt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt7ActionPerformed(evt);
            }
        });

        butt2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        butt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt2ActionPerformed(evt);
            }
        });

        butt5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        butt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt5ActionPerformed(evt);
            }
        });

        butt8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        butt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt8ActionPerformed(evt);
            }
        });

        butt3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        butt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt3ActionPerformed(evt);
            }
        });

        butt6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        butt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt6ActionPerformed(evt);
            }
        });

        reiniciar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        reiniciar.setText("Reiniciar");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butt1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butt2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butt4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butt5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butt7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butt8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butt6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147)
                                .addComponent(reiniciar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butt9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addGap(0, 136, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butt3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTurno, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butt3, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(butt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTurno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butt4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(reiniciar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butt9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(144, 144, 144))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void butt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt3ActionPerformed
        if (siguiente==1) {
            butt3.setText("X");
            siguiente = 2;
            txtTurno.setBackground(Color.BLUE);
            txtTurno.setText("Es el turno del 0");
        }else{
            butt3.setText("O");
            siguiente = 1;
            txtTurno.setBackground(Color.red);
            txtTurno.setText("Es el turno de la x");
        }
        ganador();
        butt3.setEnabled(false);
    }//GEN-LAST:event_butt3ActionPerformed

    private void butt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt2ActionPerformed
        if (siguiente==1) {
            butt2.setText("X");
            siguiente = 2;
            txtTurno.setBackground(Color.BLUE);
            txtTurno.setText("Es el turno del 0");
        }else{
            butt2.setText("O");
            siguiente = 1;
            txtTurno.setBackground(Color.red);
            txtTurno.setText("Es el turno de la x");
        }
        ganador();
        butt2.setEnabled(false);
    }//GEN-LAST:event_butt2ActionPerformed

    private void butt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt1ActionPerformed
        if (siguiente==1) {
            butt1.setText("X");
            siguiente = 2;
            txtTurno.setBackground(Color.BLUE);
            txtTurno.setText("Es el turno del 0");
        }else{
            butt1.setText("O");
            siguiente = 1;
            txtTurno.setBackground(Color.red);
            txtTurno.setText("Es el turno de la x");
        }
        ganador();
        butt1.setEnabled(false);
    }//GEN-LAST:event_butt1ActionPerformed

    private void butt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt6ActionPerformed
        if (siguiente==1) {
            butt6.setText("X");
            siguiente = 2;
            txtTurno.setBackground(Color.BLUE);
            txtTurno.setText("Es el turno del 0");
        }else{
            butt6.setText("O");
            siguiente = 1;
            txtTurno.setBackground(Color.red);
            txtTurno.setText("Es el turno de la x");
        }
        ganador();
        butt6.setEnabled(false);
    }//GEN-LAST:event_butt6ActionPerformed

    private void butt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt5ActionPerformed
        if (siguiente==1) {
            butt5.setText("X");
            siguiente = 2;
            txtTurno.setBackground(Color.BLUE);
            txtTurno.setText("Es el turno del 0");
        }else{
            butt5.setText("O");
            siguiente = 1;
            txtTurno.setBackground(Color.red);
            txtTurno.setText("Es el turno de la x");
        }
        ganador();
        butt5.setEnabled(false);
    }//GEN-LAST:event_butt5ActionPerformed

    private void butt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt4ActionPerformed
        if (siguiente==1) {
            butt4.setText("X");
            siguiente = 2;
            txtTurno.setBackground(Color.BLUE);
            txtTurno.setText("Es el turno del 0");
        }else{
            butt4.setText("O");
            siguiente = 1;
            txtTurno.setBackground(Color.red);
            txtTurno.setText("Es el turno de la x");
        }
        ganador();
        butt4.setEnabled(false);
    }//GEN-LAST:event_butt4ActionPerformed

    private void butt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt9ActionPerformed
        if (siguiente==1) {
            butt9.setText("X");
            siguiente = 2;
            txtTurno.setBackground(Color.BLUE);
            txtTurno.setText("Es el turno del 0");
        }else{
            butt9.setText("O");
            siguiente = 1;
            txtTurno.setBackground(Color.red);
            txtTurno.setText("Es el turno de la x");
        }
        ganador();
        butt9.setEnabled(false);
    }//GEN-LAST:event_butt9ActionPerformed

    private void butt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt8ActionPerformed
        if (siguiente==1) {
            butt8.setText("X");
            siguiente = 2;
            txtTurno.setBackground(Color.BLUE);
            txtTurno.setText("Es el turno del 0");
        }else{
            butt8.setText("O");
            siguiente = 1;
            txtTurno.setBackground(Color.red);
            txtTurno.setText("Es el turno de la x");
        }
        ganador();
        butt8.setEnabled(false);
    }//GEN-LAST:event_butt8ActionPerformed

    private void butt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt7ActionPerformed
        if (siguiente==1) {
            butt7.setText("X");
            siguiente = 2;
            txtTurno.setBackground(Color.BLUE);
            txtTurno.setText("Es el turno del 0");
        }else{
            butt7.setText("O");
            siguiente = 1;
            txtTurno.setBackground(Color.red);
            txtTurno.setText("Es el turno de la x");
        }
        ganador();
        butt7.setEnabled(false);
    }//GEN-LAST:event_butt7ActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        if (gameOver) {
            activar();
            primerTurno();
            limpiar();            
        } else {
            JOptionPane.showMessageDialog(this, "El juego no a terminado");
        }
    }//GEN-LAST:event_reiniciarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Opciones o = new Opciones();
        o.setSize(924, 471);
        removeAll();
        add(o);
        repaint();
        revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void primerTurno(){
        Random r = new Random();
        player = r.nextInt(3);
        if (player==1) {
            siguiente = player;
            txtTurno.setBackground(Color.red);
            txtTurno.setText("Es el turno de la x");
        } else {
            siguiente = player;
            txtTurno.setBackground(Color.BLUE);
            txtTurno.setText("Es el turno del 0");
        }
    }
    
    private void ganador(){
        String b1 = butt1.getText();
        String b2 = butt2.getText();
        String b3 = butt3.getText();
        String b4 = butt4.getText();
        String b5 = butt5.getText();
        String b6 = butt6.getText();
        String b7 = butt7.getText();
        String b8 = butt8.getText();
        String b9 = butt9.getText();
        if (b1=="O" && b2=="O" && b3=="O" || b4=="O" && b5=="O" && b6=="O" || b7=="O" && b8=="O" && b9=="O" || b1=="O" && b4=="O" && b7=="O" || b2=="O" && b5=="O" && b8=="O" || b3=="O" && b6=="O" && b9=="O" || b1=="O" && b5=="O" && b9=="O" || b3=="O" && b5=="O" && b7=="O" ) {
            txtTurno.setBackground(Color.GREEN);
            txtTurno.setText("El ganador es O");
            gameOver=true;
            desactivar();
        }else if(b1=="X" && b2=="X" && b3=="X" || b4=="X" && b5=="X" && b6=="X" || b7=="X" && b8=="X" && b9=="X" || b1=="X" && b4=="X" && b7=="X" || b2=="X" && b5=="X" && b8=="X" || b3=="X" && b6=="X" && b9=="X" || b1=="X" && b5=="X" && b9=="X" || b3=="X" && b5=="X" && b7=="X" ){
            txtTurno.setBackground(Color.GREEN);
            txtTurno.setText("El ganador es X");   
            gameOver = true;
            desactivar();
        }else if(!b1.isEmpty() && !b2.isEmpty() && !b3.isEmpty() && !b4.isEmpty() && !b5.isEmpty() && !b6.isEmpty() && !b7.isEmpty() && !b8.isEmpty() && !b9.isEmpty() ){
            txtTurno.setBackground(Color.GRAY);
            gameOver=true;
            txtTurno.setText("Empate");
        }
    }
    
    private void desactivar(){
        butt1.setEnabled(false);
        butt2.setEnabled(false);
        butt3.setEnabled(false);
        butt4.setEnabled(false);
        butt5.setEnabled(false);
        butt6.setEnabled(false);
        butt7.setEnabled(false);
        butt8.setEnabled(false);
        butt9.setEnabled(false);
    }
    
    private void activar(){
         butt1.setEnabled(true);  
         butt2.setEnabled(true);  
         butt3.setEnabled(true);  
         butt4.setEnabled(true);  
         butt5.setEnabled(true);  
         butt6.setEnabled(true);  
         butt7.setEnabled(true);  
         butt8.setEnabled(true);  
         butt9.setEnabled(true);  
    }
    
    private void limpiar(){
        butt1.setText("");
        butt2.setText("");
        butt3.setText("");
        butt4.setText("");
        butt5.setText("");
        butt6.setText("");
        butt7.setText("");
        butt8.setText("");
        butt9.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butt1;
    private javax.swing.JButton butt2;
    private javax.swing.JButton butt3;
    private javax.swing.JButton butt4;
    private javax.swing.JButton butt5;
    private javax.swing.JButton butt6;
    private javax.swing.JButton butt7;
    private javax.swing.JButton butt8;
    private javax.swing.JButton butt9;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton reiniciar;
    private javax.swing.JTextField txtTurno;
    // End of variables declaration//GEN-END:variables
}
