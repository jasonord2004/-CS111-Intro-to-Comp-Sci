/**
 * 
 * HeartTransplant class
 * 
 * @author Ana Paula Centeno
 * @author Haolin (Daniel) Jin
 */
public class HeartTransplant {

    // patient array, each Patient is read from the data file
    private Patient[] patients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause survivabilityByCause;

    /*
     * Default constructor
     * Initializes patients to null.
     * Initializes survivabilityByAge to null.
     * Initializes survivabilityByCause to null. 
     */
    public HeartTransplant() {
        
        // WRITE YOUR CODE HERE
        this.patients = null;
        this.survivabilityByAge = null;
        this.survivabilityByCause = null;

    }

    /*
     * Returns patients
     */
    public Patient[] getPatients() {

        // WRITE YOUR CODE HERE
        return patients;
     } 

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge getSurvivabilityByAge() {
        
        // WRITE YOUR CODE HERE
        return survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause getSurvivabilityByCause() {
       
        // WRITE YOUR CODE HERE
        return survivabilityByCause;
    }

    /*
     * 1) Initialize the instance variable patients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file, use StdIn.readInt() to read an integer.
     *    File Format: 
     *      ID, ethnicity, Gender, Age, Cause, Urgency, State of health
     * 
     *    Each line refers to one Patient, all values are integers.
     * 
     */
    public void readPatients (int numberOfLines) {
        
        // WRITE YOUR CODE HERE
        patients = new Patient[numberOfLines];
        for(int i = 0; i < numberOfLines; i++){
            int id = StdIn.readInt();
            int ethnicity = StdIn.readInt();
            int gender = StdIn.readInt();
            int age = StdIn.readInt();
            int cause = StdIn.readInt();
            int urgency = StdIn.readInt();
            int stateOfHealth = StdIn.readInt();
            patients[i] = new Patient(id, ethnicity, gender, age, cause, urgency, stateOfHealth);
        }
        return;
    }

    /*
     * 1) Initialize the instance variable survivabilityByAge with a new survivabilityByAge object.
     * 
     * 2) Reads from the command line file to populate the object. 
     *    Use StdIn.readInt() to read an integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     */
    public void readSurvivabilityByAge (int numberOfLines) {
        
        // WRITE YOUR CODE HERE
        survivabilityByAge = new SurvivabilityByAge();
        for(int i = 0; i < numberOfLines; i++){
            int age = StdIn.readInt();
            int year = StdIn.readInt();
            double rate = StdIn.readDouble();
            survivabilityByAge.addData(age, year, rate);
        }
        return;
    }

    /*
     * 1) Initialize the instance variable survivabilityByCause with a new survivabilityByCause object.
     * 
     * 2) Reads from the command line file to populate the object. Use StdIn.readInt() to read an 
     *    integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     */
    public void readSurvivabilityByCause (int numberOfLines) {
        // WRITE YOUR CODE HERE
        survivabilityByCause = new SurvivabilityByCause();
        for(int i = 0; i < numberOfLines; i++){
            int cause = StdIn.readInt();
            int year = StdIn.readInt();
            double rate = StdIn.readDouble();
            survivabilityByCause.addData(cause, year, rate);
        }
        return;
    }
    
    /*
     * Returns a Patient array containing the patients, 
     * from the patients array, that have age above the parameter age.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with age above the parameter age.
     * 
     * Return null if there is no Patient with age above the 
     * parameter age.
     */ 
    public Patient[] getPatientsWithAgeAbove(int age) {
        // WRITE YOUR CODE HERE
        int length = 0;
        for(int i = 0; i < patients.length; i++){
            if(patients[i].getAge() >= age){
                length++;
            }
        }
        if(length == 0){
            return null;
        }

        Patient[] ageArr = new Patient[length];
        int k = 0;
        for(int j = 0; j < patients.length; j++){
            if(patients[j].getAge() >= age){
                ageArr[k++] = patients[j];
            }
        }
        return ageArr;
    }

    /*
     * Returns a Patient array containing the patients, from the patients array, 
     * that have the heart condition cause equal to the parameter cause.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Patient with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Patient[] getPatientsByHeartConditionCause(int cause) {

        // WRITE YOUR CODE HERE
        int length = 0;
        for(int i = 0; i < patients.length; i++){
            if(patients[i].getCause() == cause){
                length++;
            }
        }
        if(length == 0){
            return null;
        }

        Patient[] causeArr = new Patient[length];
        int k = 0;
        for(int j = 0; j < patients.length; j++){
            if(patients[j].getCause() == cause){
                causeArr[k] = patients[j];
                k++;
            }
        }
        return causeArr;
    }

    /*
     * Returns a Patient array containing patients, from the patients array,
     * that have the state of health equal to the parameter state.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the state of health equal to the parameter state.
     * 
     * Return null if there is no Patient with the state of health 
     * equal to the parameter state.
     */ 
    public Patient[] getPatientsByUrgency(int urgency) {

        // WRITE YOUR CODE HERE
        int length = 0;
        for(int i = 0; i < patients.length; i++){
            if(patients[i].getUrgency() == urgency){
                length++;
            }
        }
        if(length == 0){
            return null;
        }

        Patient[] urgencyArr = new Patient[length];
        int k = 0;
        for(int j = 0; j < patients.length; j++){
            if(patients[j].getUrgency() == urgency){
                urgencyArr[k] = patients[j];
                k++;
            }
        }
        return urgencyArr;
    }

    /*
     * Assume there is a heart available for transplantation surgery.
     * Also assume that the heart is of the same blood type as the
     * Patients on the patients array.
     * This method finds the Patient to be the recepient of this
     * heart.
     * 
     * The method returns a Patient from the patients array with
     * he highest potential for survivability after the transplant.
     * 
     * Assume the patient returned by this method will receive a heart,
     * therefore the Patient will no longer need a heart.
     * 
     * There is no correct solution, you may come up with any 
     * function to find the patient with the highest potential 
     * for survivability after the transplant.
     */ 
    public Patient getPatientForTransplant () {

	    // WRITE YOUR CODE HERE
        int index = 0;
        double tempRate = 0.0;
        double surviveRate = 0.0;
        double avgUrgency = 0.0;

        for(Patient x : patients){
            avgUrgency += x.getUrgency();
        }

        avgUrgency /= patients.length;

        for(int i = 0; i < patients.length; i++){
            tempRate = (survivabilityByAge.getRate(patients[i].getAge(),5) + survivabilityByCause.getRate(patients[i].getCause(),5))/2;
            if(patients[i].getNeedHeart() == true && patients[i].getUrgency() >= avgUrgency && tempRate > surviveRate){
                index = i;
                surviveRate = tempRate;
            }
        }
        patients[index].setNeedHeart(false);
        return patients[index];
    }
}
