//simple Timer that can periodically print a timeout message.
public class ThreadDemo extends Thread {
	//overriding run method of thread class
	@Override
	public void run(){
		super.run();
		try {
			//timeout message print after small duration for ten times
			for(int i=0;i<10;i++){
			Thread.sleep(3000);				
				System.out.println("countdown Time Out"+" "+i);
			    }
			}
		 catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}