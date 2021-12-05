package Modelo.Llamadas;

public interface Llamada{

    default double calcularCosto(double duracionLlamada) {
        return 0;
    }

}
