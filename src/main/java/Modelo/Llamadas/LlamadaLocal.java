package Modelo.Llamadas;

import Modelo.ControlDeHorario.ControladorDeDia;
import Modelo.ControlDeHorario.ControladorDeHorario;

public class LlamadaLocal implements Llamada{
    private final double costoHorarioEspecifico;
    private final double costoFueraDeHorario;
    private final ControladorDeHorario timer;
    private final ControladorDeDia verificadorDia;
    private final String horaDeLlamada;
    private final String diaDeLlamada;

    public LlamadaLocal(String horaDeLlamada, String diaDeLlamada){
        this.costoFueraDeHorario = 0.1;
        this.costoHorarioEspecifico = 0.2;
        this.timer = new ControladorDeHorario(8,20);
        this.verificadorDia = new ControladorDeDia();
        this.horaDeLlamada = horaDeLlamada;
        this.diaDeLlamada = diaDeLlamada;
    }

    @Override
    public double calcularCosto(double duracionLlamada) {
        if(!(this.timer.dentroDelHorario(horaDeLlamada)) && this.verificadorDia.esFinDeSemana(this.diaDeLlamada)) return duracionLlamada * costoFueraDeHorario;;
        return duracionLlamada * this.costoHorarioEspecifico;

    }

}
