public class Multi extends Thread{


public void run(){

System.out.println("Single task to from multiple Threads");

}
//public class MyThread{
public static void main(String agrs[]){
Multi m = new Multi();
m.start();

//Multi1 m1 = new Multi1();
//m1.start();
}
}
module-path "C:\Program Files\Java\javafx-sdk-17\bin" --add-modules javafx.controls,javafx.fxml