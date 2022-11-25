package Backend;

import java.util.*;

public class Player {
    private String playerName;
    private int balance;
    private int location;
    private ArrayList<Property> propertyOwned = new ArrayList<Property>();
    boolean isCPU;
    boolean imprisoned;
    boolean isBankruot;

    public Player(String playerName, int balance, int location, ArrayList<Property> propertyOwned, boolean isCPU, boolean imprisoned ) {
        this.playerName = playerName;
        this.balance = balance;
        this.location = location;
        this.propertyOwned = propertyOwned;
        this.isCPU = isCPU;
        this.imprisoned = imprisoned;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerBalance(int newBalance) {
        balance = newBalance;
    }
    public int getBalance() {
        return balance;
    }

    public int getNetworth() {
        int propertyValue = 0;

        for (int i = 0; i < propertyOwned.size(); i++) {
            propertyValue += (propertyOwned.get(i)).getMortageValue();
        }

        return balance + propertyValue;
    }

    public void setPlayerLocation(int newLocation) {
        location = newLocation;
    }
    public int getLocation() {
        return location;
    }

    public void rollDice() {
        int diceOneRoll = (int)(Math.random()*6+1);
        int diceTwoRoll = (int)(Math.random()*6+1);
        int diceSum = diceOneRoll + diceTwoRoll;

        if (!imprisoned) {
            if (location + diceSum > 40) {
                location = location + diceSum - 40;
            } else {
                location = location + diceSum;
            }
        } else {

        }
    }

    public void payPlayer(Player player, int moneyOwed){
        if (moneyOwed > this.getBalance()) {
            player.setPlayerBalance(player.getBalance() + moneyOwed);
            this.setPlayerBalance(getBalance() - moneyOwed);
        } else {

        }

    }

    public void mortageProperty(Property property) {
        property.setCurrentlyMortaged(true);
        this.setPlayerBalance(this.getBalance() + property.getMortageValue());
    }


}
