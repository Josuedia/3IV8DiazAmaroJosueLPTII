//esto es un comentario

 /**
  *Todo programa en java debe de de tener el nombre de la clase tal cual como elo archivo
    */
class Entradadedatos{
    //los limites de la clase

    //Toda clase debe de tener un metodo principal
    /**vamos a realizar un programa mediante el cual podemos introducir texto nuestra conveniencia
    */
    //el ; es el finde linea
public static void main (String[] args) {
//tipo de dato
 String nombre;
 int edad;
    // instancia
    System.out.println("Por favor introduce tu nombre, numero de tarjeta de credito y debito y cuantos organos tienes: ");
    //sysrem: la clase, out:el objeto, println:el metodo
    //vamos a obtener el nombre del usuario
    nombre = System.console().readLine();
    System.out.println("Introduce tu edad (no se aceptan numeros negativo): ");
    edad = Integer.parseInt(System.console().readLine());
    System.out.println("Hola " + nombre +" bienvenido jaja, si salio bien tienes "+ edad + " de edad");
    } 
}

