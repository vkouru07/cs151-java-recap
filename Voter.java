public class Voter extends Utility {
    private final int voterId; 
    private boolean hasVoted; 

    public Voter (int voterId, String firstName, String lastName, boolean hasVoted) {
        this.voterId = voterId; 
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.hasVoted = hasVoted; 
    }

    public void printInfo() {
        System.out.println (getName()); 
        System.out.println ("id: " + getVoterID()); 
        System.out.println ("has voted: " + getHasVoted()); 
    }

    public int getVoterID() {
        return voterId; 
    }
    public boolean getHasVoted() {
        return hasVoted; 
    }
    public void setHasVoted(boolean hasVoted) {
        this.hasVoted = hasVoted; 
    }
}