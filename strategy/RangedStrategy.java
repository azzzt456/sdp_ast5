package strategy;

public class RangedStrategy implements FightStrategy {
    @Override
    public void fight() {
        System.out.println("Fighting with ranged weapons.");
    }
}
