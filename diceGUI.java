import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * A simple GUI I made that simulates a dice roll
 * I made it so that I could roll dice when I
 * am playing board games with my friends
*/

//extend the JFrame for the GUI
public class diceGUI extends JFrame {
	
	//make the dimensions of the GUI
	private static final int WIDTH = 525;
	private static final int HEIGHT = 300;
	
	//Make the JLabel's for the answer and diceType
	private JLabel diceTypeL, answerL;
	//Make the text fields for the diceType and the answer
	private JTextField diceTypeTF, answerTF;
	//Make the roll and exit buttons
	private JButton roll, exitB;
	
	//make the button handlers for calculate and exit buttons
	private rollButtonHandler cbRoll;
	private ExitButtonHandler ebRoll;
	
	//This class makes the GUI
	public diceGUI(){
		//initialize the labels
		diceTypeL = new JLabel("Enter the number dice you would like to roll: ", SwingConstants.RIGHT);
		
		//text fields
		diceTypeTF = new JTextField(10);
		answerTF = new JTextField(10);
		
		//Buttons too:
		roll = new JButton("Roll");
		cbRoll = new rollButtonHandler();
		roll.addActionListener(cbRoll);
		exitB = new JButton("Exit");
		ebRoll = new ExitButtonHandler();
		exitB.addActionListener(ebRoll);
		
		//set the title
		setTitle("DnD Dice Roller");
		
		//make the container for the GUI
		Container pane = getContentPane();
		
		//set the layout
		pane.setLayout(new GridLayout (3, 2));
		
		//add in the container elements
		pane.add(diceTypeL);
		pane.add(diceTypeTF);
		pane.add(roll);
		pane.add(answerTF);
		pane.add(exitB);
		
		//set the container size to the width and height constants
		setSize(WIDTH, HEIGHT);
		//set visible to true so that it always runs
		setVisible(true);
		//make it exit on close
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	//the roll button handler takes care of user input
	//it also does the dice rolling and outputs it to the GUI
	//To start, it implements the Action Listener
	private class rollButtonHandler implements ActionListener{
		
		//This function takes in the user action and outputs the dice roll
		public void actionPerformed(ActionEvent e){
			//make doubles for the type of dice rolled and the number that the dice rolls
			double diceType, answer;
			
			//create the random number variable
			Random randomNumber = new Random();
			
			//set the dice type to the diceTypeTF variable to get the info
			//from the user in the GUI
			diceType = Double.parseDouble(diceTypeTF.getText());
			
			//make an int that contains the random number
			//it takes in the diceType from the user in the GUI,
			//and uses that number as the limit for the random number generated
			int roll = randomNumber.nextInt((int) diceType) + 1;
			//print the roll out to the user
			answerTF.setText("You rolled a " + roll);
		}
	}
	
	//this class handles the exit button
	public class ExitButtonHandler implements ActionListener{
		//when there is an action performed (a click)
		public void actionPerformed(ActionEvent e){
			//exit the program
			System.exit(0);
		}
	}
	
	//the main class
	public static void main(String[] args){
		
		//create a diceGUI object that runs the GUI
		diceGUI rollObj = new diceGUI();
		
	}
		
	
}
