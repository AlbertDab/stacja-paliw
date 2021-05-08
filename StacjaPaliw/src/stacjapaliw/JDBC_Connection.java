/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacjapaliw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author motod
 */
public class JDBC_Connection {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
       	
        
        
  public void Connect(){      
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://serwer121.mysql.database.azure.com:3306/stacja_paliw?useSSL=true&requireSSL=false","Programista1@serwer121","Kwiatek$");
            System.out.println("Get Connection!!!");
        }
       catch(Exception ex){
            System.out.println("Exception: " + ex.toString());
        }
  }
  
  public void SelectAdresses(){
       try{
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM adres");
        
        while(rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
        }
       }
       catch(Exception ex){
        System.out.println("Exception: " + ex.toString());
       }
  }
}
