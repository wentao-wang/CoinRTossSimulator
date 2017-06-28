public class CoinTossSimulatorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoinTossSimulator test = new CoinTossSimulator();
		System.out.println("After constructor:");
		System.out.println("Number of trials: "+ test.getNumTrials());
		System.out.println("Two-head tosses: "+ test.getTwoHeads());
		System.out.println("Two-tail tosses: "+ test.getTwoTails());
		System.out.println("One-head one-tail tosses: "+ test.getHeadTails());
		if( test.getNumTrials()==test.getTwoHeads()+test.getTwoTails()+test.getHeadTails()){
			System.out.println("Tosses add up correctly?  "+ "true");
		  }else
		  System.out.println("Tosses add up correctly?  "+ "flase");
		
		//test after 1 times run, the result of the coin simulate.
		test.run(1);
		System.out.println("After run(1):");
		System.out.println("Number of trials: "+ test.getNumTrials());
		System.out.println("Two-head tosses: "+ test.getTwoHeads());
		System.out.println("Two-tail tosses: "+ test.getTwoTails());
		System.out.println("One-head one-tail tosses: "+ test.getHeadTails());
		if( test.getNumTrials()==test.getTwoHeads()+test.getTwoTails()+test.getHeadTails()){
			System.out.println("Tosses add up correctly?  "+ "true");
		  }else{
		  System.out.println("Tosses add up correctly?  "+ "flase");
		       }
		 System.out.println("  ");
		 
		//test after 10 times run, the result of the coin simulate.
		test.run(10);
		System.out.println("After run(10):");
		System.out.println("Number of trials: "+ test.getNumTrials());
		System.out.println("Two-head tosses: "+ test.getTwoHeads());
		System.out.println("Two-tail tosses: "+ test.getTwoTails());
		System.out.println("One-head one-tail tosses: "+ test.getHeadTails());
		if( test.getNumTrials()==test.getTwoHeads()+test.getTwoTails()+test.getHeadTails()){
			System.out.println("Tosses add up correctly?  "+ "true");
		  }else{
		  System.out.println("Tosses add up correctly?  "+ "flase");
		       }
		 System.out.println("  ");
		
			//test after 100 times run, the result of the coin simulate.
		    test.run(100);
			System.out.println("After run(100):");
			System.out.println("Number of trials: "+ test.getNumTrials());
			System.out.println("Two-head tosses: "+ test.getTwoHeads());
			System.out.println("Two-tail tosses: "+ test.getTwoTails());
			System.out.println("One-head one-tail tosses: "+ test.getHeadTails());
			if( test.getNumTrials()==test.getTwoHeads()+test.getTwoTails()+test.getHeadTails()){
				System.out.println("Tosses add up correctly?  "+ "true");
			  }else{
			  System.out.println("Tosses add up correctly?  "+ "flase");
			       }
			 System.out.println("  ");
			 
			//test after 99999 times run, the result of the coin simulate.
			 test.run(99999);
			System.out.println("After run(99999):");
				System.out.println("Number of trials: "+ test.getNumTrials());
				System.out.println("Two-head tosses: "+ test.getTwoHeads());
				System.out.println("Two-tail tosses: "+ test.getTwoTails());
				System.out.println("One-head one-tail tosses: "+ test.getHeadTails());
				if( test.getNumTrials()==test.getTwoHeads()+test.getTwoTails()+test.getHeadTails()){
					System.out.println("Tosses add up correctly?  "+ "true");
				  }else{
				  System.out.println("Tosses add up correctly?  "+ "flase");
				       }
				 System.out.println("  ");
		
	   //rest to 0.
		test.reset();
		System.out.println("After reset:");
		System.out.println("Number of trials: "+ test.getNumTrials());
		System.out.println("Two-head tosses: "+ test.getTwoHeads());
		System.out.println("Two-tail tosses: "+ test.getTwoTails());
		System.out.println("One-head one-tail tosses: "+ test.getHeadTails());
		if( test.getNumTrials()==test.getTwoHeads()+test.getTwoTails()+test.getHeadTails()){
			System.out.println("Tosses add up correctly?  "+ "true");
		  }else{
		  System.out.println("Tosses add up correctly?  "+ "flase");
		       }
		 System.out.println("  ");
		 
		 // after reset, run again
		 test.run(1);
			System.out.println("After run(1):");
				System.out.println("Number of trials: "+ test.getNumTrials());
				System.out.println("Two-head tosses: "+ test.getTwoHeads());
				System.out.println("Two-tail tosses: "+ test.getTwoTails());
				System.out.println("One-head one-tail tosses: "+ test.getHeadTails());
				if( test.getNumTrials()==test.getTwoHeads()+test.getTwoTails()+test.getHeadTails()){
					System.out.println("Tosses add up correctly?  "+ "true");
				  }else{
				  System.out.println("Tosses add up correctly?  "+ "flase");
				       }
				 System.out.println("  ");
		 
				 
				 test.run(10000);
					System.out.println("After run(10000):");
						System.out.println("Number of trials: "+ test.getNumTrials());
						System.out.println("Two-head tosses: "+ test.getTwoHeads());
						System.out.println("Two-tail tosses: "+ test.getTwoTails());
						System.out.println("One-head one-tail tosses: "+ test.getHeadTails());
						if( test.getNumTrials()==test.getTwoHeads()+test.getTwoTails()+test.getHeadTails()){
							System.out.println("Tosses add up correctly?  "+ "true");
						  }else{
						  System.out.println("Tosses add up correctly?  "+ "flase");
						       }
						 System.out.println("  ");
	}

}
