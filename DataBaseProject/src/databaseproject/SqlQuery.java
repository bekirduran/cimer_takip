/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class SqlQuery {

    	public static ResultSet SqlQuery(String sorgu) throws Exception {

            Connection con =  DatabaseUtilities.getConnection();

        
            Statement st = con.createStatement();
            String sql_query = sorgu;
            ResultSet rs = st.executeQuery(sql_query);

            
            disconnectFromDatabase();
                
            return rs;
        
        }
        public static boolean SqlQuery_delete(String sorgu) throws Exception {
            
         

            // Connect to database
            Connection con =  DatabaseUtilities.getConnection();
	
          
             //veritabanı bağlantısı
            Statement st = con.createStatement();
            
             //query sorgu
            String sql_query = sorgu;
           int rowsdeleted= st.executeUpdate(sql_query);
           
           if(rowsdeleted>0){
           JOptionPane.showMessageDialog(null, "Kayıt basarılı bir sekilde silindi !","Kayıt Silme",JOptionPane.INFORMATION_MESSAGE);
           return true;
           }
            disconnectFromDatabase();
                
          
        
        return false;
        }
        
        
        
     
       public static void SqlQuery2(String sorgu) throws Exception {
		// Connect to database
            
     
            Connection con =  DatabaseUtilities.getConnection();

            Statement st = con.createStatement();
            String sql_query = sorgu;
            
             //update/insert sorgu
            st.executeUpdate(sql_query);
            
            System.out.println("Sorgu Yaptı");
            
                
            disconnectFromDatabase();
    
        
        }  
       
        
        
        public static void disconnectFromDatabase() {
		try {
			DatabaseUtilities.disconnect();
		}
		catch(Exception e) {
			System.out.println("Error disconnecting from database : " + e);
			return;
		}		
	}
    
}
