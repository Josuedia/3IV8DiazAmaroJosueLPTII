import java.util.Scanner;
class latarea {
    public static void main (String[] args){
    Scanner respuesta= new Scanner(System.in);
    int edad1, mensaje2, numerobinario, m, num1, num2, cp, cneg, cneu;
    double n, r, abono1, abono2;
    char mensaje1;
    String binario;
    //menu
    do{
        do{
    System.out.println("Nombre: Diaz Amaro Josue Ramses");
    System.out.println("Grupo: 3IV8");
    System.out.println("Bienvenido");
    System.out.println("Elija cual de los siguientes problemas quiere trabajar:");
    System.out.println("1. Abono");
    System.out.println("2. Numeros decimales a binarios");
    System.out.println("3. Conversor de unidades de temperatura");
    System.out.println("4. Identificador de numeros positivos y negativos");
    mensaje2=respuesta.nextInt();
    }while(mensaje2<0 || mensaje2>5);
    
    switch(mensaje2){
        case 1:
        do{
            System.out.println("Cual es su edad?");
            edad1=respuesta.nextInt();
            }while(edad1<0);
            do{
            System.out.println("Ingrese el abono");
            abono1=respuesta.nextFloat();
            }while(edad1<0);
    
            if(edad1<=65 && edad1>=21 || edad1<21){
                System.out.println("No hay un trato con gente de "+edad1+" años de edad");
            }else if(edad1>65 && edad1<=128){
                abono2=abono1*0.40;
                System.out.println("Su abono es de "+abono2);
            }else if(edad1<21 && edad1>=18){
                System.out.println("Sus padres son socios? s/n");
                mensaje1=respuesta.next().charAt(1);
                switch(mensaje1){
                        case 's':
                        abono2=abono1*0.45;
                        System.out.println("Su abono es de "+abono2);
                        break;
                        case 'n':
                        abono2=abono1*0.25;
                        System.out.println("Su abono es de "+abono2);
                    }
                    //disculpe, no se a que se refiere con abono xd
            }
        break;
        case 2:
        System.out.println("Ingrese el numero positivo entero que desee convertir a binario");
        numerobinario=respuesta.nextInt();
        binario="";
        if(numerobinario>0){
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
            binario="\n N0 se pudo converitir el numero, ingrese solo positivos";
        }
        System.out.println("El numero binario es: "+ binario);
        break;
        case 3:
        System.out.println("Introduzca la temperatura en celcius: ");
        n=respuesta.nextDouble();
        System.out.println("A que unidad de temperatura desea convertir?");
        System.out.println("1. FAHRENHEIT");
        System.out.println("2. KELVINE");
        System.out.println("3. RANKINE");
        mensaje2=respuesta.nextInt();
        switch(mensaje2){
            case 1:
            r=(9*n/5)+32;
            System.out.println(n+" grados celicuis es igual a "+r+" grados fahrenheit");
            break;
            case 2:
            r=n+273.15;
            System.out.println(n+" grados celicuis es igual a "+r+" grados kelvine");
            break;
            case 3:
            r=(9*n/5)+491.67;
            System.out.println(n+" grados celicuis es igual a "+r+" grados kelvine");
            break;
        }
        break;
        case 4:
        cp=0;
        cneg=0;
        cneu=0;
        do{
        System.out.println("Cuantos numeros desea contar?");
        num1=respuesta.nextInt();
        }while(num1<0);
        for(m=0; m<num1; m++){
            System.out.println("Introduzca un numero:");
            num2=respuesta.nextInt();
            if(num2>0){
                cp++;
            }else if(num2<0){
                cneg++;
            }else if(num2==0){
                cneu++;
            }
        }
        System.out.println("Hay en total "+cp+" numeros positivos");
        System.out.println("Hay en total "+cneg+" numeros negativos");
        System.out.println("Hay en total "+cneu+" numeros neutros (0)");
        break;
    }

    System.out.println("Desea repetir? s/n");
    mensaje1=respuesta.next().charAt(0);;
    }while(mensaje1=='S' || mensaje1=='s');
    } 
}
