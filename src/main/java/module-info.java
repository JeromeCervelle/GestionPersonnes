module fr.limoges.valadon.gestionpersonnes {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.prefs;

    requires com.fasterxml.jackson.dataformat.xml;
    requires com.fasterxml.jackson.datatype.jsr310;
    requires com.fasterxml.jackson.databind;

    opens fr.limoges.valadon.gestionpersonnes to javafx.fxml;
    opens fr.limoges.valadon.gestionpersonnes.controller to javafx.fxml;
    opens fr.limoges.valadon.gestionpersonnes.model to com.fasterxml.jackson.databind;
    exports fr.limoges.valadon.gestionpersonnes;
}