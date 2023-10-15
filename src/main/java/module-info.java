module fr.limoges.valadon.gestionpersonnes {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.prefs;
    requires java.xml.bind;


    opens fr.limoges.valadon.gestionpersonnes to javafx.fxml;
    opens fr.limoges.valadon.gestionpersonnes.controller to javafx.fxml;
    exports fr.limoges.valadon.gestionpersonnes;
}