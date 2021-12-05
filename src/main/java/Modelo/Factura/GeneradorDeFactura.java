package Modelo.Factura;
import Modelo.Llamadas.*;

import java.io.*;
import java.util.Scanner;


public class GeneradorDeFactura {

    public static void main(String[] arg) throws IOException {
        String row;
        Llamada llamada;
        String paisDeOrigen = "Argentina";
        double subTotalLocal = 0;
        double subTotalNacional = 0;
        double subTotalInternacional = 0;
        System.out.println("Introduzca su número de cliente: ");
        Scanner entrada = new Scanner(System.in);
        String numeroDeCliente = entrada.nextLine();
        FacturaTelefonica factura = new FacturaTelefonica();
        FileReader fr = new FileReader("clientes.csv");
        BufferedReader br = new BufferedReader(fr);
        while ((row = br.readLine()) != null) {
            String[] datos = row.split(";");
            if (numeroDeCliente.equals(datos[0])) {
                String paisDestino = datos[1];
                String localidadOrigen = datos[2];
                String localidadDestino = datos[3];
                String dia = datos[4];
                String hora = datos[5];
                double duracion = Double.parseDouble(datos[6]);
                if (!(paisDeOrigen.equals(paisDestino))) {
                    llamada = new LlamadaInternacional();
                    subTotalInternacional = subTotalInternacional + llamada.calcularCosto(duracion);
                } else if (!(localidadOrigen.equals(localidadDestino))) {
                    llamada = new LlamadaNacional();
                    subTotalNacional = subTotalNacional + llamada.calcularCosto(duracion);
                } else {
                    llamada = new LlamadaLocal(hora, dia);
                    subTotalLocal = subTotalLocal + llamada.calcularCosto(duracion);
                }

            }
        }
        factura.imprimir(subTotalLocal,subTotalNacional,subTotalInternacional);
    }
}
