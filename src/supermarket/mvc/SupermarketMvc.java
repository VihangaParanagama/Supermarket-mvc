/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermarket.mvc;

import java.sql.SQLException;

import supermarket.mvc.view.HomepageVIew;


/**
 *
 * @author Vihanga
 */
public class SupermarketMvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
         //new CustomerView().setVisible(true);
         // new ItemView().setVisible(true);
         //new OrderView().setVisible(true);
         new HomepageVIew().setVisible(true);
    }   
    
}
