 package snake;

 import javax.swing.JFrame;
 
public class GameFrame extends JFrame{
	GameFrame(){
		
		GamePanel panel = new GamePanel();
		
		this.add(panel); //could also use this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();//packs all components added to Jframe into the frame
		this.setVisible(true);
		this.setLocationRelativeTo(null);//sets the frame to appear in the middle of our screen
	}
}