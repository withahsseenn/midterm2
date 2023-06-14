import java.awt.FocusTraversalPolicy;
import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

public class SpamChecker {

	public static void main(String[] args) {
		// We are creating a list of spam words or phrases
		String[] Spam_words = { "Accept credit cards", "Ad", "All new", "As seen on", "Bargain", "Beneficiary",
				"Billing", "Bonus", "Cards accepted", "Cash", "Certified", "Cheap", "Claims", "Clearance",
				"Compare rates", "Credit card offers", "Deal", "Debt", "Discount", "Fantastic",
				"In accordance with laws", "Income", "Investment", "Join millions", "Lifetime", "Loans", "Luxury",
				"Marketing solution", "Message contains", "Mortgage rates", "Name brand", "Offer,Online marketing",
				"Opt in", "Pre-approved", "Quote", "Rates", "Refinance", "Removal", "Reserves the right", "Score",
				"Search engine", "Sent in compliance", "Subject to…", "Terms and conditions", "Trial", "Unlimited",
				"Warranty", "Web traffic", "Work from home" };

		Scanner scanner = new Scanner(System.in);
		// We receive an e-mail message from the user
		System.out.println("Please enter an e-mail: ");
		String message = scanner.nextLine().toLowerCase();// We convert all characters to lowercase

		int spamscore = 0;

		// We scan the message for each spam word or phrase
		for (String word : Spam_words) {
			if (message.contains(word.toLowerCase())) { // If the word or phrase is in the message, we add points
				spamscore++;
			}
		}

		// We determine the probability that the message is spam according to the spam
		// score
		if (spamscore >= 4) {// If the spam score is greater than or equal to 4, the message is most likely
								// spam
			System.out.println("This message is probably spam.");
		} else {
			System.out.println("This message is not spam.");
		}
	}
}