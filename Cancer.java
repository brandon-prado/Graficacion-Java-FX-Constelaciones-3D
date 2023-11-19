package ConstelacionesZodiaco;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Figuras en 3 dimensiones de la constelación del zodiaco (CÁNCER).
 *
 * @author Brandon Alexis Prado Castro (19051178)
 * @version 1.0. 21.10.2021
 */

public class Cancer extends Application {

    @Override
    public void start(Stage primaryStage) {
        //------------ESFERAS------------//
        //Crear esfera1 por medio de Sphere
        Sphere esfera1 = new Sphere(15);
        esfera1.setTranslateX(55);
        esfera1.setTranslateY(45);
        esfera1.setTranslateZ(0);
        
        //Crear esfera2 por medio de Sphere
        Sphere esfera2 = new Sphere(10);
        esfera2.setTranslateX(138);
        esfera2.setTranslateY(153);
        esfera2.setTranslateZ(0);

        //Crear esfera3 por medio de Sphere
        Sphere esfera3 = new Sphere(20);
        esfera3.setTranslateX(162);
        esfera3.setTranslateY(201);
        esfera3.setTranslateZ(0);
        
        //Crear esfera4 por medio de Sphere
        Sphere esfera4 = new Sphere(15);
        esfera4.setTranslateX(161);
        esfera4.setTranslateY(343);
        esfera4.setTranslateZ(0);
        
        //Crear esfera5 por medio de Sphere
        Sphere esfera5 = new Sphere(15);
        esfera5.setTranslateX(412);
        esfera5.setTranslateY(278);
        esfera5.setTranslateZ(0);
        
        //Texturas de todas las esferas
        PhongMaterial texturaEsferas = new PhongMaterial();
        texturaEsferas.setDiffuseMap(new Image("https://e00-co-marca.uecdn.es/claro/assets/multimedia/imagenes/2021/03/27/16168795045567.jpg"));
        esfera1.setMaterial(texturaEsferas);
        esfera2.setMaterial(texturaEsferas);
        esfera3.setMaterial(texturaEsferas);
        esfera4.setMaterial(texturaEsferas);
        esfera5.setMaterial(texturaEsferas);
        
        //------------CILINDROS------------//
        //Crear cilindro1 por medio de Cylinder
        Cylinder cilindro1 = new Cylinder(2, 110);
        cilindro1.setTranslateX(98);
        cilindro1.setTranslateY(103);
        cilindro1.setTranslateZ(-1);
        
        //Rotación del cilindro1
        cilindro1.setRotate(-38);

        //Color del cilindro1
        PhongMaterial colorCilindros = new PhongMaterial();
        colorCilindros.setDiffuseColor(Color.WHITE);//Blanco
        cilindro1.setMaterial(colorCilindros);
        
        //Crear cilindro2 por medio de Cylinder
        Cylinder cilindro2 = new Cylinder(2, 22);
        cilindro2.setTranslateX(148);
        cilindro2.setTranslateY(173);
        cilindro2.setTranslateZ(-1);
        
        //Rotación del cilindro2
        cilindro2.setRotate(-30);
        
        //Color del cilindro2 tomando valores del cilindro1
        cilindro2.setMaterial(colorCilindros);
        
        //Crear cilindro3 por medio de Cylinder
        Cylinder cilindro3 = new Cylinder(2, 110);
        cilindro3.setTranslateX(164);
        cilindro3.setTranslateY(273);
        cilindro3.setTranslateZ(-1);
        
        //Rotación del cilindro3
        cilindro3.setRotate(1);
        
        //Color del cilindro3 tomando valores del cilindro1
        cilindro3.setMaterial(colorCilindros);
        
        //Crear cilindro4 por medio de Cylinder
        Cylinder cilindro4 = new Cylinder(2, 225);
        cilindro4.setTranslateX(287);
        cilindro4.setTranslateY(241);
        cilindro4.setTranslateZ(-1);
        
        //Rotación del cilindro4
        cilindro4.setRotate(-72);
        
        //Color del cilindro4 tomando valores del cilindro1
        cilindro4.setMaterial(colorCilindros);
        
        //------------LUZ------------//
        PointLight luz = new PointLight();
        luz.setTranslateX(-350);
        luz.setTranslateY(-180);
        luz.setTranslateZ(-500);
        
        PointLight luzContraste = new PointLight();
        luzContraste.setTranslateX(450);
        luzContraste.setTranslateY(300);
        luzContraste.setTranslateZ(310);
      
        /* CREACIÓN DE LA VENTANA Y DE LOS CONTENEDORES PRINCIPALES */
        // Contenedores principales donde se alojarán todos los elementos
        Group rootFiguras = new Group(esfera1, esfera2, esfera3, esfera4, esfera5, 
                cilindro1, cilindro2, cilindro3, cilindro4, luz, luzContraste);
        Group rootRadioButton = new Group();
        Group rootPrincipal = new Group(rootFiguras, rootRadioButton);

        // Creación del área (scene) correspondiente al contenido que tendrá la ventana 
        // de 500 x 400 puntos, con color de fondo dado en rgb, indicando que el
        // elemento rootPrincipal va a ser el contenedor principal de este espacio
        Scene scene = new Scene(rootPrincipal, 500, 400, Color.rgb(28, 40, 51));//Azul muy oscuro

        // Se asocia la ventana (scene) al parámetro primaryStage (escenario
        // principal). El parámetro primaryStage se recibe en este método start
        primaryStage.setScene(scene);

        //Se aplica la cámara a las figuras
        PerspectiveCamera camara = new PerspectiveCamera();
        camara.setTranslateX(1);
        camara.translateZProperty().set(1);
        scene.setCamera(camara);
        primaryStage.setScene(scene);
        
        // Título que se aparecerá en la ventana
        primaryStage.setTitle("CONSTELACIÓN DE CÁNCER");

        // Orden para que se muestre la ventana
        primaryStage.show();
        
        //Animación de la constelación sin activar
        RotateTransition rotacion = new RotateTransition(Duration.seconds(1), camara);
        rotacion.setNode(rootFiguras);
        rotacion.setCycleCount(Animation.INDEFINITE);
        rotacion.setByAngle(40);
        rotacion.setAutoReverse(true);
        
        //Botones para realizar las acciones
        RadioButton rbTrasladar = new RadioButton("Trasladar constelación");
        RadioButton rbAnimacion1 = new RadioButton("Play animación");
        RadioButton rbAnimacion0 = new RadioButton("Pause animación");
        
        //Color del texto de los radioButton
        rbTrasladar.setTextFill(Color.WHITE);  
        rbAnimacion1.setTextFill(Color.WHITE); 
        rbAnimacion0.setTextFill(Color.WHITE); 
        
        //Ubicación de los RadioButton
        rbTrasladar.setLayoutX(5);
        rbTrasladar.setLayoutY(5);
        rbAnimacion1.setLayoutX(150);
        rbAnimacion1.setLayoutY(5);
        rbAnimacion0.setLayoutX(260);
        rbAnimacion0.setLayoutY(5);
        
        //Agregar los RadioButton al grupo
        rootRadioButton.getChildren().add(rbTrasladar);
        rootRadioButton.getChildren().add(rbAnimacion1);
        rootRadioButton.getChildren().add(rbAnimacion0);
        
        //Acción de cada RadioButton
        rbTrasladar.setOnAction(event -> {
            rbTrasladar.setSelected(true);
            Translate trasladar = new Translate();
            trasladar.setX(30);
            rootFiguras.getTransforms().addAll(trasladar);
        });
        rbAnimacion1.setOnAction(event -> {
            rbAnimacion1.setSelected(true);
            rbAnimacion0.setSelected(false);
            rotacion.play();
        });
        rbAnimacion0.setOnAction(event -> {
            rbAnimacion0.setSelected(true);
            rbAnimacion1.setSelected(false);
            rotacion.pause();
        });
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}