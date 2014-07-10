import java.util.Scanner;

public class administrarCarrera {

    
    public static void main(String [] args){
        Scanner entrada;
        entrada = new Scanner(System.in);
        String respuesta, nombre, equipo, parametro1;
        int dorsal, i;
        int parametro2;
        double parametro3;
        char talla;
        
        System.out.print("Dime el nombre de la carrera");
        parametro1 = entrada.next();
        System.out.print("Dime el número de participantes");
        parametro2 = entrada.nextInt();
        System.out.print("Dime los kilómetros");
        parametro3 = entrada.nextDouble();
        
        carrera carrerita = new carrera(parametro1, parametro2, parametro3);
        
        
        System.out.print("¿Hay corredores que apuntar? (S/N)");
        respuesta = entrada.next();
        while (respuesta.equalsIgnoreCase("S")){
            System.out.print("Ingrese dorsal del corredor: ");
            dorsal = entrada.nextInt();
            System.out.print("Ingrese nombre del corredor: ");
            nombre = entrada.next();
            System.out.print("Ingrese nombre del equipo: ");
            equipo = entrada.next();
            System.out.print("Ingrese la letra de la talla de camiseta: ");
            talla = entrada.next().charAt(0); 
            
            carrerita.agregarCorredor(dorsal, nombre, equipo, talla);
            System.out.print("¿Hay datos para cargar? (S/N)");
            respuesta = entrada.next();  
        }
        
        System.out.println();
        System.out.println("Datos de todos los corredores apuntados:");
        for(i=0;i<carrerita.getCantCorredores();i++)
        {
            System.out.println(carrerita.mostrarVectorCorredores()[i].toString());
        }
        System.out.println();
        System.out.println("Datos de la carrera:");
        System.out.println(carrerita.toString());
        System.out.println();
       
    }
}
