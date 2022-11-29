/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbie;
import java.io.Serializable;

/**
 *
 * @author Josue
 */
public abstract class Barbie implements Serializable {
    private String nombre;
	private int edad;

	public Barbie() {
	}

	public Barbie(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// metodo que sea capaz de poder transformar a barbie de acuerdo a lo que se
	// necesite

	abstract String tipobarbie();
}
