package modelo;

public class Moto extends Vehiculo{
    private double modoEco;

    public Moto(double modoEco, int codigo, boolean requiereMantenimiento, double horasDeUso) {
        super(codigo, requiereMantenimiento, horasDeUso);
        this.modoEco = modoEco;
    }

    public double getHorasDeUso() {
        return horasDeUso;
    }

    public void setHorasDeUso(double horasDeUso) {
        this.horasDeUso = horasDeUso;
    }

    public Moto() {
    }

    public double getModoEco() {
        return modoEco;
    }

    public void setModoEco(double modoEco) {
        this.modoEco = modoEco;
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
        if(modoEco> horasDeUso/2){
            double aux = Constantes.valorHoraAlquiler * horasDeUso;
            return aux * 1.08;
        }else{
            return Constantes.valorHoraAlquiler * horasDeUso;
        }
    }

    @Override
    public String toString() {
        return "Moto{" + "modoEco=" + modoEco + '}';
    }
    
    
}
