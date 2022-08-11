package assignment5;

public class Student {
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println(id+"  "+name);
	}
	public void getStudentInfo(String emailid, long mob) {
		System.out.println(emailid+"  "+mob);
	}
public static void main(String[] args) {
	Student info=new Student();
	info.getStudentInfo(220005059);
	info.getStudentInfo(220005059, "Subasri");
	info.getStudentInfo("subasri@gmail.com",9003792877L );
	info.getStudentInfo(220005060);
	info.getStudentInfo(220005060, "Surjeeth");
	info.getStudentInfo("Surjeeth@gmail.com", 9840651598L);
	info.getStudentInfo(220005062);
	info.getStudentInfo(220005062, "Vaishnavi");
	info.getStudentInfo("vaishnavi@gmail.com", 7708571272L);
}
}
