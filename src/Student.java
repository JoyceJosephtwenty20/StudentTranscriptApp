public class Student {

    private String firstName;
    private String lastName;
    private String course;
    private String grade;
    private int credits;
    private int idNumber;
    private double qualityPoint;



    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse() {
        return this.course;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public String getGrade() {
        return this.grade;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }
    public int getCredits() {
        return this.credits;
    }
    public void setIdNumber(int idNumber){
        this.idNumber = idNumber;
    }
    public int getIdNumber() {
        return this.idNumber;
    }
    public void setQualityPoint(double qualityPoint){
        this.qualityPoint = qualityPoint;
    }
    public double getQualityPoint() {
        return this.qualityPoint;
    }

    public String printDetails(){
        String finalString = "";

        finalString = this.course +	"\t\t" + this.credits + "\t\t\t" + this.grade + "\t\t\t"+this.qualityPoint;
        return finalString;
    }
}
