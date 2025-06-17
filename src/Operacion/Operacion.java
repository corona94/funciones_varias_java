package Operacion;

public class Operacion {

    private int op1;
    private int op2;


    public  float sumar(float... number)// float... number // Funcion con argumentos variables
    {
       float result=0;

        for(float n : number)
        {
            result  += n;
        }
        return result;


    }

    public float restar(float... number)
    {
        float result=0;

        for(float n : number)
        {
            result  -= n;
        }
        return result;
    }

    public float multiplicar(float num1, float num2)
    {
        float result;
        return result = num1 * num2;
    }
    public float dividir(float num1, float num2)
    {
        float result;
        return result = num1 / num2;
    }
    public void ecuacion(int a,int b,int c)
    {

        double result = 0;

        result = (-b + Math.sqrt(b*b-(4*a*c)))/(2*a);
        System.out.println("Con +: " + result);
        result = (-b - Math.sqrt(b*b-(4*a*c)))/(2*a);
        System.out.println("Con -: " + result);



    }

    public double raiz(float a)
    {
        return Math.sqrt(a);
    }




}
