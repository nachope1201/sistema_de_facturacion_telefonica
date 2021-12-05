package Modelo.ControlDeHorario;

import java.util.ArrayList;

public class ControladorDeDia {
    private final ArrayList<String> finDeSemana;


    public ControladorDeDia(){
        this.finDeSemana = new ArrayList();
        this.finDeSemana.add("Sabado");
        this.finDeSemana.add("Domingo");
    }

    public boolean esFinDeSemana(String dia){
        return this.finDeSemana.contains(dia);
    }

}
