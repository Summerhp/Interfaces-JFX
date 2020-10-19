import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
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

public class ControllerLibro {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtAñoDeEdicion;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblAutores;

    @FXML
    private Label lblEditorial;

    @FXML
    private Label lblAñoDeEdicion;

    @FXML
    private Label lblPrecio;

    @FXML
    private Label lblNumeroDePaginas;

    @FXML
    private Label lblNumeroDeCopias;

    @FXML
    private Label lblNumeroDeCopiasDisponibles;

    @FXML
    private Label lblNumeroDeCopiasPrestadas;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TextField txtNumeroDePaginas;

    @FXML
    private TextField txtNumeroDeCopias;

    @FXML
    private TextField txtNumeroDeCopiasDisponibles;

    @FXML
    private TextField txtNumeroDeCopiasPrestadas;

    @FXML
    private Button cmdGuardarCambios;

    @FXML
    private TextField txtTitulo;

    @FXML
    private TextField txtAutores;

    @FXML
    private TextField txtEditorial;

    @FXML
    private Text lblRegistroDePrestamo;

    @FXML
    private Button cmdActualizarPantalla;

    @FXML
    private Button cmdRegistrarPrestamo;

    @FXML
    private Button cmdRegistrarDevolucion;

    @FXML
    private ImageView imgLibro;
    
    private Libro L;
    
    @FXML
    private void mostrarAlertError(ActionEvent event, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
    
    public ControllerLibro(){
    L = new Libro();
}
public void actualizarGUI()
{ txtTitulo.setText(""+L.getTitulo());
  txtAutores.setText(""+L.getAutores());
  txtEditorial.setText(""+L.getEditorial());
  txtPrecio.setText(""+L.getPrecio());
  txtAñoDeEdicion.setText(""+L.getAñoEdicion());
  txtNumeroDePaginas.setText(""+L.getNumeroDePaginas());
  txtNumeroDeCopias.setText(""+L.getNumeroDeCopias());
  txtNumeroDeCopiasDisponibles.setText(""+L.getNumeroDeCopiasDisponibles());
  txtNumeroDeCopiasPrestadas.setText(""+L.getNumeroDeCopiasPrestadas());
}

    @FXML
    void Actualizar(ActionEvent event) {
        actualizarGUI();
    }

    @FXML
    void guardar(ActionEvent event) {
        L.setTitulo(txtTitulo.getText());
        L.setAutores(txtAutores.getText());
        L.setEditorial(txtEditorial.getText());
        L.setPrecio(Integer.parseInt(txtPrecio.getText()));
        L.setAñoEdicion(Integer.parseInt(txtAñoDeEdicion.getText()));
        L.setNumeroDePaginas(Integer.parseInt(txtNumeroDePaginas.getText()));
        L.cambiarNumeroDeCopias(Integer.parseInt(txtNumeroDeCopias.getText()));
    }

    @FXML
    void registrarDevolucion(ActionEvent event) {
        if(L.devolver())
        actualizarGUI();
        else mostrarAlertError(event,"No se pueden realizar mas devoluciones");
        actualizarGUI();
        
    }

    @FXML
    void registrarPrestamo(ActionEvent event) {
        if(L.prestar())
        actualizarGUI();
        else mostrarAlertError(event,"No se pueden realizar mas prestamos");
        actualizarGUI();
    }

    @FXML
    void initialize() {
        assert txtAñoDeEdicion != null : "fx:id=\"txtAñoDeEdicion\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert lblAutores != null : "fx:id=\"lblAutores\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert lblEditorial != null : "fx:id=\"lblEditorial\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert lblAñoDeEdicion != null : "fx:id=\"lblAñoDeEdicion\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert lblPrecio != null : "fx:id=\"lblPrecio\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert lblNumeroDePaginas != null : "fx:id=\"lblNumeroDePaginas\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert lblNumeroDeCopias != null : "fx:id=\"lblNumeroDeCopias\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert lblNumeroDeCopiasDisponibles != null : "fx:id=\"lblNumeroDeCopiasDisponibles\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert lblNumeroDeCopiasPrestadas != null : "fx:id=\"lblNumeroDeCopiasPrestadas\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert txtPrecio != null : "fx:id=\"txtPrecio\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert txtNumeroDePaginas != null : "fx:id=\"txtNumeroDePaginas\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert txtNumeroDeCopias != null : "fx:id=\"txtNumeroDeCopias\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert txtNumeroDeCopiasDisponibles != null : "fx:id=\"txtNumeroDeCopiasDisponibles\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert txtNumeroDeCopiasPrestadas != null : "fx:id=\"txtNumeroDeCopiasPrestadas\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert cmdGuardarCambios != null : "fx:id=\"cmdGuardarCambios\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert txtTitulo != null : "fx:id=\"txtTitulo\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert txtAutores != null : "fx:id=\"txtAutores\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert txtEditorial != null : "fx:id=\"txtEditorial\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert lblRegistroDePrestamo != null : "fx:id=\"lblRegistroDePrestamo\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert cmdActualizarPantalla != null : "fx:id=\"cmdActualizarPantalla\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert cmdRegistrarPrestamo != null : "fx:id=\"cmdRegistrarPrestamo\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert cmdRegistrarDevolucion != null : "fx:id=\"cmdRegistrarDevolucion\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        assert imgLibro != null : "fx:id=\"imgLibro\" was not injected: check your FXML file 'Libro Problema.fxml'.";
        actualizarGUI();
    }
}
