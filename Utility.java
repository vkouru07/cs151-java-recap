public abstract class Utility {
    public static void main (String[] args) {
        Utility[] people = new Utility[5]; 
        people[0] = new Voter (12, "poot", "lovato", true); 
        people[1] = new Candidate (2, "adi", "k", "green"); 
        people[2] = new Voter (3, "huey", "80", false); 
        people[3] = new Voter (2, "bluey", "goo", false); 
        people[4] = new Candidate (45, "vai", "k", "yob"); 

        for (int i=0; i<people.length; i++) {
            people[i].printInfo(); 
        }
    }

    protected String firstName;
    protected String lastName;  

    public abstract void printInfo(); 

    public String getName () {
        return firstName.toUpperCase() + " " + lastName.toUpperCase(); 
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName; 
    }
    public void setLastName(String lastName) {
        this.lastName = lastName; 
    }
}