package day4assignment3;

//Main.java
public class Main {
 public static void main(String[] args) {
     // Create a Hostelite object using the parameterized constructor
     Hostelite hostelStudent = new Hostelite(1, 'A', "John", "Doe", 5000.00, "Sunrise Hostel", 101);
     DayScholar dayscholar=new DayScholar(2,'B',"manikanta","pallapothu",6000.00,"97/A vijayawada");
     // Display details
    hostelStudent.displayDetails();
    
   
    dayscholar.displayDetails();
 }
}
