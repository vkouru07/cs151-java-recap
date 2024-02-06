public class Candidate extends Utility {
    private final int candidateId; 
    private String party; 
    private int votes; 

    public Candidate (int candidateId, String firstName, String lastName, String party) {
        this.candidateId = candidateId; 
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.party = party; 
        this.votes = 0; 
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
    
    public void incrementVotes () {
    	votes++; 
    }
    public int getVotes () {
    	return votes; 
    }
}
