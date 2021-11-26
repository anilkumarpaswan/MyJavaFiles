 class MoviesApps extends Thread{
	int total =0;
	public void run() {
		synchronized(this){
			
			for(int i=0;i<10;i++){
				
				total =total+100000;
		}
			
			this.notify();
		}
		
		
	}

}

  class Earning
{
public static void main(String agrs[])throws InterruptedException {
	
	MoviesApps ma = new MoviesApps();
	ma.start();
	//System.out.println("MoviesApps:"+ma.total+ " Rs.");
	synchronized(ma) {
		ma.wait();
		
	}
System.out.println("MoviesApp :"+ma.total+"Rs.");	
}
	
}