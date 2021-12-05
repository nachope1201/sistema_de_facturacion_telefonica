package Modelo.Llamadas;

public class LlamadaInternacional implements Llamada{
    private final double costoPorLLamadaInternacional;

    public LlamadaInternacional(){
        this.costoPorLLamadaInternacional = 1.50;
    }

    @Override
    public double calcularCosto(double duracionLlamada) {
        return duracionLlamada * this.costoPorLLamadaInternacional;
    }
}
