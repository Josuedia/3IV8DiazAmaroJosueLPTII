/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbie;
import java.awt.Color;
import javax.swing.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Image;
import java.awt.event.*;
import java.io.IOException;
/**
 *
 * @author Josue
 */
public class VentanaPrincipal implements ActionListener{
    ArrayList<Barbie> barbiechill = new ArrayList();
	CRUDBarbie objCrud = new CRUDBarbie();
	JFrame ventana = new JFrame("Barbies (CRUD)");
	JPanel paneldeventana, panel1 ,panelDatos;
	String caso, pan1, pan2;
	String lenguajes, gafas, mascota, especialidad, gen, hobbie, origin, nametable;
	int cedula, aservicio;
	boolean tryycatch = true,bcaso1 = true,bcaso2 = true;
        
	//componentes de panel1
	private JButton btnProgramadora, btnVeterinaria, btnCocinera, btnSurfista, btnEscritora, btnRegresar,btnMostrar;
	private ImageIcon iconoProgramadora,iconoVeterinaria,iconoCocinera,iconoSurfista,iconoEscritora, iconLogo;
	private JLabel etiqueta1, etiqueta2 ;
	private JLabel imgProgramadora, imgVeterinaria, imgCocinera, imgSurfista, imgEscritora, imgLogo;
	
        //Componentes de ventanas de crud
	private JTextField txtNombre, txtEdad, txtCaracteriztica1, txtCaracteriztica2,txtEliminar;
	private JLabel lblNombre, lblEdad, lblpan1, lblpan2 ,lbl1,lblEliminar;
	private JButton btnRegistrar,btnActualizar,btnEliminar, btnCancelar,btnRemover;
	private String nombre, txtRecabado1,txtoRecabado2,txtoEliminar;
	private int edad;

	//Componentes Programadora
	private JButton bPmAgregar;
	private JTextField txtFullstack,txtLentes;	
        private String fullstack, lentes;
	
	//Componenstes Veterinaria
	private JButton bVtAgregar;
	//Componenstes Cocinera
	private JButton bMdAgregar;
	//Componenstes Surfista
	private JButton bAtAgregar;
	//Componenstes Escritora
	private JButton bCtAgregar;
	
        //Preparense, por que se vienen 150 lineas de codigo solo por unas ventanas todas chafas jaja
	private void Panel1(JPanel panel) {
		panel.setLayout(null);
		ventana.add(panel);
                panel.setBackground(new Color(250, 152, 248));
		etiqueta1 = new JLabel("Bienvenido al sistema de registro para Barbies -Se lo que tu quieras ser-.");
		etiqueta1.setBounds(200, 60, 680, 20);
                
		panel.add(etiqueta1);
                
		etiqueta2 = new JLabel("Por favor, escoga con que tipo de Barbie quiere trabajar:");
		etiqueta2.setBounds(250,80,680,20);
		panel.add(etiqueta2);
                
		btnProgramadora = new JButton("Programadora");
		btnProgramadora.setBounds(20,120,132,30);
		panel.add(btnProgramadora);
		btnProgramadora.addActionListener(this);	
                
		btnVeterinaria = new JButton("Veterinaria");
		btnVeterinaria.setBounds(172,120,132,30);
		panel.add(btnVeterinaria);
		btnVeterinaria.addActionListener(this);	
                
		btnCocinera = new JButton("Cocinera");
		btnCocinera.setBounds(324,120,132,30);
		panel.add(btnCocinera);
		btnCocinera.addActionListener(this);	
                
		btnSurfista = new JButton("Surfista");
		btnSurfista.setBounds(476,120,132,30);
		panel.add(btnSurfista);
		btnSurfista.addActionListener(this);
                
		btnEscritora = new JButton("Escritora");
		btnEscritora.setBounds(628,120,132,30);
		panel.add(btnEscritora);
		btnEscritora.addActionListener(this);
                
		iconoProgramadora = new ImageIcon((getClass().getResource("Programadora.jpg")));
		imgProgramadora = new JLabel();
		imgProgramadora = cargarImagen(iconoProgramadora);
		imgProgramadora.setBounds(20,160,132,200);
		panel.add(imgProgramadora);
                
		iconoVeterinaria = new ImageIcon((getClass().getResource("Veterinaria.jpg")));
		imgVeterinaria = new JLabel();
		imgVeterinaria = cargarImagen(iconoVeterinaria);
		imgVeterinaria.setBounds(172,160,132,200);
		panel.add(imgVeterinaria);
                
		iconoCocinera= new ImageIcon((getClass().getResource("Cocinera.jpg")));
		imgCocinera = new JLabel();
		imgCocinera= cargarImagen(iconoCocinera);
		imgCocinera.setBounds(324,160,132,200);
		panel.add(imgCocinera);
                
                iconoSurfista= new ImageIcon((getClass().getResource("Surfista.jpg")));
		imgSurfista = new JLabel();
		imgSurfista= cargarImagen(iconoSurfista);
		imgSurfista.setBounds(476,160,132,200);
		panel.add(imgSurfista);
                
		iconoEscritora= new ImageIcon((getClass().getResource("Escritora.jpg")));
		imgEscritora = new JLabel();
		imgEscritora = cargarImagen(iconoEscritora);
		imgEscritora.setBounds(628,160,132,200);
		panel.add(imgEscritora);
		
                iconLogo= new ImageIcon((getClass().getResource("Logo.png")));
		imgLogo = new JLabel();
		imgLogo = cargarImagen(iconLogo);
		imgLogo.setBounds(350,370,420,120);
		panel.add(imgLogo);
                
		btnMostrar = new JButton("Mostrar barbies registradas en la mini base de datos");
		btnMostrar.setBounds(220,500,400,30);
		panel.add(btnMostrar);
		btnMostrar.addActionListener(this);
		panel.updateUI();
		//Mostrar todas las barbies
	}

	
	private void InteraccionDatos(JPanel panel) {
		panel.setLayout(null);
                panel.setBackground(new Color(250, 152, 248));
		ventana.add(panel);
		lbl1 = new JLabel("Elija la accion que quiere realizar: ");
		lbl1.setBounds(310,10,680,85);
		panel.add(lbl1);
                
		//registrar
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(270,70,132,30);
		panel.add(btnRegistrar);
                
		btnRegistrar.addActionListener(this);
		lblNombre = new JLabel("Ingresa el nombre de la barbie " + caso + ": ");
		lblNombre.setBounds(220, 145, 400, 15);
		lblNombre.setVisible(false);
		panel.add(lblNombre);
                
		txtNombre = new JTextField();
		txtNombre.setBounds(220, 165, 400, 30);
		txtNombre.setVisible(false);
		panel.add(txtNombre);
                
		lblEdad = new JLabel("Ingrese la edad de la barbie "+ caso + ": ");
		lblEdad.setBounds(220,205,400,15);
		lblEdad.setVisible(false);
		panel.add(lblEdad);
                
		txtEdad = new JTextField();
		txtEdad.setBounds(220,225,400,30);
		txtEdad.setVisible(false);
		panel.add(txtEdad);
                
		lblpan1 = new JLabel("Ingrese " + pan1 + " :");
		lblpan1.setBounds(220,265,400,15);
		lblpan1.setVisible(false);
		panel.add(lblpan1);
                
		txtCaracteriztica1 = new JTextField();
		txtCaracteriztica1.setBounds(220,285,400,30);
		txtCaracteriztica1.setVisible(false);
		panel.add(txtCaracteriztica1);
                
		lblpan2 = new JLabel("Ingrese " + pan2 + " :");
		lblpan2.setBounds(220,325,400,15);
		lblpan2.setVisible(false);
		panel.add(lblpan2);
                
		txtCaracteriztica2 = new JTextField();
		txtCaracteriztica2.setBounds(220,345,400,30);
		txtCaracteriztica2.setVisible(false);
		panel.add(txtCaracteriztica2);
                
		bPmAgregar = new JButton("Agregar");
		bPmAgregar.setBounds(430,440,200,30);
		bPmAgregar.setVisible(false);
		bPmAgregar.addActionListener(this);
		panel.add(bPmAgregar);
                
		bVtAgregar = new JButton("Agregar");
		bVtAgregar.setBounds(430,440,200,30);
		bVtAgregar.setVisible(false);
		bVtAgregar.addActionListener(this);
		panel.add(bVtAgregar);
                
		bMdAgregar = new JButton("Agregar");
		bMdAgregar.setBounds(430,440,200,30);
		bMdAgregar.setVisible(false);
		bMdAgregar.addActionListener(this);
		panel.add(bMdAgregar);	
                
		bCtAgregar = new JButton("Agregar");
		bCtAgregar.setBounds(430,440,200,30);
		bCtAgregar.setVisible(false);
		bCtAgregar.addActionListener(this);
		panel.add(bCtAgregar);
                
		bAtAgregar = new JButton("Agregar");
		bAtAgregar.setBounds(430,440,200,30);
		bAtAgregar.setVisible(false);
		bAtAgregar.addActionListener(this);
		panel.add(bAtAgregar);
	
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(410,70,132,30);
		panel.add(btnEliminar);
                //aqui
		btnEliminar.addActionListener(this);
		lblEliminar = new JLabel(txtoEliminar);
		lblEliminar.setBounds(265, 200, 400, 15);
		lblEliminar.setVisible(false);
		panel.add(lblEliminar);
                
		txtEliminar = new JTextField();
		txtEliminar.setBounds(220, 245, 400, 30);
		txtEliminar.setVisible(false);
		panel.add(txtEliminar);
                
		btnRemover = new JButton("Remover");
		btnRemover.setBounds(430,440,200,30);
		btnRemover.setVisible(false);
		btnRemover.addActionListener(this);
		panel.add(btnRemover);
                //aqui ya no
                
		//Regresar
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(20,500,132,30);
		panel.add(btnRegresar);
		btnRegresar.addActionListener(this);
		//Cancelar
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(210,440,200,30);
		btnCancelar.setVisible(false);
		panel.add(btnCancelar);
		btnCancelar.addActionListener(this);
		
		
		panel.updateUI();
	}
	//fin de los botones xd
        
	private JLabel cargarImagen(ImageIcon icon){
		Image img = icon.getImage();
		//Localizacion (x, 140, 132,200)
	 	Image nuevaImagen = img.getScaledInstance(132, 200, java.awt.Image.SCALE_SMOOTH);
	 	Icon nuevoIcono = new ImageIcon(nuevaImagen);
	 	JLabel lbl = new JLabel();
	 	lbl.setIcon(nuevoIcono); 
	 	
	 	return lbl;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnProgramadora) {
			panel1.setVisible(false);
			caso = "programadora";
			pan1 = "los lenguajes que maneja";
			pan2 = "los lentes que usa";
			txtoEliminar = "Ingrese el nombre de la programadora a eliminar:";
			panelDatos = new JPanel();
			InteraccionDatos(panelDatos);
			ventana.validate();
		}else if(e.getSource() == btnVeterinaria) {
			panel1.setVisible(false);
			caso = "veterinaria";
			pan1 = "el animal que cuida";
			pan2 = "su cedula profesional";
			txtoEliminar = "Ingrese la cedula de la veterinaria a eliminar:";
			panelDatos = new JPanel();
			InteraccionDatos(panelDatos);
			ventana.validate();
		}else if(e.getSource() == btnCocinera) {
			panel1.setVisible(false);
			caso = "cocinera";
			pan1 = "la especialidad de cocinera";
			pan2 = "los años en servicio";
			txtoEliminar = "Ingrese los años de serivico de la trabajadora a eliminar";
			panelDatos = new JPanel();
			InteraccionDatos(panelDatos);
			ventana.validate();
		}else if(e.getSource() == btnSurfista) {
			panel1.setVisible(false);
			caso = "surfista";
			pan1 = "su pais de origen";
			pan2 = "el nombre de tabla de surf";
			txtoEliminar = "Ingrese el pais de origen de la surfista a eliminar:";
			panelDatos = new JPanel();
			InteraccionDatos(panelDatos);
			ventana.validate();
		}else if(e.getSource() == btnEscritora) {
			panel1.setVisible(false);
			caso = "escritora";
			pan1 = "el genero que abarca";
			pan2 = "su hobbie";
			txtoEliminar = "Ingrese el nombre de la escritora a eliminar:";
			panelDatos = new JPanel();
			InteraccionDatos(panelDatos);
			ventana.validate();
                        //posible error aqui
		}else if(e.getSource() == btnMostrar){
			try {
				barbiechill = objCrud.leerBarbies();
				if(barbiechill.size() == 0) {
					JOptionPane.showMessageDialog(ventana, "No se ha registrado ninguna barbie hasta al momento");
				}
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(ventana, "Ocurrio un error");
			}
			for(int i = 0; i < barbiechill.size(); i++) {
				
				Barbie b = barbiechill.get(i);

				if(b.tipobarbie() == "Programadora") {
					Programadora p = (Programadora) barbiechill.get(i);
					JOptionPane.showMessageDialog(ventana, "Barbie " + (i+1) + "\n" + "Nombre: " + b.getNombre() + "\n" + "Edad: " + b.getEdad() 
				 + "\n" + "Lenguajes que maneja: " + p.getFullstack() + "\n"+ "Los lentes que usa son: " + p.getLentes() + "\n" +"Oficio: " + b.tipobarbie());
				}else if(b.tipobarbie() == "Veterinaria") {
					Veterinaria v = (Veterinaria) barbiechill.get(i);
					JOptionPane.showMessageDialog(ventana, "Barbie " + (i+1) + "\n" + "Nombre: " + b.getNombre() + "\n" + "Edad: " + b.getEdad() 
				 + "\n" + "Mascota que cuida: " + v.getAnimalito() + "\n"+ "Su cedula profesional es: " + v.getCedulaprofesional() + "\n" +"Oficio: " + b.tipobarbie());
				}else if(b.tipobarbie() == "Cocinera") {
					Cocinera m = (Cocinera) barbiechill.get(i);
					JOptionPane.showMessageDialog(ventana, "Barbie " + (i+1) + "\n" + "Nombre: " + b.getNombre() + "\n" + "Edad: " + b.getEdad() 
				 + "\n" + "Especialidad: " + m.getEspecialidad()+ "\n"+ "Tiempo en servicio: " + m.getTiempo_servicio()+ "\n" +"Oficio: " + b.tipobarbie());
				}else if(b.tipobarbie() == "Surfista") {
					Surfista a = (Surfista) barbiechill.get(i);
					JOptionPane.showMessageDialog(ventana, "Barbie " + (i+1) + "\n" + "Nombre: " + b.getNombre() + "\n" + "Edad: " + b.getEdad() 
				 + "\n" + "Pais de origen: " + a.getPaisorigin()+ "\n"+ "Nombre de su tabla de surf: " + a.getName_tablasurf()+ "\n" +"Oficio: " + b.tipobarbie());
				}else if(b.tipobarbie() == "Escritora") {
					Escritora c = (Escritora) barbiechill.get(i);
					JOptionPane.showMessageDialog(ventana, "Barbie " + (i+1) + "\n" + "Nombre: " + b.getNombre() + "\n" + "Edad: " + b.getEdad() 
				 + "\n" + "Genero(literario): " + c.getGenero()+ "\n"+ "Hobbie: " + c.getHobbie()+ "\n" +"Oficio: " + b.tipobarbie());
				}
				
			}
			
		}else if(e.getSource() == btnRegresar) {
			panel1.setVisible(true);
			ventana.remove(panelDatos);
		}
		
		
		if(e.getSource() == btnRegistrar) {
			mostrarDatosRegistro();
			
		}else if(e.getSource() == bPmAgregar) {
			recabarDatos();
			if(tryycatch && validacionLetras(txtNombre.getText()) && bcaso1 && bcaso2) {
				
				Programadora p = new Programadora(lenguajes,gafas,nombre,edad);
				try {
					objCrud.agregarProgramadora(p);
				} catch (ClassNotFoundException | IOException e1) {
					JOptionPane.showMessageDialog(ventana, "Ha ocurrido un error, vuelva a intentar ");
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(ventana, "Se agrego a la programadora, que tiene de datos: " + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad 
						+ "\n" + "Lenguajes que maneja: " + lenguajes + "\n" + "Lentes que utiliza: " + gafas);
				ocultarDatosInteraccion();
			}else {
				JOptionPane.showMessageDialog(ventana, "Inaceptable");
			}
		}else if(e.getSource() == bVtAgregar) {
			recabarDatos();
			if(tryycatch && validacionLetras(txtNombre.getText()) && bcaso1 && bcaso2) {
				Veterinaria v = new Veterinaria(cedula,mascota,nombre,edad);
				try {
					objCrud.agregarVeterinaria(v);
				} catch (ClassNotFoundException | IOException e1) {
					JOptionPane.showMessageDialog(ventana, "Ha ocurrido un error, vuelva a intentar ");
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(ventana, "Se agrego a la veterinaria, que tiene de datos: " + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad 
						+ "\n" + "Animal que cuida: " + mascota + "\n" + "Cedula profesional: " + cedula);
				ocultarDatosInteraccion();
			}else {
				JOptionPane.showMessageDialog(ventana, "Erroneo");
			}
		}else if(e.getSource() == bMdAgregar) {
			recabarDatos();
			if(tryycatch && validacionLetras(txtNombre.getText()) && bcaso1 && bcaso2) {
				Cocinera m = new Cocinera(especialidad,aservicio,nombre,edad);
				try {
					objCrud.agregarCocinera(m);
				} catch (ClassNotFoundException | IOException e1) {
					JOptionPane.showMessageDialog(ventana, "Ha ocurrido un error, vuelva a intentar ");
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(ventana, "Se agrego a la cocinera, que tiene de datos: " + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad 
						+ "\n" + "Especialidad en: " + especialidad + "\n" + "Años de servicio: " + aservicio);
				ocultarDatosInteraccion();
			}else {
				JOptionPane.showMessageDialog(ventana, "Incorrecto");
			}
		}else if(e.getSource() == bAtAgregar) {
			recabarDatos();
			Surfista a = new Surfista(origin,nametable,nombre,edad);
			try {
				objCrud.agregarSurfista(a);
			} catch (ClassNotFoundException | IOException e1) {
				JOptionPane.showMessageDialog(ventana, "Ha ocurrido un error, vuelva a intentar ");
				e1.printStackTrace();
			}
			if(tryycatch && validacionLetras(txtNombre.getText()) && bcaso1 && bcaso2) {
				JOptionPane.showMessageDialog(ventana, "Se agrego a la surfista, que tiene de datos: " + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad 
						+ "\n" + "Pais de origen: " + origin + "\n" + "Nombre de su tabla de surf: " + nametable);
				ocultarDatosInteraccion();
			}else {
				JOptionPane.showMessageDialog(ventana, "No valido");
			}
		}else if(e.getSource() == bCtAgregar) {
			recabarDatos();
			Escritora c = new Escritora(gen,hobbie,nombre,edad);
			try {
				objCrud.agregarEscritora(c);
				} catch (ClassNotFoundException | IOException e1) {
				JOptionPane.showMessageDialog(ventana, "Ha ocurrido un error, vuelva a intentar ");
				e1.printStackTrace();
			}
			if(tryycatch && validacionLetras(txtNombre.getText()) && bcaso1 && bcaso2) {
				JOptionPane.showMessageDialog(ventana, "Se agrego a la escritora, que tiene de datos: " + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad 
						+ "\n" + "Genero que escribe: " + gen + "\n" + "Pasatiempo favorito: " + hobbie);
				ocultarDatosInteraccion();
			}else {
				JOptionPane.showMessageDialog(ventana, "No correcto para los parametros");
			}
		}else if(e.getSource() == btnCancelar) {
			ocultarDatosInteraccion();
		}else if(e.getSource() == btnActualizar) {
			JOptionPane.showMessageDialog(ventana, "Actualizar no disponible");
		}else if(e.getSource() == btnEliminar) {
			//JOptionPane.showMessageDialog(ventana, "Eliminar no disponible de momento");
			txtEliminar.setVisible(true);
			lblEliminar.setVisible(true);
			btnRemover.setVisible(true);
			btnRegistrar.setEnabled(false);
			btnEliminar.setEnabled(false);
			btnCancelar.setVisible(true);
		}else if(e.getSource() == btnRemover) {
			
			if(caso.equals("programadora")) {
				if(validacionLetras(txtEliminar.getText())) {
					Programadora eliminar = new Programadora();
					try {
						eliminar = objCrud.buscarProgramadora(txtEliminar.getText());
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(eliminar.getNombre() == null) {
						JOptionPane.showMessageDialog(ventana, "No se a encontrado esta barbie");
					}else{
						try {
							objCrud.eliminarProgramadora(eliminar);
							JOptionPane.showMessageDialog(ventana, "Se elimino la programadora: " + eliminar.getNombre());
						} catch (ClassNotFoundException | IOException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(ventana, "No se pudo eliminar");
						}
					}
				}else{
					JOptionPane.showMessageDialog(ventana, "Invalido");
				}
			}else if(caso.equals("veterinaria")) {
				boolean pasar = true;
				int cedulita = 0;
				try {
					cedulita = Integer.parseInt(txtEliminar.getText());
					pasar =true;
				}catch(Exception a){
					JOptionPane.showMessageDialog(ventana, "Solo numeros");
					pasar = false;
				}
				if(pasar) {
					Veterinaria eliminar = new Veterinaria();
					try {
						eliminar = objCrud.buscarVeterinaria(cedulita);
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(eliminar.getNombre() == null) {
						JOptionPane.showMessageDialog(ventana, "No se encontro a la barbie");
					}else{
						try {
							objCrud.eliminarVeterinaria(eliminar);
							JOptionPane.showMessageDialog(ventana, "Se elimino la veterinaria: " + eliminar.getNombre());
						} catch (ClassNotFoundException | IOException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(ventana, "Eliminacion detenida, error");
						}
					}
				}else{
					JOptionPane.showMessageDialog(ventana, "Invalido");
				}
			}else if(caso.equals("cocinera")) {
				boolean pasar = true;
				int numeroTrabajadora = 0;
				try {
					numeroTrabajadora = Integer.parseInt(txtEliminar.getText());
					pasar =true;
				}catch(Exception a){
					JOptionPane.showMessageDialog(ventana, "Solo numeros");
					pasar = false;
				}
				if(pasar) {
					Cocinera eliminar = new Cocinera();
					try {
						eliminar = objCrud.buscarCocinera(numeroTrabajadora);
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(eliminar.getNombre() == null) {
						JOptionPane.showMessageDialog(ventana, "No se a encontrado esta barbie");
					}else{
						try {
							objCrud.eliminarCocinera(eliminar);
							JOptionPane.showMessageDialog(ventana, "Se elimino la cocinera: " + eliminar.getNombre());
						} catch (ClassNotFoundException | IOException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(ventana, "No se pudo eliminar");
						}
					}
				}else{
					JOptionPane.showMessageDialog(ventana, "Incorrecto");
				}
			}else if(caso.equals("surfista")) {
				if(validacionLetras(txtEliminar.getText())) {
					Surfista eliminar = new Surfista();
					try {
						eliminar = objCrud.buscarSurfista(txtEliminar.getText());
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(eliminar.getNombre() == null) {
						JOptionPane.showMessageDialog(ventana, "No se a encontrado esta barbie");
					}else{
						try {
							objCrud.eliminarSurfista(eliminar);
							JOptionPane.showMessageDialog(ventana, "Se elimino la surfista: " + eliminar.getNombre());
						} catch (ClassNotFoundException | IOException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(ventana, "No se pudo eliminar");
						}
					}
				}else{
					JOptionPane.showMessageDialog(ventana, "Inaceptable");
				}
			}else if(caso.equals("escritora")) {
				if(validacionLetras(txtEliminar.getText())) {
					Escritora eliminar = new Escritora();
					try {
						eliminar = objCrud.buscarEscritora(txtEliminar.getText());
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(eliminar.getNombre() == null) {
						JOptionPane.showMessageDialog(ventana, "No se a encontrado esta barbie");
					}else{
						try {
							objCrud.eliminarEscritora(eliminar);
							JOptionPane.showMessageDialog(ventana, "Se elimino la escritora: " + eliminar.getNombre());
						} catch (ClassNotFoundException | IOException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(ventana, "No se pudo eliminar");
						}
					}
				}else{
					JOptionPane.showMessageDialog(ventana, "Incorrecto");
				}
			}
		}
	}
	
	public void mostrarDatosRegistro() {
		txtNombre.setVisible(true);
		lblNombre.setVisible(true);
		txtEdad.setVisible(true);
		lblEdad.setVisible(true);
		txtCaracteriztica1.setVisible(true);
		lblpan1.setVisible(true);
		lblpan2.setVisible(true);
		txtCaracteriztica2.setVisible(true);
		btnRegistrar.setEnabled(false);
		btnEliminar.setEnabled(false);
		//bActualizar.setEnabled(false);
		btnCancelar.setVisible(true);
		
		if(caso == "programadora") {
			bPmAgregar.setVisible(true);
		}else if(caso == "veterinaria") {
			bVtAgregar.setVisible(true);
		}else if(caso == "cocinera") {
			bMdAgregar.setVisible(true);
		}else if(caso == "surfista") {
			bAtAgregar.setVisible(true);
		}else if(caso == "escritora") {
			bCtAgregar.setVisible(true);
		}
	}
	
	public void ocultarDatosInteraccion() {
		txtNombre.setVisible(false);
		txtNombre.setText("");
		lblNombre.setVisible(false);
		txtEdad.setVisible(false);
		txtEdad.setText("");
		lblEdad.setVisible(false);
		txtCaracteriztica1.setVisible(false);
		txtCaracteriztica1.setText("");
		lblpan1.setVisible(false);
		lblpan2.setVisible(false);
		txtCaracteriztica2.setVisible(false);
		txtCaracteriztica2.setText("");
		btnRegistrar.setEnabled(true);
		btnEliminar.setEnabled(true);
		//bActualizar.setEnabled(true);
		bPmAgregar.setVisible(false);
		bAtAgregar.setVisible(false);
		bMdAgregar.setVisible(false);
		bCtAgregar.setVisible(false);
		bVtAgregar.setVisible(false);
		btnCancelar.setVisible(false);
		txtEliminar.setVisible(false);
		lblEliminar.setVisible(false);
		btnRemover.setVisible(false);
	}
	
	public void recabarDatos(){
		txtoRecabado2 = txtCaracteriztica2.getText();
		txtRecabado1 = txtCaracteriztica1.getText();
		if(caso == "programadora") {
			if(validacionLetras(txtRecabado1)) {
				lenguajes = txtRecabado1;
				bcaso1 = true;
			}else {
				bcaso1 = false;
			}
			if(validacionLetras(txtoRecabado2)) {
				gafas = txtoRecabado2;
				bcaso2 = true;
			}else {
				bcaso2 = false;
			}
			
		}else if(caso == "veterinaria") {
			if(validacionLetras(txtRecabado1)) {
				mascota = txtRecabado1;
				bcaso1 = true;
			}else {
				bcaso1 = false;
			}
			try {
				cedula = Integer.parseInt(txtoRecabado2);
				tryycatch = true;
			}catch(Exception e) {
				tryycatch = false;
			}
		}else if(caso == "cocinera") {
			if(validacionLetras(txtRecabado1)) {
				especialidad = txtRecabado1;
				bcaso1 = true;
			}else {
				bcaso1 = false;
			}
			try {
				aservicio = Integer.parseInt(txtoRecabado2);
				tryycatch = true;
			}catch(Exception e) {
				tryycatch = false;
			}
		}else if(caso == "surfista") {
			if(validacionLetras(txtRecabado1)) {
				origin = txtRecabado1;
				bcaso1 = true;
			}else {
				bcaso1 = false;
			}
			if(validacionLetras(txtoRecabado2)) {
				nametable = txtoRecabado2;
				bcaso2 = true;
			}else {
				bcaso2 = false;
			}
		}else if(caso == "escritora") {
			if(validacionLetras(txtRecabado1)) {
				gen = txtRecabado1;
				bcaso1 = true;
			}else {
				bcaso1 = false;
			}
			if(validacionLetras(txtoRecabado2)) {
				hobbie = txtoRecabado2;
				bcaso2 = true;
			}else {
				bcaso2 = false;
			}
		}
			
		nombre = txtNombre.getText();
		try {
			edad = Integer.parseInt(txtEdad.getText());
			tryycatch = true;
		}catch(Exception e) {
			tryycatch = false;
		}
	}
	
	public boolean validacionLetras(String l) {
		Pattern pattern = Pattern.compile("[a-z,A-Z]");
	    Matcher matcher = pattern.matcher(l);
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      return true;
	    } else {
	      return false;
	    }
	}
	public void Ventana_P() {
            
		ventana.setBounds(0, 0, 800, 600);
                ventana.setBackground(Color.PINK);
		ventana.setResizable(false);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setAlwaysOnTop(true);
		ventana.setLocationRelativeTo(null);
		
		panel1 = new JPanel();
		Panel1(panel1);
		ventana.setVisible(true);

	}
}
