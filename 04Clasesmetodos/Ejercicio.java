import java.util.Scanner;
class Ejercicio{
        /*Vamos a realizar un progrma en el cual vamos a tener 4 opciones:1. calculadora, conversion de unidades, cuadro magico y movimiento de un cuadro.
         */
        //una variable puede ser global (para todos), afuera del metodo
        Scanner entrada= new Scanner(System.in);
        char op;
        //metodos o compartimientos de la clase
        //vamos a crear un metodo para la clase
        //public es el acceso al tipo de dato, clase o metodo cualquier elemento del programapuede acceder a el
        //private es de acceso restringido solo mediante reglas se puede accedera el
        //protected se puede tener acceso solo desde la misma clase y aplicando a la herencia de POO (programacion orientada a objetos)entre os hijos y padres
        //un metodo tambien es tipo de dato aplicado(int,string,float,double)
        public void menu(/*aqui van los parametros*/){
            System.out.println("Bienvenido a los metodos");
            System.out.println("Elije una de las siguientes opciones:");
            System.out.println("a. Calculadora");
            System.out.println("b. Conversion de unidades");
            System.out.println("c. Creacion de cuadros");
            System.out.println("d. Movimiento de un cuadro");
            op =entrada.next().charAt(0);
            switch(op){
                case 'a':
                //vamos a hacer un metodo
                Ejercicio1();
                break;
                case 'b':
                Ejercicio2();
                break;
                case 'c':
                Ejercicio3();
                break;
                case 'd':
                Ejercicio4();
                break;
                default:
                System.out.println("Opcion no valido, nimodos");
                break;
            }
        }
        //metodo1
        public void Ejercicio1(){

        }
        //metodo2
        public void Ejercicio2(){
            
        }
        //metodo3
        public void Ejercicio3(){
            
        }
        //metodo4
        public void Ejercicio4(){
            
        }
}

