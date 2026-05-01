package JavaFX.ejemApp;

// ================================
// IMPORTACIONES
// ================================

// Clase base de JavaFX
import javafx.application.Application;

// Contenedor de escena
import javafx.scene.Scene;

// Componentes visuales
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

// Layout vertical
import javafx.scene.layout.VBox;

// Ventana principal
import javafx.stage.Stage;

// ================================
// CLASE PRINCIPAL
// ================================

// Toda aplicación JavaFX hereda de Application
public class Main extends Application {

    // ==========================================
    // METODO START
    // ==========================================

    // Este método es el punto de entrada gráfico
    @Override
    public void start(Stage stage) {

        // ======================================
        // LABEL
        // ======================================

        // Texto que aparece arriba
        Label titulo = new Label("Bienvenido a JavaFX");

        // ======================================
        // TEXTFIELD
        // ======================================

        // Campo donde el usuario escribe
        TextField campoNombre = new TextField();

        // Texto guía dentro del campo
        campoNombre.setPromptText("Escribe tu nombre");

        // ======================================
        // BOTON
        // ======================================

        // Botón interactivo
        Button boton = new Button("Saludar");

        // ======================================
        // LABEL RESULTADO
        // ======================================

        // Aquí aparecerá el mensaje
        Label resultado = new Label();

        // ======================================
        // EVENTO DEL BOTON
        // ======================================

        // Cuando el usuario haga click
        boton.setOnAction(e -> {

            // Obtener texto del TextField
            String nombre = campoNombre.getText();

            // Verificar si está vacío
            if(nombre.isEmpty()) {

                resultado.setText("Por favor escribe un nombre");

            } else {

                resultado.setText("Hola " + nombre + ", bienvenido a JavaFX");
            }
        });

        // ======================================
        // LAYOUT
        // ======================================

        // VBox organiza verticalmente
        VBox root = new VBox();

        // Espaciado entre elementos
        root.setSpacing(15);

        // Agregar componentes al layout
        root.getChildren().addAll(
                titulo,
                campoNombre,
                boton,
                resultado
        );

        // ======================================
        // SCENE
        // ======================================

        // Crear escena
        Scene scene = new Scene(root, 400, 250);

        // ======================================
        // STAGE
        // ======================================

        // Configurar título
        stage.setTitle("Tutorial JavaFX");

        // Agregar escena
        stage.setScene(scene);

        // Mostrar ventana
        stage.show();
    }

    // ==========================================
    // MAIN
    // ==========================================

    public static void main(String[] args) {

        // Inicia JavaFX
        launch();
    }
}

