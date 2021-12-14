package week3.day1;

public class Students {

	
	public void getStudentInfo(int id) {
		System.out.println("Studend Id : " + id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student Id and Name : " + id + "  " + name);
	}
	public void getStudentInfo(String email, String phonenumber) {
		System.out.println("Student Email and Phonenumber : " + email +"  " + phonenumber);
	}
	public static void main(String[] args) {
		Students  std=new Students();
		std.getStudentInfo(42356);
		std.getStudentInfo(42356, "Veena");
		std.getStudentInfo("veena@gmail.com","1238904567");
		
	}


}
