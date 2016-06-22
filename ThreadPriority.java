public class ThreadPriority extends Thread {
	
	
	public void run(){  

			
			System.out.println("running thread name is:"+Thread.currentThread().getName());  
			System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
		  
		  }  
		 public static void main(String args[]){  
			 ThreadPriority m1=new ThreadPriority();  
			 ThreadPriority m2=new ThreadPriority();
			 ThreadPriority m3=new ThreadPriority();
			 m1.setName("Thread-A");
			 m2.setName("Thread-B");
			 m3.setName("Thread-C");
			 m1.setPriority(Thread.MIN_PRIORITY);  
			 m2.setPriority(Thread.NORM_PRIORITY);  
			 m3.setPriority(Thread.MAX_PRIORITY);
			 m1.start();  
			 m2.start();  
			 m3.start();
		   
		 
		  
		 }  
}