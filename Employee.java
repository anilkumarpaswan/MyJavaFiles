class Employee{

int empid;
String name;
String company;

Employee(int empid, String name, String company){
this.empid=empid;
this.name=name;
this.company=company;

}
void display(){
 System.out.println(empid+" "+name+" "+company);
}
public static void main(String args[]){
Employee e1 = new Employee(1002,"Anil", "Higher Programing");
e1.display();
Employee e2 = new Employee(1002, "Amit", "Higher Programing");
e2.display();
}
}