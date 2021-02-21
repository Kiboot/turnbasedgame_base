package mcm.edu.ph.turnbasedgame_base;

public class Hero extends GameUnit{

    double statSTR;
    double statAGI;
    double statINT;
    int exp;


    public Hero(){}
    public Hero(String unitName, int baseHealth, int baseMana, int minDPT, int maxDPT, double statSTR,
                double statAGI, double statINT){
        super.unitName =    unitName;
        super.baseHealth =  baseHealth;
        super.baseMana =    baseMana;
        super.minDPT =      minDPT;
        super.maxDPT =      maxDPT;
        super.level =       1;
        super.baseArmor =   0;
        this.statSTR =      statSTR;
        this.statAGI =      statAGI;
        this.statINT =      statINT;
        this.exp =          0;
    }



}
