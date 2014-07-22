import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class simpleGUI extends JFrame {
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	
	private JLabel lengthL, widthL, areaL, perimeterL;
	private JTextField lengthTF, widthTF, areaTF, perimeterTF;
	private JButton calculateB, exitB;
	
	//Button handlers:
	private CalculateButtonHandler cbHandler;
	private ExitButtonHandler ebHandler;
	
	public simpleGUI(){
		//instantiate the labels:
		lengthL = new JLabel("Enter the length: ", SwingConstants.RIGHT);
		widthL = new JLabel("Enter the width: ", SwingConstants.RIGHT);
		areaL = new JLabel("Area: ", SwingConstants.RIGHT);
		perimeterL = new JLabel("Perimeter: ", SwingConstants.RIGHT);
		
		//Text fields next
		lengthTF = new JTextField(10);
		widthTF = new JTextField(10);
		areaTF = new JTextField(10);
		perimeterTF = new JTextField(10);
		
		//Buttons too:
		calculateB = new JButton("Calculate");
		cbHandler = new CalculateButtonHandler();
		calculateB.addActionListener(cbHandler);
		exitB = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);
		
		//set the windows title
		setTitle("Sample Title: Area of a Rectangle");
		//get the content pane (CP)
		Container pane = getContentPane();
		//set the layout
		pane.setLayout(new GridLayout (4, 2));
		
		pane.add(lengthL);
		pane.add(lengthTF);
		pane.add(widthL);
		pane.add(widthTF);
		pane.add(areaL);
		pane.add(areaTF);
		pane.add(calculateB);
		pane.add(exitB);
		
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}
	
	private class CalculateButtonHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			double width, length, area;
			
			length = Double.parseDouble(lengthTF.getText());
			width = Double.parseDouble(widthTF.getText());
			area = length * width;
			
			areaTF.setText("" + area);
		}
		
	}
	
	public class ExitButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
	
	public static void main(String[] args){
		
		simpleGUI rectObj = new simpleGUI();
		
	}
		
}
