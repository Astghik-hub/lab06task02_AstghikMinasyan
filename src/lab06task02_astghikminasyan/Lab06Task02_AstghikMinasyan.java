/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab06task02_astghikminasyan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Git URL: 
 * @author Astghik Minasyan
 */
public class Lab06Task02_AstghikMinasyan extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Constants for the scene size
        final double SCENE_WIDTH = 520.0;
        final double SCENE_HEIGHT = 520.0;
        
        // Create the ground rectangle
        Rectangle ground = new Rectangle(SCENE_WIDTH, 80);
        ground.setFill(Color.GREEN);
        ground.setX(0);
        ground.setY(520 - 80);
        
        // Create the step rectangle
        Rectangle step = new Rectangle(520 / 2, 15);
        step.setFill(Color.BEIGE);
        step.setX(520 / 4);
        step.setY(520 - 80);
        
        // Create the house rectangle
        Rectangle house = new Rectangle(520 / 2, 210);
        house.setFill(Color.LIGHTGRAY);
        house.setStroke(Color.BLACK);
        house.setX(520 / 4);
        house.setY(520 - 210 - 80);
        
        // Create the roof triangle
        Polygon roof = new Polygon(520 / 4, 520 - 210 - 80, // left corner
                520 / 2, 100, // top corner
                390, 520 - 210 - 80 // right corner
        );
        roof.setFill(Color.RED);
        
        // Create chimney rectangle
        Rectangle chimney = new Rectangle(25, 80);
        chimney.setFill(Color.GRAY);
        chimney.setX(220);
        chimney.setY(120);
        
        // Create door rectangle
        Rectangle door = new Rectangle(50, 210 / 2);
        door.setFill(Color.SADDLEBROWN);
        door.setX(520 / 2);
        door.setY(520 - 80 - (210 / 2));
        
        // Creete the window rectangles
        Rectangle window1 = new Rectangle(60, 60);
        Rectangle window2 = new Rectangle(60,60);
        window1.setFill(Color.LIGHTBLUE);
        window2.setFill(Color.LIGHTBLUE);
        
        // Add the nodes to a Pane here.
        Pane root = new Pane();
        root.getChildren().add(ground);
        root.getChildren().add(step);
        root.getChildren().add(house);
        root.getChildren().add(roof);
        root.getChildren().add(chimney);
        root.getChildren().add(door);
        
        // Create a Scene with the Pane as the root node, and display it here.
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
        stage.setScene(scene);
        stage.setTitle("House with Window Panes");
        stage.show();
    }
    
}
