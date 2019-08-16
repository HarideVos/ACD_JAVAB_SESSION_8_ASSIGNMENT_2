package eightpointtwo;

public class CheckERunnable implements Runnable{
	boolean checker;
	int number =1;
	@Override
	public void run() {
	
	        
    for(int i=2; i<=number/2; i++){
        number++;    
    	if(number % i == 0){
               
    		checker = false;
    		System.out.println("Not a prime number.");
    	}
    }
    checker = true;		
    System.out.println("Prime number.");
	}
}
