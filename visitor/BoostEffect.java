package visitor;

import main.Character;

public class BoostEffect implements EffectVisitor {
    @Override
    public void applyBoost(Character character) {
        System.out.println("Applying boost to character.");
    }

    @Override
    public void applyDamage(Character character) {
        System.out.println("No damage applied with boost.");
    }
}
