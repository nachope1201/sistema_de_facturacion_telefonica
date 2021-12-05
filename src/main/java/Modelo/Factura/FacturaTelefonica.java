package Modelo.Factura;

public class FacturaTelefonica {
    private final double abonoMensual;

    public FacturaTelefonica(){
        this.abonoMensual = 100;
    }

    public void imprimir(double subLocal,double subNacional, double subInternacional){
        double total = this.abonoMensual + subLocal + subNacional + subInternacional;
        System.out.println("\n------ Factura ------\n");
        System.out.println("Subtotal Internacional: " + subInternacional + "\n");
        System.out.println("Subtotal Nacional: " + subNacional + "\n");
        System.out.println("Subtotal local: " + subLocal + "\n");
        System.out.println("Abono mensual: " + this.abonoMensual + "\n");
        System.out.println("---------------------\n");
        System.out.println("Total: " + total);
    }

}
