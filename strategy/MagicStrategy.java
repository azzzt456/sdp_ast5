package strategy;

public class MagicStrategy implements FightStrategy {
    @Override
    public void fight() {
        System.out.println("Fighting with magic spells.");
    }
}
