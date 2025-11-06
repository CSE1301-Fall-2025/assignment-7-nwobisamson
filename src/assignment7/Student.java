package assignment7;

public class Student {
	private String firstName;
    private String lastName;
    private int studentID;
    private int attempedCredits;
    private int passingCredits;
    private int quailtyPoints;
    private double bearBucks;

    public Student (String first,String last,int stID){
        firstName = first;
        lastName = last;
        studentID = stID;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public int getId(){
        return studentID;
    }

    public int getTotalPassingCredits() {
        return passingCredits;
    }

    public int getTotalAttempingCredits() {
        return attempedCredits;
    }

    public String getClassStanding(){
        if(passingCredits < 30 ) {
            return "First Year";
        } else if (passingCredits < 60 ){
            return "Sophomore";
        }else if (passingCredits < 90 ) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public void addBuck(double amount) {
        bearBucks = bearBucks + amount;
    }


}
