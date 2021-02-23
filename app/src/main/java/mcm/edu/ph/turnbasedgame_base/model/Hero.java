package mcm.edu.ph.turnbasedgame_base.model;

public class Hero extends GameUnit{

    double statSTR;
    double statAGI;
    double statINT;
    int exp;


    public Hero(){}
    public Hero(String unitName, int baseHealth, int baseMana, int minDPT, int maxDPT, double statSTR,
                double statAGI, double statINT){
        setUnitName(unitName);
        setBaseHealth(baseHealth);
        setBaseMana(baseMana);
        setMinDPT(minDPT);
        setMaxDPT(maxDPT);
        setLevel(1);
        setBaseArmor(0);

        this.statSTR =      statSTR;
        this.statAGI =      statAGI;
        this.statINT =      statINT;
        this.exp =          0;
    }



}
