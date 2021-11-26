abstract class VehicleAbstract{

abstract void start();
}
class Care extends VehicaleAbstract{
	void start(){
		System.out.println("care start with key");
		
	        }
	
	}
class Scooter extends VehecaleAbstract{
	void start()
	{
		System.out.println("Scooter start with keck");
		}
		
		
public static void main(String agrs[]){
		//VehicaleAbstract abstract=new VehicaleAbstract();//
		Care c =new Care();
		c.start();
		
		Scooter sc =new Scooter();
		sc.start();
		
	}
	
	
	
}