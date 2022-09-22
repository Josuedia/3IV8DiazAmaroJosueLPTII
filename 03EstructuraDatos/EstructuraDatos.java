/*  Convertir los siguientes datos:
convertir numeros decimales a binarios
temperatura celcius, kelvin y rankin
numeros positivos y negativos segun una lista 
Tiendita peke
Area y perimetro de figuras geometricas
una tabla
factoriales
dibujito 
figuras huecas
patrones
diamantes
Calculadora
Salir xd
*/ 
import java.util.Scanner;
class EstructuraDatos{
    //Programa1
    public static void main (String[] args){
        Scanner entrada=new Scanner(System.in);
        int edad, opcion, socio, numerobinario, total, numtotal, n, a, b, i;
        int positivos=0;
        int negativos=0;
        double precio, bono;
        char letras, operacion;
        float precios=0;
        float resultado=0;
        int cantidad=0;
        String binario="";
        //vamos a crear un bucle para que se repita el programa
        do{
            //vamos a crear nuestro menu
            System.out.println("Bienvenido a la tarea que tenian que hacer jaja");
            System.out.println("Por favor elija la opcion deseada:");
            System.out.println("1. Descuento por edad");
            System.out.println("2. Convertir numero decimal a binario");
            System.out.println("3. Conversiones de temperatura");
            System.out.println("4. Numeros positivos y negativos");
            System.out.println("5. La tiendita");
            System.out.println("6. Area y perimetro");
            System.out.println("7. Tabla");
            System.out.println("8. Factoriales");
            System.out.println("9. Dibujitos");
            System.out.println("10. Figura hueca");
            System.out.println("11. Patrones");
            System.out.println("12. Diamante");
            System.out.println("13. Calculadora");
            System.out.println("14. Salir");
            opcion=entrada.nextInt();
            //nuestro switch
            switch(opcion){
                case 1://hay lo hacen xd
                break;
                case 2:
                System.out.println("Ingrese el numero positivo entero que desee convertir a binario");
                numerobinario=entrada.nextInt();
                binario="";
                //comrpobar que sea entero psortivo
                if(numerobinario>0){
                    //Debo aplicar el algoritmo
                    while(numerobinario>0){
                        if(numerobinario%2==0){
                            binario="0"+binario;
                        }else{
                            binario="1"+binario;
                        }
                        numerobinario=(int)numerobinario/2;

                    }
                }else if(numerobinario==0){
                    binario="0";
                }else{
                    binario="\n no se pudo converitir el numero, ingrese solo positivos";
                }
                System.out.println("El numero binario es: "+ binario);
                break;
                case 3:
                break;
                case 4:
                break;
                case 5:
                break;
                case 6:
                break;
                case 7:
                //vamos a checar el for
                for(/*con que variable inicia*/n=1; /*hasta que variable va a repetir*/n<=10; /*la operación que va a hacer*/n++){
                    System.out.println(n+" "+(n*10)+" "+(n*100)+" "+(n*1000));
                  //LOL xd   
                }
                break;
                case 8:
                break;
                case 9:
                break;
                case 10://incompletojaja
                System.out.println("Cuadrado magico, bien hueco despues de que te rechazaron jaja");
                System.out.println("Inserte el numero de uinidades entre el 1 y 20");
                n=entrada.nextInt();
                if(n >= 1 && n <= 20){
                    //linea superior
                    for(i=0;i < n;i++ ){
                        System.out.print(" * "); 
                    }
                    System.out.println("");
                    //cuadrado interno
                    for(int j=0; j<n-2; j++){
                        
                        System.out.print(" * ");
                        for(int k=0;k<n-2;k++){
                            System.out.println(" ");
                        }
                        System.out.println(" * ")
                    }
                    for(i=0;i < n;i++ ){
                        System.out.print(" * "); 
                    }
                    System.out.println("");
                }else{
                    System.out.println("No bro, numeros menores de 20 y mayores de 1");
                }
                break;//incompleto
                
            }


            System.out.println("¿Desea repetir el programa? Si lo desea escriba s minuscula");
            letras=entrada.next().charAt(0);

        }while(letras == 's'|| letras == 'S');

    }
}