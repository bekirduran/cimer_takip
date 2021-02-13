/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;


import static databaseproject.SqlQuery.SqlQuery;
import static databaseproject.SqlQuery.SqlQuery2;
import java.awt.FileDialog;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author velik
 */
public class Admin_Panel extends javax.swing.JFrame {

      DefaultTableModel model_filter=new DefaultTableModel();
      DefaultTableModel model_istatistik_tarih=new DefaultTableModel();
      ArrayList<String> model_tabloAdi=new ArrayList<String>();
       int RowNum_kabul =0;
      
        public static Basvuru basvuru1;
        public int selecRow;
        public static ArrayList<Basvuru> basvuruArray=new ArrayList<>();
        public static ArrayList<String> telefon_arr=new ArrayList<>();
        public static ArrayList<String> cevaplama_arr=new ArrayList<>();
        public static ArrayList<String> kisi_tanımı_arr=new ArrayList<>();
        public static ArrayList<String> kamu_arr=new ArrayList<>();
        public static ArrayList<Basvuru> for_insert2_arr=new ArrayList<>();
    
           
            public void createColoumn2(){
           
            model_filter=(DefaultTableModel) table_list1.getModel();
         
            
            model_filter.addColumn("BasvuruNo");
            model_filter.addColumn("BasvuruTarihi");
            model_filter.addColumn("BasvuruCevapSonTarihi");
            model_filter.addColumn("BasvuruTipiNo");
            model_filter.addColumn("Basvuru\nDurumu");
            model_filter.addColumn("TürkVatandasıMı");
            model_filter.addColumn("TcNo");
            model_filter.addColumn("Adi");
            model_filter.addColumn("Soyadi");
            model_filter.addColumn("TüzelKişiMi");
            model_filter.addColumn("TüzelKişiÜnvanı");
            model_filter.addColumn("Adres");
            model_filter.addColumn("E-posta");
            model_filter.addColumn("TelefonNum");
            model_filter.addColumn("TelefonTipi");
            model_filter.addColumn("Fax");
            model_filter.addColumn("CevaplamaTipiNo");
            model_filter.addColumn("BasvuruCevabıAcıklama");
            model_filter.addColumn("RedSebebiNo");
            model_filter.addColumn("AdresTipiNo");
            model_filter.addColumn("BasvuruAcıklaması");
            model_filter.addColumn("KurumNo");


}
            
            public void sorguCalistir2(){
                
            
             
        DefaultTableModel model = new DefaultTableModel();
        model=(DefaultTableModel) table_list1.getModel();
        
        
        model.setRowCount(0);
   
        System.out.println("table1");

       try {  

            String sql_query= ConstantSqlQuery.fatchAlldataQuery;
            
            ResultSet rs=SqlQuery(sql_query);
            ResultSetMetaData metadata = rs.getMetaData();
            int columnCount = metadata.getColumnCount(); 
               String str=null;
            
            while(rs.next()){
                
                Object[] row = new Object[columnCount];
                
                for (int i = 1; i <= columnCount; ++i) {
                    row[i-1]=rs.getString(i);
                   
                     
                }
                    
                 model.addRow(row);   
            }
            
            
        
            if(model.getRowCount()<=0){
                JOptionPane.showMessageDialog(null, "Kayıt bulunamadı ", "Uyarı", JOptionPane.ERROR_MESSAGE);
            }
            
            }
 catch (Exception e) {
            System.out.println(e);
        }
  }
            
            
            
   

public void createColoumn_tabloAdi(){

           
            model_tabloAdi.add("BasvuruNo");        
            model_tabloAdi.add("BasvuruTarihi");
            model_tabloAdi.add("BasvuruCevapSonTarihi");
            model_tabloAdi.add("BasvuranTipiNo");
            model_tabloAdi.add("BasvuruTipiNo");
            model_tabloAdi.add("BasvuruDurumuNo");
            model_tabloAdi.add("TurkVatandasimi");
            model_tabloAdi.add("TCKimlikNo");
            model_tabloAdi.add("Adi");
            model_tabloAdi.add("Soyadi");
            model_tabloAdi.add("TuzelKisimi");
            model_tabloAdi.add("TuzelKisiUnvani");
            model_tabloAdi.add("Adres");
            model_tabloAdi.add("Eposta");
            model_tabloAdi.add("Telefonu");
            model_tabloAdi.add("TelefonTipiNo");
            model_tabloAdi.add("Fax");
            model_tabloAdi.add("CevaplamaTipiNo");
            model_tabloAdi.add("BasvuruCevabiAciklama");
            model_tabloAdi.add("RedSebebiNo");
            model_tabloAdi.add("AdresTipiNo");
            model_tabloAdi.add("BasvuruAciklamasi");
            model_tabloAdi.add("KurumNo");



}

public void createColoumn_istatistik(){

            model_istatistik_tarih=(DefaultTableModel) table_istatistik.getModel();
           
            model_istatistik_tarih.addColumn("BasvuruNo");
            model_istatistik_tarih.addColumn("BasvuruTarihi");
            model_istatistik_tarih.addColumn("BasvuruCevapSonTarihi");
            model_istatistik_tarih.addColumn("BasvuranTipi");
            model_istatistik_tarih.addColumn("BasvuruTipiNo");
            model_istatistik_tarih.addColumn("Basvuru\nDurumu");
            model_istatistik_tarih.addColumn("TürkVatandasıMı");
            model_istatistik_tarih.addColumn("TcNo");
            model_istatistik_tarih.addColumn("Adi");
            model_istatistik_tarih.addColumn("Soyadi");
            model_istatistik_tarih.addColumn("TüzelKişiMi");
            model_istatistik_tarih.addColumn("TüzelKişiÜnvanı");
            model_istatistik_tarih.addColumn("Adres");
            model_istatistik_tarih.addColumn("E-posta");
            model_istatistik_tarih.addColumn("TelefonNum");
            model_istatistik_tarih.addColumn("TelefonTipi");
            model_istatistik_tarih.addColumn("Fax");
            model_istatistik_tarih.addColumn("CevaplamaTipiNo");
            model_istatistik_tarih.addColumn("BasvuruCevabıAcıklama");
            model_istatistik_tarih.addColumn("RedSebebiNo");
            model_istatistik_tarih.addColumn("AdresTipiNo");
            model_istatistik_tarih.addColumn("BasvuruAcıklaması");
            model_istatistik_tarih.addColumn("KurumNo");



}
   public  void filter_table(String query)
   {
       
       TableRowSorter<DefaultTableModel> sorter =new TableRowSorter<>(model_filter);
       table_list1.setRowSorter(sorter);
       
      sorter.setRowFilter(RowFilter.regexFilter(query));
   
   }
         
         
         
         
         
    public static void fill_basvuru_ekrani(){
           
        telefon_arr.clear();
        
        
        try {
            String sql_query="select TelefonTipiAciklama from TelefonTipi";
          
            
            ResultSet rs=SqlQuery(sql_query);
            
            while(rs.next()){
            
            String d = rs.getString("TelefonTipiAciklama");
            telefon_arr.add(d);
            
            }
           
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(Login_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        cevaplama_arr.clear();
        
        
        try {
            
            String telefon_sorgu="select CevaplamaTipiAciklama from CevaplamaTipi";
            ResultSet tel_rs=SqlQuery(telefon_sorgu);
           
            
            while(tel_rs.next()){
            
            String d = tel_rs.getString("CevaplamaTipiAciklama");
            cevaplama_arr.add(d);
            
            }
           
            
             
          
        } catch (Exception ex) {
            Logger.getLogger(Login_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
            kisi_tanımı_arr.clear();
        
        
        try {
            
            String kisi_sorgu="select BasvuranTipiAciklama from BasvuranTipi";
            ResultSet kisi_rs=SqlQuery(kisi_sorgu);
           
            
            while(kisi_rs.next()){
            
            String d = kisi_rs.getString("BasvuranTipiAciklama");
            kisi_tanımı_arr.add(d);
            
            }
           
          
        } catch (Exception ex) {
            Logger.getLogger(Login_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
        
         
        
        }
    public static void radio_btn_fill(int num){
   
   kamu_arr.clear();
   
        
        
        try {
            
            String kamu_sorgu="select KurumAdi from Kurum where KurumTipiNo ="+num;
            ResultSet kamu_rs=SqlQuery(kamu_sorgu);
           
            
            while(kamu_rs.next()){
            
            String d = kamu_rs.getString("KurumAdi");
            kamu_arr.add(d);
            
            }
           
            
          
        } catch (Exception ex) {
            Logger.getLogger(Login_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
   
   }
    
   
    public Admin_Panel() {
        initComponents();
        fill_basvuru_ekrani();
    
        createColoumn2();
        jPanel9.setVisible(false);
        
        createColoumn_tabloAdi();
    
        jLayeredPane1.setVisible(false);
     pasaport_pane.setVisible(false);
     tc_pane.setVisible(false);
     gercek_tuzel_pane1.setVisible(false);
      gercek_tuzel_pane.setVisible(false);
      btn_kaydet.setEnabled(false);
     
     for (int i = 0; i < telefon_arr.size(); i++) {
            telefon_tip_combo.addItem(telefon_arr.get(i));
        }
        
        for (int i = 0; i < cevaplama_arr.size(); i++) {
            basvuru_yolu.addItem(cevaplama_arr.get(i));
        }
        for (int i = 0; i < kisi_tanımı_arr.size(); i++) {
            kisi_tanimi.addItem(kisi_tanımı_arr.get(i));
        }
        
     
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        mail = new javax.swing.JTextField();
        ad = new javax.swing.JTextField();
        telefon_num = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        soyad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_adres = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        uyruk = new javax.swing.JComboBox<>();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        tc_pane = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tc_no = new javax.swing.JTextField();
        pasaport_pane = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pasaport_no = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        telefon_tip_combo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        adres_combo = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        basvuru_yolu = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        kisi_tanimi = new javax.swing.JComboBox<>();
        gercek_tuzel_pane = new javax.swing.JPanel();
        tuzel_unvan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        kurum_tipi_combo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_bas_acıklama = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        btn_kaydet = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_istatistik = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        sonuc = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        kabul_edilen_table = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        panel_secret1 = new javax.swing.JPanel();
        tf_basvuru_no1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        tf_filter1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        adminDuzenPanel = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        mail1 = new javax.swing.JTextField();
        telefon_num1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ta_adres1 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        telefon_tip_combo1 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        adres_combo1 = new javax.swing.JComboBox<>();
        adSoyadLabel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tcNoLabel = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        basvuru_yolu1 = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        kisi_tanimi1 = new javax.swing.JComboBox<>();
        gercek_tuzel_pane1 = new javax.swing.JPanel();
        tuzel_unvan1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        kurumTipicombo = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ta_bas_acıklama1 = new javax.swing.JTextArea();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        table_list1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Paneli");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Başvuru Sahibinin;", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        mail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });

        ad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActionPerformed(evt);
            }
        });

        telefon_num.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        telefon_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefon_numActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Soyadı :");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Telefon Numarası:");

        soyad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        soyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soyadActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Email:");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("Adı :");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setText("Adres:");

        ta_adres.setColumns(20);
        ta_adres.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ta_adres.setRows(5);
        jScrollPane1.setViewportView(ta_adres);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Uyruk: ");

        uyruk.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        uyruk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yabancı", "T.C" }));
        uyruk.setSelectedIndex(-1);
        uyruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyrukActionPerformed(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tc_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("T.C. No:");
        tc_pane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 82, 32));

        tc_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tc_noKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tc_noKeyReleased(evt);
            }
        });
        tc_pane.add(tc_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 257, 41));

        pasaport_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Pasaport No:");
        pasaport_pane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 28));

        pasaport_no.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pasaport_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pasaport_noKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pasaport_noKeyReleased(evt);
            }
        });
        pasaport_pane.add(pasaport_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 260, 39));

        jLayeredPane1.setLayer(tc_pane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pasaport_pane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tc_pane, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pasaport_pane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tc_pane, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pasaport_pane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setText("Telefon Tipi:");

        telefon_tip_combo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        telefon_tip_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefon_tip_comboActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel15.setText("Adres Tipi: ");

        adres_combo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        adres_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ev", "İş" }));
        adres_combo.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLayeredPane1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(soyad)
                                    .addComponent(ad)
                                    .addComponent(uyruk, 0, 256, Short.MAX_VALUE))))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel15)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(telefon_num)
                            .addComponent(mail, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(adres_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefon_tip_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyruk, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(telefon_tip_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(telefon_num, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel15))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(adres_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(62, 62, 62))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Başvuruya hangi yolla cevap almak istersiniz?");

        basvuru_yolu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Kişi Tanımı : ");

        kisi_tanimi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        kisi_tanimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kisi_tanimiActionPerformed(evt);
            }
        });

        gercek_tuzel_pane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tuzel_unvan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Tüzel Kişi Ünvanı:");

        javax.swing.GroupLayout gercek_tuzel_paneLayout = new javax.swing.GroupLayout(gercek_tuzel_pane);
        gercek_tuzel_pane.setLayout(gercek_tuzel_paneLayout);
        gercek_tuzel_paneLayout.setHorizontalGroup(
            gercek_tuzel_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gercek_tuzel_paneLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(tuzel_unvan, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        gercek_tuzel_paneLayout.setVerticalGroup(
            gercek_tuzel_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gercek_tuzel_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gercek_tuzel_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tuzel_unvan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setText("Başvuru yapılan kurum tipi: ");

        buttonGroup2.add(rb1);
        rb1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        rb1.setText("Kamu Kurumu Niteliğindeki Meslek Kuruluşları ");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb2);
        rb2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        rb2.setText("Kamu Kurum ve Kuruluşları ");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        kurum_tipi_combo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        kurum_tipi_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurum_tipi_comboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb1)
                            .addComponent(rb2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(kurum_tipi_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(basvuru_yolu, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kisi_tanimi, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(gercek_tuzel_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(basvuru_yolu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(kisi_tanimi)
                        .addGap(16, 16, 16))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(gercek_tuzel_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kurum_tipi_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(rb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb2)))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Başvurunuzu Açıklayınız: ");

        ta_bas_acıklama.setColumns(20);
        ta_bas_acıklama.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ta_bas_acıklama.setRows(5);
        jScrollPane2.setViewportView(ta_bas_acıklama);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("ÇIKIŞ YAP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_kaydet.setBackground(new java.awt.Color(255, 255, 255));
        btn_kaydet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_kaydet.setForeground(new java.awt.Color(0, 153, 51));
        btn_kaydet.setText("Kaydet");
        btn_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kaydetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_kaydet, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_kaydet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kayıt Alma", jPanel1);

        jButton1.setText("Aynı kişiye ait başvuruların gösterilmesi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Kendilerine yapılan bilgi edinme başvurularının sayısını");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Olumlu cevaplanarak bilgi veya belgelere erişim sağlanan başvuru sayısını");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Reddedilen başvuru sayısı");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel16.setText("SONUÇLAR:");

        table_istatistik.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BasvuruNo", "BasvuruTarihi", "Adı", "Soyadı", "Basvuru Acıklaması", "KurumAdı", "TcNo", "Tekrar Sayısı"
            }
        ));
        jScrollPane4.setViewportView(table_istatistik);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        sonuc.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sonuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sonuc, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton9.setText("Gizlilik ihlali Olan Basvuru Sayısı");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(31, 31, 31)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1067, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 237, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("İstatistik", jPanel3);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        kabul_edilen_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BasvuruNo", "Adı", "Soyadı", "TcNo", "BasvuruDurumu"
            }
        ));
        kabul_edilen_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kabul_edilen_tableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(kabul_edilen_table);

        jButton10.setText("Kabul Edilen Basvuruları Göster");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton11.setText("Raporu Gönder");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(667, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Kabul Edilen Basvuru", jPanel7);

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton12.setText("Bütün Başvuruları Göster");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_secret1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tf_basvuru_no1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Başvuru Numarası : ");

        javax.swing.GroupLayout panel_secret1Layout = new javax.swing.GroupLayout(panel_secret1);
        panel_secret1.setLayout(panel_secret1Layout);
        panel_secret1Layout.setHorizontalGroup(
            panel_secret1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_secret1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(tf_basvuru_no1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panel_secret1Layout.setVerticalGroup(
            panel_secret1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_secret1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_secret1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_basvuru_no1)
                    .addComponent(jLabel27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton13.setText("Basvuruyu Güncelle");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Basvuruyu Sil");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tf_filter1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_filter1KeyReleased(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Tabloda Ara: ");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(tf_filter1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_filter1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addContainerGap())
        );

        adminDuzenPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Başvuru Sahibi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        mail1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mail1ActionPerformed(evt);
            }
        });

        telefon_num1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        telefon_num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefon_num1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel18.setText("Telefon Numarası:");

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel19.setText("Email:");

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel21.setText("Adres:");

        ta_adres1.setColumns(15);
        ta_adres1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ta_adres1.setRows(5);
        jScrollPane6.setViewportView(ta_adres1);

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel25.setText("Telefon Tipi:");

        telefon_tip_combo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        telefon_tip_combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İş", "Ev", "Mobil" }));
        telefon_tip_combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefon_tip_combo1ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel26.setText("Adres Tipi: ");

        adres_combo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        adres_combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ev", "İş" }));

        adSoyadLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel20.setText("Tc / Pasport ID : ");

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel22.setText("Adı - Soyadı :");

        tcNoLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel26)
                            .addComponent(jLabel21)
                            .addComponent(jLabel25)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel20))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(telefon_num1)
                    .addComponent(mail1)
                    .addComponent(adres_combo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telefon_tip_combo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tcNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adSoyadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adSoyadLabel)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tcNoLabel))
                .addGap(27, 27, 27)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(telefon_tip_combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(telefon_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(mail1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel26))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(adres_combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel29.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel29.setText("Başvuruya hangi yolla cevap almak istersiniz?");

        basvuru_yolu1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        basvuru_yolu1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yazılı", "Email" }));

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel30.setText("Kişi Tanımı : ");

        kisi_tanimi1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        kisi_tanimi1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerçek", "Tüzel" }));
        kisi_tanimi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kisi_tanimi1ActionPerformed(evt);
            }
        });

        gercek_tuzel_pane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tuzel_unvan1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel31.setText("Tüzel Kişi Ünvanı:");

        javax.swing.GroupLayout gercek_tuzel_pane1Layout = new javax.swing.GroupLayout(gercek_tuzel_pane1);
        gercek_tuzel_pane1.setLayout(gercek_tuzel_pane1Layout);
        gercek_tuzel_pane1Layout.setHorizontalGroup(
            gercek_tuzel_pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gercek_tuzel_pane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(tuzel_unvan1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        gercek_tuzel_pane1Layout.setVerticalGroup(
            gercek_tuzel_pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gercek_tuzel_pane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gercek_tuzel_pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tuzel_unvan1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel32.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel32.setText("Başvuru yapılan kurum tipi: ");

        buttonGroup1.add(rb3);
        rb3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        rb3.setText("Kamu Kurumu Niteliğindeki Meslek Kuruluşları ");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb4);
        rb4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        rb4.setText("Kamu Kurum ve Kuruluşları ");
        rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4ActionPerformed(evt);
            }
        });

        kurumTipicombo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb3)
                            .addComponent(rb4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(kurumTipicombo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gercek_tuzel_pane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(basvuru_yolu1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kisi_tanimi1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(basvuru_yolu1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(kisi_tanimi1)
                        .addGap(3, 3, 3)))
                .addComponent(gercek_tuzel_pane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kurumTipicombo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(rb3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb4)))
                .addGap(50, 50, 50))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Başvurunuzu Açıklayınız: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        ta_bas_acıklama1.setColumns(20);
        ta_bas_acıklama1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ta_bas_acıklama1.setRows(5);
        jScrollPane7.setViewportView(ta_bas_acıklama1);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Başvuru Listesi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        table_list1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table_list1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_list1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table_list1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_list1MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(table_list1);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout adminDuzenPanelLayout = new javax.swing.GroupLayout(adminDuzenPanel);
        adminDuzenPanel.setLayout(adminDuzenPanelLayout);
        adminDuzenPanelLayout.setHorizontalGroup(
            adminDuzenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminDuzenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminDuzenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(adminDuzenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        adminDuzenPanelLayout.setVerticalGroup(
            adminDuzenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminDuzenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminDuzenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminDuzenPanelLayout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminDuzenPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(adminDuzenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel_secret1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_secret1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(adminDuzenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Güncelleme Paneli", jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void table_list1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_list1MouseClicked
        /*

        DefaultTableModel model = (DefaultTableModel) table_list.getModel();
        int selectRowIndex = table_list.getSelectedRow();
        tf_basvuru_no.setText(model.getValueAt(selectRowIndex, 0).toString() );
        selecRow = selectRowIndex;
        */

        DefaultTableModel model = (DefaultTableModel) table_list1.getModel();
        int selectRowIndex = table_list1.getSelectedRow();
        tf_basvuru_no1.setText(model.getValueAt(selectRowIndex, 0).toString() );
        selecRow = Integer.parseInt(model.getValueAt(selectRowIndex, 0).toString());

        try {

            String sql_query="select * from Basvuru where BasvuruNo = '"+selecRow+"'";
            ResultSet rs=SqlQuery(sql_query);

            if(rs.next()){

                //System.out.println("Kurum: "+rs.getString("KurumNo"));

                String sql_query2="select * from Kurum where KurumNo = '"+rs.getString("KurumNo") +"'";
                ResultSet rs2 = SqlQuery(sql_query2);

                rs2.next();

                //System.out.println("KurumTipiNo: "+rs.getString("KurumNo"));

                adSoyadLabel.setText(rs.getString("Adi")+" "+rs.getString("Soyadi"));
                tcNoLabel.setText(rs.getString("TCKimlikNo"));

                telefon_tip_combo1.setSelectedIndex(Integer.parseInt(rs.getString("TelefonTipiNo")));

                telefon_num1.setText(rs.getString("Telefonu"));

                adres_combo1.setSelectedIndex(Integer.parseInt(rs.getString("AdresTipiNo")));

                mail1.setText(rs.getString("Eposta"));

                ta_adres1.setText(rs.getString("Adres"));

                ta_bas_acıklama1.setText(rs.getString("BasvuruCevabiAciklama"));

                basvuru_yolu1.setSelectedIndex(Integer.parseInt(rs.getString("BasvuruTipiNo")));

                kisi_tanimi1.setSelectedIndex(Integer.parseInt(rs.getString("TuzelKisimi")));

                tuzel_unvan1.setText(rs.getString("TuzelKisiUnvani"));

                //System.out.println("KurumTipiNo: "+rs2.getString("KurumTipiNo"));

                if( Integer.parseInt(rs2.getString("KurumTipiNo")) == 0 ) {
                    rb3.setSelected(true);
                    rb4.setSelected(false);

                    radio_btn_fill(0);
                    kurumTipicombo.removeAllItems();
                    for (int i = 0; i < kamu_arr.size(); i++) {
                        kurumTipicombo.addItem(kamu_arr.get(i));
                    }

                    kurumTipicombo.setSelectedIndex(Integer.parseInt(rs.getString("KurumNo")));

                } else {
                    rb4.setSelected(true);
                    rb3.setSelected(false);

                    radio_btn_fill(1);
                    kurumTipicombo.removeAllItems();
                    for (int i = 0; i < kamu_arr.size(); i++) {
                        kurumTipicombo.addItem(kamu_arr.get(i));
                    }

                    kurumTipicombo.setSelectedIndex(Integer.parseInt(rs.getString("KurumNo"))-10);

                }

                /*
                odemeBox.setSelectedIndex(basvuruOdeme);

                tarihText.setText(basvuruTarihi);

                guncelleBtn.setVisible(true);
                kaydetBtn.setVisible(false);*/

            } else{
                /*
                odemeBox.setSelectedIndex(0);

                textUcret.setText("");
                tarihText.setText("");

                guncelleBtn.setVisible(false);
                kaydetBtn.setVisible(true);*/

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_table_list1MouseClicked

    private void rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4ActionPerformed
        if(rb4.isSelected())
        {
            radio_btn_fill(1);
            kurumTipicombo.removeAllItems();
            for (int i = 0; i < kamu_arr.size(); i++) {
                kurumTipicombo.addItem(kamu_arr.get(i));
            }
        }
    }//GEN-LAST:event_rb4ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        if(rb3.isSelected())
        {
            radio_btn_fill(0);
            kurumTipicombo.removeAllItems();
            for (int i = 0; i < kamu_arr.size(); i++) {
                kurumTipicombo.addItem(kamu_arr.get(i));
            }
        }
    }//GEN-LAST:event_rb3ActionPerformed

    private void kisi_tanimi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kisi_tanimi1ActionPerformed
        if(kisi_tanimi1.getSelectedIndex()==1)
        {

            gercek_tuzel_pane1.setVisible(true);
            String tuzelUnvan=tuzel_unvan.getText();
        }
        else
        {

            gercek_tuzel_pane1.setVisible(false);

        }
    }//GEN-LAST:event_kisi_tanimi1ActionPerformed

    private void telefon_tip_combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefon_tip_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefon_tip_combo1ActionPerformed

    private void telefon_num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefon_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefon_num1ActionPerformed

    private void mail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mail1ActionPerformed

    private void tf_filter1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_filter1KeyReleased

        String str=tf_filter1.getText();
        filter_table(str);
    }//GEN-LAST:event_tf_filter1KeyReleased

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

        int id=Integer.parseInt(tf_basvuru_no1.getText());
        
        String sorgu2 ="DELETE FROM Basvuru WHERE BasvuruNo="+tf_basvuru_no1.getText();

        try {

          
            SqlQuery2(sorgu2);
            sorguCalistir2();

            JOptionPane.showMessageDialog(null, "Toblo:  "+tf_basvuru_no1.getText()+" Başarı ile Silinmiştir. ", "Bilgi", JOptionPane.INFORMATION_MESSAGE);

        

        } catch (Exception ex) {
            Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        int kNum = 0;

        if(rb3.isSelected()) kNum = kurumTipicombo.getSelectedIndex(); else kNum = kurumTipicombo.getSelectedIndex()+10;

        String sql_query = "UPDATE Basvuru set "
        +"TelefonTipiNo = '"+ telefon_tip_combo1.getSelectedIndex()  +"',"+
        "Telefonu = '"+ telefon_num1.getText().toString()  +"',"+
        "AdresTipiNo = '"+ adres_combo1.getSelectedIndex() +"', "+
        "Eposta = '"+ mail1.getText().toString()  +"',"+
        "Adres = '"+ ta_adres1.getText().toString()  +"',"+
        "BasvuruCevabiAciklama = '"+ ta_bas_acıklama1.getText().toString()  +"',"+
        "BasvuruTipiNo = '"+ basvuru_yolu1.getSelectedIndex() +"', "+
        "TuzelKisimi = '"+ kisi_tanimi1.getSelectedIndex() +"', "+
        "TuzelKisiUnvani = '"+ tuzel_unvan1.getText().toString()  +"',"+
        "KurumNo = '"+ kNum +"' "+
        " where BasvuruNo = '"+selecRow+"'";

        try {
            SqlQuery2(sql_query);
            sorguCalistir2();
            JOptionPane.showMessageDialog(null, "Başvuur Düzenleme Başarı ile Tamamlandı. ", "Bilgi", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        sorguCalistir2();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        try {
             FileDialog dialog = new FileDialog((Frame)null, "Select File to Open");
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        String file = dialog.getFile();
        
        JOptionPane.showMessageDialog(null, file+" Dosya "+RowNum_kabul +" numaralı başvuru sahibine  Gönderildi ", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null," Dosya secimi yapınız ", "Başarısız", JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        DefaultTableModel model = new DefaultTableModel(new String[]{}, 0);
        model=(DefaultTableModel) kabul_edilen_table.getModel();

        model.setRowCount(0);

        try {

            String sql_query= ConstantSqlQuery.basvuruDurumNo2Queries;

            ResultSet rs=SqlQuery(sql_query);
            ResultSetMetaData metadata = rs.getMetaData();
            int columnCount = metadata.getColumnCount();

            while(rs.next()){

                Object[] row = new Object[columnCount];

                for (int i = 1; i <= columnCount; ++i) {

                    row[i - 1] = rs.getString(i);

                }
                model.addRow(row);
            }

            if(model.getRowCount()<=0){
                JOptionPane.showMessageDialog(null, "Kayıt bulunamadı ", "Uyarı", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void kabul_edilen_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kabul_edilen_tableMouseClicked
        jPanel9.setVisible(true);
        DefaultTableModel model = (DefaultTableModel) kabul_edilen_table.getModel();
        int selectRowIndex = kabul_edilen_table.getSelectedRow();
        RowNum_kabul = Integer.parseInt( model.getValueAt(selectRowIndex, 0).toString() );
    }//GEN-LAST:event_kabul_edilen_tableMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String sorgu=ConstantSqlQuery.gizliBilgimiQuery;
        ResultSet rs;
        try {
            rs = SqlQuery(sorgu);
            while(rs.next()){
                String s=rs.getString("GizliBilgi");
                sonuc.setText("Gizlilik ihlali Olan Basvuru Sayısı: "+s);

            }
        } catch (Exception ex) {
            Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String sorgu="Select Count(BasvuruDurumuNo) as RedEdilenler from Basvuru where BasvuruDurumuNo=3";
        ResultSet rs;
        try {
            rs = SqlQuery(sorgu);
            while(rs.next()){
                String s=rs.getString("RedEdilenler");
                sonuc.setText("Reddedilen başvuru sayısı: "+s);

            }
        } catch (Exception ex) {
            Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String sorgu="Select Count(BasvuruDurumuNo) as Kabuledilen from Basvuru where BasvuruDurumuNo=2";
        ResultSet rs;
        try {
            rs = SqlQuery(sorgu);
            while(rs.next()){
                String s=rs.getString("Kabuledilen");
                sonuc.setText("Kabul edilen başvuru sayısı "
                    + "\n:"+s);

            }
        } catch (Exception ex) {
            Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String sorgu="Select Count(BasvuruNo) as ToplamBasvuru from Basvuru ";
        ResultSet rs;
        try {
            rs = SqlQuery(sorgu);
            while(rs.next()){
                String s=rs.getString("ToplamBasvuru");
                sonuc.setText("ToplamBasvuru başvuru sayısı: "+s);

            }
        } catch (Exception ex) {
            Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DefaultTableModel model = new DefaultTableModel(new String[]{}, 0);
        model=(DefaultTableModel) table_istatistik.getModel();

        model.setRowCount(0);

        try {

            String sql_query=ConstantSqlQuery.ayniTcSahibiQuery;

            ResultSet rs=SqlQuery(sql_query);
            ResultSetMetaData metadata = rs.getMetaData();
            int columnCount = metadata.getColumnCount();

            while(rs.next()){

                Object[] row = new Object[columnCount];

                for (int i = 1; i <= columnCount; ++i) {

                    row[i - 1] = rs.getString(i);

                }
                model.addRow(row);
            }

            if(model.getRowCount()<=0){
                JOptionPane.showMessageDialog(null, "Kayıt bulunamadı ", "Uyarı", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kaydetActionPerformed

        String basvuru_no_ekrandaGösterilmesi="Select TOP 1 BasvuruNo from Basvuru ORDER BY BasvuruNo DESC ";
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("fieldAdis", "Adi,Soyadi,BasvuruTarihi,BasvuruCevapSonTarihi,BasvuranTipiNo,BasvuruTipiNo,BasvuruDurumuNo,TurkVatandasimi,TCKimlikNo,TuzelKisimi,TuzelKisiUnvani,Adres,Eposta,Telefonu,TelefonTipiNo,Fax,AdresTipiNo");

        List<Object> rows = new ArrayList<>();

        long tcNewVeri=0;

        if(uyruk.getSelectedIndex() == 0 )
        tcNewVeri = Long.parseLong(pasaport_no.getText());
        else
        tcNewVeri = Long.parseLong(tc_no.getText());

        int kurum_no=0;
        String kurum_adi= (String) kurum_tipi_combo.getSelectedItem();

        try {
            ResultSet rs=SqlQuery("select KurumNo from Kurum where KurumAdi = " +"'"+kurum_adi+"'");
            if(rs.next())
            {
                kurum_no=Integer.parseInt(rs.getString("KurumNo")) ;

            }
        } catch (Exception ex) {
            Logger.getLogger(Basvuru_Ekrani.class.getName()).log(Level.SEVERE, null, ex);
        }

        int BasvuranTipiNo = kisi_tanimi.getSelectedIndex();
        int BasvuruTipiNo = basvuru_yolu.getSelectedIndex();
        int BasvuruDurumuNo = 0;

        int TurkVatandasimi = uyruk.getSelectedIndex(); //0 tc ,1 yabancı
        long TCKimlikNo = tcNewVeri;
        String Adi = ad.getText();
        String Soyadi = soyad.getText();
        int TuzelKisimi = kisi_tanimi.getSelectedIndex();
        String TuzelKisiUnvani = tuzel_unvan.getText();
        String Adres = ta_adres.getText();
        String Eposta = mail.getText();
        String basvuran_tipi=(String) kisi_tanimi.getSelectedItem();
        String Telefonu = telefon_num.getText();
        int TelefonTipiNo = telefon_tip_combo.getSelectedIndex();
        String Fax =  "null";
        int AdresTipiNo = adres_combo.getSelectedIndex();

        String BasvuruAciklamasi = ta_bas_acıklama.getText();
        int KurumNo = kurum_no;

        int CevaplamaTipiNo = basvuru_yolu.getSelectedIndex();

        rows.add(new Basvuru(Adi, Soyadi,BasvuruTipiNo, BasvuruDurumuNo,TurkVatandasimi,TCKimlikNo, TuzelKisimi, TuzelKisiUnvani, Adres, Eposta, Telefonu, TelefonTipiNo, Fax,CevaplamaTipiNo, AdresTipiNo,BasvuruAciklamasi,KurumNo));

        System.out.println("unvan: "+telefon_num.getText());

        basvuru1 = new Basvuru(Adi, Soyadi,BasvuruTipiNo, BasvuruDurumuNo,TurkVatandasimi,TCKimlikNo, TuzelKisimi, TuzelKisiUnvani, Adres, Eposta, Telefonu, TelefonTipiNo, Fax,CevaplamaTipiNo, AdresTipiNo,BasvuruAciklamasi,KurumNo);

        String sql_query = "insert into Basvuru (Adi, Soyadi,BasvuruTipiNo, BasvuruDurumuNo,TurkVatandasimi,TCKimlikNo, TuzelKisimi, TuzelKisiUnvani, Adres, Eposta, Telefonu, TelefonTipiNo, Fax,CevaplamaTipiNo, AdresTipiNo,BasvuruAciklamasi,KurumNo)"
        +"values ('"+
        Adi                 +"','"+
        Soyadi              +"',"+
        BasvuruTipiNo       +", "+
        BasvuruDurumuNo     +","+
        TurkVatandasimi     +","+
        TCKimlikNo          +", "+
        TuzelKisimi         +", '"+
        TuzelKisiUnvani     +"', '"+
        Adres               +"', '"+
        Eposta              +"', '"+
        Telefonu            +"', "+
        TelefonTipiNo       +", '"+
        Fax                 +"',"+
        CevaplamaTipiNo     +", "+
        AdresTipiNo         +",'"+
        BasvuruAciklamasi   +"',"+
        KurumNo             +")";

        try {
            SqlQuery2(sql_query);

            ResultSet rs=SqlQuery(basvuru_no_ekrandaGösterilmesi);

            String bas_no=null;
            while(rs.next())
            {
                bas_no=rs.getString("BasvuruNo");
            }
            JOptionPane.showMessageDialog(null,"Basvuru "+bas_no+" numara ile kaydedildi Sorgu yapmak için numarayı kaybetmeyin" , "Basvuru Kabul", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            System.out.println(ex);
        }

        basvuruArray.add(basvuru1);

        System.out.println("Degerler: "+rows.toString());

        System.out.println("Rowlar: "+rows.toString());

        parameters.put("rows", rows);

        Map<String, Controller> router = new HashMap<>();
        router.put("Basvuru", new Controller(new BasvuruView(), new BasvuruModel()));

        ViewData veriEkle = new ViewData("Basvuru", "insert", parameters);
        try {
            Controller controller = router.get(veriEkle.functionName);
            ModelData modelData = controller.executeModel(veriEkle);
            veriEkle = controller.getView(modelData, veriEkle.functionName, veriEkle.operationName);

            System.out.println("Veriler: "+veriEkle.toString());
        } catch (Exception ex) { }
    }//GEN-LAST:event_btn_kaydetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int result= JOptionPane.showConfirmDialog(null, "Çıkmak istediğine emin misin? ", "Uyarı",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION)
        {
            this.setVisible(false);
            Login_Page login=new Login_Page();
            login.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        if(rb2.isSelected())
        {
          
            kurum_tipi_combo.removeAllItems();
            radio_btn_fill(1);
            for (int i = 0; i < kamu_arr.size(); i++) {
                kurum_tipi_combo.addItem(kamu_arr.get(i));
            }
        }
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        if(rb1.isSelected())
        {
            kurum_tipi_combo.removeAllItems();
            radio_btn_fill(0);
            
            for (int i = 0; i < kamu_arr.size(); i++) {
                kurum_tipi_combo.addItem(kamu_arr.get(i));
            }
        }
    }//GEN-LAST:event_rb1ActionPerformed

    private void kisi_tanimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kisi_tanimiActionPerformed
        if(kisi_tanimi.getSelectedIndex()==1)
        {

            gercek_tuzel_pane.setVisible(true);

            String tuzelUnvan=tuzel_unvan.getText();
        }
        else
        {

            gercek_tuzel_pane.setVisible(false);

        }
    }//GEN-LAST:event_kisi_tanimiActionPerformed

    private void telefon_tip_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefon_tip_comboActionPerformed

    }//GEN-LAST:event_telefon_tip_comboActionPerformed

    private void uyrukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyrukActionPerformed
        if(uyruk.getSelectedItem().equals("Yabancı"))
        {
            jLayeredPane1.setVisible(true);
            pasaport_pane.setVisible(true);
            tc_pane.setVisible(false);

        }
        else
        {
            jLayeredPane1.setVisible(true);
            pasaport_pane.setVisible(false);
            tc_pane.setVisible(true);

        }
    }//GEN-LAST:event_uyrukActionPerformed

    private void soyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soyadActionPerformed

    private void telefon_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefon_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefon_numActionPerformed

    private void adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailActionPerformed

    private void kurum_tipi_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurum_tipi_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kurum_tipi_comboActionPerformed
//bu komutsatırı gerçek bir tc numarası girilmesinin hesaplamasını yapmaktadır.
  private boolean isTCKNCorrect(String id) {
      if (id == null) return false;

 

      if (id.length() != 11) return false;

 


//      char[] chars = id.toCharArray();
//      int[] a = new int[11];
//  
//      for(int i=0; i<11; i++) {
//          a[i] = chars[i] - '0';
//      }
//
//      if(a[0] == 0) return false;
//      if(a[10] % 2 == 1) return false;
//
//      if(((a[0] + a[2] + a[4] + a[6] + a[8]) * 7 - (a[1] + a[3] + a[5] + a[7])) % 10 != a[9]) return false;
//
//      if((a[0] + a[1] + a[2] + a[3] + a[4] + a[5] + a[6] + a[7] + a[8] + a[9]) % 10 != a[10]) return false;

 

      return true;
  }
    private void pasaport_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pasaport_noKeyReleased
        //pasaport_no
               
                   if (isTCKNCorrect(pasaport_no.getText())){
                 btn_kaydet.setEnabled(true);
             }else{
                  btn_kaydet.setEnabled(false);
             }
    }//GEN-LAST:event_pasaport_noKeyReleased

    private void pasaport_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pasaport_noKeyTyped
               char karakter=evt.getKeyChar();
        
        
        if(!(Character.isDigit(karakter)))
        {
    
            evt.consume();
        
        }
    }//GEN-LAST:event_pasaport_noKeyTyped

    private void tc_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tc_noKeyTyped
         char ch = evt.getKeyChar();
       
        if(!Character.isDigit(ch) )
        {
            evt.consume();
        }
    }//GEN-LAST:event_tc_noKeyTyped

    private void tc_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tc_noKeyReleased
                    if (isTCKNCorrect(tc_no.getText())){
                 btn_kaydet.setEnabled(true);
             }else{
                  btn_kaydet.setEnabled(false);
             }
    }//GEN-LAST:event_tc_noKeyReleased

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
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad;
    private javax.swing.JLabel adSoyadLabel;
    private javax.swing.JPanel adminDuzenPanel;
    private javax.swing.JComboBox<String> adres_combo;
    private javax.swing.JComboBox<String> adres_combo1;
    private javax.swing.JComboBox<String> basvuru_yolu;
    private javax.swing.JComboBox<String> basvuru_yolu1;
    private javax.swing.JButton btn_kaydet;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel gercek_tuzel_pane;
    private javax.swing.JPanel gercek_tuzel_pane1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable kabul_edilen_table;
    private javax.swing.JComboBox<String> kisi_tanimi;
    private javax.swing.JComboBox<String> kisi_tanimi1;
    private static javax.swing.JComboBox<String> kurumTipicombo;
    private javax.swing.JComboBox<String> kurum_tipi_combo;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField mail1;
    private javax.swing.JPanel panel_secret1;
    private javax.swing.JTextField pasaport_no;
    private javax.swing.JPanel pasaport_pane;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JLabel sonuc;
    private javax.swing.JTextField soyad;
    private javax.swing.JTextArea ta_adres;
    private javax.swing.JTextArea ta_adres1;
    private javax.swing.JTextArea ta_bas_acıklama;
    private javax.swing.JTextArea ta_bas_acıklama1;
    private javax.swing.JTable table_istatistik;
    private javax.swing.JTable table_list1;
    private javax.swing.JLabel tcNoLabel;
    private javax.swing.JTextField tc_no;
    private javax.swing.JPanel tc_pane;
    private javax.swing.JTextField telefon_num;
    private javax.swing.JTextField telefon_num1;
    public static javax.swing.JComboBox<String> telefon_tip_combo;
    public static javax.swing.JComboBox<String> telefon_tip_combo1;
    private javax.swing.JTextField tf_basvuru_no1;
    private javax.swing.JTextField tf_filter1;
    private javax.swing.JTextField tuzel_unvan;
    private javax.swing.JTextField tuzel_unvan1;
    private javax.swing.JComboBox<String> uyruk;
    // End of variables declaration//GEN-END:variables
}
