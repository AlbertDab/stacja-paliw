/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacjapaliw;

/**
 *
 * @author motod
 */
public class StacjaPaliw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JDBC_Connection con1 = new JDBC_Connection();
        con1.Connect();
        con1.SelectAdresses();
    }
    
}
