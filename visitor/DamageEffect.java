package visitor;

import main.Character;

public class DamageEffect implements EffectVisitor {
    @Override
    public void applyBoost(Character character) {
        System.out.println("No boost applied with damage.");
    }

    @Override
    public void applyDamage(Character character) {
        System.out.println("Character takes damage.");
    }
}
