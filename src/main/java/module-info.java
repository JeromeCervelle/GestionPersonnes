module fr.limoges.valadon.gestionpersonnes {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.limoges.valadon.gestionpersonnes to javafx.fxml;
    exports fr.limoges.valadon.gestionpersonnes;
}