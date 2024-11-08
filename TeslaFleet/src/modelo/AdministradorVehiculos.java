package modelo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdministradorVehiculos {
    private List <Vehiculo> vehiculos= new ArrayList <>();
    private int codigoAux = 1;
    Scanner entrada = new Scanner(System.in);

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getCodigoAux() {
        return codigoAux;
    }
    
    public AdministradorVehiculos() {
    }

    public void crearAuto(){
        System.out.println("CREAR AUTO");
        System.out.println("");
        Auto auto = new Auto();
        auto.setCodigo(codigoAux);
        this.codigoAux += 1;
        auto.setRequiereMantenimiento(this.preguntaMantenimiento());
        
        System.out.println("[1]Si ");
        System.out.println("[2]No ");
        System.out.print("Autopilot Activado?: ");

        if(entrada.nextInt() == 1){
            auto.setAutopilot(true);
        }else{
            auto.setAutopilot(false);
        }
        
        auto.setHorasDeUso(this.preguntaHorasDeUso());
        vehiculos.add(auto);
        System.out.println("");
    }
    
    public void crearMoto(){
        System.out.println("CREAR MOTO");
        System.out.println("");
        Moto moto = new Moto();
        moto.setCodigo(codigoAux);
        
        this.codigoAux += 1;
        moto.setRequiereMantenimiento(this.preguntaMantenimiento());
        
        System.out.print("Tiempo mocoEco activo(En horas): ");
        moto.setModoEco(entrada.nextDouble());
        moto.setHorasDeUso(this.preguntaHorasDeUso());
        vehiculos.add(moto);
        System.out.println("");
    }
    
    public void crearBici(){
        System.out.println("CREAR BICI");
        System.out.println("");
        BicicletaElectrica bici = new BicicletaElectrica();
        bici.setCodigo(codigoAux);
        this.codigoAux += 1;
        bici.setRequiereMantenimiento(this.preguntaMantenimiento());
        
        System.out.print("capacidad Bateria (En kilometros):  ");
        bici.setCapacidadBateria(entrada.nextDouble());
        bici.setHorasDeUso(this.preguntaHorasDeUso());
        vehiculos.add(bici);
        System.out.println("");
    }
    
    public void mostrarVehiculos(){
        for(int i=0; i<this.vehiculos.size(); i++){
            System.out.println(this.vehiculos.get(i).toString());//ARREGLALO WN AGREGA LOS TOSTRING
        }
        System.out.println("");
    }
    
    public int tamanioFlota(){
        return this.vehiculos.size();
    }
    
    public boolean preguntaMantenimiento(){
        System.out.println("[1]Si ");
        System.out.println("[2]No ");
        System.out.print("Requiere Mantenimiento?: ");
        
        if(entrada.nextInt() == 1){
            return true;
        }else{
            return false;
        }
    }
    
    public void mostrarCostosAlquiler(){
        for(int i=0; i < this.vehiculos.size(); i++){
            System.out.print("Ingresa las horas de uso: ");
            System.out.println(this.vehiculos.get(i).calcularCostoAlquiler());
        }
        System.out.println("");
    }
    
    public double preguntaHorasDeUso(){
        System.out.print("Horas de uso: ");
        return entrada.nextDouble();
    }
}
