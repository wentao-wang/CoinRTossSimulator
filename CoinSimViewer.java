import java.util.Scanner;
import javax.swing.JFrame;

public class CoinSimViewer {
public static void main(String[] args){
	// Prompt to enter the number of trials and make sure it's greater than 0.
	Scanner input =new Scanner(System.in);
	System.out.print("Enter number of trials: ");
	int num=input.nextInt();
	while(num<=0){
		System.out.println("ERROR: Number entered must be greater than 0.");
		System.out.print("Enter number of trials: ");
		 num=input.nextInt();
	}
	
	//Construct a frame and add the component to the frame.
	 JFrame frame = new JFrame();
	 frame.setSize(800,500);
	 frame.setTitle("CoinSim");
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 CoinSimComponent component = new CoinSimComponent(num);
     frame.add(component);
	 
	 frame.setVisible(true);
	 

    
}
}
