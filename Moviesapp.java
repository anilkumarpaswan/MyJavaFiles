
class TotaleEarning extends Thread{
		int totale=0;
		public void run() {
			for(int i=1;i<40;i++) {
			totale =totale+100;
				
			}
			
			
		}
	
	

	public static void main(String[] args) {
		

    TotaleEarning T=new TotaleEarning();
	T.start();
	System.out.println("Totale earning :"+T.totale+"rs");
}
	}

