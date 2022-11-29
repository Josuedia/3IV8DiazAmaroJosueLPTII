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
public class Cocinera extends Barbie{
    private String especialidad;
	private int tiempo_servicio;

	public Cocinera() {

	}

	public Cocinera(String especialidad, int tiempo_servicio) {
		this.especialidad = especialidad;
		this.tiempo_servicio = tiempo_servicio;
	}

	public Cocinera(String especialidad, int tiempo_servicio, String nombre, int edad) {
		super(nombre, edad);
		this.especialidad = especialidad;
		this.tiempo_servicio = tiempo_servicio;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getTiempo_servicio() {
		return tiempo_servicio;
	}

	public void setTiempo_servicio(int tiempo_servicio) {
		this.tiempo_servicio = tiempo_servicio;
	}

	@Override
	String tipobarbie() {
		return ("Cocinera");
	}
}
