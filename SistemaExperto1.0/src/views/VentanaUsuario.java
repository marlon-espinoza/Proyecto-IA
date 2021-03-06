/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controlador.MotorController;
import controlador.Recomendaciones;
import controlador.VentanaRecom;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JList;
import jess.JessException;

/**
 *
 * @author Alex
 */
public class VentanaUsuario extends javax.swing.JFrame {
    private MotorController motorController;
    CheckBoxList checkBoxList = new CheckBoxList();
    CheckBoxList cBLClimas = new CheckBoxList();
    CheckBoxList cBLLugares = new CheckBoxList();
    CheckBoxList cBLActividades = new CheckBoxList();
    /**
     * Creates new form ZooView
     */
    public VentanaUsuario() {
        initComponents();
        this.setVisible(true);
        DefaultListModel lClimas=new DefaultListModel();
        DefaultListModel lLugares=new DefaultListModel();
        DefaultListModel lAcitividades=new DefaultListModel();
        DefaultListModel lmdlEjemplo=new DefaultListModel();
        
        //Conjunto de CheckBox para Climas
        lClimas.addElement(jCBCalido);
        lClimas.addElement(jCBFrio);
        lClimas.addElement(jCBHumedo);
        lClimas.addElement(jCBTemplado);
        
        //Conjunto de CheckBox para Lugares de Interes
        lLugares.addElement(jCBTradicionales);
        lLugares.addElement(jCBParquesUrb);
        lLugares.addElement(jCBZoo);
        lLugares.addElement(jCBLugaresReligiosos);
        lLugares.addElement(jCBMonumentos);
        lLugares.addElement(jCBCentrosCom);
        lLugares.addElement(jCBFloraFauna);
        lLugares.addElement(jCBPlayas);
        lLugares.addElement(jCBParquesNac);
        lLugares.addElement(jCBMuseos);
        
        //Conjunto de CheckBox para Actividades
        lAcitividades.addElement(jCBVidaNoc);
        lAcitividades.addElement(jCBCiclismo);
        lAcitividades.addElement(jCBTours);
        lAcitividades.addElement(jCBKayak);
        lAcitividades.addElement(jCBBuceo);
        lAcitividades.addElement(jCBPesca);
        lAcitividades.addElement(jCBSurf);
        lAcitividades.addElement(jCBParapente);
        lAcitividades.addElement(jCBDivJuegos);
        lAcitividades.addElement(jCBRelajacion);
        lAcitividades.addElement(jCBTeatro);
        lAcitividades.addElement(jCBCine);
        lAcitividades.addElement(jCBMontanismo);
        
        //Adicion 
        cBLClimas.setModel(lClimas);
        cBLLugares.setModel(lLugares);
        cBLActividades.setModel(lAcitividades);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgOpciones = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jBVer = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jCBCalido = new javax.swing.JCheckBox();
        jCBFrio = new javax.swing.JCheckBox();
        jCBTemplado = new javax.swing.JCheckBox();
        jCBHumedo = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jCBTradicionales = new javax.swing.JCheckBox();
        jCBParquesUrb = new javax.swing.JCheckBox();
        jCBLugaresReligiosos = new javax.swing.JCheckBox();
        jCBMonumentos = new javax.swing.JCheckBox();
        jCBParquesNac = new javax.swing.JCheckBox();
        jCBZoo = new javax.swing.JCheckBox();
        jCBMuseos = new javax.swing.JCheckBox();
        jCBCentrosCom = new javax.swing.JCheckBox();
        jCBFloraFauna = new javax.swing.JCheckBox();
        jCBPlayas = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jCBVidaNoc = new javax.swing.JCheckBox();
        jCBBuceo = new javax.swing.JCheckBox();
        jCBSurf = new javax.swing.JCheckBox();
        jCBMontanismo = new javax.swing.JCheckBox();
        jCBParapente = new javax.swing.JCheckBox();
        jCBTours = new javax.swing.JCheckBox();
        jCBCiclismo = new javax.swing.JCheckBox();
        jCBKayak = new javax.swing.JCheckBox();
        jCBPesca = new javax.swing.JCheckBox();
        jCBCine = new javax.swing.JCheckBox();
        jCBDivJuegos = new javax.swing.JCheckBox();
        jCBRelajacion = new javax.swing.JCheckBox();
        jCBTeatro = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escoge tus Preferencias");

        jBVer.setBackground(new java.awt.Color(230, 74, 25));
        jBVer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBVer.setForeground(new java.awt.Color(255, 255, 255));
        jBVer.setText("Ver Reconmendaciones");
        jBVer.setBorder(null);
        jBVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBVerMouseClicked(evt);
            }
        });
        jBVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerActionPerformed(evt);
            }
        });

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        jCBCalido.setText("Cálido");

        jCBFrio.setText("Frío");
        jCBFrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFrioActionPerformed(evt);
            }
        });

        jCBTemplado.setText("Templado");

        jCBHumedo.setText("Húmedo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBHumedo)
                    .addComponent(jCBTemplado)
                    .addComponent(jCBFrio)
                    .addComponent(jCBCalido))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCBCalido)
                .addGap(18, 18, 18)
                .addComponent(jCBFrio)
                .addGap(18, 18, 18)
                .addComponent(jCBTemplado)
                .addGap(18, 18, 18)
                .addComponent(jCBHumedo)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Climas", jPanel4);

        jCBTradicionales.setText("Sitios Tradicionales");

        jCBParquesUrb.setText("Parques Urbanos");

        jCBLugaresReligiosos.setText("Lugares Religiosos");

        jCBMonumentos.setText("Monumentos");

        jCBParquesNac.setText("Parques Nacionales");

        jCBZoo.setText("Zoológicos");

        jCBMuseos.setText("Museos");

        jCBCentrosCom.setText("Centros Comerciales");

        jCBFloraFauna.setText("Flora y Fauna");

        jCBPlayas.setText("Playas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBFloraFauna)
                    .addComponent(jCBCentrosCom)
                    .addComponent(jCBMuseos)
                    .addComponent(jCBZoo)
                    .addComponent(jCBParquesNac)
                    .addComponent(jCBParquesUrb)
                    .addComponent(jCBMonumentos)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jCBTradicionales)
                        .addGap(60, 60, 60)
                        .addComponent(jCBPlayas))
                    .addComponent(jCBLugaresReligiosos))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBTradicionales)
                    .addComponent(jCBPlayas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBParquesUrb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBZoo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBLugaresReligiosos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBMonumentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBCentrosCom)
                .addGap(3, 3, 3)
                .addComponent(jCBParquesNac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBMuseos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBFloraFauna)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lugares de Interés", jPanel5);

        jCBVidaNoc.setText("Vida Nocturna");

        jCBBuceo.setText("Buceo");
        jCBBuceo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBBuceoActionPerformed(evt);
            }
        });

        jCBSurf.setText("Surf");
        jCBSurf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSurfActionPerformed(evt);
            }
        });

        jCBMontanismo.setText("Montañismo");
        jCBMontanismo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMontanismoActionPerformed(evt);
            }
        });

        jCBParapente.setText("Parapente");

        jCBTours.setText("Tours");

        jCBCiclismo.setText("Cliclismo");

        jCBKayak.setText("Kayak");
        jCBKayak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBKayakActionPerformed(evt);
            }
        });

        jCBPesca.setText("Pesca");
        jCBPesca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPescaActionPerformed(evt);
            }
        });

        jCBCine.setText("Cine");
        jCBCine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCineActionPerformed(evt);
            }
        });

        jCBDivJuegos.setText("Diversión y Juegos");
        jCBDivJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBDivJuegosActionPerformed(evt);
            }
        });

        jCBRelajacion.setText("Relajación");
        jCBRelajacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBRelajacionActionPerformed(evt);
            }
        });

        jCBTeatro.setText("Teatro");
        jCBTeatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTeatroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBTeatro)
                    .addComponent(jCBMontanismo)
                    .addComponent(jCBSurf)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBVidaNoc)
                            .addComponent(jCBTours)
                            .addComponent(jCBBuceo)
                            .addComponent(jCBKayak)
                            .addComponent(jCBPesca))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBRelajacion)
                            .addComponent(jCBDivJuegos)
                            .addComponent(jCBCine)
                            .addComponent(jCBCiclismo)
                            .addComponent(jCBParapente))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBVidaNoc)
                    .addComponent(jCBParapente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBTours)
                    .addComponent(jCBCiclismo))
                .addGap(3, 3, 3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBBuceo)
                    .addComponent(jCBCine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBKayak)
                    .addComponent(jCBDivJuegos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBPesca)
                    .addComponent(jCBRelajacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBSurf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBMontanismo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBTeatro)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Actividades", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(540, Short.MAX_VALUE)
                .addComponent(jBVer, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(192, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(jBVer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 87, 34));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ecuador Destino Turístico");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 87, 34));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVerMouseClicked
        // TODO add your handling code here:
        /*try{
            if(jrbSi.isSelected() || jbSiguiente.getText().equals("Otra vez")){
                    this.motorController.afirmar("(respuesta si)");

            }else if(jrbNo.isSelected()){
                this.motorController.afirmar("(respuesta no)");
            }
            //this.pack();
        } catch (JessException ex) {
                Logger.getLogger(VentanaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }*/
    }//GEN-LAST:event_jBVerMouseClicked

    private void jBVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerActionPerformed
        // TODO add your handling code here:
        List jlist=(List)checkBoxList.getCheckedItems();
        List jlistLugares=(List)cBLLugares.getCheckedItems();
        List jlistClimas=(List)cBLClimas.getCheckedItems();
        List jlistActividades=(List)cBLActividades.getCheckedItems();
        ArrayList<String> lugaresInteres=new ArrayList<>();
        ArrayList<String> climasInteres=new ArrayList<>();
        ArrayList<String> actividadesInteres=new ArrayList<>();
        //Lista para climas
        for (Object obj : jlistClimas) {
            JCheckBox jc= (JCheckBox)obj;
            climasInteres.add(jc.getText().toLowerCase());
        }
        //Lista para lugares
        for (Object obj : jlistLugares) {
            JCheckBox jc= (JCheckBox)obj;
            lugaresInteres.add(jc.getText().toLowerCase());        
        }
        //Lista para actividades
        for (Object obj : jlistActividades) {
            JCheckBox jc= (JCheckBox)obj;
            actividadesInteres.add(jc.getText().toLowerCase());        
        }
        try {
            this.motorController.afirmar(climasInteres,lugaresInteres,actividadesInteres);
        } catch (JessException ex) {
            Logger.getLogger(VentanaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(VentanaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(VentanaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        VentanaRecom vr = new VentanaRecom();
        Recomendaciones r=new Recomendaciones();
        
        r.readTuristPoints();
        vr.setRecomendaciones(r.getPuntosTuristicos());
        try {
            vr.crearMapa();
        } catch (MalformedURLException ex) {
            Logger.getLogger(VentanaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(VentanaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jBVerActionPerformed

    private void jCBMontanismoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMontanismoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBMontanismoActionPerformed

    private void jCBSurfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSurfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBSurfActionPerformed

    private void jCBBuceoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBBuceoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBBuceoActionPerformed

    private void jCBFrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFrioActionPerformed

    private void jCBKayakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBKayakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBKayakActionPerformed

    private void jCBPescaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPescaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBPescaActionPerformed

    private void jCBCineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCineActionPerformed

    private void jCBDivJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBDivJuegosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBDivJuegosActionPerformed

    private void jCBRelajacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBRelajacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBRelajacionActionPerformed

    private void jCBTeatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTeatroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBTeatroActionPerformed

    public void setMotorController(MotorController motorController){
        this.motorController = motorController;
    }

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgOpciones;
    private javax.swing.JButton jBVer;
    private javax.swing.JCheckBox jCBBuceo;
    private javax.swing.JCheckBox jCBCalido;
    private javax.swing.JCheckBox jCBCentrosCom;
    private javax.swing.JCheckBox jCBCiclismo;
    private javax.swing.JCheckBox jCBCine;
    private javax.swing.JCheckBox jCBDivJuegos;
    private javax.swing.JCheckBox jCBFloraFauna;
    private javax.swing.JCheckBox jCBFrio;
    private javax.swing.JCheckBox jCBHumedo;
    private javax.swing.JCheckBox jCBKayak;
    private javax.swing.JCheckBox jCBLugaresReligiosos;
    private javax.swing.JCheckBox jCBMontanismo;
    private javax.swing.JCheckBox jCBMonumentos;
    private javax.swing.JCheckBox jCBMuseos;
    private javax.swing.JCheckBox jCBParapente;
    private javax.swing.JCheckBox jCBParquesNac;
    private javax.swing.JCheckBox jCBParquesUrb;
    private javax.swing.JCheckBox jCBPesca;
    private javax.swing.JCheckBox jCBPlayas;
    private javax.swing.JCheckBox jCBRelajacion;
    private javax.swing.JCheckBox jCBSurf;
    private javax.swing.JCheckBox jCBTeatro;
    private javax.swing.JCheckBox jCBTemplado;
    private javax.swing.JCheckBox jCBTours;
    private javax.swing.JCheckBox jCBTradicionales;
    private javax.swing.JCheckBox jCBVidaNoc;
    private javax.swing.JCheckBox jCBZoo;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
