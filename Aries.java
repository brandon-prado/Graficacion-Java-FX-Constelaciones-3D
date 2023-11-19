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
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Figuras en 3 dimensiones de la constelación del zodiaco (ARIES).
 *
 * @author Brandon Alexis Prado Castro (19051178)
 * @version 1.0. 21.10.2021
 */

public class Aries extends Application {

    @Override
    public void start(Stage primaryStage) {
        //------------ESFERAS------------//
        //Crear esfera1 por medio de Sphere
        Sphere esfera1 = new Sphere(20);
        esfera1.setTranslateX(102);
        esfera1.setTranslateY(123);
        esfera1.setTranslateZ(0);

        //Crear esfera2 por medio de Sphere
        Sphere esfera2 = new Sphere(30);
        esfera2.setTranslateX(339);
        esfera2.setTranslateY(171);
        esfera2.setTranslateZ(0);

        //Crear esfera3 por medio de Sphere
        Sphere esfera3 = new Sphere(20);
        esfera3.setTranslateX(458);
        esfera3.setTranslateY(219);
        esfera3.setTranslateZ(0);

        //Crear esfera4 por medio de Sphere
        Sphere esfera4 = new Sphere(10);
        esfera4.setTranslateX(484);
        esfera4.setTranslateY(287);
        esfera4.setTranslateZ(0);

        //Texturas de todas las esferas
        PhongMaterial texturaEsferas = new PhongMaterial();
        texturaEsferas.setDiffuseMap(new Image("https://rsc.lavanguardia.com/img/horoscopo/horoscopo-aries.jpg"));
        esfera1.setMaterial(texturaEsferas);
        esfera2.setMaterial(texturaEsferas);
        esfera3.setMaterial(texturaEsferas);
        esfera4.setMaterial(texturaEsferas);

        //------------CILINDROS------------//
        //Crear cilindro1 por medio de Cylinder
        Cylinder cilindro1 = new Cylinder(2, 195);
        cilindro1.setTranslateX(213);
        cilindro1.setTranslateY(147);
        cilindro1.setTranslateZ(-1);

        //Rotación del cilindro1
        cilindro1.setRotate(-78);

        //Color del cilindro1
        PhongMaterial colorCilindros = new PhongMaterial();
        colorCilindros.setDiffuseColor(Color.WHITE);//Blanco
        cilindro1.setMaterial(colorCilindros);

        //Crear cilindro2 por medio de Cylinder
        Cylinder cilindro2 = new Cylinder(2, 82);
        cilindro2.setTranslateX(402);
        cilindro2.setTranslateY(196);
        cilindro2.setTranslateZ(-1);

        //Rotación del cilindro1
        cilindro2.setRotate(-70);

        //Color del cilindro2 tomado del cilindro1
        cilindro2.setMaterial(colorCilindros);

        //Crear cilindro3 por medio de Cylinder
        Cylinder cilindro3 = new Cylinder(2, 45);
        cilindro3.setTranslateX(473);
        cilindro3.setTranslateY(256);
        cilindro3.setTranslateZ(-1);

        //Rotación del cilindro1
        cilindro3.setRotate(-20);

        //Color del cilindro2 tomado del cilindro1
        cilindro3.setMaterial(colorCilindros);

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
        Group rootFiguras = new Group(esfera1, esfera2, esfera3, esfera4, cilindro1, cilindro2, cilindro3, luz, luzContraste);
        Group rootRadioButton = new Group();
        Group rootPrincipal = new Group(rootFiguras, rootRadioButton);
        
        // Creación del área (scene) correspondiente al contenido que tendrá la ventana 
        // de 550 x 400 puntos, con color de fondo dado en rgb, indicando que el
        // elemento rootPrincipal va a ser el contenedor principal de este espacio
        Scene scene = new Scene(rootPrincipal, 550, 400, Color.rgb(118, 215, 196));//Azul claro

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
        primaryStage.setTitle("CONSTELACIÓN DE ARIES");

        // Orden para que se muestre la ventana
        primaryStage.show();

        //Animación de la constelación sin activar
        RotateTransition rotacion = new RotateTransition(Duration.seconds(3), camara);
        rotacion.setNode(rootFiguras);
        rotacion.setCycleCount(Animation.INDEFINITE);
        rotacion.setFromAngle(2);
        rotacion.setToAngle(360);
        rotacion.setAxis(Rotate.Y_AXIS);
        rotacion.setAutoReverse(true);
        
        //RadioButton para realizar las acciones
        RadioButton rbRotar = new RadioButton("Rotar constelación");
        RadioButton rbAnimacion1 = new RadioButton("Play animación");
        RadioButton rbAnimacion0 = new RadioButton("Pause animación");
        
        //Ubicación de los RadioButton
        rbRotar.setLayoutX(5);
        rbRotar.setLayoutY(5);
        rbAnimacion1.setLayoutX(130);
        rbAnimacion1.setLayoutY(5);
        rbAnimacion0.setLayoutX(240);
        rbAnimacion0.setLayoutY(5);
        
        //Agregar los RadioButton al grupo
        rootRadioButton.getChildren().add(rbRotar);
        rootRadioButton.getChildren().add(rbAnimacion1);
        rootRadioButton.getChildren().add(rbAnimacion0);
        
        //Acción de cada RadioButton
        rbRotar.setOnAction(event -> {
            rbRotar.setSelected(true);
            Rotate rotar = new Rotate();
            rotar.setAngle(1);
            rootFiguras.getTransforms().addAll(rotar);
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