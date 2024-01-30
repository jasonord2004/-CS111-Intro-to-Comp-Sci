public class Student{

    private static int id = 1001;

    private String lastName;
    private String firstName;
    private double gpa;
    private int studentID;
    private String email;

    public Student(String lName, String fName){
        lastName = lName;
        firstName = fName;
        gpa = generateGpa();
        studentID = id;
        id++;
        email = findEmail();
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public double getGpa(){
        return gpa;
    }

    public int getID(){
        return studentID;
    }


    private String getEmail(){
        return email;
    }

    public String toString(){
        String s = "";
        s = s + getName() + " GPA: " + getGpa() + " ID: " + getID() + " EMAIL: " + getEmail();
        return s;
    }

    private double generateGpa(){
        double rand = (Math.random()*3)+1; 
        return ((int)(rand * 100))/ 100.0; //rounds to the hundredth place.
    }

    private String findEmail(){
        String s = "";
        s = s + firstName.charAt(0);
        if(lastName.length() < 5){
            s = s + lastName;
        }
        else{
            s = s + lastName.substring(0, 4);
        }
        s = s + "@rutgers.edu";
        return s.toLowerCase();
    }

    public static void main (String[] args){
        Student[] studs = new Student[2];
        for (int i = 0; i < studs.length; i++){
            String fname = StdIn.readString();
            String lname = StdIn.readString();
            studs[i] = new Student (lname, fname);
        }
        for (Student s : studs){
            System.out.println(s);
        }
    }

}