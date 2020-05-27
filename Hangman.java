package HangmanGame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Hangman extends Application {
	
	//Create pane
	Pane pane = new Pane();

	Text text = new Text();
	@Override
	public void start(Stage primaryStage) throws Exception{
		
		//Create gallow and rope 
		Line gallow1 = new Line(25, 25, 200, 25);
		gallow1.setStroke(Color.BLACK);
		gallow1.setStrokeWidth(3);
		
		Line gallow2 = new Line(25, 25, 25, 300);
		gallow2.setStroke(Color.BLACK);
		gallow2.setStrokeWidth(3);
		
		Line gallow3 = new Line(300, 300, 25, 300);
		gallow3.setStroke(Color.BLACK);
		gallow3.setStrokeWidth(3);
		
		Line rope = new Line(200, 25, 200, 75);
		rope.setStroke(Color.BROWN);
		rope.setStrokeWidth(3);
		
		//Create man
		Ellipse head = new Ellipse(200, 112, 35, 35);
		head.setStroke(Color.BLACK);
		head.setFill(Color.YELLOW);
		head.setStrokeWidth(5);

		Line body = new Line(200, 200, 200, 150);
		body.setStroke(Color.GREEN);
		body.setStrokeWidth(5);

		Line leftArm = new Line(150, 225, 200, 175);
		leftArm.setStroke(Color.BLACK);
		leftArm.setStrokeWidth(5);

		Line rightArm = new Line(250, 225, 200, 175);
		rightArm.setStroke(Color.BLACK);
		rightArm.setStrokeWidth(5);

		Line leftLeg = new Line(200, 200, 175, 275);
		leftLeg.setStroke(Color.BLUE);
		leftLeg.setStrokeWidth(5);

		Line rightLeg = new Line(200, 200, 225, 275);
		rightLeg.setStroke(Color.BLUE);
		rightLeg.setStrokeWidth(5);
		
		//Create labels
		Label labelEnter = new Label("Enter a letter: ");
		labelEnter.setLayoutX(50);
		labelEnter.setLayoutY(350);
		
		Label labelGuessed = new Label("Word: ");
		labelGuessed.setLayoutX(50);
		labelGuessed.setLayoutY(400);
		
		//Create textfield object
		//FIX X AXIS
		TextField textfield = new TextField();
		textfield.setLayoutX(140);
		textfield.setLayoutY(350);
		
		//label that shows that you have lost
		Label Loser = new Label("You killed the man!");
		Loser.setLayoutX(140);
		Loser.setLayoutY(450);
		Loser.setMaxHeight(10);
		Loser.setMaxWidth(500);
		Loser.setVisible(false);
		
		//label that shows that you have won
		Label Winner = new Label("Congratulations, you win!");
		Winner.setLayoutX(140);
		Winner.setLayoutY(450);
		Winner.setMaxHeight(10);
		Winner.setMaxWidth(500);
		Winner.setVisible(false);
		
		//Create label for letter H
		Label H = new Label("H");
		H.setLayoutX(100);
		H.setLayoutY(400);
		H.setVisible(false);
		
		//Create label for letter h
		Label h = new Label("h");
		h.setLayoutX(100);
		h.setLayoutY(400);
		h.setVisible(false);
		
		//Create label for letter E
		Label E = new Label("E");
		E.setLayoutX(130);
		E.setLayoutY(400);
		E.setVisible(false);
		
		//Create label for letter e
		Label e = new Label("e");
		e.setLayoutX(130);
		e.setLayoutY(400);
		e.setVisible(false);
		
		//Create label for letter L
		Label L = new Label("L");
		L.setLayoutX(160);
		L.setLayoutY(400);
		L.setVisible(false);
		
		//Create label for letter L2
		Label L2= new Label("L");
		L2.setLayoutX(190);
		L2.setLayoutY(400);
		L2.setVisible(false);
		
		//Create label for letter l
		Label l = new Label("l");
		l.setLayoutX(160);
		l.setLayoutY(400);
		l.setVisible(false);
		
		//Create label for letter l2
		Label l2 = new Label("l");
		l2.setLayoutX(190);
		l2.setLayoutY(400);
		l2.setVisible(false);
		
		//Create label for letter O
		Label O = new Label("O");
		O.setLayoutX(220);
		O.setLayoutY(400);
		O.setVisible(false);
		
		//Create label for o
		Label o = new Label("o");
		o.setLayoutX(220);
		o.setLayoutY(400);
		o.setVisible(false);
		//Key EventHandler
		textfield.setOnAction(new EventHandler<ActionEvent>(){
			//.getText().equals(args); will be used
			//Create attempt variable to keep track of errors
			int attempt = 1;
			@Override
			public void handle(ActionEvent case1) {
				
				//if else statements
				if (textfield.getText().equals("H")){
					//Clear text field once a letter has been entered
					textfield.clear();
					//setting the isibility to true
					H.setVisible(true);
				}
				
				else if (textfield.getText().equals("h")) {	
					//Clear text field once a letter has been entered
					textfield.clear();
					//setting the isibility to true
					h.setVisible(true);
				}
				
				else if (textfield.getText().equals("E")) {
					//Clear text field once a letter has been entered
					textfield.clear();
					//setting the isibility to true
					E.setVisible(true);
				}
				
				else if (textfield.getText().equals("e")) {
					//Clear text field once a letter has been entered
					textfield.clear();
					//setting the isibility to true
					e.setVisible(true);
				}
				
				else if (textfield.getText().equals("L")) {
					//Clear text field once a letter has been entered
					textfield.clear();
					//setting the visibility to true
					L.setVisible(true);
					L2.setVisible(true);
				}
				
				else if (textfield.getText().equals("l")) {
					//Clear text field once a letter has been entered
					textfield.clear();
					//setting the visibility to true
					l.setVisible(true);
					l2.setVisible(true);
				}
			
				else if (textfield.getText().equals("O")) {
					//Clear text field once a letter has been entered
					textfield.clear();
					//setting the visibility to true
					O.setVisible(true);
					//Display winning message
					Winner.setVisible(true);
				}
			
				else if (textfield.getText().equals("o")) {
					//Clear text field once a letter has been entered
					textfield.clear();
					//setting the visibility to true
					o.setVisible(true);
					//Display winning message
					Winner.setVisible(true);
				}
				//provide 6 fail attempts
				
				else if(attempt == 1){
					pane.getChildren().add(head);
					attempt++;
					//Clear text field once a letter has been entered
					textfield.clear();
				}
				
				else if(attempt == 2){
					pane.getChildren().add(body);
					attempt++;
					//Clear text field once a letter has been entered
					textfield.clear();
				}
				
				else if(attempt == 3){
					pane.getChildren().add(leftArm);
					attempt++;
					//Clear text field once a letter has been entered
					textfield.clear();
				}
				
				else if (attempt == 4) {
					pane.getChildren().add(rightArm);
					attempt++;
					//Clear text field once a letter has been entered
					textfield.clear();
				}
				
				else if (attempt == 5) {
					pane.getChildren().add(leftLeg);
					attempt++;
					//Clear text field once a letter has been entered
					textfield.clear();
				}
				else if (attempt == 6){
					pane.getChildren().add(rightLeg);
					attempt++;
					//Clear text field once a letter has been entered
					textfield.clear();
					Loser.setVisible(true);
				}
			
			}
			
		});
		
		//Presets gallows, rope, labels, and textfield
		pane.getChildren().addAll(gallow1, gallow2, gallow3, rope, labelEnter, labelGuessed, textfield, Loser, Winner,H, h, E, e, L, L2, l, l2, O, o);
		
		Scene scene = new Scene(pane, 350, 500);
		
		//Create title of page
		primaryStage.setTitle("Hangman Game");
		//add the scene to the stage
		primaryStage.setScene(scene);
		//show the contents of the stage 
		primaryStage.show();
		}
}



