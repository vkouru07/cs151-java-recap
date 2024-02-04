public class Candidate extends Utility {
    private final int candidateId; 
    private String party; 

    public Candidate (int candidateId, String firstName, String lastName, String party) {
        this.candidateId = candidateId; 
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.party = party; 
    }

    public void printInfo() {
        System.out.println (getName()); 
        System.out.println ("id: " + getCandidateID()); 
        System.out.println ("party: " + getParty()); 
    }

    public int getCandidateID() {
        return candidateId; 
    }
    public String getParty() {
        return party; 
    }
    public void setParty(String party) {
        this.party = party; 
    }
}