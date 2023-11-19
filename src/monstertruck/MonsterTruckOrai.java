/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package monstertruck;

import java.awt.TrayIcon;
import javax.swing.JOptionPane;


public class MonsterTruckOrai extends javax.swing.JFrame {
    
    int felnottAr = 4990;
    int diakAr = 2990;

    
    public MonsterTruckOrai() {
        initComponents();
        btnFoglalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblArak = new javax.swing.JLabel();
        lblFelnottArTabla = new javax.swing.JLabel();
        lblDiakArTabla = new javax.swing.JLabel();
        lblFelnottAr = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblDiakAr = new javax.swing.JLabel();
        lbl6eves = new javax.swing.JLabel();
        lblJegyvasarlas = new javax.swing.JLabel();
        lblFelnottDb = new javax.swing.JLabel();
        lblDiakDb = new javax.swing.JLabel();
        spinnerFelnottDb = new javax.swing.JSpinner();
        spinnerDiakDb = new javax.swing.JSpinner();
        lblOsszesen = new javax.swing.JLabel();
        lblOsszAr = new javax.swing.JLabel();
        lblOsszArFt = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnFoglalas = new javax.swing.JButton();
        cmbBoxUlohely = new javax.swing.JComboBox<>();
        lblUlohelyvalasztas = new javax.swing.JLabel();
        lblFizetesmod = new javax.swing.JLabel();
        rdbKeszpenz = new javax.swing.JRadioButton();
        rdbKartya = new javax.swing.JRadioButton();

        jLabel16.setText("jLabel16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel1.setText("Monster Truck");

        lblArak.setText("Árak:");

        lblFelnottArTabla.setText("Felnőtt:");

        lblDiakArTabla.setText("Diák:");

        lblFelnottAr.setText("4990");

        jLabel6.setText("Ft");

        lblDiakAr.setText("2990");

        lbl6eves.setText("6 éves kor alatt ingyenes.");

        lblJegyvasarlas.setText("Jegyvásárlás:");

        lblFelnottDb.setText("Felnőtt (db)");

        lblDiakDb.setText("Diák (db)");

        spinnerFelnottDb.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        spinnerDiakDb.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        lblOsszesen.setText("Összesen:");

        lblOsszAr.setText("0");

        lblOsszArFt.setText("Ft");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kepek/monstertruck.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");

        jLabel8.setText("Ft");

        btnFoglalas.setText("Foglalás");
        btnFoglalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoglalasActionPerformed(evt);
            }
        });

        cmbBoxUlohely.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alsó sor", "Középső sor", "Felső sor", " " }));

        lblUlohelyvalasztas.setText("  Ülőhely választása");

        lblFizetesmod.setText("Fizetésmód");

        buttonGroup1.add(rdbKeszpenz);
        rdbKeszpenz.setText("Készpénz");

        buttonGroup1.add(rdbKartya);
        rdbKartya.setText("Bankkártya");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblArak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblJegyvasarlas)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFelnottArTabla)
                                    .addComponent(lblDiakArTabla))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFelnottAr)
                                    .addComponent(lblDiakAr))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel8)))
                                        .addGap(80, 80, 80)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblFelnottDb)
                                            .addComponent(lblDiakDb)
                                            .addComponent(lblOsszesen)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel1))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lbl6eves)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinnerFelnottDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerDiakDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rdbKartya)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnFoglalas))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblFizetesmod)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblUlohelyvalasztas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rdbKeszpenz)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmbBoxUlohely, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(3, 3, 3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblOsszAr, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(lblOsszArFt)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArak)
                    .addComponent(lblJegyvasarlas))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFelnottArTabla)
                                .addComponent(lblFelnottAr)
                                .addComponent(jLabel6))
                            .addComponent(lblFelnottDb)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(spinnerFelnottDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblDiakDb)
                    .addComponent(spinnerDiakDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiakArTabla)
                    .addComponent(lblDiakAr)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblOsszArFt)
                        .addComponent(lblOsszAr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl6eves, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOsszesen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUlohelyvalasztas)
                    .addComponent(lblFizetesmod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBoxUlohely, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbKeszpenz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFoglalas)
                    .addComponent(rdbKartya))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFoglalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoglalasActionPerformed
        
        int felnottDb = (int) spinnerFelnottDb.getValue();
        int diakDb = (int) spinnerDiakDb.getValue();
        
        int osszAr = felnottDb * felnottAr + diakDb * diakAr;
        
        lblOsszAr.setText(String.valueOf(osszAr));
        lblOsszArFt.setText("Ft");
        
        if (!rdbKeszpenz.isSelected() && !rdbKartya.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Válassza ki a fizetési módot!", "Hiba", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        if (felnottDb == 0 && diakDb ==0){
            JOptionPane.showMessageDialog(rootPane, "Nincs jegymennyiség kiválasztva!", "Hiba", JOptionPane.ERROR_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(rootPane, "Sikeres foglalás!\n A jegyek ára: " +osszAr);
        }
        

        

        
    }//GEN-LAST:event_btnFoglalasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new MonsterTruckOrai().setVisible(true);
            }
        });
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoglalas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbBoxUlohely;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl6eves;
    private javax.swing.JLabel lblArak;
    private javax.swing.JLabel lblDiakAr;
    private javax.swing.JLabel lblDiakArTabla;
    private javax.swing.JLabel lblDiakDb;
    private javax.swing.JLabel lblFelnottAr;
    private javax.swing.JLabel lblFelnottArTabla;
    private javax.swing.JLabel lblFelnottDb;
    private javax.swing.JLabel lblFizetesmod;
    private javax.swing.JLabel lblJegyvasarlas;
    private javax.swing.JLabel lblOsszAr;
    private javax.swing.JLabel lblOsszArFt;
    private javax.swing.JLabel lblOsszesen;
    private javax.swing.JLabel lblUlohelyvalasztas;
    private javax.swing.JRadioButton rdbKartya;
    private javax.swing.JRadioButton rdbKeszpenz;
    private javax.swing.JSpinner spinnerDiakDb;
    private javax.swing.JSpinner spinnerFelnottDb;
    // End of variables declaration//GEN-END:variables
}
