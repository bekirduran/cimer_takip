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
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author velik
 */
public class Controller_Panel extends javax.swing.JFrame {

    
    public ArrayList<String> kamu_arr =new ArrayList<>();
    
    // bu fonksiyonda datatable kolonları oluşturulur.
     public void createColoumn(){
           DefaultTableModel  model_filter=(DefaultTableModel) table.getModel();
            
            model_filter.addColumn("BasvuruNo");
            model_filter.addColumn("BasvuruCevapSonTarihi");
            model_filter.addColumn("BasvuruDurumuAciklama");
            model_filter.addColumn("TCKimlikNo");
            model_filter.addColumn("Adi");
            model_filter.addColumn("Soyadi"); 
            model_filter.addColumn("RedSebebiAciklama");
            model_filter.addColumn("KurumAdi");


}
      // bu fonksiyonda datatable kolonları oluşturulur.
     public void createColoumn2(){
           DefaultTableModel  model_filter=(DefaultTableModel) table.getModel();
            
            model_filter.addColumn("BasvuruNo");
            model_filter.addColumn("BasvuruTarihi");
            model_filter.addColumn("BasvuruCevapSonTarihi");
            model_filter.addColumn("KalanGünSayisi");
            model_filter.addColumn("BasvuruDurumuAciklama");
            model_filter.addColumn("Adi");
            model_filter.addColumn("Soyadi"); 
            model_filter.addColumn("RedSebebiAciklama");
            model_filter.addColumn("KurumAdi");


}
      // bu fonksiyonda controller rolüne sahip personel ilgili bütün verileri database'den çeker.
     public void getAllData(){
     
      DefaultTableModel model = new DefaultTableModel();
        model=(DefaultTableModel) table.getModel();
        
        model.setRowCount(0);
        model.setColumnCount(0);
         createColoumn();
        try {

              
   String verileri_okuma=ConstantSqlQuery.controllerGetAllDataQuery;
   
            ResultSet display=SqlQuery(verileri_okuma);
           
           while(display.next()){
            
                    String d = display.getString("BasvuruNo");
                    String e = display.getString("BasvuruCevapSonTarihi");
                    String f = display.getString("BasvuruDurumuAciklama");
                    String g = display.getString("TCKimlikNo");
                    String h = display.getString("Adi");
                    String i = display.getString("Soyadi");
                    String j = display.getString("RedSebebiAciklama");
                    String k = display.getString("KurumAdi");
                 
                    
                    model.addRow(new Object[]{d, e, f,g,h,i,j,k});
             
            }
            
            if(model.getRowCount()<=0){
                JOptionPane.showMessageDialog(null, "Kayıt bulunamadı ", "Uyarı", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
     
     
     }
     
     
     // bu fonksiyon database'in kurum tablosundan verileri combo box'ıumızın içersini doldurmak için çeker.
     public void fill_combo(){
     
     borc_panel.setVisible(false);
     kamu_arr.clear();
     cb2.removeAllItems();
        
        
        try {
            
            String kamu_sorgu="select KurumAdi from Kurum ";
            
            ResultSet kamu_rs=SqlQuery(kamu_sorgu);
           
            
            while(kamu_rs.next()){
            
            String d = kamu_rs.getString("KurumAdi");
            kamu_arr.add(d);
            
            }
           
            
          
        } catch (Exception ex) {
            Logger.getLogger(Login_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         for (int i = 0; i < kamu_arr.size(); i++) {
            cb2.addItem(kamu_arr.get(i));
        
         
         
     
     }
     }
    
      // bu fonksiyon database'in redsebebi tablosundan verileri combo box'ıumızın içersini doldurmak için çeker.
     public void fill_combo_red(){
     
          borc_panel.setVisible(false);
     kamu_arr.clear();
     cb2.removeAllItems();
        
        
        try {
            
            String kamu_sorgu="select RedSebebiAciklama from RedSebebi" ;
            
            ResultSet kamu_rs=SqlQuery(kamu_sorgu);
           
            
            while(kamu_rs.next()){
            
            String d = kamu_rs.getString("RedSebebiAciklama");
            kamu_arr.add(d);
            
            }
           
            
          
        } catch (Exception ex) {
            Logger.getLogger(Login_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         for (int i = 0; i < kamu_arr.size(); i++) {
            cb2.addItem(kamu_arr.get(i));
        
     }
     }
     
     public void fill_combo_onay(){
     
     kamu_arr.clear();
     cb2.removeAllItems();
     
     cb2.addItem("Ucret Talebi Yok");
     cb2.addItem("Ucret Talebi Var");

     }
     

    public Controller_Panel() {
        initComponents();
       getAllData();
        borc_panel.setVisible(false);//borc ekranı acılacak
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        cb1 = new javax.swing.JComboBox<String>();
        panel2 = new javax.swing.JPanel();
        cb2 = new javax.swing.JComboBox<String>();
        jButton3 = new javax.swing.JButton();
        borc_panel = new javax.swing.JPanel();
        tf_borc_ekrani = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Basvuruları Görüntüle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        jButton2.setText("Veriyi Güncelle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Baska kuruma yönlendirildi", "Kabul edildi", "Reddedildi" }));
        cb1.setSelectedIndex(-1);
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb2, 0, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jButton3.setText("Acil Olan Basvurulara Göre Sıralama");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        borc_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tf_borc_ekrani.setText("Ucreti giriniz...");
        tf_borc_ekrani.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_borc_ekraniMouseClicked(evt);
            }
        });
        tf_borc_ekrani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_borc_ekraniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout borc_panelLayout = new javax.swing.GroupLayout(borc_panel);
        borc_panel.setLayout(borc_panelLayout);
        borc_panelLayout.setHorizontalGroup(
            borc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borc_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_borc_ekrani, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addContainerGap())
        );
        borc_panelLayout.setVerticalGroup(
            borc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borc_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_borc_ekrani)
                .addContainerGap())
        );

        jButton4.setForeground(new java.awt.Color(204, 0, 0));
        jButton4.setText("ÇIKIŞ YAP");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borc_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(borc_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       getAllData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
      
        if(cb1.getSelectedIndex()==0)
        {
           fill_combo();
        }
        else if(cb1.getSelectedIndex()==1)
        {
            fill_combo_onay();
        }
        else if(cb1.getSelectedIndex()==2)
        {
             fill_combo_red();
        
        }
 
        
    }//GEN-LAST:event_cb1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        model=(DefaultTableModel) table.getModel();
//ortak
        int selectedRow=table.getSelectedRow();
        String id=(String) model.getValueAt(selectedRow, 0);
        
   //yönlendirme
   int kurum_combo_id=cb2.getSelectedIndex();
   int selected_index_cb1=cb1.getSelectedIndex();
   //kabul edildi
   int selected_index_cb2=cb2.getSelectedIndex();
   String borc,kabul_query;
   if(cb1.getSelectedIndex()==1 && cb2.getSelectedIndex()==1)
   {
        borc=tf_borc_ekrani.getText();
        kabul_query="insert into BasvuruUcreti (BasvuruNo,UcretTalepTarihi,BasvuruUcreti,Odendimi) values ( "+id+",GETDATE(),"+Integer.parseInt(borc)+",0)";
            try {
                SqlQuery2(kabul_query);
            } catch (Exception ex) {
                Logger.getLogger(Controller_Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
   
   }
   
   // bu sorguda controller rolune sahip kişi başvuruyu yönlendirir ve + 15 gün ekleme işlemini yapar.
   String yonlendirme_query="UPDATE Basvuru\n" + "SET BasvuruDurumuNo = 1, KurumNo ="+kurum_combo_id+ " ,BasvuruCevapSonTarihi = DATEADD(day, 15, BasvuruCevapSonTarihi) WHERE BasvuruNo = "+id;
   
   String red_query="UPDATE Basvuru\n" +"SET BasvuruDurumuNo = 3, RedSebebiNo = "+kurum_combo_id+"WHERE BasvuruNo ="+id ;

   String kabul_update="UPDATE Basvuru SET BasvuruDurumuNo = 2 where BasvuruNo="+id;
   
        try {
            
            
            
            if(selected_index_cb1==0 )
                SqlQuery2(yonlendirme_query);
            else if(selected_index_cb1==1 ){
             
               
                SqlQuery2(kabul_update);
            }
            else if(selected_index_cb1==2)
                SqlQuery2(red_query);
            

           JOptionPane.showMessageDialog(null, "Basvuru Başarıyla Güncellendi","Basvuru Güncelleme", JOptionPane.INFORMATION_MESSAGE);
        
        } catch (Exception e) {
            System.out.println(e);
        }
        getAllData();
  
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed

        if(cb2.getSelectedIndex()==1 && cb1.getSelectedIndex()==1)//ücret talebi var
        {
            borc_panel.setVisible(true);
            
        
        }
        
        
    }//GEN-LAST:event_cb2ActionPerformed

    // bu fonksiyonda jButton3ActionPerformed tıklanıldığında tabloya başvuru için kalan günü hesaplayarak listeler.
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        DefaultTableModel model = new DefaultTableModel();
        model=(DefaultTableModel) table.getModel();

        model.setRowCount(0);
        model.setColumnCount(0);
        createColoumn2();
        
        String sql_query=ConstantSqlQuery.controllerRemaninDayCalcQuery;
        try{
         ResultSet display=SqlQuery(sql_query);
           
           while(display.next()){
               
                    String d = display.getString("BasvuruNo");
                    String d1 = display.getString("BasvuruTarihi");
                    String d2 = display.getString("BasvuruCevapSonTarihi");
                    String e = display.getString("KalanGünSayisi");
                    String f = display.getString("BasvuruDurumuAciklama");
                    String h = display.getString("Adi");
                    String i = display.getString("Soyadi");
                    String j = display.getString("RedSebebiAciklama");
                    String k = display.getString("KurumAdi");
                 
                    
                    model.addRow(new Object[]{d,d1,d2,e, f,h,i,j,k});
             
            }
            
            if(model.getRowCount()<=0){
                JOptionPane.showMessageDialog(null, "Kayıt bulunamadı ", "Uyarı", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tf_borc_ekraniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_borc_ekraniMouseClicked
       tf_borc_ekrani.setText("");
      
      
        
        
    }//GEN-LAST:event_tf_borc_ekraniMouseClicked

    private void tf_borc_ekraniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_borc_ekraniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_borc_ekraniActionPerformed

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
            java.util.logging.Logger.getLogger(Controller_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controller_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controller_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controller_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controller_Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel borc_panel;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTable table;
    private javax.swing.JTextField tf_borc_ekrani;
    // End of variables declaration//GEN-END:variables
}
