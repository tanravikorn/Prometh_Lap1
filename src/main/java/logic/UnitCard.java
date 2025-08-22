package logic;

public class UnitCard {
	private String name;
	private int bloodCost;
	private int power;
	private int health;
	private String flavorText;


    public UnitCard(String name, int bloodCost, int
            power, int health, String flavorText){
        this.setName(name);
        this.setPower(power);
        this.setBloodCost(bloodCost);
        this.setHealth(health);
        this.setFlavorText(flavorText);
    }
    //setter
    void setName(String name){
        if(name.isBlank()){
            this.name = "creature";
        }
        else {
            this.name = name;
        }
    }
    void setBloodCost(int bloodCost){
        this.bloodCost = Math.max(0, bloodCost);
    }
    void setPower(int power){
        this.power = Math.max(0, power);
    }
    void setHealth(int health){
        this.health = Math.max(1, health);
    }
    void setFlavorText(String flavorText){
        this.flavorText = flavorText;
    }
    //getter
    String getName(){return this.name;}
    int getPower(){return this.power;}
    int getHealth(){return this.health;}
    int getBloodCost(){return this.bloodCost;}
    String getFlavorText(){return this.flavorText;}
    //standard methods
    public String toString() {
		return this.getName() + " (POW: " + this.getPower() + ", HP: " + this.getHealth() + ")";
	}
    boolean equals(UnitCard other){
        if (this == other){return true;}
        UnitCard o = (UnitCard) other;
        if (this.name == o.name){return true;}
        return false;
    }
}
