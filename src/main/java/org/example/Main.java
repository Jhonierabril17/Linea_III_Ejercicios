package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int VtI = 700000, VtR = 200000, VtT = 600000, Vc1 = 0,Vc2 = 0, Vc3 = 0, ViIC1 = 0, ViRC1 = 0, ViTC1 = 0
                , ViIC2 = 0, ViRC2 = 0, ViTC2 = 0, ViIC3 = 0, ViRC3 = 0, ViTC3 = 0, sumaV = 0, sumaTotal3 = 0, sumaTotal2 = 0, sumaTotal1 = 0;
        boolean estado= true;
            while (estado){
                System.out.println("\n Opciones");
                System.out.println("1.Votar por el candidato de su elección.");
                System.out.println("2.Calcular el costo de campaña de un candidato dependiendo de la influencia publicitaria de cada voto.");
                System.out.println("3.Vaciar todas las urnas de la votación.");
                System.out.println("4.Conocer el número total de votos y su porcentaje.");
                System.out.println("5.Costo promedio de campaña en las elecciones.");
                System.out.println("Elige una opcion");
                int opc = sc.nextInt();
                switch (opc){
                    case 1:
                        System.out.println("\n Elige al candidato de tu eleccion");
                        System.out.println("1. Lokillo");
                        System.out.println("2. Boyacoman");
                        System.out.println("3. Chuck Norris");
                        int Voto = sc.nextInt();
                        switch (Voto){
                            case 1:
                                System.out.println("\n ¿Por que medio viste la campaña de tu candidato?");
                                System.out.println("1. Internet");
                                System.out.println("2. Radio");
                                System.out.println("3. Television");
                                int medioC1 = sc.nextInt();
                                switch (medioC1){
                                    case 1:
                                        ViIC1++;
                                        break;
                                    case 2:
                                        ViRC1++;
                                        break;
                                    case 3:
                                        ViTC1++;
                                        break;
                                    default:
                                        System.out.println("Opción no válida.");
                                }
                                Vc1++;
                                break;
                            case 2:
                                System.out.println("\n ¿Por que medio viste la campaña de tu candidato?");
                                System.out.println("1. Internet");
                                System.out.println("2. Radio");
                                System.out.println("3. Television");
                                int medioC2 = sc.nextInt();
                                switch (medioC2){
                                    case 1:
                                        ViIC2++;
                                        break;
                                    case 2:
                                        ViRC2++;
                                        break;
                                    case 3:
                                        ViTC2++;
                                        break;
                                    default:
                                        System.out.println("Opción no válida.");
                                }
                                Vc2++;
                                break;
                            case 3:
                                System.out.println("\n ¿Por que medio viste la campaña de tu candidato?");
                                System.out.println("1. Internet");
                                System.out.println("2. Radio");
                                System.out.println("3. Television");
                                int medioC3 = sc.nextInt();
                                switch (medioC3){
                                    case 1:
                                        ViIC3++;
                                        break;
                                    case 2:
                                        ViRC3++;
                                        break;
                                    case 3:
                                        ViTC3++;
                                        break;
                                    default:
                                        System.out.println("Opción no válida.");
                                }
                                Vc3++;
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                        break;
                    case 2:
                        System.out.println("Seleccione la opcion del candidato que quieres calcular el costo de su campaña");
                        System.out.println("\n Elige una opcion");
                        System.out.println("1. Candidato Lokillo");
                        System.out.println("2. Candidato Boyacoman");
                        System.out.println("3. Candidato Ckuck Norris");
                        int Cal = sc.nextInt();
                        switch (Cal){
                            case 1:
                                int sumaIC1, sumaRC1, sumaTC1;
                                sumaIC1 = (ViIC1 * VtI);
                                System.out.println("Total campaña Publicitaria de Internet: "+ sumaIC1);
                                sumaRC1 = (ViRC1 * VtR);
                                System.out.println("Total campaña Publicitaria de Radio: "+ sumaRC1);
                                sumaTC1 = (ViTC1 * VtT);
                                System.out.println("Total campaña Publicitaria de television: "+ sumaTC1);
                                sumaTotal1 = (sumaIC1 +sumaRC1 + sumaTC1);
                                System.out.println("La suma total de las campañas publicitarias es: "+ sumaTotal1);
                                break;
                            case 2:
                                int sumaIC2, sumaRC2, sumaTC2;
                                sumaIC2 = (ViIC2 * VtI);
                                System.out.println("Total campaña Publicitaria de Internet: "+ sumaIC2);
                                sumaRC2 = (ViRC2 * VtR);
                                System.out.println("Total campaña Publicitaria de Radio: "+ sumaRC2);
                                sumaTC2 = (ViTC2 * VtT);
                                System.out.println("Total campaña Publicitaria de television: "+ sumaTC2);
                                sumaTotal2 = (sumaIC2 +sumaRC2 + sumaTC2);
                                System.out.println("La suma total de las campañas publicitarias es: "+ sumaTotal2);
                                break;
                            case 3:
                                int sumaIC3, sumaRC3, sumaTC3;
                                sumaIC3 = (ViIC3 * VtI);
                                System.out.println("Total campaña Publicitaria de Internet: "+ sumaIC3);
                                sumaRC3 = (ViRC3 * VtR);
                                System.out.println("Total campaña Publicitaria de Radio: "+ sumaRC3);
                                sumaTC3 = (ViTC3 * VtT);
                                System.out.println("Total campaña Publicitaria de television: "+ sumaTC3);
                                sumaTotal3 = (sumaIC3 +sumaRC3 + sumaTC3);
                                System.out.println("La suma total de las campañas publicitarias es: "+ sumaTotal3);
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                        break;
                    case 3:
                        Vc1 = Vc2 = Vc3 = ViIC1 = ViRC1 = ViTC1 = ViIC2 = ViRC2 = ViTC2 = ViIC3 = ViRC3 = ViTC3 = 0;
                        System.out.println("Vaciando Urnas...");
                        System.out.println("Urnas Vaciadas");
                        break;
                    case 4:
                        int porcentajeC1, porcentajeC2, porcentajeC3;
                        System.out.println("El numero Total de votos es: ");
                        System.out.println("Candidato Lokillo : " + Vc1);
                        System.out.println("Candidato Boyacoman : " + Vc2);
                        System.out.println("Candidato Ckuck Norris : " + Vc3);
                        sumaV = (Vc1 +Vc2 + Vc3);
                        System.out.println("Cantidad total de votos es: " + sumaV);
                        porcentajeC1 = ( Vc1 / sumaV) * 100;
                        System.out.println("Candidato 1 Lokillo con un porcentaje de : " + porcentajeC1 + "%");
                        porcentajeC2 = ( Vc2 / sumaV) * 100;
                        System.out.println("Candidato 2 Boyacoman con un porcentaje de : " + porcentajeC2 + "%");
                        porcentajeC3 = ( Vc3 / sumaV) * 100;
                        System.out.println("Candidato 3 Chuck Norris  con un porcentaje de : " + porcentajeC3 + "%");
                        break;
                    case 5:
                        int SumaPromedio;
                        SumaPromedio = (sumaTotal1 + sumaTotal2 + sumaTotal3) / 3;
                        System.out.println("El promedio de las campañas fue de : "+ SumaPromedio);
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            }
    }
}