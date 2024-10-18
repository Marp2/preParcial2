module programacion3.parcial2archivos.archivosapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens programacion3.parcial2archivos.archivosapp to javafx.fxml;
    exports programacion3.parcial2archivos.archivosapp;
}