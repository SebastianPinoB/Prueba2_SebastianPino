package modelo;

public class Auto extends Vehiculo{
    private boolean autopilot;

    public Auto(){
    }
    
    public Auto(boolean autopilot, int codigo, boolean requiereMantenimiento, double horasDeUso) {
        super(codigo, requiereMantenimiento, horasDeUso);
        this.autopilot = autopilot;
    }

    public double getHorasDeUso() {
        return horasDeUso;
    }

    public void setHorasDeUso(double horasDeUso) {
        this.horasDeUso = horasDeUso;
    }

    public boolean isAutopilot() {
        return autopilot;
    }

    public void setAutopilot(boolean autopilot) {
        this.autopilot = autopilot;
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
        if(autopilot == true){
            double aux = Constantes.valorHoraAlquiler * horasDeUso;
            return aux * 1.10;
        }else{
            return Constantes.valorHoraAlquiler * horasDeUso;
        }
    }

    @Override
    public String toString() {
        return "Auto{" + "autopilot=" + autopilot + '}';
    }
    
    
}
