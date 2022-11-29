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
public class Surfista extends Barbie{
    
	private String paisorigin;
	private String name_tablasurf;

	public Surfista() {

	}

	public Surfista(String paisorigin, String name_tablasurf) {
		this.paisorigin = paisorigin;
		this.name_tablasurf = name_tablasurf;
	}

	public Surfista(String paisorigin, String name_tablasurf, String nombre, int edad) {
		super(nombre, edad);
		this.paisorigin = paisorigin;
		this.name_tablasurf = name_tablasurf;
	}

	public String getPaisorigin() {
		return paisorigin;
	}

	public void setPaisorigin(String paisorigin) {
		this.paisorigin = paisorigin;
	}

	public String getName_tablasurf() {
		return name_tablasurf;
	}

	public void setName_tablasurf(String name_tablasurf) {
		this.name_tablasurf = name_tablasurf;
	}

	@Override
	String tipobarbie() {
		return ("Surfista");
	}
}
