public class Meter_Reader { // private attributes
	private String name;
	private int age;
	private String address;
	private String gender;
	private int idNumber;

	// static attribute
	public static int meterReaderCount;

	// constructors
	public Meter_Reader(){
		name = "";
		age = 0;
		address = "";
		gender = "";
		idNumber = 0;
	}
	public Meter_Reader(String name){
		this.name = name;
	}
	public Meter_Reader(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Meter_Reader(String n, int a, String ad, String g, int id){
		name = n;
		age = a;
		address = ad;
		gender = g;
		idNumber = id;
	}
	// accessor
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getAddress(){
		return address;
	}
	public String getGender(){
		return gender;
	}
	public int getidNumber(){
		return idNumber;
	}
	// mutators
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public void setidNumber(int idNumber){
		this.idNumber = idNumber;
	}

	public void printInfo(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		System.out.println("Gender: " + gender);
		System.out.println("ID Number: " + idNumber);
		System.out.println();
	}
}