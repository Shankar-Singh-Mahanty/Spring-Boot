package ssm.POJO;

public class Student {
	private String name;
	private int rollno;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + rollno);
		System.out.println("Email: " + email);
	}
}
