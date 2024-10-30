package strategy;

public class MeleeStrategy implements FightStrategy {
    @Override
    public void fight() {
        System.out.println("Fighting with melee attacks.");
    }
}
