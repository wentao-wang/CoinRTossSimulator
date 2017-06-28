import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;

public class CoinSimComponent  extends JComponent {
private int total; // number of trials.
private int twoheads;// number of the coins are two heads. 
private int twotails;//number of the coins are two tails.
private int headtail;//number of the coins are one head and one tail.
	

	public CoinSimComponent(int number) {
	CoinTossSimulator toss = new CoinTossSimulator();
	toss.run(number);
	total=number;
	twoheads=toss.getTwoHeads();
	twotails=toss.getTwoTails();
	headtail=toss.getHeadTails();
	
}
	//contract a method to call the Bar's draw method to draw the bars and labels.
public void paintComponent(Graphics g)
{
Graphics2D g2 = (Graphics2D) g;
double per=(double)(getHeight()*0.75/total); //how many application units per pixel for height.
double h11=0.8*getHeight()-twoheads*per; //the y-coordinate of bar1. bar1 shows two heads situation.
double h00=0.8*getHeight()-twotails*per; //the y-coordinate of bar3. bar3 shows one head and one tail situation.
double h10=0.8*getHeight()-headtail*per; //the y-coordinate of bar2. bar2 shows two tails situation.
int percent1=(int)((double)twoheads*100/total); //calculate the percentage of two heads situation in total.
int percent2=(int)((double)headtail*100/total); //calculate the percentage of two tails situation in total.
int percent3=100-percent1-percent2; //calculate the percentage of one head and one tail situation in total.

//communicate the parameters to Bar object.
Bar bar1= new Bar((int)h11,getWidth()/5,getWidth()/15,twoheads,per,Color.green,"Two Heads: "+twoheads+" ("+percent1+"%)");
Bar bar2= new Bar((int)h10,getWidth()*7/15,getWidth()/15,headtail,per,Color.blue,"A Head and a Tail: "+headtail+" ("+percent2+"%)");
Bar bar3= new Bar((int)h00,getWidth()*11/15,getWidth()/15,twotails,per,Color.red,"Two Tails: "+twotails+" ("+percent3+"%)");

//draw three bars.
bar1.draw(g2);
bar2.draw(g2);
bar3.draw(g2);


}
	
}
