package modelo;

public abstract class Vehiculo implements Constantes{
    public int codigo;
    public boolean requiereMantenimiento;
    public double horasDeUso;

    public Vehiculo(int codigo, boolean requiereMantenimiento, double horasDeUso) {
        this.codigo = codigo;
        this.requiereMantenimiento = requiereMantenimiento;
        this.horasDeUso = horasDeUso;
    }
    public Vehiculo(){
    }
    
    @Override
    public abstract String toString();
}
