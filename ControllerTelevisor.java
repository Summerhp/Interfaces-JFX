import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class ControllerTelevisor {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblVolumen;

    @FXML
    private Label lblCanal;

    @FXML
    private Label lblEntrada;

    @FXML
    private Button cmdBajarVolumen;

    @FXML
    private Button cmdSubirVolumen;

    @FXML
    private Button cmdAvanzarCanal;

    @FXML
    private Button cmdRetrocederCanal;

    @FXML
    private TextField txtVolumen;

    @FXML
    private TextField txtCanal;

    @FXML
    private MenuItem cmdApagado;

    @FXML
    private MenuItem cmdCable;

    @FXML
    private MenuItem cmdAire;

    @FXML
    private MenuItem cmdAuxiliar;

    @FXML
    private TextField txtEntrada;

    private Televisor T;
    
    public ControllerTelevisor(){
    T = new Televisor();
    }
    
    @FXML
    private void mostrarAlertError(ActionEvent event, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
    
    public void actualizarGUI(){
    txtCanal.setText(""+T.getCanal());
    txtVolumen.setText(""+T.getVolumen());
    txtEntrada.setText(""+T.getTipoDeEntrada());
    }
    @FXML
    void Aire(ActionEvent event) {
        T.setTipoDeEntrada(T.tipoDeEntrada=1);
        T.setCanal(T.canal=0);
        actualizarGUI();
    }

    @FXML
    void Apgado(ActionEvent event) {
        T.setTipoDeEntrada(T.tipoDeEntrada=0);
        T.setCanal(T.canal=0);
        actualizarGUI();
    }

    @FXML
    void AvazarEntrada(ActionEvent event) {
        T.avanzarCanal();
        actualizarGUI();
    }

    @FXML
    void BajarVolumen(ActionEvent event) {
        T.bajarVolumen();
        if(T.volumen==0)
        mostrarAlertError(event,"No se pueden bajar mas el volumen del televisor");
        else actualizarGUI();
        actualizarGUI();
    }

    @FXML
    void Cable(ActionEvent event) {
        T.setTipoDeEntrada(T.tipoDeEntrada=2);
        T.setCanal(T.canal=0);
        actualizarGUI();
    }

    @FXML
    void RetrocederCanal(ActionEvent event) {
        T.retrocederCanal();
        actualizarGUI();
    }

    @FXML
    void SubirVolumen(ActionEvent event) {
        T.subirVolumen();
        if(T.volumen==20)
        mostrarAlertError(event,"No se pueden subir mas el volumen del televisor");
        else actualizarGUI();
        actualizarGUI();
        
    }
    
    @FXML
    void auxiliar(ActionEvent event) {
        T.setTipoDeEntrada(T.tipoDeEntrada=3);
        T.setCanal(T.canal=0);
        actualizarGUI();
    }
    
    @FXML
    void initialize() {
        assert lblVolumen != null : "fx:id=\"lblVolumen\" was not injected: check your FXML file 'Control Problema2.fxml'.";
        assert lblCanal != null : "fx:id=\"lblCanal\" was not injected: check your FXML file 'Control Problema2.fxml'.";
        assert lblEntrada != null : "fx:id=\"lblEntrada\" was not injected: check your FXML file 'Control Problema2.fxml'.";
        assert cmdBajarVolumen != null : "fx:id=\"cmdBajarVolumen\" was not injected: check your FXML file 'Control Problema2.fxml'.";
        assert cmdSubirVolumen != null : "fx:id=\"cmdSubirVolumen\" was not injected: check your FXML file 'Control Problema2.fxml'.";
        assert cmdAvanzarCanal != null : "fx:id=\"cmdAvanzarCanal\" was not injected: check your FXML file 'Control Problema2.fxml'.";
        assert cmdRetrocederCanal != null : "fx:id=\"cmdRetrocederCanal\" was not injected: check your FXML file 'Control Problema2.fxml'.";
        assert txtVolumen != null : "fx:id=\"txtVolumen\" was not injected: check your FXML file 'Control Problema2.fxml'.";
        assert txtCanal != null : "fx:id=\"txtCanal\" was not injected: check your FXML file 'Control Problema2.fxml'.";
        assert cmdApagado != null : "fx:id=\"cmdApagado\" was not injected: check your FXML file 'Control Problema2.fxml'.";
        assert cmdCable != null : "fx:id=\"cmdCable\" was not injected: check your FXML file 'Control Problema2.fxml'.";
        assert cmdAire != null : "fx:id=\"cmdAire\" was not injected: check your FXML file 'Control Problema2.fxml'.";
        assert txtEntrada != null : "fx:id=\"txtEntrada\" was not injected: check your FXML file 'Control Problema2.fxml'.";
        actualizarGUI();
    }
}