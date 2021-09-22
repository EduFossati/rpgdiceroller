/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import backgroundDados.Dados;

/**
 *
 * @author user
 */
public class GUIResultado extends javax.swing.JFrame {

    backgroundDados.Dados dados = new Dados();
    
    public void setarResultados(){
        jtmodD4.setText(Integer.toString(0));
        jtmodD6.setText(Integer.toString(0));
        jtmodD8.setText(Integer.toString(0));
        jtmodD10.setText(Integer.toString(0));
        jtmodD12.setText(Integer.toString(0));
        jtmodD20.setText(Integer.toString(0));
        jtmodD100.setText(Integer.toString(0));
        jtmodDCustom.setText(Integer.toString(0));
    }
    
    public void limparCampos(){
        jtmodD4.setText(Integer.toString(0));
        jtmodD6.setText(Integer.toString(0));
        jtmodD8.setText(Integer.toString(0));
        jtmodD10.setText(Integer.toString(0));
        jtmodD12.setText(Integer.toString(0));
        jtmodD20.setText(Integer.toString(0));
        jtmodD100.setText(Integer.toString(0));
        
        jsD4.setValue(0);
        jsD6.setValue(0);
        jsD8.setValue(0);
        jsD10.setValue(0);
        jsD12.setValue(0);
        jsD20.setValue(0);
        jsD100.setValue(0);
        
        jlResultadoD4.setText(null);
        jlResultadoD6.setText(null);
        jlResultadoD8.setText(null);
        jlResultadoD10.setText(null);
        jlResultadoD12.setText(null);
        jlResultadoD20.setText(null);
        jlResultadoD100.setText(null);
        
        jlVantagemD4.setText(null);
        jlVantagemD6.setText(null);
        jlVantagemD8.setText(null);
        jlVantagemD10.setText(null);
        jlVantagemD12.setText(null);
        jlVantagemD20.setText(null);
        jlVantagemD100.setText(null);
        
        jCD4vant.setSelected(false);
        jCD6vant.setSelected(false);
        jCD8vant.setSelected(false);
        jCD10vant.setSelected(false);
        jCD12vant.setSelected(false);
        jCD20vant.setSelected(false);
        jCD100vant.setSelected(false);
    }
    
     public void calcularD4(){
        dados.setQuantidade((int) jsD4.getModel().getValue());
        dados.setModificador(Integer.parseInt(jtmodD4.getText()));
        jlResultadoD4.setText(Integer.toString(dados.rolarDquatro()));
        
        if (jCD4vant.isSelected()){
            dados.setQuantidade(1);
            dados.setModificador(Integer.parseInt(jtmodD4.getText()));
            jlVantagemD4.setText(Integer.toString(dados.rolarDquatro()));
        }
    }
     
  
    
    public void calcularD6(){
        dados.setQuantidade((int) jsD6.getModel().getValue());
        dados.setModificador(Integer.parseInt(jtmodD6.getText()));
        jlResultadoD6.setText(Integer.toString(dados.rolarDseis()));
        
        if (jCD6vant.isSelected()){
            dados.setQuantidade(1);
            dados.setModificador(Integer.parseInt(jtmodD6.getText()));
            jlVantagemD6.setText(Integer.toString(dados.rolarDseis()));
        }
    }
    
    public void calcularD8(){
        dados.setQuantidade((int) jsD8.getModel().getValue());
        dados.setModificador(Integer.parseInt(jtmodD8.getText()));
        jlResultadoD8.setText(Integer.toString(dados.rolarDoito()));
        
        if (jCD8vant.isSelected()){
            dados.setQuantidade(1);
            dados.setModificador(Integer.parseInt(jtmodD8.getText()));
            jlVantagemD8.setText(Integer.toString(dados.rolarDoito()));
        }
    }
    
    public void calcularD10(){
        dados.setQuantidade((int) jsD10.getModel().getValue());
        dados.setModificador(Integer.parseInt(jtmodD10.getText()));
        jlResultadoD10.setText(Integer.toString(dados.rolarDdez()));
        
        if (jCD10vant.isSelected()){
            dados.setQuantidade(1);
            dados.setModificador(Integer.parseInt(jtmodD10.getText()));
            jlVantagemD10.setText(Integer.toString(dados.rolarDdez()));
        }
    }
    
    public void calcularD12(){
        dados.setQuantidade((int) jsD12.getModel().getValue());
        dados.setModificador(Integer.parseInt(jtmodD12.getText()));
        jlResultadoD12.setText((Integer.toString(dados.rolarDdoze())));
        
        if (jCD12vant.isSelected()){
            dados.setQuantidade(1);
            dados.setModificador(Integer.parseInt(jtmodD12.getText()));
            jlVantagemD12.setText(Integer.toString(dados.rolarDdoze()));
        }
        
        
    }
    
    public void calcularD20(){
        dados.setQuantidade((int) jsD20.getModel().getValue());
        dados.setModificador(Integer.parseInt(jtmodD20.getText()));
        jlResultadoD20.setText(Integer.toString(dados.rolarDvinte()));
        
        if (jCD20vant.isSelected()){
            dados.setQuantidade(1);
            dados.setModificador(Integer.parseInt(jtmodD20.getText()));
            jlVantagemD20.setText(Integer.toString(dados.rolarDvinte()));
        }
    }
    
    public void calcularD100(){
        dados.setQuantidade((int) jsD100.getModel().getValue());
        dados.setModificador(Integer.parseInt(jtmodD100.getText()));
        jlResultadoD100.setText(Integer.toString(dados.rolarDcem()));
        
        if (jCD100vant.isSelected()){
            dados.setQuantidade(1);
            dados.setModificador(Integer.parseInt(jtmodD100.getText()));
            jlVantagemD100.setText(Integer.toString(dados.rolarDcem()));
        }
    } 
    
    public void calcularDadoCustom(){
        dados.setValorCustom(Integer.parseInt(jtValorDadoCustom.getText()));
        dados.setQuantidade((int) jsDCustom.getModel().getValue());
        dados.setModificador(Integer.parseInt(jtmodDCustom.getText()));
        jlResultadoDcustom.setText(Integer.toString(dados.rolarDadoCustom()));
       
        if (jCDcustomVant.isSelected()){
            dados.setQuantidade(1);
            dados.setModificador(Integer.parseInt(jtmodDCustom.getText()));
            jlVantagemDcustom.setText(Integer.toString(dados.rolarDadoCustom()));
        }
    }
            
    public GUIResultado() {
        initComponents();
        setarResultados();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jlQtd1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbRolarD4 = new javax.swing.JButton();
        jlDquatro = new javax.swing.JLabel();
        jsD4 = new javax.swing.JSpinner();
        jlResultadoD4 = new javax.swing.JLabel();
        jtmodD4 = new javax.swing.JTextField();
        jCD4vant = new javax.swing.JCheckBox();
        jlVantagemD4 = new javax.swing.JLabel();
        jlResultado = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbRolarD6 = new javax.swing.JButton();
        jsD6 = new javax.swing.JSpinner();
        jlDseis = new javax.swing.JLabel();
        jlResultadoD6 = new javax.swing.JLabel();
        jtmodD6 = new javax.swing.JTextField();
        jCD6vant = new javax.swing.JCheckBox();
        jlVantagemD6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jlResultadoD8 = new javax.swing.JLabel();
        jbRolarD8 = new javax.swing.JButton();
        jsD8 = new javax.swing.JSpinner();
        jlDoito = new javax.swing.JLabel();
        jtmodD8 = new javax.swing.JTextField();
        jCD8vant = new javax.swing.JCheckBox();
        jlVantagemD8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jbRolarD10 = new javax.swing.JButton();
        jsD10 = new javax.swing.JSpinner();
        jlDdez = new javax.swing.JLabel();
        jlResultadoD10 = new javax.swing.JLabel();
        jtmodD10 = new javax.swing.JTextField();
        jCD10vant = new javax.swing.JCheckBox();
        jlVantagemD10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jlDdoze = new javax.swing.JLabel();
        jsD12 = new javax.swing.JSpinner();
        jbRolarD12 = new javax.swing.JButton();
        jlResultadoD12 = new javax.swing.JLabel();
        jtmodD12 = new javax.swing.JTextField();
        jCD12vant = new javax.swing.JCheckBox();
        jlVantagemD12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jlDvinte = new javax.swing.JLabel();
        jsD20 = new javax.swing.JSpinner();
        jbRolarD20 = new javax.swing.JButton();
        jlResultadoD20 = new javax.swing.JLabel();
        jtmodD20 = new javax.swing.JTextField();
        jCD20vant = new javax.swing.JCheckBox();
        jlVantagemD20 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jlDcem = new javax.swing.JLabel();
        jsD100 = new javax.swing.JSpinner();
        jbRolarD100 = new javax.swing.JButton();
        jlResultadoD100 = new javax.swing.JLabel();
        jtmodD100 = new javax.swing.JTextField();
        jCD100vant = new javax.swing.JCheckBox();
        jlVantagemD100 = new javax.swing.JLabel();
        jlModificador = new javax.swing.JLabel();
        jlVantagemDesvantagem = new javax.swing.JLabel();
        jlResultadoVD = new javax.swing.JLabel();
        jBLimpar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jlDcustom = new javax.swing.JLabel();
        jsDCustom = new javax.swing.JSpinner();
        jbRolarDcustom = new javax.swing.JButton();
        jlResultadoDcustom = new javax.swing.JLabel();
        jtmodDCustom = new javax.swing.JTextField();
        jCDcustomVant = new javax.swing.JCheckBox();
        jlVantagemDcustom = new javax.swing.JLabel();
        jtValorDadoCustom = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Simulador de dados D20", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 0, 14))); // NOI18N

        jlQtd1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jlQtd1.setText("Qtd.");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbRolarD4.setText("Rolar");
        jbRolarD4.setBorder(null);
        jbRolarD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRolarD4ActionPerformed(evt);
            }
        });

        jlDquatro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlDquatro.setText("d4");

        jlResultadoD4.setBackground(new java.awt.Color(255, 255, 204));
        jlResultadoD4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jlVantagemD4.setBackground(new java.awt.Color(255, 255, 204));
        jlVantagemD4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlDquatro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jsD4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jtmodD4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCD4vant)
                .addGap(27, 27, 27)
                .addComponent(jbRolarD4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jlResultadoD4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jlVantagemD4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlResultadoD4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDquatro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRolarD4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCD4vant)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jsD4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtmodD4)))
                .addContainerGap())
            .addComponent(jlVantagemD4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jlResultado.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jlResultado.setText("Resultado");

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbRolarD6.setText("Rolar");
        jbRolarD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRolarD6ActionPerformed(evt);
            }
        });

        jlDseis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlDseis.setText("d6");

        jlResultadoD6.setBackground(new java.awt.Color(255, 255, 204));
        jlResultadoD6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jlVantagemD6.setBackground(new java.awt.Color(255, 255, 204));
        jlVantagemD6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlDseis, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jsD6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jtmodD6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCD6vant)
                .addGap(30, 30, 30)
                .addComponent(jbRolarD6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jlResultadoD6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jlVantagemD6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlResultadoD6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDseis, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jsD6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtmodD6)
                                .addComponent(jCD6vant)))
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jbRolarD6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jlVantagemD6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlResultadoD8.setBackground(new java.awt.Color(255, 255, 204));
        jlResultadoD8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jbRolarD8.setText("Rolar");
        jbRolarD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRolarD8ActionPerformed(evt);
            }
        });

        jlDoito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlDoito.setText("d8");

        jlVantagemD8.setBackground(new java.awt.Color(255, 255, 204));
        jlVantagemD8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jlDoito, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jsD8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jtmodD8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCD8vant)
                .addGap(28, 28, 28)
                .addComponent(jbRolarD8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jlResultadoD8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jlVantagemD8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlResultadoD8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDoito, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jsD8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtmodD8))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbRolarD8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCD8vant))
                        .addGap(2, 2, 2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jlVantagemD8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbRolarD10.setText("Rolar");
        jbRolarD10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRolarD10ActionPerformed(evt);
            }
        });

        jlDdez.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlDdez.setText("d10");

        jlResultadoD10.setBackground(new java.awt.Color(255, 255, 204));
        jlResultadoD10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jlVantagemD10.setBackground(new java.awt.Color(255, 255, 204));
        jlVantagemD10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlDdez)
                .addGap(18, 18, 18)
                .addComponent(jsD10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jtmodD10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCD10vant)
                .addGap(30, 30, 30)
                .addComponent(jbRolarD10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jlResultadoD10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jlVantagemD10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlResultadoD10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jbRolarD10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jCD10vant)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDdez, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jsD10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtmodD10)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jlVantagemD10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlDdoze.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlDdoze.setText("d12");

        jbRolarD12.setText("Rolar");
        jbRolarD12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRolarD12ActionPerformed(evt);
            }
        });

        jlResultadoD12.setBackground(new java.awt.Color(255, 255, 204));
        jlResultadoD12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jlVantagemD12.setBackground(new java.awt.Color(255, 255, 204));
        jlVantagemD12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlDdoze)
                .addGap(18, 18, 18)
                .addComponent(jsD12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jtmodD12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCD12vant)
                .addGap(31, 31, 31)
                .addComponent(jbRolarD12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jlResultadoD12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jlVantagemD12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlResultadoD12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jsD12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtmodD12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jlDdoze, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbRolarD12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCD12vant))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jlVantagemD12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlDvinte.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlDvinte.setText("d20");

        jbRolarD20.setText("Rolar");
        jbRolarD20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRolarD20ActionPerformed(evt);
            }
        });

        jlResultadoD20.setBackground(new java.awt.Color(255, 255, 204));
        jlResultadoD20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jlVantagemD20.setBackground(new java.awt.Color(255, 255, 204));
        jlVantagemD20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlDvinte)
                .addGap(18, 18, 18)
                .addComponent(jsD20, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jtmodD20, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCD20vant)
                .addGap(32, 32, 32)
                .addComponent(jbRolarD20, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jlResultadoD20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jlVantagemD20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlResultadoD20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlVantagemD20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbRolarD20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCD20vant))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jtmodD20))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jlDvinte, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jsD20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlDcem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlDcem.setText("d100");

        jbRolarD100.setText("Rolar");
        jbRolarD100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRolarD100ActionPerformed(evt);
            }
        });

        jlResultadoD100.setBackground(new java.awt.Color(255, 255, 204));
        jlResultadoD100.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jlVantagemD100.setBackground(new java.awt.Color(255, 255, 204));
        jlVantagemD100.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDcem)
                .addGap(18, 18, 18)
                .addComponent(jsD100, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jtmodD100, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCD100vant)
                .addGap(33, 33, 33)
                .addComponent(jbRolarD100, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jlResultadoD100, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jlVantagemD100, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlResultadoD100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlVantagemD100, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jtmodD100))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCD100vant)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jsD100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlDcem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jbRolarD100)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jlModificador.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jlModificador.setText("Modificador");

        jlVantagemDesvantagem.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jlVantagemDesvantagem.setText("V/D");

        jlResultadoVD.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jlResultadoVD.setText("Resultado V/D");

        jBLimpar.setText("Zerar Dados");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlDcustom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlDcustom.setText("d");

        jbRolarDcustom.setText("Rolar");
        jbRolarDcustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRolarDcustomActionPerformed(evt);
            }
        });

        jlResultadoDcustom.setBackground(new java.awt.Color(255, 255, 204));
        jlResultadoDcustom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jlVantagemDcustom.setBackground(new java.awt.Color(255, 255, 204));
        jlVantagemDcustom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDcustom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtValorDadoCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsDCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jtmodDCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCDcustomVant)
                .addGap(34, 34, 34)
                .addComponent(jbRolarDcustom, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jlResultadoDcustom, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jlVantagemDcustom, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlResultadoDcustom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlVantagemDcustom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbRolarDcustom)
                            .addComponent(jCDcustomVant)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jsDCustom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtValorDadoCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jtmodDCustom))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jlDcustom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jlQtd1)
                .addGap(63, 63, 63)
                .addComponent(jlModificador)
                .addGap(29, 29, 29)
                .addComponent(jlVantagemDesvantagem)
                .addGap(147, 147, 147)
                .addComponent(jlResultado)
                .addGap(33, 33, 33)
                .addComponent(jlResultadoVD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlVantagemDesvantagem, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlResultado)
                        .addComponent(jlResultadoVD))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlQtd1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlModificador)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRolarD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRolarD4ActionPerformed
       calcularD4();
    }//GEN-LAST:event_jbRolarD4ActionPerformed

    private void jbRolarD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRolarD6ActionPerformed
        calcularD6();
    }//GEN-LAST:event_jbRolarD6ActionPerformed

    private void jbRolarD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRolarD8ActionPerformed
        calcularD8();
    }//GEN-LAST:event_jbRolarD8ActionPerformed

    private void jbRolarD10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRolarD10ActionPerformed
        calcularD10();
    }//GEN-LAST:event_jbRolarD10ActionPerformed

    private void jbRolarD12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRolarD12ActionPerformed
        calcularD12();
    }//GEN-LAST:event_jbRolarD12ActionPerformed

    private void jbRolarD20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRolarD20ActionPerformed
       calcularD20();
    }//GEN-LAST:event_jbRolarD20ActionPerformed

    private void jbRolarD100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRolarD100ActionPerformed
        calcularD100();
    }//GEN-LAST:event_jbRolarD100ActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jbRolarDcustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRolarDcustomActionPerformed
        calcularDadoCustom();
    }//GEN-LAST:event_jbRolarDcustomActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(GUIResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIResultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JCheckBox jCD100vant;
    private javax.swing.JCheckBox jCD10vant;
    private javax.swing.JCheckBox jCD12vant;
    private javax.swing.JCheckBox jCD20vant;
    private javax.swing.JCheckBox jCD4vant;
    private javax.swing.JCheckBox jCD6vant;
    private javax.swing.JCheckBox jCD8vant;
    private javax.swing.JCheckBox jCDcustomVant;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbRolarD10;
    private javax.swing.JButton jbRolarD100;
    private javax.swing.JButton jbRolarD12;
    private javax.swing.JButton jbRolarD20;
    private javax.swing.JButton jbRolarD4;
    private javax.swing.JButton jbRolarD6;
    private javax.swing.JButton jbRolarD8;
    private javax.swing.JButton jbRolarDcustom;
    private javax.swing.JLabel jlDcem;
    private javax.swing.JLabel jlDcustom;
    private javax.swing.JLabel jlDdez;
    private javax.swing.JLabel jlDdoze;
    private javax.swing.JLabel jlDoito;
    private javax.swing.JLabel jlDquatro;
    private javax.swing.JLabel jlDseis;
    private javax.swing.JLabel jlDvinte;
    private javax.swing.JLabel jlModificador;
    private javax.swing.JLabel jlQtd1;
    private javax.swing.JLabel jlResultado;
    private javax.swing.JLabel jlResultadoD10;
    private javax.swing.JLabel jlResultadoD100;
    private javax.swing.JLabel jlResultadoD12;
    private javax.swing.JLabel jlResultadoD20;
    private javax.swing.JLabel jlResultadoD4;
    private javax.swing.JLabel jlResultadoD6;
    private javax.swing.JLabel jlResultadoD8;
    private javax.swing.JLabel jlResultadoDcustom;
    private javax.swing.JLabel jlResultadoVD;
    private javax.swing.JLabel jlVantagemD10;
    private javax.swing.JLabel jlVantagemD100;
    private javax.swing.JLabel jlVantagemD12;
    private javax.swing.JLabel jlVantagemD20;
    private javax.swing.JLabel jlVantagemD4;
    private javax.swing.JLabel jlVantagemD6;
    private javax.swing.JLabel jlVantagemD8;
    private javax.swing.JLabel jlVantagemDcustom;
    private javax.swing.JLabel jlVantagemDesvantagem;
    private javax.swing.JSpinner jsD10;
    private javax.swing.JSpinner jsD100;
    private javax.swing.JSpinner jsD12;
    private javax.swing.JSpinner jsD20;
    private javax.swing.JSpinner jsD4;
    private javax.swing.JSpinner jsD6;
    private javax.swing.JSpinner jsD8;
    private javax.swing.JSpinner jsDCustom;
    private javax.swing.JTextField jtValorDadoCustom;
    private javax.swing.JTextField jtmodD10;
    private javax.swing.JTextField jtmodD100;
    private javax.swing.JTextField jtmodD12;
    private javax.swing.JTextField jtmodD20;
    private javax.swing.JTextField jtmodD4;
    private javax.swing.JTextField jtmodD6;
    private javax.swing.JTextField jtmodD8;
    private javax.swing.JTextField jtmodDCustom;
    // End of variables declaration//GEN-END:variables
}
