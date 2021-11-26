class AnilThreterSeat{
int total_seats =100;
synchronized void bookSeat(int seats){
if(total_seats>=seats){
System.out.println(seats+"seats booked is Successfully");
total_seats=total_seats-seats;
System.out.println("Seats Left: "+total_seats);

}
else{
System.out.println("Sorry seats cannot is booked....!!");
System.out.println("Seats left: "+total_seats);
}
}
}