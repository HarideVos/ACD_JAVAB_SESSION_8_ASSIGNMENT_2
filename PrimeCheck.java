package eightpointtwo;

public class PrimeCheck {
	 
    public static void main(String a[]){
    	CheckEThreads cet = new CheckEThreads();
    	CheckERunnable cer = new CheckERunnable();
    	Thread t1 = new Thread(cet);
    	Thread t2 = new Thread(cer);
    	t1.start();
    	t2.start();
    }
}
