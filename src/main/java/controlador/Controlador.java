/*
 * clase que permite que el modelo y la vista
 * se comuniquen.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 * @author Fernando Arevalo
 * @author Johan Sanchez
 * @since 15/10/2020
 * @version 1.0.0
 */
public class Controlador implements ActionListener {
    
    private Vista view;
    private Modelo model;
    /***
     * creacion del constructor
     */
    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnResultado.addActionListener(this);
    }
    /**
     * Metodo encargado de inicializar el formulario
     */
    public void iniciar(){
        view.setTitle("Modelo Vista Controlador");
        view.setLocationRelativeTo(null);
    }
    /**
     * Sobre escritura del metodo que 
     * herda de una interfas 
     * el cual va a permitir almacenar capturar datos digitados
     * por teclado
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e){
        model.setPrimerNumero(Integer.parseInt(view.txtPrimerNumero.getText()));
        model.setSegundoNumero(Integer.parseInt(view.txtSegundoNumero.getText()));
        model.sumar();
        view.jlabelResultado.setText(String.valueOf(model.getRespuesta()));
    }
}
