package week1.day1;

public class Mobile {
	String mobileModel = "samsung";
	int mobileWeight = 36883;
	boolean isFullCharge = true;
	double mobileCost = 7889.887979d;
	
public void makeCall() {
	// TODO Auto-generated method stub
System.out.println("calling");
}
public void sendmsg() {
	// TODO Auto-generated method stub
System.out.println("sending");
}
public static void main(String[] args) {
	Mobile mob = new Mobile();
	mob.makeCall();
	mob.sendmsg();
	System.out.println(mob.mobileModel);
	System.out.println(mob.mobileWeight);
	System.out.println(mob.isFullCharge);
	System.out.println(mob.mobileCost);
}
}

