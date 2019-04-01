import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Client extends JFrame{
	private final int NUM_INVADERS = 25;
	private final int COLS = 5;
	private final int ROWS = 5;

	public Client(){
		super("Invaders");
		Container c = getContentPane();
		c.setLayout(new GridLayout(ROWS,COLS));
		for(int i = 0; i < NUM_INVADERS; i++){
			c.add(new Invader("Invader " + i));
		}
		setSize(500,500);
		show();
	}

	public static void main(String[] args){
		Client client = new Client();
	}
}

