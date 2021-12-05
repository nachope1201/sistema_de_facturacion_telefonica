package Modelo.ControlDeHorario;

public class ControladorDeHorario {
    private int horaInicial;
    private int horaFinal;
    private final String limiteDeMinutos;

    public ControladorDeHorario(int horaInicial, int horaFinal) {
        this.horaFinal = horaFinal;
        this.horaInicial = horaInicial;
        this.limiteDeMinutos = "00";
    }

    public boolean dentroDelHorario(String horario){
        String[] horaYMinutos = horario.split(":");
        int hora = Integer.parseInt(horaYMinutos[0]);
        if(hora >= this.horaInicial && hora <= this.horaFinal){
            if(this.limiteDeMinutos.equals(horaYMinutos[1])) return true;
        }
        return false;
        }

}
