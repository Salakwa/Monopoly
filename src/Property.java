public class Property {
    protected String propertyName;
    protected int propertyCost;
    protected int mortageValue;
    protected int rent;
    protected Player owner;
    boolean currentlyMortaged;

    public Property(String propertyName,Player owner, int propertyCost, int mortageValue, int rent, boolean currentlyMortaged) {
        this.propertyName = propertyName;
        this.owner = owner;
        this.propertyCost = propertyCost;
        this.mortageValue = mortageValue;
        this.rent = rent;
        this.currentlyMortaged = currentlyMortaged;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public int getPropertyCost() {
        return propertyCost;
    }

    public int getMortageValue() {
        return mortageValue;
    }

    public int getRent() {
        return rent;
    }

    public boolean getMortageStatus() {
        return currentlyMortaged;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player player) {
        owner = player;
    }


}
