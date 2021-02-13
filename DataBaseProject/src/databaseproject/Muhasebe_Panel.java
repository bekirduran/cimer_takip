/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import static databaseproject.SqlQuery.SqlQuery;
import static databaseproject.SqlQuery.SqlQuery2;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author flashomer
 */
public class Muhasebe_Panel extends javax.swing.JFrame {

    /**
     * Creates new form Muhasebe_Panel
     */
    
    int RowNum = 0;
    
    public Muhasebe_Panel() {
        initComponents();
        createColoumn();
        duzenPanel.setVisible(false);
    }
    
    // bu  fonksiyonda muhasebeciyi ilgilendiren kayıtlar database'den sorgulanıp listelenir
    public void select_sorgusu()
    {
        DefaultTableModel model = new DefaultTableModel();
        model=(DefaultTableModel) table1.getModel();

        model.setRowCount(0);
        
    

        try {

            String sql_query=ConstantSqlQuery.muhasebeGetAllDataQuery;

            ResultSet rs=SqlQuery(sql_query);
          

           while(rs.next()){
            
                    String d = rs.getString("BasvuruNo");
                    String e = rs.getString("BasvuruTarihi");
                    String f = rs.getString("BasvuruCevapSonTarihi");
                    String g = rs.getString("UcretTalepTarihi");
                    String h = rs.getString("BasvuruUcreti");
                    String i = rs.getString("Odendimi");
                    String j = rs.getString("Adı");
                    String k = rs.getString("Soyadı");
                    String l = rs.getString("BasvuruDurumuNo");
                    
                    
                    model.addRow(new Object[]{d, e, f,g,h,i,j,k,l});
             
            }

            if(model.getRowCount()<=0){
                JOptionPane.showMessageDialog(null, "Kayıt bulunamadı ", "Uyarı", JOptionPane.ERROR_MESSAGE);
                duzenPanel.setVisible(false);
            } else {
                duzenPanel.setVisible(true);
                guncelleBtn.setVisible(false);
                kaydetBtn.setVisible(false);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    
    
    }    
    
     public void createColoumn(){
           DefaultTableModel  model_filter=(DefaultTableModel) table1.getModel();
            
            model_filter.addColumn("BasvuruNo");
            model_filter.addColumn("BasvuruTarihi");
            model_filter.addColumn("BasvuruCevapSonTarihi");
            model_filter.addColumn("UcretTalepTarihi");
            model_filter.addColumn("BasvuruUcreti");
            model_filter.addColumn("Odendimi");
            model_filter.addColumn("Adı");
            model_filter.addColumn("Soyadı");
            model_filter.addColumn("Basvuru\nDurumu");
       
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        duzenPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        kaydetBtn = new javax.swing.JButton();
        guncelleBtn = new javax.swing.JButton();
        odemeBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        textUcret = new javax.swing.JTextField();
        tarihText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Muhasebe Ekranı");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        kaydetBtn.setText("Kaydet");
        kaydetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetBtnActionPerformed(evt);
            }
        });

        guncelleBtn.setText("Güncelle");
        guncelleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(guncelleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kaydetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kaydetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncelleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        odemeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ödeme Yapılmadı", "Ödeme Yapıldı" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("TL");

        textUcret.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        tarihText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout duzenPanelLayout = new javax.swing.GroupLayout(duzenPanel);
        duzenPanel.setLayout(duzenPanelLayout);
        duzenPanelLayout.setHorizontalGroup(
            duzenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(duzenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tarihText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textUcret, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(odemeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        duzenPanelLayout.setVerticalGroup(
            duzenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(duzenPanelLayout.createSequentialGroup()
                .addGroup(duzenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(odemeBox)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, duzenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textUcret, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(tarihText))
                .addGap(10, 10, 10))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButton1.setText("Basvuruları Görüntüle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton4.setForeground(new java.awt.Color(204, 0, 0));
        jButton4.setText("ÇIKIŞ YAP");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(duzenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duzenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
select_sorgusu();        
    }//GEN-LAST:event_jButton1ActionPerformed

    // bu fonksiyonda tablonun herhangi bir satırına tıklanıldığında verileri uygulama bileşenlerine database'den çeker ve ekler
    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        int selectRowIndex = table1.getSelectedRow();
        RowNum = Integer.parseInt( model.getValueAt(selectRowIndex, 0).toString() );

        try {

            String sql_query="select * from BasvuruUcreti where BasvuruNo = '"+model.getValueAt(selectRowIndex, 0)+"'";

            ResultSet rs=SqlQuery(sql_query);
            ResultSetMetaData metadata = rs.getMetaData();
            int columnCount = metadata.getColumnCount();
            String str=null;

            if(rs.next()){

                String basvuruUcreti = rs.getString("BasvuruUcreti");
                String basvuruTarihi = rs.getString("UcretTalepTarihi");
                int basvuruOdeme = Integer.parseInt( rs.getString("Odendimi"));
                
                odemeBox.setSelectedIndex(basvuruOdeme);
                
                textUcret.setText(basvuruUcreti);
                tarihText.setText(basvuruTarihi);
                
                guncelleBtn.setVisible(true);
                kaydetBtn.setVisible(false);
                    
            } else{
                
                odemeBox.setSelectedIndex(0);
                
                textUcret.setText("");
                tarihText.setText("");
                
                
                guncelleBtn.setVisible(false);
                kaydetBtn.setVisible(true);

                    }

        } catch (Exception e) {
            System.out.println(e);
        }      
        
    }//GEN-LAST:event_table1MouseClicked

    // bu fonksiyon ve sorgu ödeme yapılma işlemlerini günceller
    private void guncelleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleBtnActionPerformed
             String sql_query = "UPDATE BasvuruUcreti set "
                    +"UcretTalepTarihi = '"+ tarihText.getText().toString()  +"',"+
                     "BasvuruUcreti = '"+ textUcret.getText().toString()  +"',"+
                     "Odendimi = '"+ odemeBox.getSelectedIndex() +"' "+
                     " where BasvuruNo = '"+RowNum+"'";
    
        try {
          SqlQuery2(sql_query);
          
          JOptionPane.showMessageDialog(null, "Ücret Kaydı Başarı ile Eklenmiştir ", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
            select_sorgusu();
        } catch (Exception ex) {
            Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_guncelleBtnActionPerformed

    // bu fonksiyon ve sorgu ödeme yapılma işlemlerini database'e ekleme işlemini yapar
    private void kaydetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetBtnActionPerformed
        
        System.out.println("Row: "+RowNum);
       String sql_query = "insert into BasvuruUcreti (BasvuruNo, UcretTalepTarihi,BasvuruUcreti, Odendimi)"
                    +"values ('"+
                        RowNum                          +"','"+ 
                        tarihText.getText().toString()  +"',"+
                        textUcret.getText().toString()  +", "+
                        odemeBox.getSelectedIndex()     +")";
    
        try {
          SqlQuery2(sql_query);
          
          JOptionPane.showMessageDialog(null, "Ücret Kaydı Başarı ile Eklenmiştir ", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
          select_sorgusu();
        } catch (Exception ex) {
            Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_kaydetBtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        Login_Page login=new Login_Page();
        login.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Muhasebe_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Muhasebe_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Muhasebe_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Muhasebe_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Muhasebe_Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel duzenPanel;
    private javax.swing.JButton guncelleBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kaydetBtn;
    private javax.swing.JComboBox odemeBox;
    private javax.swing.JTable table1;
    private javax.swing.JTextField tarihText;
    private javax.swing.JTextField textUcret;
    // End of variables declaration//GEN-END:variables
}
