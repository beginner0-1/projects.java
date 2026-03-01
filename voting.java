import java.util.Scanner;

public class voting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Candidate names
        String[] candidates = {"Alice", "Bob", "Charlie"};
        int[] votes = {0, 0, 0};

        while (true) {

            System.out.println("\n===== Voting System =====");
            System.out.println("1. Show Candidates");
            System.out.println("2. Vote");
            System.out.println("3. Show Results");
            System.out.println("4. Show Winner");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nCandidates:");
                    for (int i = 0; i < candidates.length; i++) {
                        System.out.println((i + 1) + ". " + candidates[i]);
                    }
                    break;

                case 2:
                    System.out.println("\nEnter candidate number to vote:");
                    int voteChoice = sc.nextInt();

                    if (voteChoice > 0 && voteChoice <= candidates.length) {
                        votes[voteChoice - 1]++;
                        System.out.println("Vote recorded successfully!");
                    } else {
                        System.out.println("Invalid candidate number!");
                    }
                    break;

                case 3:
                    System.out.println("\nVoting Results:");
                    for (int i = 0; i < candidates.length; i++) {
                        System.out.println(candidates[i] + 
                                " : " + votes[i] + " votes");
                    }
                    break;

                case 4:
                    int maxVotes = votes[0];
                    int winnerIndex = 0;

                    for (int i = 1; i < votes.length; i++) {
                        if (votes[i] > maxVotes) {
                            maxVotes = votes[i];
                            winnerIndex = i;
                        }
                    }

                    System.out.println("\nWinner: " + candidates[winnerIndex] +
                            " with " + maxVotes + " votes");
                    break;

                case 5:
                    System.out.println("Exiting Voting System...");
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}