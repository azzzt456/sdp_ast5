package visitor;

import main.Character;

public interface EffectVisitor {
    void applyBoost(Character character);
    void applyDamage(Character character);
}
