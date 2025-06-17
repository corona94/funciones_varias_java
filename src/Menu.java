import ManejoMenu.ManejoMenu;
import Operacion.Operacion;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        var opc = "";
        Scanner read = new Scanner(System.in);
        while (opc != "4")
        {

        System.out.println("" +
                "\n**Menu principal**\n" +
                "opciones:\n" +
                "1-Operaciones\n" +
                "2-Matrices\n" +
                "3-Arreglos\n" +
                "4-Salir\n");
        System.out.print("Ingresa la opcion: ");
        opc = read.nextLine();




        switch (opc)
        {
            case "1":
            {


                var opcOper = "";
                Scanner readOpc = new Scanner(System.in);
                while (opcOper != "7") {
                System.out.print("" +
                        "1-suma\n" +
                        "2-resta\n" +
                        "3-Multiplicacion\n" +
                        "4-Division\n" +
                        "5-Raiz Cuadrada\n" +
                        "6-Ecuacion de segundo grado\n" +
                        "7-Salir\n" +
                        "opcion:");
                opcOper = readOpc.nextLine();


                    ManejoMenu manejomenu = new ManejoMenu();
                    switch (opcOper)
                    {
                        case "1":

                            manejomenu.metodosumar();

                            break;

                        case "2":

                            manejomenu.metodoRestar();
                            break;
                        case "3":
                            manejomenu.metodoMultiplicar();
                            break;
                        case "5":

                            manejomenu.metodoRaizCuadrada();
                            break;
                        case "6":
                            manejomenu.metodoEcuacion();
                            break;

                        default:
                            System.out.println("\nOpcion invalida\n");
                    }


                }
            }


                break;
            case "2":
                break;
            case "3":
                break;

            case "4":
                opc = "4";
                System.out.println("Saliendo");
                break;


            default:
                System.out.println("Opcion invalida");
        }
        }

    }
}
