/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbie;

/**
 *
 * @author Josue
 */
public class Escritora extends Barbie{
    private String genero;
	private String hobbie;

	public Escritora() {

	}

	public Escritora(String genero, String hobbie) {
		this.genero = genero;
		this.hobbie = hobbie;
	}

	public Escritora(String genero, String hobbie, String nombre, int edad) {
		super(nombre, edad);
		this.genero = genero;
		this.hobbie = hobbie;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getHobbie() {
		return hobbie;
	}

	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}

	@Override
	String tipobarbie() {
		return ("Escritora");
	}
}
