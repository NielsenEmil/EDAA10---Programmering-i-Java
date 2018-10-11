
public class Person {
	private String name;
	private String date;
	
	 public Person(String name, String date) {
		 this.name = name;
		 this.date = date;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public String getDate() {
		 return date;
	 }
	 
	 public String toString() {
		 return name + " " + date;
	 }

}
