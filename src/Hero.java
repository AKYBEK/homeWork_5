public class Hero {
    private int Hp = 400;
    private int Dmg = 15;

    private String superPower;

    public int getHp() {
        return Hp;
    }

    public int getDmg() {
        return Dmg;
    }

    public String getSuperPower() {
        return superPower;
    }

    public Hero(int hp, int dmg) {
        Hp = hp;
        Dmg = dmg;
    }

    public Hero(int hp, int dmg, String superPower) {
        Hp = hp;
        Dmg = dmg;
        this.superPower = superPower;
    }
}
