import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GamePrep extends JFrame implements KeyListener, ActionListener {

	//instances of our data classes (store position, etc here)
	private PlayerCharacter PlayerCharacter;
	
	//graphic elements
	private Container content;
	private JLabel character1Label, character2Label;
	private ImageIcon character1Image, character2Image;
	
	public GamePrep() {
		//set up PlayerCharacter
		PlayerCharacter = new PlayerCharacter();
		PlayerCharacter.setX(0);
		PlayerCharacter.setY(200);
		PlayerCharacter.setWidth(100);
		PlayerCharacter.setHeight(200);
		PlayerCharacter.setImg("char1.jpg");
		
		//set up screen
		setSize(GameProperties.SCREEN_WIDTH, GameProperties.SCREEN_HEIGHT);
		content = getContentPane();
		content.setBackground(Color.gray);
		setLayout(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
