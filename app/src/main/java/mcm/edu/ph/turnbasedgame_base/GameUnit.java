package mcm.edu.ph.turnbasedgame_base;

public class GameUnit {

    int level;
    String unitName;
    int baseHealth;
    int baseMana;
    int baseArmor;
    int minDPT;
    int maxDPT;

    public GameUnit(){}
    public GameUnit(String unitName, int baseHealth, int baseMana, int minDPT, int maxDPT){
        this.unitName =     unitName;
        this.baseHealth =   baseHealth;
        this.baseMana =     baseMana;
        this.minDPT =       minDPT;
        this.maxDPT =       maxDPT;
        this.baseArmor = 0;
        this.level = 0;
    }

    public GameUnit(String unitName) {
        this.unitName = unitName;

    }
}
