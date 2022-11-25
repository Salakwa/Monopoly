package Backend;

import java.util.ArrayList;
import java.util.Random;

public class CommunityChest extends Square {

    private static ArrayList<String> communityChestPrompts = new ArrayList<String>();

    public CommunityChest(int communityChestLocation) {
        super("Community Chest", communityChestLocation);
    }

    static {
        communityChestPrompts.add("Advance to Go (Collect $200)");
        communityChestPrompts.add("Bank error in your favor. Collect $200");
        communityChestPrompts.add("Doctor’s fee. Pay $50");
        communityChestPrompts.add("From sale of stock you get $50");
        communityChestPrompts.add("Get Out of Jail Free");
        communityChestPrompts.add("Go to Jail. Go directly to jail, do not pass Go, do not collect $200");
        communityChestPrompts.add("Holiday fund matures. Receive $100");
        communityChestPrompts.add("It is your birthday. Collect $10 from every player");
        communityChestPrompts.add("Life insurance matures. Collect $100");
        communityChestPrompts.add("Go Back 3 Spaces");
        communityChestPrompts.add("Pay hospital fees of $100");
        communityChestPrompts.add("Pay school fees of $50");
        communityChestPrompts.add("Receive $25 consultancy fee");
        communityChestPrompts.add("You are assessed for street repair. $40 per house. $115 per hotel");
        communityChestPrompts.add("You have won second prize in a beauty contest. Collect $10");
        communityChestPrompts.add("You inherit $100");
    }

    public String getCommunityChestPrompt() {
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(communityChestPrompts.size());
        String randomCCPrompt = communityChestPrompts.get(index);
        return randomCCPrompt;
    }

}
