/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ca.sheridancollege.sinchang.productmanager;

/**
 *
 * @author singh
 */
public class ProductManager {

    public static void main(String[] args) {
        System.out.println("Product Manager Application Started");
    }
    
    
    // This method calculates the discounted price based on original price and discount percentage
    public double calculateDiscount(double price, double percentage) {
        return price - (price * percentage / 100);
    }
}
