public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDmg(39);
        boss.setHp(700);
        boss.setDafanceType("Magic");
        System.out.println("урон: " + boss.getDmg() + "\nздарове: " + boss.getHp() +"\nтип: " + boss.getDafanceType());
    }
}