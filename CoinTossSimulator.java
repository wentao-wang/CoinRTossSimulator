
  import java.util.Random;
/**
 * class CoinTossSimulator
 * 
 * Simulates trials of tossing two coins and allows the user to access the
 * cumulative results.
 * 
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants, 
 * and private methods to the class.  You will also be completing the 
 * implementation of the methods given. 
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 * 
 */
public class CoinTossSimulator {
 
 private int times; //instance variable of total trials times.
 private Random generate1;
 private Random generate2;
 private int twoheads;
 private int twotails;
 private int headtails;
	
   /**
      Creates a coin toss simulator with no trials done yet.
   */
   public CoinTossSimulator() {
	   generate1= new Random();
	   generate2= new Random();
   }


   /**
      Runs the simulation for numTrials more trials. Multiple calls to this
      without a reset() between them add these trials to the simulation
      already completed.
      
      @param numTrials  number of trials to for simulation; must be >= 0
    */
   public void run(int numTrials) {
      
      int number=numTrials;
      times+=numTrials;
     
      //use the generate to make two random number of 1 or 0. 
      //0 stands for head. 1 stands for tails. 
      //collect the results of three different situations.
       for(int i =0;i<number; i++){
    	   int num1=generate1.nextInt(2);
    	   int num2=generate2.nextInt(2);
    	  if (num1==0&&num2==0){
    		 twoheads++; 
    	     }
    	    else if (num1==1&&num2==1){
    		  twotails++;
    	            }
    	        else headtails++;
           }
      }
   


   /**
      Get number of trials performed since last reset.
   */
   public int getNumTrials() {
       return times;
   }


   /**
      Get number of trials that came up two heads since last reset.
   */
   public int getTwoHeads() {
       return twoheads; 
   }


   /**
     Get number of trials that came up two tails since last reset.
   */  
   public int getTwoTails() {
       return twotails; 
   }


   /**
     Get number of trials that came up one head and one tail since last reset.
   */
   public int getHeadTails() {
       return headtails; 
   }


   /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {
    times=0;
    twoheads=0;
    twotails=0;
    headtails=0;
   }

}
