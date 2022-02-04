import java.util.*;

public class Vehicle {
protected String plateNum;
protected String type;
protected int entrance;
public Vehicle(String type, String plateNum,int entrance){
	this.type=type;
	this.plateNum=plateNum;
	this.entrance=entrance;
}
int count=0;
Scanner input=new Scanner(System.in);
public void enterVehicle(Vehicle[] v) {

	if(count!=20) {
	System.out.print("Enter vehicle's plate:");
	String plate=input.next();
	System.out.print("Enter vehicle's type:");
	String type= input.next();
	System.out.print("Enter vehicle's enterence hour :");
	int ent=input.nextInt();
	v[count]=new Vehicle(type,plate,ent);
	count++;
	}
	else {
		System.out.println("There is NO room in the parking area");
	}
}
int totalMoney=0;
public void exitVehicle(Vehicle v[]) {
	count--;
	System.out.print("Enter exiting vehicle's plate:");
	String plate=input.next();
int index=0;
	for(int i=0;i<20;i++) {
	if(v[i].plateNum.equals(plate)) {
		index=i;
		break;
	}}
	
	System.out.print("Enter exiting hour:");
	int hour= input.nextInt();
	int time=hour-v[index].entrance;
	System.out.println("The vehicle pays:"+totalMoney(v[index].type,time));
		totalMoney=totalMoney+totalMoney(v[index].type,time);
		if(index!=20) {
		for(int i=index;i<20;i++) {
		
			v[index]=v[index+1];
		}}

	
}
public int totalMoney(String type, int time) {
	int money=0;
	switch(type) {
	case "small":
	if(time>3) {
		time=time-3;
		money=4+time;
	}
	else {
		money=4;
	}
	break;
	case "medium":
		if(time>3) {
			time=time-3;
			money=6+(time*2);
		}
		else {
			money=6;
		}
		break;
	case "large":
		if(time>3) {
			time=time-3;
			money=7+(time*3);
		}
		else {
			money=7;
		}
		break;
	}
	
	return money;
}
public String Terminate() {
	return "Total Money Earned: "+totalMoney;
}
}
