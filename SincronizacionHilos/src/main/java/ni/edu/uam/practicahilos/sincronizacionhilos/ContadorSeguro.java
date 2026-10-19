package ni.edu.uam.practicahilos.sincronizacionhilos;

public class ContadorSeguro {

    private int valor = 0;

    public synchronized void incrementar() {
        valor++;
    }

    public synchronized int obtener() {
        return valor;
    }
}
