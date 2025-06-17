package ManejoMenu;

import Arreglo.Arreglo;
import Matriz.Matriz;
import Operacion.Operacion;

import java.util.Scanner;

public class ManejoMenu extends Operacion {

    /*Esto se le conoce como delegación y composisción:
    tener instancias de cada clase como atributos en el
    menu principal, y luego llamar a sus métodos desde ahí.*/
    private Operacion operacion;
    private Matriz matriz;
    private Arreglo arreglo;

    /*Metodos de la clase Operacion*/
    public void metodosumar()
    {
        int cantnum1 = 0;//numeros[] = new float[0];
        float num1 = 0;

        Scanner readnum = new Scanner(System.in);
        var operacion = new Operacion();

        System.out.print("Ingresa la cantidad de numeros a sumar: ");
        cantnum1 = readnum.nextInt();

        float[] arrNum = new float[cantnum1];

        for (int i = 0; i < cantnum1; i++) {
            System.out.print("Numero " + (i+1) + " :");
            num1 = readnum.nextFloat();
            arrNum[i] = num1;
           // System.out.println("Numero en la posición: " + arrNum[i]);

        }
        System.out.println("\nResultado de la suma: " + operacion.sumar(arrNum) + "\n");

    }
    public void metodoRestar()
    {
        int cantnum1 = 0;//numeros[] = new float[0];
        float num1 = 0;

        Scanner readnum = new Scanner(System.in);
        var operacion = new Operacion();

        System.out.print("Ingresa la cantidad de numeros a restar: ");
        cantnum1 = readnum.nextInt();

        float[] arrNum = new float[cantnum1];

        for (int i = 0; i < cantnum1; i++) {
            System.out.print("Numero " + (i+1) + " :");
            num1 = readnum.nextFloat();
            arrNum[i] = num1;
            // System.out.println("Numero en la posición: " + arrNum[i]);

        }
        System.out.println("\nResultado de la resta " + operacion.restar(arrNum) + "\n");
    }
    public void metodoMultiplicar()
    {

        float num1 = 0, num2 = 0;
        Scanner readnum = new Scanner(System.in);
        var operacion = new Operacion();
        System.out.print("Ingresa el primer digito: ");
        num1 = readnum.nextInt();
        System.out.print("Ingresa el segundo digito: ");
        num2 = readnum.nextInt();
        System.out.println("\nResultado de la multiplicación " + operacion.multiplicar(num1,num2) + "\n");
    }
    public void metodoDividir()
    {
        float num1 = 0, num2 = 0;
        Scanner readnum = new Scanner(System.in);
        var operacion = new Operacion();
        System.out.print("Ingresa el primer digito: ");
        num1 = readnum.nextInt();
        System.out.print("Ingresa el segundo digito: ");
        num2 = readnum.nextInt();
        System.out.println("\nResultado de la division " + operacion.multiplicar(num1,num2) + "\n");
    }
    public void metodoEcuacion()
    {
        int num1 = 0, num2 = 0, num3 = 0;
        Scanner readnum = new Scanner(System.in);
        var operacion = new Operacion();
        System.out.print("Ingresa a: ");
        num1 =  readnum.nextInt();

        System.out.print("Ingresa b: ");
        num2 = readnum.nextInt();
        System.out.print("Ingresa c: ");
        num3 = readnum.nextInt();
        operacion.ecuacion(num1,num2,num3);
    }
    public void metodoRaizCuadrada()
    {
        int num1 = 0;
        Scanner readnum = new Scanner(System.in);
        var operacion = new Operacion();
        System.out.print("Ingresa a: ");
        num1 =  readnum.nextInt();
        System.out.println("El resultado de la ecuacuón es: " + operacion.raiz(num1));


    }

    /*Metodos de la clase Metriz*/


    /*Metodos de la clase Arreglo*/


}
