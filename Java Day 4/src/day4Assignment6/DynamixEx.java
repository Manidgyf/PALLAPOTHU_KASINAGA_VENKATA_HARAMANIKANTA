package day4Assignment6;

public class DynamixEx {

    public static void main(String[] args) {
        // Create an instance of DayScholar with the required parameters
        DayScholar dayScholar = new DayScholar(1000, 'B', "manikanta", 5000, "97/a vijaywada");

        // Setting additional details
        dayScholar.setStudentName("manika");
        dayScholar.setResidentialAddress("23/51, Mydukur");

        // Print details
        dayScholar.getDetails();
    }
}
