import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Choose:");
	System.out.println("(1) Enter Vehicle\n"
			+ "(2) Exit Vehicle\n"
			+ "(3) Terminate");
	Vehicle vehicle= new Vehicle(null, null, 0);
	Vehicle[] myVehicle= new Vehicle[20];
	int num=input.nextInt();
	 while(num!=3) {
		 switch(num) {
		 case 1:
			 vehicle.enterVehicle( myVehicle);
			 break;
		 case 2:
			 vehicle.exitVehicle(myVehicle);
			 break;
		 }
		 System.out.println("Choose:");
		 System.out.println("(1) Enter Vehicle\n"
					+ "(2) Exit Vehicle\n"
					+ "(3) Terminate");
		  num=input.nextInt();
	}
	 
	 
	System.out.println(vehicle.Terminate() ); 

	}

}
