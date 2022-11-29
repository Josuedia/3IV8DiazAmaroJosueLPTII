/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Josue
 */
public class CRUDBarbie {
    ArrayList<Barbie> listadebarbies = new ArrayList();

	public ArrayList<Barbie> leerBarbies() throws IOException, ClassNotFoundException {
		actualizarLista();
		return listadebarbies;
	}

	public void agregarProgramadora(Programadora p) throws IOException, ClassNotFoundException {
		actualizarLista();
		listadebarbies.add(p);
		guardar();
	}

	public void agregarVeterinaria(Veterinaria v) throws IOException, ClassNotFoundException {
		actualizarLista();
		listadebarbies.add(v);
		guardar();
	}

	public void agregarCocinera(Cocinera m) throws IOException, ClassNotFoundException {
		actualizarLista();
		listadebarbies.add(m);
		guardar();
	}

	public void agregarSurfista(Surfista a) throws IOException, ClassNotFoundException {
		actualizarLista();
		listadebarbies.add(a);
		guardar();
	}

	public void agregarEscritora(Escritora c) throws IOException, ClassNotFoundException {
		actualizarLista();
		listadebarbies.add(c);
		guardar();
	}

	public Programadora buscarProgramadora(String nombre) throws IOException, ClassNotFoundException {
		Programadora encontrada = new Programadora();

		actualizarLista();
		for (int i = 0; i < listadebarbies.size(); i++) {
			Barbie barbie = listadebarbies.get(i);
			if(barbie.tipobarbie().equals("Programadora")) {
				Programadora fullstack = (Programadora) listadebarbies.get(i);
				if (fullstack.getNombre().equals(nombre)) {
					return fullstack;
				}
			}
		}

		return encontrada;
	}

	public Veterinaria buscarVeterinaria(int cedulin) throws IOException, ClassNotFoundException {
		Veterinaria encontrada = new Veterinaria();

		actualizarLista();
		for (int i = 0; i < listadebarbies.size(); i++) {
			Barbie barbie = listadebarbies.get(i);
			if(barbie.tipobarbie().equals("Veterinaria")) {
				Veterinaria vet = (Veterinaria) listadebarbies.get(i);
				if (vet.getCedulaprofesional() == (cedulin)) {
					return vet;
				}
			}
			
		}
		return encontrada;
	}

	public Cocinera buscarCocinera(int nservicio) throws IOException, ClassNotFoundException {
		Cocinera encontrada = new Cocinera();

		actualizarLista();
		for (int i = 0; i < listadebarbies.size(); i++) {
			Barbie barbie = listadebarbies.get(i);
			if(barbie.tipobarbie().equals("Cocinera")) {
				Cocinera mesera = (Cocinera) listadebarbies.get(i);
				if (mesera.getTiempo_servicio()== (nservicio)) {
					return mesera;
				}
			}
			
		}
		return encontrada;
	}
        public Surfista buscarSurfista(String paisorigin) throws IOException, ClassNotFoundException {
                        Surfista encontrada = new Surfista();

                        actualizarLista();
                        for (int i = 0; i < listadebarbies.size(); i++) {
                                Surfista shitpost = (Surfista) listadebarbies.get(i);
                                if (shitpost.getPaisorigin().equals(paisorigin)) {
                                        encontrada = shitpost;
                                }
                        }
                        return encontrada;
                }
        
	public Escritora buscarEscritora(String nombre) throws IOException, ClassNotFoundException {
		Escritora encontrada = new Escritora();

		actualizarLista();
		for (int i = 0; i < listadebarbies.size(); i++) {
			Barbie barbie = listadebarbies.get(i);
			if(barbie.tipobarbie().equals("Escritora")) {
				Escritora edgy = (Escritora) listadebarbies.get(i);
				if (edgy.getNombre().equals(nombre)) {
					return edgy;
				}
			}
			
		}
		return encontrada;
	}

	

	public void actualizarProgramadora(Programadora p)throws FileNotFoundException, ClassNotFoundException, IOException {

		actualizarLista();
		Programadora eliminar = buscarProgramadora(p.getNombre());
		listadebarbies.remove(eliminar);
		listadebarbies.add(p);
		guardar();
	}

	public void actualizarVeterinaria(Veterinaria v) throws FileNotFoundException, ClassNotFoundException, IOException {

		actualizarLista();
		Veterinaria eliminar = buscarVeterinaria(v.getCedulaprofesional());
		listadebarbies.remove(eliminar);
		listadebarbies.add(v);
		guardar();

	}

	public void actualizarCocinera(Cocinera m) throws FileNotFoundException, ClassNotFoundException, IOException {

		actualizarLista();
		Cocinera eliminar = buscarCocinera(m.getTiempo_servicio());
		listadebarbies.remove(eliminar);
		listadebarbies.add(m);
		guardar();

	}
        
        public void actualizarSurfista(Surfista a) throws FileNotFoundException, ClassNotFoundException, IOException {

                        actualizarLista();
                        Surfista eliminar = buscarSurfista(a.getPaisorigin());
                        listadebarbies.remove(eliminar);
                        listadebarbies.add(a);
                        guardar();

                }
        
	public void actualizarEscritora(Escritora c) throws FileNotFoundException, ClassNotFoundException, IOException {

		actualizarLista();
		Escritora eliminar = buscarEscritora(c.getNombre());
		listadebarbies.remove(eliminar);
		listadebarbies.add(c);
		guardar();

	}

	

	public void eliminarProgramadora(Programadora p) throws ClassNotFoundException, IOException {
		actualizarLista();
		listadebarbies.remove(p);
		guardar();
	}

	public void eliminarVeterinaria(Veterinaria v) throws ClassNotFoundException, IOException {
		actualizarLista();
		listadebarbies.remove(v);
		guardar();
	}

	public void eliminarCocinera(Cocinera m) throws ClassNotFoundException, IOException {
		actualizarLista();
		listadebarbies.remove(m);
		guardar();
	}
        
        public void eliminarSurfista(Surfista a) throws ClassNotFoundException, IOException {
                        actualizarLista();
                        listadebarbies.remove(a);
                        guardar();
                }
        
	public void eliminarEscritora(Escritora c) throws ClassNotFoundException, IOException {
		actualizarLista();
		listadebarbies.remove(c);
		guardar();
	}

	

	public void eliminarBarbie(String nombre) {

	}

	public void guardar() throws IOException {
		// Para guardar el archivo tenemos que escribir una salida
		FileOutputStream archivo = new FileOutputStream("archivo.dat");
		// tenemos que definir el buffer de salida del archivo
		ObjectOutputStream salida = new ObjectOutputStream(archivo);

		// escribimos los datos del array
		salida.writeObject(listadebarbies);
		// cerramos el flujo
		salida.close();

	}

	public void actualizarLista() throws IOException {
		boolean errores = false;
		do{
			try{
				FileInputStream archivo = new FileInputStream("archivo.dat");
				ObjectInputStream entrada = new ObjectInputStream(archivo);
				listadebarbies = (ArrayList) entrada.readObject();
				entrada.close();
				errores = false;
			}catch(Exception e){
				FileOutputStream archivo1 = new FileOutputStream("archivo.dat");
				ObjectOutputStream salida = new ObjectOutputStream(archivo1);
				ArrayList<Barbie> provicional = new ArrayList();
				salida.writeObject(provicional);
				archivo1.close();
				errores = true;
			}
		}while(errores);





		
	}
}
