package day4Assignment7;



	public class DynamixEx {

	    public static void main(String[] args) {
	        // Create an object of DayScholar
	        DayScholar dayScholar = new DayScholar(1000, 'B', "Maniknata", "97/a vijayawada");

	        // Set values using setter methods
	        dayScholar.setStudentID(1000);
	        dayScholar.setStudentName("manika");
	        dayScholar.setStudentType('B');
	        dayScholar.setResidentialAddress("23/51, Mydukur");

	        // Calculate fees
	        dayScholar.calculateFees();

	        // Display details of DayScholar and Student
	        dayScholar.displayDetails();
	    }
	}


