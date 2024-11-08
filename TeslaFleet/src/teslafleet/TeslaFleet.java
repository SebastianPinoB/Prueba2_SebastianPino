package teslafleet;
import java.util.Scanner;
import modelo.AdministradorVehiculos;
import modelo.Auto;
import modelo.BicicletaElectrica;
import modelo.Moto;

public class TeslaFleet {

    public static void main(String[] args) {
        AdministradorVehiculos admin = new AdministradorVehiculos();
        Scanner entrada = new Scanner(System.in);
        
        //Menu
        
        while(true){
            System.out.println("MENU");
            System.out.println("");
            System.out.println("[1]Crear Auto");
            System.out.println("[2]Crear Moto");
            System.out.println("[3]Crear Bici");
            System.out.println("[4]Listar Vehiculos");
            System.out.println("[5]Costos de alquiler");
            System.out.println("[6]Tamanio de la flota");
            System.out.println("[0]Salir");
            System.out.println("");
            System.out.print("OPCION: ");
            int opcion = entrada.nextInt();
            System.out.println("");

            
            if(opcion == 1){
                admin.crearAuto();
            }else if(opcion == 2){
                admin.crearMoto();
            }else if(opcion == 3){
                admin.crearBici();
            }else if(opcion ==4){
                admin.mostrarVehiculos();
            }else if(opcion == 5){
                admin.mostrarCostosAlquiler();
            }else if(opcion == 6){
                admin.tamanioFlota();
            }
            else if(opcion == 0){
                break;
            }
        }
        
        /*admin.crearAuto();
        admin.crearAuto();
        admin.crearAuto();
        
        admin.crearMoto();
        admin.crearMoto();
        
        admin.crearBici();
        admin.crearBici();
        
        admin.mostrarCostosAlquiler();
        admin.mostrarVehiculos();*/
    }
    
}
