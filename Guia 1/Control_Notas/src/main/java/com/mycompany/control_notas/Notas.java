package com.mycompany.control_notas;

import static java.lang.Float.parseFloat;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MINEDUCYT
 */
public class Notas extends javax.swing.JFrame {

    /**
     * Creates new form Notas
     */
    public Notas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btCalcular = new javax.swing.JButton();
        tfNombre = new javax.swing.JTextField();
        cbCarrera = new javax.swing.JComboBox<>();
        cbCiclo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbMateria1 = new javax.swing.JComboBox<>();
        cbMateria2 = new javax.swing.JComboBox<>();
        cbMateria3 = new javax.swing.JComboBox<>();
        cbMateria4 = new javax.swing.JComboBox<>();
        cbMateria5 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbUV5 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        tfNota1 = new javax.swing.JTextField();
        tfNota2 = new javax.swing.JTextField();
        tfNota3 = new javax.swing.JTextField();
        tfNota4 = new javax.swing.JTextField();
        tfNota5 = new javax.swing.JTextField();
        lbEstado1 = new javax.swing.JLabel();
        lbEstado2 = new javax.swing.JLabel();
        lbEstado3 = new javax.swing.JLabel();
        lbEstado4 = new javax.swing.JLabel();
        lbEstado5 = new javax.swing.JLabel();
        tfCUM = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbUV3 = new javax.swing.JComboBox<>();
        cbUV4 = new javax.swing.JComboBox<>();
        cbUV2 = new javax.swing.JComboBox<>();
        cbUV1 = new javax.swing.JComboBox<>();
        lbMensaje = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Control de Notas");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Carrera");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ciclo");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("CUM");

        btCalcular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        cbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Ing. en Sistemas" }));

        cbCiclo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Ciclo 02" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Materia");

        cbMateria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Investigacion de Operaciones", "Desarrollo de Software I", "Bases de Datos II", "Legislacion aplicada a la empresa", "Electronica" }));

        cbMateria2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Investigacion de Operaciones", "Desarrollo de Software I", "Bases de Datos II", "Legislacion aplicada a la empresa", "Electronica" }));

        cbMateria3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Investigacion de Operaciones", "Desarrollo de Software I", "Bases de Datos II", "Legislacion aplicada a la empresa", "Electronica" }));

        cbMateria4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Investigacion de Operaciones", "Desarrollo de Software I", "Bases de Datos II", "Legislacion aplicada a la empresa", "Electronica" }));

        cbMateria5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Investigacion de Operaciones", "Desarrollo de Software I", "Bases de Datos II", "Legislacion aplicada a la empresa", "Electronica" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("UV");

        cbUV5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "        ", "3", "4" }));
        cbUV5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUV5ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Nota");

        lbEstado1.setText("Estado");

        lbEstado2.setText("Estado");

        lbEstado3.setText("Estado");

        lbEstado4.setText("Estado");

        lbEstado5.setText("Estado");

        tfCUM.setEditable(false);
        tfCUM.setFocusable(false);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Estado");

        cbUV3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "        ", "3", "4" }));
        cbUV3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUV3ActionPerformed(evt);
            }
        });

        cbUV4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "        ", "3", "4" }));
        cbUV4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUV4ActionPerformed(evt);
            }
        });

        cbUV2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "        ", "3", "4" }));
        cbUV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUV2ActionPerformed(evt);
            }
        });

        cbUV1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "        ", "3", "4" }));
        cbUV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUV1ActionPerformed(evt);
            }
        });

        lbMensaje.setText(" ");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\MINEDUCYT\\Documents\\Lab desarrollo de software\\Control_Notas\\logo.jpg")); // NOI18N
        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel6)
                                        .addGap(291, 291, 291)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbUV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbMateria5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbUV5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbMateria4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbUV4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbMateria3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbUV3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tfNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cbMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbUV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(43, 43, 43)
                                            .addComponent(tfNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tfNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfNota5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 49, 49)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEstado5)
                            .addComponent(lbEstado4)
                            .addComponent(lbEstado3)
                            .addComponent(jLabel14)
                            .addComponent(lbEstado1)
                            .addComponent(lbEstado2))
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(cbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addComponent(cbCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(tfCUM, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel3)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel4)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel5)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btCalcular)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCUM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEstado1)
                            .addComponent(cbUV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbUV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEstado2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMateria3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbUV3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEstado3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMateria4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbUV4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEstado4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMateria5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbUV5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEstado5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel9)))
                .addGap(13, 13, 13)
                .addComponent(lbMensaje)
                .addGap(18, 18, 18)
                .addComponent(btCalcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        int aprobadas = 0;
        int reprobadas = 0;
        float cum = (float) 0.0;
        
        if(" ".equals(this.cbCarrera.getSelectedItem()) || " ".equals(this.cbCiclo.getSelectedItem()) || " ".equals(this.cbMateria1.getSelectedItem()) || " ".equals(this.cbMateria2.getSelectedItem()) || " ".equals(this.cbMateria3.getSelectedItem()) || " ".equals(this.cbMateria4.getSelectedItem()) || " ".equals(this.cbMateria5.getSelectedItem()) || " ".equals(this.cbUV1.getSelectedItem()) || " ".equals(this.cbUV2.getSelectedItem()) || " ".equals(this.cbUV3.getSelectedItem()) || " ".equals(this.cbUV4.getSelectedItem()) || " ".equals(this.cbUV5.getSelectedItem()) || this.tfNombre.getText().isEmpty() || this.tfNota1.getText().isEmpty() || this.tfNota2.getText().isEmpty() || this.tfNota3.getText().isEmpty() || this.tfNota4.getText().isEmpty() || this.tfNota5.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Hay uno o mas campos vacios. ", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            //Nota 1
            if(parseFloat(this.tfNota1.getText())>=6 && parseFloat(this.tfNota1.getText()) <= 10){
                this.lbEstado1.setText("Aprobada");
                aprobadas++;
            }else if(parseFloat(this.tfNota1.getText())>= 0 && parseFloat(this.tfNota1.getText()) <= 6){
                this.lbEstado1.setText("Reprobada");
                reprobadas++;
            }else{
                this.lbEstado1.setText("ERROR");
            }
            //Nota 2
            if(parseFloat(this.tfNota2.getText())>=6 && parseFloat(this.tfNota2.getText()) <= 10){
                this.lbEstado2.setText("Aprobada");
                aprobadas++;
            }else if(parseFloat(this.tfNota2.getText())>= 0 && parseFloat(this.tfNota2.getText()) <= 6){
                this.lbEstado2.setText("Reprobada");
                reprobadas++;
            }else{
                this.lbEstado2.setText("ERROR");
            }
            //Nota 3
            if(parseFloat(this.tfNota3.getText())>=6 && parseFloat(this.tfNota3.getText()) <= 10){
                this.lbEstado3.setText("Aprobada");
                aprobadas++;
            }else if(parseFloat(this.tfNota3.getText())>= 0 && parseFloat(this.tfNota3.getText()) <= 6){
                this.lbEstado3.setText("Reprobada");
                reprobadas++;
            }else{
                this.lbEstado3.setText("ERROR");
            }
            //Nota 4
            if(parseFloat(this.tfNota4.getText())>=6 && parseFloat(this.tfNota4.getText()) <= 10){
                this.lbEstado4.setText("Aprobada");
                aprobadas++;
            }else if(parseFloat(this.tfNota4.getText())>= 0 && parseFloat(this.tfNota4.getText()) <= 6){
                this.lbEstado4.setText("Reprobada");
                reprobadas++;
            }else{
                this.lbEstado4.setText("ERROR");
            }
            //Nota 5
            if(parseFloat(this.tfNota5.getText())>=6 && parseFloat(this.tfNota5.getText()) <= 10){
                this.lbEstado5.setText("Aprobada");
                aprobadas++;
            }else if(parseFloat(this.tfNota5.getText())>= 0 && parseFloat(this.tfNota5.getText()) <= 6){
                this.lbEstado5.setText("Reprobada");
                reprobadas++;
            }else{
                this.lbEstado5.setText("ERROR");
            }

            //Calcular CUM
            cum = ((parseFloat(this.tfNota1.getText())*parseFloat((String) this.cbUV1.getSelectedItem())) + (parseFloat(this.tfNota2.getText())*parseFloat((String) this.cbUV2.getSelectedItem())) + (parseFloat(this.tfNota3.getText())*parseFloat((String) this.cbUV3.getSelectedItem())) + (parseFloat(this.tfNota4.getText())*parseFloat((String) this.cbUV4.getSelectedItem())) + (parseFloat(this.tfNota5.getText())*parseFloat((String) this.cbUV5.getSelectedItem()))) / (parseFloat((String) this.cbUV1.getSelectedItem()) + parseFloat((String) this.cbUV2.getSelectedItem()) + parseFloat((String) this.cbUV3.getSelectedItem()) + parseFloat((String) this.cbUV4.getSelectedItem()) + parseFloat((String) this.cbUV5.getSelectedItem()));
            //CUM caja de texto
            this.tfCUM.setText(Float.toString(cum));

            //Mensaje
            this.lbMensaje.setText(this.tfNombre.getText()
                    + " su estado actual es de "
                    + aprobadas
                    + " materias aprobadas y "
                    + reprobadas
                    + " reprobadas y su CUM actual es de "
                    + cum
            );
        }
        
    }//GEN-LAST:event_btCalcularActionPerformed

    private void cbUV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUV1ActionPerformed

    private void cbUV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUV2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUV2ActionPerformed

    private void cbUV4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUV4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUV4ActionPerformed

    private void cbUV3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUV3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUV3ActionPerformed

    private void cbUV5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUV5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUV5ActionPerformed

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
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JComboBox<String> cbCarrera;
    private javax.swing.JComboBox<String> cbCiclo;
    private javax.swing.JComboBox<String> cbMateria1;
    private javax.swing.JComboBox<String> cbMateria2;
    private javax.swing.JComboBox<String> cbMateria3;
    private javax.swing.JComboBox<String> cbMateria4;
    private javax.swing.JComboBox<String> cbMateria5;
    private javax.swing.JComboBox<String> cbUV1;
    private javax.swing.JComboBox<String> cbUV2;
    private javax.swing.JComboBox<String> cbUV3;
    private javax.swing.JComboBox<String> cbUV4;
    private javax.swing.JComboBox<String> cbUV5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbEstado1;
    private javax.swing.JLabel lbEstado2;
    private javax.swing.JLabel lbEstado3;
    private javax.swing.JLabel lbEstado4;
    private javax.swing.JLabel lbEstado5;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JTextField tfCUM;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNota1;
    private javax.swing.JTextField tfNota2;
    private javax.swing.JTextField tfNota3;
    private javax.swing.JTextField tfNota4;
    private javax.swing.JTextField tfNota5;
    // End of variables declaration//GEN-END:variables

    private String parseString(float cum) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String string(float cum) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Object isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
