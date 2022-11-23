public class Utility extends Property{

    public Utility(String propertyName, int propertyLocation, Player owner, int propertyCost, int rent) {
        super(propertyName, propertyLocation, owner, propertyCost, 75, rent, false);
    }

    public void setUtilityRent(int diceRoll, int numUtilitiesOwned) {
        if (numUtilitiesOwned == 1) {
            super.rent = diceRoll * 4;
        } else if (numUtilitiesOwned == 2) {
            super.rent = diceRoll * 10;
        }
    }


}
