/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.erp111;
import org.erp111.vistas.PruebaCompra;

/**
 *
 * @author agu
 */
public class Erp111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PruebaCompra().setVisible(true);
            }
        });
        }
   } 

