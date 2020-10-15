/*
 * Modelo
 * Clase encargada de representar la informacion
 * y ademas permte operar los datos 
 */
package modelo;

/**
 * @author Fernando Arevalo
 * @author Johan Sanchez
 * @since 15/10/2020
 * @version 1.0.0
 */
public class Modelo {
    //variable encargada de guardar un numero
    private int primerNumero;
    //variable encargada de guardar un numero
    private int segundoNumero;
    //variable encargada de almacenar la respuesta de la suma de dos numeros
    private int respuesta;
    
    public int getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }
    /**
     * Metodo encargado de sumar dos numeros
     * @return respuesta 
     */
    public int sumar(){
        this.respuesta = this.primerNumero+this.segundoNumero;
        return this.respuesta;
    }
}
