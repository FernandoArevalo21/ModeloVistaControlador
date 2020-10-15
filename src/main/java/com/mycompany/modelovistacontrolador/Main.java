/**
 * clase encargad de mostrar el formulario
 */
package com.mycompany.modelovistacontrolador;


import vista.Vista;
/**
 * @author Fernando Arevalo
 * @author Johan Sanchez
 * @since 15/10/2020
 * @version 1.0.0
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Vista view = new Vista();
        view.setVisible(true);
    }    
}
