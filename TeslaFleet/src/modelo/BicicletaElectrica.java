package modelo;

public class BicicletaElectrica extends Vehiculo{

    private double capacidadBateria;

    public BicicletaElectrica(double capacidadBateria, int codigo, boolean requiereMantenimiento, double horasDeUso) {
        super(codigo, requiereMantenimiento, horasDeUso);
        this.capacidadBateria = capacidadBateria;
    }

    public BicicletaElectrica() {
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isRequiereMantenimiento() {
        return requiereMantenimiento;
    }

    public void setRequiereMantenimiento(boolean requiereMantenimiento) {
        this.requiereMantenimiento = requiereMantenimiento;
    }
    
    @Override
    public double calcularCostoAlquiler() {
        if(this.capacidadBateria < 20){
            double aux = Constantes.valorHoraAlquiler * horasDeUso;
            return aux * 0.95;
        }else{
            return Constantes.valorHoraAlquiler * horasDeUso;
        }
    }

    public double getHorasDeUso() {
        return horasDeUso;
    }

    public void setHorasDeUso(double horasDeUso) {
        this.horasDeUso = horasDeUso;
    }

    @Override
    public String toString() {
        return "BicicletaElectrica{" + "capacidadBateria=" + capacidadBateria + '}';
    }
    
    
}
