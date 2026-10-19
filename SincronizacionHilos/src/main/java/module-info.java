module ni.edu.uam.practicahilos.sincronizacionhilos {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.practicahilos.sincronizacionhilos to javafx.fxml;
    exports ni.edu.uam.practicahilos.sincronizacionhilos;
}