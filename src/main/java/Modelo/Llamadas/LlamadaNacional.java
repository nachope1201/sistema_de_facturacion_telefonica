package Modelo.Llamadas;

public class LlamadaNacional implements Llamada{

    private final double costoPorDistintaLocalidad;

    public LlamadaNacional(){
        this.costoPorDistintaLocalidad = 0.30;
    }

    @Override
    public double calcularCosto(double duracionLlamada){
        return this.costoPorDistintaLocalidad * duracionLlamada;
    }
}
