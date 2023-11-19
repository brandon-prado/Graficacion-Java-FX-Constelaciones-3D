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
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Figuras en 3 dimensiones de la constelación del zodiaco (CAPRICORNIO).
 *
 * @author Brandon Alexis Prado Castro (19051178)
 * @version 1.0. 22.10.2021
 */

public class Capricornio extends Application {

    @Override
    public void start(Stage primaryStage) {
        //------------ESFERAS------------//
        //Crear esfera1 por medio de Sphere
        Sphere esfera1 = new Sphere(25);
        esfera1.setTranslateX(463);
        esfera1.setTranslateY(64);
        esfera1.setTranslateZ(0);

        //Crear esfera2 por medio de Sphere
        Sphere esfera2 = new Sphere(15);
        esfera2.setTranslateX(463);
        esfera2.setTranslateY(118);
        esfera2.setTranslateZ(0);

        //Crear esfera3 por medio de Sphere
        Sphere esfera3 = new Sphere(15);
        esfera3.setTranslateX(361);
        esfera3.setTranslateY(285);
        esfera3.setTranslateZ(0);

        //Crear esfera4 por medio de Sphere
        Sphere esfera4 = new Sphere(15);
        esfera4.setTranslateX(258);
        esfera4.setTranslateY(350);
        esfera4.setTranslateZ(0);

        //Crear esfera5 por medio de Sphere
        Sphere esfera5 = new Sphere(10);
        esfera5.setTranslateX(191);
        esfera5.setTranslateY(363);
        esfera5.setTranslateZ(0);

        //Crear esfera6 por medio de Sphere
        Sphere esfera6 = new Sphere(25);
        esfera6.setTranslateX(121);
        esfera6.setTranslateY(415);
        esfera6.setTranslateZ(0);

        //Crear esfera7 por medio de Sphere
        Sphere esfera7 = new Sphere(15);
        esfera7.setTranslateX(257);
        esfera7.setTranslateY(408);
        esfera7.setTranslateZ(0);

        //Crear esfera8 por medio de Sphere
        Sphere esfera8 = new Sphere(15);
        esfera8.setTranslateX(334);
        esfera8.setTranslateY(436);
        esfera8.setTranslateZ(0);

        //Crear esfera9 por medio de Sphere
        Sphere esfera9 = new Sphere(10);
        esfera9.setTranslateX(407);
        esfera9.setTranslateY(411);
        esfera9.setTranslateZ(0);

        //Crear esfera10 por medio de Sphere
        Sphere esfera10 = new Sphere(25);
        esfera10.setTranslateX(467);
        esfera10.setTranslateY(402);
        esfera10.setTranslateZ(0);

        //Crear esfera11 por medio de Sphere
        Sphere esfera11 = new Sphere(15);
        esfera11.setTranslateX(489);
        esfera11.setTranslateY(341);
        esfera11.setTranslateZ(0);

        //Texturas de todas las esferas
        PhongMaterial texturaEsferas = new PhongMaterial();
        texturaEsferas.setDiffuseMap(new Image("https://estaticos-cdn.prensaiberica.es/clip/8c7b66df-03ce-4aa2-b4b1-46b45ba98d39_16-9-discover-aspect-ratio_default_0.jpg"));
        esfera1.setMaterial(texturaEsferas);
        esfera2.setMaterial(texturaEsferas);
        esfera3.setMaterial(texturaEsferas);
        esfera4.setMaterial(texturaEsferas);
        esfera5.setMaterial(texturaEsferas);
        esfera6.setMaterial(texturaEsferas);
        esfera7.setMaterial(texturaEsferas);
        esfera8.setMaterial(texturaEsferas);
        esfera9.setMaterial(texturaEsferas);
        esfera10.setMaterial(texturaEsferas);
        esfera11.setMaterial(texturaEsferas);

        //------------CILINDROS------------//
        //Crear cilindro1 por medio de Cylinder
        Cylinder cilindro1 = new Cylinder(2, 16);
        cilindro1.setTranslateX(462);
        cilindro1.setTranslateY(98);
        cilindro1.setTranslateZ(-1);

        //Rotación del cilindro1
        cilindro1.setRotate(0);

        //Color del cilindro1
        PhongMaterial colorCilindros = new PhongMaterial();
        colorCilindros.setDiffuseColor(Color.WHITE);//Blanco
        cilindro1.setMaterial(colorCilindros);

        //Crear cilindro2 por medio de Cylinder
        Cylinder cilindro2 = new Cylinder(2, 167);
        cilindro2.setTranslateX(412);
        cilindro2.setTranslateY(203);
        cilindro2.setTranslateZ(-1);

        //Rotación del cilindro2
        cilindro2.setRotate(30);

        //Color del cilindro2 tomando valores del cilindro1
        cilindro2.setMaterial(colorCilindros);

        //Crear cilindro3 por medio de Cylinder
        Cylinder cilindro3 = new Cylinder(2, 94);
        cilindro3.setTranslateX(310);
        cilindro3.setTranslateY(319);
        cilindro3.setTranslateZ(-1);

        //Rotación del cilindro3
        cilindro3.setRotate(55);

        //Color del cilindro3 tomando valores del cilindro1
        cilindro3.setMaterial(colorCilindros);

        //Crear cilindro4 por medio de Cylinder
        Cylinder cilindro4 = new Cylinder(2, 45);
        cilindro4.setTranslateX(222);
        cilindro4.setTranslateY(359);
        cilindro4.setTranslateZ(-1);

        //Rotación del cilindro4
        cilindro4.setRotate(77);

        //Color del cilindro4 tomando valores del cilindro1
        cilindro4.setMaterial(colorCilindros);

        //Crear cilindro5 por medio de Cylinder
        Cylinder cilindro5 = new Cylinder(2, 53);
        cilindro5.setTranslateX(161);
        cilindro5.setTranslateY(385);
        cilindro5.setTranslateZ(-1);

        //Rotación del cilindro5
        cilindro5.setRotate(50);

        //Color del cilindro5 tomando valores del cilindro1
        cilindro5.setMaterial(colorCilindros);

        //Crear cilindro6 por medio de Cylinder
        Cylinder cilindro6 = new Cylinder(2, 96);
        cilindro6.setTranslateX(195);
        cilindro6.setTranslateY(413);
        cilindro6.setTranslateZ(-1);

        //Rotación del cilindro6
        cilindro6.setRotate(90);

        //Color del cilindro6 tomando valores del cilindro1
        cilindro6.setMaterial(colorCilindros);

        //Crear cilindro7 por medio de Cylinder
        Cylinder cilindro7 = new Cylinder(2, 55);
        cilindro7.setTranslateX(295);
        cilindro7.setTranslateY(424);
        cilindro7.setTranslateZ(-1);

        //Rotación del cilindro7
        cilindro7.setRotate(-70);

        //Color del cilindro7 tomando valores del cilindro1
        cilindro7.setMaterial(colorCilindros);

        //Crear cilindro8 por medio de Cylinder
        Cylinder cilindro8 = new Cylinder(2, 53);
        cilindro8.setTranslateX(373);
        cilindro8.setTranslateY(424);
        cilindro8.setTranslateZ(-1);

        //Rotación del cilindro8
        cilindro8.setRotate(-110);

        //Color del cilindro8 tomando valores del cilindro1
        cilindro8.setMaterial(colorCilindros);

        //Crear cilindro9 por medio de Cylinder
        Cylinder cilindro9 = new Cylinder(2, 26);
        cilindro9.setTranslateX(429);
        cilindro9.setTranslateY(408);
        cilindro9.setTranslateZ(-1);

        //Rotación del cilindro9
        cilindro9.setRotate(-100);

        //Color del cilindro9 tomando valores del cilindro1
        cilindro9.setMaterial(colorCilindros);

        //Crear cilindro10 por medio de Cylinder
        Cylinder cilindro10 = new Cylinder(2, 26);
        cilindro10.setTranslateX(479);
        cilindro10.setTranslateY(367);
        cilindro10.setTranslateZ(-1);

        //Rotación del cilindro10
        cilindro10.setRotate(20);

        //Color del cilindro10 tomando valores del cilindro1
        cilindro10.setMaterial(colorCilindros);

        //Crear cilindro11 por medio de Cylinder
        Cylinder cilindro11 = new Cylinder(2, 195);
        cilindro11.setTranslateX(476);
        cilindro11.setTranslateY(230);
        cilindro11.setTranslateZ(-1);

        //Rotación del cilindro11
        cilindro11.setRotate(-6);

        //Color del cilindro11 tomando valores del cilindro1
        cilindro11.setMaterial(colorCilindros);

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
        Group rootFiguras = new Group(esfera1, esfera2, esfera3, esfera4, esfera5, esfera6,
                esfera7, esfera8, esfera9, esfera10, esfera11, cilindro1, cilindro2,
                cilindro3, cilindro4, cilindro5, cilindro6, cilindro7, cilindro8,
                cilindro9, cilindro10, cilindro11, luz, luzContraste);
        Group rootRadioButton = new Group();
        Group rootPrincipal = new Group(rootFiguras, rootRadioButton);

        // Creación del área (scene) correspondiente al contenido que tendrá la ventana 
        // de 600 x 500 puntos, con color de fondo dado en rgb, indicando que el
        // elemento rootPrincipal va a ser el contenedor principal de este espacio
        Scene scene = new Scene(rootPrincipal, 600, 500, Color.rgb(148, 49, 38));//Rojo

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
        primaryStage.setTitle("CONSTELACIÓN DE CAPRICORNIO");

        // Orden para que se muestre la ventana
        primaryStage.show();

        //Animación de la constelación sin activar
        RotateTransition rotacion = new RotateTransition(Duration.seconds(1), camara);
        rotacion.setNode(rootFiguras);
        rotacion.setCycleCount(Animation.INDEFINITE);
        rotacion.setByAngle(-60);
        rotacion.setAutoReverse(true);
        rotacion.setAxis(Rotate.Y_AXIS);

        //Botones para realizar las acciones
        RadioButton rbEscalar = new RadioButton("Escalar constelación");
        RadioButton rbAnimacion1 = new RadioButton("Play animación");
        RadioButton rbAnimacion0 = new RadioButton("Pause animación");

        //Color del texto de los radioButton
        rbEscalar.setTextFill(Color.WHITE);
        rbAnimacion1.setTextFill(Color.WHITE);
        rbAnimacion0.setTextFill(Color.WHITE);

        //Ubicación de los RadioButton
        rbEscalar.setLayoutX(5);
        rbEscalar.setLayoutY(5);
        rbAnimacion1.setLayoutX(145);
        rbAnimacion1.setLayoutY(5);
        rbAnimacion0.setLayoutX(255);
        rbAnimacion0.setLayoutY(5);

        //Agregar los RadioButton al grupo
        rootRadioButton.getChildren().add(rbEscalar);
        rootRadioButton.getChildren().add(rbAnimacion1);
        rootRadioButton.getChildren().add(rbAnimacion0);

        //Acción de cada RadioButton
        rbEscalar.setOnAction(event -> {
            rbEscalar.setSelected(true);
            Scale escalar = new Scale();
            escalar.setX(0.9);
            escalar.setY(0.9);
            rootFiguras.getTransforms().addAll(escalar);
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
