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
import javafx.scene.transform.Shear;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 * Figuras en 3 dimensiones de la constelación del zodiaco (LEO).
 *
 * @author Brandon Alexis Prado Castro (19051178)
 * @version 1.0. 21.10.2021
 */

public class Leo extends Application {

    @Override
    public void start(Stage primaryStage) {
        //------------ESFERAS------------//
        //Crear esfera1 por medio de Sphere
        Sphere esfera1 = new Sphere(20);
        esfera1.setTranslateX(395);
        esfera1.setTranslateY(51);
        esfera1.setTranslateZ(0);
        
        //Crear esfera2 por medio de Sphere
        Sphere esfera2 = new Sphere(15);
        esfera2.setTranslateX(439);
        esfera2.setTranslateY(75);
        esfera2.setTranslateZ(0);
        
        //Crear esfera3 por medio de Sphere
        Sphere esfera3 = new Sphere(15);
        esfera3.setTranslateX(340);
        esfera3.setTranslateY(130);
        esfera3.setTranslateZ(0);
        
        //Crear esfera4 por medio de Sphere
        Sphere esfera4 = new Sphere(20);
        esfera4.setTranslateX(333);
        esfera4.setTranslateY(181);
        esfera4.setTranslateZ(0);
        
        //Crear esfera5 por medio de Sphere
        Sphere esfera5 = new Sphere(15);
        esfera5.setTranslateX(403);
        esfera5.setTranslateY(208);
        esfera5.setTranslateZ(0);
        
        //Crear esfera6 por medio de Sphere
        Sphere esfera6 = new Sphere(15);
        esfera6.setTranslateX(180);
        esfera6.setTranslateY(223);
        esfera6.setTranslateZ(0);
        
        //Crear esfera7 por medio de Sphere
        Sphere esfera7 = new Sphere(25);
        esfera7.setTranslateX(79);
        esfera7.setTranslateY(331);
        esfera7.setTranslateZ(0);
        
        //Crear esfera8 por medio de Sphere
        Sphere esfera8 = new Sphere(15);
        esfera8.setTranslateX(188);
        esfera8.setTranslateY(303);
        esfera8.setTranslateZ(0);
        
        //Crear esfera9 por medio de Sphere
        Sphere esfera9 = new Sphere(25);
        esfera9.setTranslateX(407);
        esfera9.setTranslateY(283);
        esfera9.setTranslateZ(0);
    
        //Texturas de todas las esferas
        PhongMaterial texturaEsferas = new PhongMaterial();
        texturaEsferas.setDiffuseMap(new Image("https://st1.uvnimg.com/6b/2a/3bbe9b7342819b2ebaa2f71d8740/leo-zellagro-diario.jpg"));
        esfera1.setMaterial(texturaEsferas);
        esfera2.setMaterial(texturaEsferas);
        esfera3.setMaterial(texturaEsferas);
        esfera4.setMaterial(texturaEsferas);
        esfera5.setMaterial(texturaEsferas);
        esfera6.setMaterial(texturaEsferas);
        esfera7.setMaterial(texturaEsferas);
        esfera8.setMaterial(texturaEsferas);
        esfera9.setMaterial(texturaEsferas);
        
        //------------CILINDROS------------//
        //Crear cilindro1 por medio de Cylinder
        Cylinder cilindro1 = new Cylinder(2, 17);
        cilindro1.setTranslateX(417);
        cilindro1.setTranslateY(66);
        cilindro1.setTranslateZ(-1);
        
        //Rotación del cilindro1
        cilindro1.setRotate(-60);

        //Color del cilindro1
        PhongMaterial colorCilindros = new PhongMaterial();
        colorCilindros.setDiffuseColor(Color.WHITE);//Blanco
        cilindro1.setMaterial(colorCilindros);
        
        //Crear cilindro2 por medio de Cylinder
        Cylinder cilindro2 = new Cylinder(2, 65);
        cilindro2.setTranslateX(360);
        cilindro2.setTranslateY(90);
        cilindro2.setTranslateZ(-1);
        
        //Rotación del cilindro2
        cilindro2.setRotate(35);
        
        //Color del cilindro2 tomando valores del cilindro1
        cilindro2.setMaterial(colorCilindros);
        
        //Crear cilindro3 por medio de Cylinder
        Cylinder cilindro3 = new Cylinder(2, 19);
        cilindro3.setTranslateX(338);
        cilindro3.setTranslateY(154);
        cilindro3.setTranslateZ(-1);
        
        //Rotación del cilindro3
        cilindro3.setRotate(0);
        
        //Color del cilindro3 tomando valores del cilindro1
        cilindro3.setMaterial(colorCilindros);
        
        //Crear cilindro4 por medio de Cylinder
        Cylinder cilindro4 = new Cylinder(2, 124);
        cilindro4.setTranslateX(253);
        cilindro4.setTranslateY(200);
        cilindro4.setTranslateZ(-1);
        
        //Rotación del cilindro4
        cilindro4.setRotate(75);
        
        //Color del cilindro4 tomando valores del cilindro1
        cilindro4.setMaterial(colorCilindros);
        
        //Crear cilindro5 por medio de Cylinder
        Cylinder cilindro5 = new Cylinder(2, 110);
        cilindro5.setTranslateX(130);
        cilindro5.setTranslateY(270);
        cilindro5.setTranslateZ(-1);
        
        //Rotación del cilindro5
        cilindro5.setRotate(45);
        
        //Color del cilindro5 tomando valores del cilindro1
        cilindro5.setMaterial(colorCilindros);
        
        //Crear cilindro6 por medio de Cylinder
        Cylinder cilindro6 = new Cylinder(2, 72);
        cilindro6.setTranslateX(138);
        cilindro6.setTranslateY(315);
        cilindro6.setTranslateZ(-1);
        
        //Rotación del cilindro6
        cilindro6.setRotate(-105);
        
        //Color del cilindro6 tomando valores del cilindro1
        cilindro6.setMaterial(colorCilindros);
        
        //Crear cilindro7 por medio de Cylinder
        Cylinder cilindro7 = new Cylinder(2, 180 /*, 9000*/);
        cilindro7.setTranslateX(292);
        cilindro7.setTranslateY(295);
        cilindro7.setTranslateZ(-1);
        
        //Rotación del cilindro7
        cilindro7.setRotate(-95);
        
        //Color del cilindro7 tomando valores del cilindro1
        cilindro7.setMaterial(colorCilindros);
        
        //Crear cilindro8 por medio de Cylinder
        Cylinder cilindro8 = new Cylinder(2, 36);
        cilindro8.setTranslateX(404);
        cilindro8.setTranslateY(240);
        cilindro8.setTranslateZ(-1);
        
        //Rotación del cilindro8
        cilindro8.setRotate(-10);
        
        //Color del cilindro8 tomando valores del cilindro1
        cilindro8.setMaterial(colorCilindros);
        
        //Crear cilindro9 por medio de Cylinder
        Cylinder cilindro9 = new Cylinder(2, 42);
        cilindro9.setTranslateX(369);
        cilindro9.setTranslateY(198);
        cilindro9.setTranslateZ(-1);
        
        //Rotación del cilindro9
        cilindro9.setRotate(120);
        
        //Color del cilindro9 tomando valores del cilindro1
        cilindro9.setMaterial(colorCilindros);
        
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
        Group rootFiguras = new Group(esfera1, esfera2, esfera3, esfera4, esfera5, esfera6, esfera7, esfera8, esfera9, 
                cilindro1, cilindro2, cilindro3, cilindro4, cilindro5, cilindro6, cilindro7, cilindro8,
                cilindro9, luz, luzContraste);
        Group rootRadioButton = new Group();
        Group rootPrincipal = new Group(rootFiguras, rootRadioButton);

        // Creación del área (scene) correspondiente al contenido que tendrá la ventana 
        // de 500 x 400 puntos, con color de fondo dado en rgb, indicando que el
        // elemento rootPrincipal va a ser el contenedor principal de este espacio
        Scene scene = new Scene(rootPrincipal, 500, 400, Color.rgb(243, 156, 18));//Naranja

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
        primaryStage.setTitle("CONSTELACIÓN DE LEO");

        // Orden para que se muestre la ventana
        primaryStage.show();
        
        //Animación de la constelación sin activar
        RotateTransition rotacion = new RotateTransition(Duration.seconds(3), camara);
        rotacion.setNode(rootFiguras);
        rotacion.setCycleCount(Animation.INDEFINITE);
        rotacion.setFromAngle(2);
        rotacion.setToAngle(360);
        rotacion.setAutoReverse(true);
        rotacion.setAxis(Rotate.X_AXIS);
        
        //Botones para realizar las acciones
        RadioButton rbSesgar = new RadioButton("Sesgar constelación");
        RadioButton rbAnimacion1 = new RadioButton("Play animación");
        RadioButton rbAnimacion0 = new RadioButton("Pause animación"); 
        
        //Ubicación de los RadioButton
        rbSesgar.setLayoutX(5);
        rbSesgar.setLayoutY(5);
        rbAnimacion1.setLayoutX(150);
        rbAnimacion1.setLayoutY(5);
        rbAnimacion0.setLayoutX(260);
        rbAnimacion0.setLayoutY(5);
        
        //Agregar los RadioButton al grupo
        rootRadioButton.getChildren().add(rbSesgar);
        rootRadioButton.getChildren().add(rbAnimacion1);
        rootRadioButton.getChildren().add(rbAnimacion0);
        
        //Acción de cada RadioButton
        rbSesgar.setOnAction(event -> {
            rbSesgar.setSelected(true);
            Shear shear = new Shear();
            shear.setPivotX(0);
            shear.setPivotY(0);
            shear.setX(0.05);
            shear.setY(0.05);
            rootFiguras.getTransforms().addAll(shear);
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