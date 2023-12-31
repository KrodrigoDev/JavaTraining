package calculadora;

import java.awt.Color;

/**
 *
 * @author Kauã Rodrigo
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form calculadora
     */
    
    double numeros[] = new double[2];
    String sinal;

    public Calculadora() {
        initComponents();

        // sinal inicializado
        sinal = "";
          
        // Mudando a cor de fundo
        getContentPane().setBackground(Color.BLACK);
    }
    
    public void recuperarValor(){
        numeros[0] = Double.parseDouble(textResultado.getText());
    } 
    
    public void limparCampo(){
        textResultado.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelResultado = new javax.swing.JPanel();
        textResultado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bntLimpar = new javax.swing.JButton();
        bntRestoDivisao = new javax.swing.JButton();
        bntDivisao = new javax.swing.JButton();
        bntMultiplicacao = new javax.swing.JButton();
        bntSubtracao = new javax.swing.JButton();
        bntAdicao = new javax.swing.JButton();
        bntResultado = new javax.swing.JButton();
        bnt8 = new javax.swing.JButton();
        bnt7 = new javax.swing.JButton();
        bnt9 = new javax.swing.JButton();
        bnt6 = new javax.swing.JButton();
        bnt4 = new javax.swing.JButton();
        bnt5 = new javax.swing.JButton();
        bnt3 = new javax.swing.JButton();
        bnt2 = new javax.swing.JButton();
        bnt1 = new javax.swing.JButton();
        bnt0 = new javax.swing.JButton();
        bntPonto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Calculadora"); // NOI18N
        setResizable(false);

        painelResultado.setBackground(new java.awt.Color(0, 0, 0));

        textResultado.setBackground(new java.awt.Color(255, 255, 255));
        textResultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textResultado.setForeground(new java.awt.Color(255, 255, 255));
        textResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout painelResultadoLayout = new javax.swing.GroupLayout(painelResultado);
        painelResultado.setLayout(painelResultadoLayout);
        painelResultadoLayout.setHorizontalGroup(
            painelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelResultadoLayout.setVerticalGroup(
            painelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("..");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bntLimpar.setBackground(new java.awt.Color(102, 102, 102));
        bntLimpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bntLimpar.setForeground(new java.awt.Color(0, 0, 0));
        bntLimpar.setText("C");
        bntLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLimparActionPerformed(evt);
            }
        });

        bntRestoDivisao.setBackground(new java.awt.Color(102, 102, 102));
        bntRestoDivisao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntRestoDivisao.setForeground(new java.awt.Color(0, 0, 0));
        bntRestoDivisao.setText("%");
        bntRestoDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRestoDivisaoActionPerformed(evt);
            }
        });

        bntDivisao.setBackground(new java.awt.Color(255, 102, 0));
        bntDivisao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bntDivisao.setForeground(new java.awt.Color(255, 255, 255));
        bntDivisao.setText("/");
        bntDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDivisaoActionPerformed(evt);
            }
        });

        bntMultiplicacao.setBackground(new java.awt.Color(255, 102, 0));
        bntMultiplicacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bntMultiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        bntMultiplicacao.setText("x");
        bntMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMultiplicacaoActionPerformed(evt);
            }
        });

        bntSubtracao.setBackground(new java.awt.Color(255, 102, 0));
        bntSubtracao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bntSubtracao.setForeground(new java.awt.Color(255, 255, 255));
        bntSubtracao.setText("-");
        bntSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSubtracaoActionPerformed(evt);
            }
        });

        bntAdicao.setBackground(new java.awt.Color(255, 102, 0));
        bntAdicao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bntAdicao.setForeground(new java.awt.Color(255, 255, 255));
        bntAdicao.setText("+");
        bntAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAdicaoActionPerformed(evt);
            }
        });

        bntResultado.setBackground(new java.awt.Color(255, 102, 0));
        bntResultado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bntResultado.setForeground(new java.awt.Color(255, 255, 255));
        bntResultado.setText("=");
        bntResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntResultadoActionPerformed(evt);
            }
        });

        bnt8.setBackground(new java.awt.Color(51, 51, 51));
        bnt8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bnt8.setForeground(new java.awt.Color(255, 255, 255));
        bnt8.setText("8");
        bnt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt8ActionPerformed(evt);
            }
        });

        bnt7.setBackground(new java.awt.Color(51, 51, 51));
        bnt7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bnt7.setForeground(new java.awt.Color(255, 255, 255));
        bnt7.setText("7");
        bnt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt7ActionPerformed(evt);
            }
        });

        bnt9.setBackground(new java.awt.Color(51, 51, 51));
        bnt9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bnt9.setForeground(new java.awt.Color(255, 255, 255));
        bnt9.setText("9");
        bnt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt9ActionPerformed(evt);
            }
        });

        bnt6.setBackground(new java.awt.Color(51, 51, 51));
        bnt6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bnt6.setForeground(new java.awt.Color(255, 255, 255));
        bnt6.setText("6");
        bnt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt6ActionPerformed(evt);
            }
        });

        bnt4.setBackground(new java.awt.Color(51, 51, 51));
        bnt4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bnt4.setForeground(new java.awt.Color(255, 255, 255));
        bnt4.setText("4");
        bnt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt4ActionPerformed(evt);
            }
        });

        bnt5.setBackground(new java.awt.Color(51, 51, 51));
        bnt5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bnt5.setForeground(new java.awt.Color(255, 255, 255));
        bnt5.setText("5");
        bnt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt5ActionPerformed(evt);
            }
        });

        bnt3.setBackground(new java.awt.Color(51, 51, 51));
        bnt3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bnt3.setForeground(new java.awt.Color(255, 255, 255));
        bnt3.setText("3");
        bnt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt3ActionPerformed(evt);
            }
        });

        bnt2.setBackground(new java.awt.Color(51, 51, 51));
        bnt2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bnt2.setForeground(new java.awt.Color(255, 255, 255));
        bnt2.setText("2");
        bnt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt2ActionPerformed(evt);
            }
        });

        bnt1.setBackground(new java.awt.Color(51, 51, 51));
        bnt1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bnt1.setForeground(new java.awt.Color(255, 255, 255));
        bnt1.setText("1");
        bnt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt1ActionPerformed(evt);
            }
        });

        bnt0.setBackground(new java.awt.Color(51, 51, 51));
        bnt0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bnt0.setForeground(new java.awt.Color(255, 255, 255));
        bnt0.setText("0");
        bnt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt0ActionPerformed(evt);
            }
        });

        bntPonto.setBackground(new java.awt.Color(51, 51, 51));
        bntPonto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bntPonto.setForeground(new java.awt.Color(255, 255, 255));
        bntPonto.setText(".");
        bntPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPontoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bnt0, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bntPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bntResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bntLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bnt7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bnt6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bnt3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bnt8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bnt5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bntRestoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bnt9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bnt4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bntAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bntSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bntMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bntDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(painelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bntLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bntRestoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnt8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnt5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bntRestoDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRestoDivisaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntRestoDivisaoActionPerformed

    private void bntDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDivisaoActionPerformed
        // TODO add your handling code here:
        recuperarValor();
        limparCampo();
        sinal = "/";
    }//GEN-LAST:event_bntDivisaoActionPerformed

    private void bntMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntMultiplicacaoActionPerformed
        // TODO add your handling code here:
        
        recuperarValor();
        limparCampo();
        sinal = "x";
    }//GEN-LAST:event_bntMultiplicacaoActionPerformed

    private void bntSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSubtracaoActionPerformed
        // TODO add your handling code here:
        recuperarValor();
        limparCampo();
        sinal = "-";
    }//GEN-LAST:event_bntSubtracaoActionPerformed

    private void bntAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAdicaoActionPerformed
        // TODO add your handling code here:
        recuperarValor();
        limparCampo();
        sinal = "+"; 
    }//GEN-LAST:event_bntAdicaoActionPerformed

    private void bntResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntResultadoActionPerformed
        // TODO add your handling code here:
        
        numeros[1] = Double.parseDouble(textResultado.getText());
        
        
        if(sinal.equals("+")){
            textResultado.setText(Double.toString(numeros[0] + numeros[1]));
        } else if(sinal.equals("x")){
            textResultado.setText(Double.toString(numeros[0] * numeros[1]));
        } else if(sinal.equals("-")){
            textResultado.setText(Double.toString(numeros[0] - numeros[1]));
        }  else if(sinal.equals("/")){
            textResultado.setText(Double.toString(numeros[0] / numeros[1]));
        }
    }//GEN-LAST:event_bntResultadoActionPerformed

    private void bnt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt8ActionPerformed
        // TODO add your handling code here:
        textResultado.setText(textResultado.getText() + 8);
    }//GEN-LAST:event_bnt8ActionPerformed

    private void bnt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt9ActionPerformed
        // TODO add your handling code here:
        textResultado.setText(textResultado.getText() + 9);
    }//GEN-LAST:event_bnt9ActionPerformed

    private void bnt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt4ActionPerformed
        // TODO add your handling code here:
        textResultado.setText(textResultado.getText() + 4);
    }//GEN-LAST:event_bnt4ActionPerformed

    private void bnt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt5ActionPerformed
        // TODO add your handling code here:
        textResultado.setText(textResultado.getText() + 5);
    }//GEN-LAST:event_bnt5ActionPerformed

    private void bnt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt2ActionPerformed
        // TODO add your handling code here:
        textResultado.setText(textResultado.getText() + 2);
    }//GEN-LAST:event_bnt2ActionPerformed

    private void bnt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt1ActionPerformed
        // TODO add your handling code here:
        textResultado.setText(textResultado.getText() + 1); 
    }//GEN-LAST:event_bnt1ActionPerformed

    private void bntPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPontoActionPerformed
        // TODO add your handling code here:
        textResultado.setText(textResultado.getText() + ".");
    }//GEN-LAST:event_bntPontoActionPerformed

    private void bnt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt0ActionPerformed
        // TODO add your handling code here:
        textResultado.setText(textResultado.getText() + 0);
    }//GEN-LAST:event_bnt0ActionPerformed

    private void bnt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt7ActionPerformed
        // TODO add your handling code here:
        textResultado.setText(textResultado.getText() + 7);
    }//GEN-LAST:event_bnt7ActionPerformed

    private void bnt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt6ActionPerformed
        // TODO add your handling code here:
        textResultado.setText(textResultado.getText() + 6);
    }//GEN-LAST:event_bnt6ActionPerformed

    private void bnt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt3ActionPerformed
        // TODO add your handling code here:
        textResultado.setText(textResultado.getText() + 3);
    }//GEN-LAST:event_bnt3ActionPerformed

    private void bntLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimparActionPerformed
        // TODO add your handling code here:
        textResultado.setText("");
    }//GEN-LAST:event_bntLimparActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt0;
    private javax.swing.JButton bnt1;
    private javax.swing.JButton bnt2;
    private javax.swing.JButton bnt3;
    private javax.swing.JButton bnt4;
    private javax.swing.JButton bnt5;
    private javax.swing.JButton bnt6;
    private javax.swing.JButton bnt7;
    private javax.swing.JButton bnt8;
    private javax.swing.JButton bnt9;
    private javax.swing.JButton bntAdicao;
    private javax.swing.JButton bntDivisao;
    private javax.swing.JButton bntLimpar;
    private javax.swing.JButton bntMultiplicacao;
    private javax.swing.JButton bntPonto;
    private javax.swing.JButton bntRestoDivisao;
    private javax.swing.JButton bntResultado;
    private javax.swing.JButton bntSubtracao;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel painelResultado;
    private javax.swing.JLabel textResultado;
    // End of variables declaration//GEN-END:variables
}
