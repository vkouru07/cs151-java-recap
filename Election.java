import java.util.ArrayList;
import java.util.Comparator;

public class Election {
	private ArrayList<Candidate> cans = new ArrayList<>(); 
	private ArrayList<Voter> voters = new ArrayList<>(); 
	private boolean electionRunning; 
	
	public Election() {
		this.electionRunning = true; 
	}
	
	public void addVoter (Voter v) {
		if (electionRunning)
			voters.add (v); 
	}
	public void addCandidate (Candidate c) {
		if (electionRunning)
			cans.add (c); 
	}
	public void endElection () {
		electionRunning = false; 
	}
	public void vote (Candidate c) {
		c.incrementVotes();
	}
	
	public void displayResults () {
		cans.sort(new Comparator<Candidate>() {
			@Override
			public int compare(Candidate o1, Candidate o2) {
				return o1.getVotes() - o2.getVotes();
			}

		}); 
		
		for (Candidate c: cans) {
			System.out.printf ("votes %d, name %s, party %s, id %d", c.getVotes(), c.getName(), c.getParty(), c.getCandidateID()); 
		}
		
	}
}
