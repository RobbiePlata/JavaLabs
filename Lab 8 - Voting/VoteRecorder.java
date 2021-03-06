import java.util.Scanner;
public class VoteRecorder {

	Scanner kb = new Scanner(System.in);
	public static String nameCandidatePresident1;
	public static String nameCandidatePresident2;
	public static String nameCandidateVicePresident1;
	public static String nameCandidateVicePresident2;
	public static int votesCandidatePresident1 = 0;
	public static int votesCandidatePresident2 = 0;
	public static int votesCandidateVicePresident1 = 0;
	public static int votesCandidateVicePresident2 = 0;
	public int myVoteForPresident;
	public int myVoteForVicePresident;
	
	public static void setCandidatesPresident(String name1, String name2){
		nameCandidatePresident1 = name1;
		nameCandidatePresident2 = name2;		
	}
	public static void setCandidatesVicePresident(String name1, String name2){
		nameCandidateVicePresident1 = name1;
		nameCandidateVicePresident2 = name2;
		}
	public static void resetVotes(){
		if (votesCandidatePresident1 > 0){
			votesCandidatePresident1 = 0;
		}
		if (votesCandidatePresident2 > 0){
			votesCandidatePresident2 = 0;
		}
		if (votesCandidateVicePresident1 > 0){
			votesCandidateVicePresident1 = 0;
		}
		if (votesCandidateVicePresident2 > 0){
			votesCandidateVicePresident2 = 0;
		}
		System.out.println(votesCandidatePresident1 + votesCandidatePresident2 + votesCandidateVicePresident1 + votesCandidateVicePresident2);
	}
	public static String getCurrentVotePresident(int pres1, int pres2){
		int total = pres1 + pres2;
		String newTotal = Integer.toString(total);
		return newTotal;
	}
	public static String getCurrentVoteVicePresident(int vice1, int vice2){
		int total = vice1 + vice2;
		String newTotal = Integer.toString(total);
		return newTotal;
		}
	
	public void getAndConfirmVotes(int vote1, int vote2){
		this.myVoteForPresident = vote1;
		this.myVoteForVicePresident = vote2;
		System.out.println("Your Choices: ");
		if (vote1 == 1){
			System.out.println(nameCandidatePresident1);
		}
		if (vote1 == 2){
			System.out.println(nameCandidatePresident2);
		}
		if (vote1 == 0){
			System.out.println("No one");
		}
		if (vote2 == 1){
			System.out.println(nameCandidateVicePresident1);
		}
		if (vote2 == 2){
			System.out.println(nameCandidateVicePresident2);
		}
		if (vote2 == 0){
			System.out.println("No one");
		}
		
	//confirm with getavote and confirm votes
		//then go to recordavote
	}
	public void getAVote(String name1, String name2){
		System.out.println("What is your choice of candidate?");
		System.out.println(name1 + " or " + name2 + " or neither");
		String choice = kb.nextLine();
		System.out.println(choice);
		if(name1.equals(nameCandidatePresident1)){
			if (choice.equals(name1)){
				int choiceVal = 1;
				this.myVoteForPresident = choiceVal;
			}
			if (choice.equals(name2)){
				int choiceVal = 2;
				this.myVoteForPresident = choiceVal;
			}
			if (choice.equals("neither")){
				int choiceVal = 0;
				this.myVoteForPresident = choiceVal;
			}
		}
		if(name1.equals(nameCandidateVicePresident1)){
			if (choice.equals(name1)){
				int choiceVal = 1;
				this.myVoteForVicePresident = choiceVal;
			}
			if (choice.equals(name2)){
				int choiceVal = 2;
				this.myVoteForVicePresident = choiceVal;
			}
			if (choice.equals("neither")){
				int choiceVal = 0;
				this.myVoteForVicePresident = choiceVal;
			}
		}
	}

	//returns who the user voter for by name.
	public void getVotes(int num){
		if (num == 0){
			this.myVoteForPresident = 0;
		}
		if (num == 1){
			this.myVoteForPresident = 1;
			
		}
		if (num == 2){
			this.myVoteForPresident = 2;
			
		}
		
	}
		//return the names as answers
		//
		
	private boolean confirmVotes(){
		System.out.println("Are you happy with these choices? yes/no");
		String answer = kb.nextLine();
		boolean satisfied = true;
		if (answer.equals("yes")){
			System.out.println("Thank you. Your Vote has been recorded.");
			satisfied = true;
		}
		if (answer.equals("no")){
			System.out.println("Sorry");
			satisfied = false;
		}
		return satisfied;
		
	}
	private void recordVotes(){
		
		int vote1 = this.myVoteForPresident;
		int vote2 = this.myVoteForVicePresident;
		
		if (vote1 == 0){
			System.out.println("No vote for President");
		}
		if (vote1 == 1){
			votesCandidatePresident1 ++;
		}
		if (vote1 == 2){
			votesCandidatePresident2 ++;
		}
		if (vote2 == 0){
			System.out.println("No vote for Vice President");
		}
		if (vote2 == 1){
			votesCandidateVicePresident1++;
		}
		if (vote2 == 2){
			votesCandidateVicePresident2++;
		}
		System.out.println();
		System.out.println(nameCandidatePresident1 +" has "+ votesCandidatePresident1 +" votes");
		System.out.println(nameCandidatePresident2 +" has "+ votesCandidatePresident2 +" votes");
		System.out.println(nameCandidateVicePresident1 +" has "+ votesCandidateVicePresident1 +" votes");
		System.out.println(nameCandidateVicePresident2 +" has "+ votesCandidateVicePresident2 +" votes");
		System.out.println();
	}
	
	public static void main(String[] args) {
		String pres1 = "Mac";
		String pres2 = "Dennis";
		String vice1 = "Charlie";
		String vice2 = "Dee";

		VoteRecorder election = new VoteRecorder();
		election.setCandidatesPresident(pres1 , pres2);
		election.setCandidatesVicePresident(vice1, vice2);
		election.getAVote(nameCandidatePresident1, nameCandidatePresident2);
		election.getAVote(nameCandidateVicePresident1, nameCandidateVicePresident2);
		election.recordVotes();
		boolean state = election.confirmVotes();
		if (state == false){
			System.out.println("resetting vote count to zero");
			VoteRecorder.resetVotes();
			while(state == false){
				System.out.println("Choose again");
				election.getAVote(nameCandidatePresident1, nameCandidatePresident2);
				election.getAVote(nameCandidateVicePresident1, nameCandidateVicePresident2);
			}
		}
		
		
		
	}
}