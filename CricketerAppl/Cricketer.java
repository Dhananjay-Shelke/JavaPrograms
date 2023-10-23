/*4. Write a class Cricketer with following Fields 
String name,int age,String email_id,String Phone,int rating

This application should contains the test class called CricketerTest which will test the functionality of Cricketer class.

Use any collection you like to store the data.
1.Accept minimum 5 Cricketers in the collection.
2.Modify Cricketer's rating
3.Search Cricketer by name
4.Display all Cricketers added in collection.
5.Display All Cricketers in sorted form by rating.
*/
package CricketerAppl;

public class Cricketer {
	private String name;
	private int age;
	private String email;
	private String phone;
	private int ratings;

	public Cricketer(String name, int age, String email, String phone, int ratings) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", age=" + age + ", email=" + email + ", phone=" + phone + ", ratings="
				+ ratings + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

}



/*
dhananjay
21
dsp@gmail.com
9130584892
10

smitesh
22
smit@gmail.com
9423323683
9

Mayur
22
mayur@gmail.com
9011152121
8

Rohit
32
rohit@gmail.com
3020659565
10

























*/
