import main.Character;
import state.*;
import strategy.*;
import template.*;
import visitor.*;

public class GameDemo {
    public static void main(String[] args) {
        Character character = new Character();

        // Пример использования State паттерна
        character.setState(new NormalState());
        character.attack();

        character.setState(new PoweredUpState());
        character.attack();

        character.setState(new DefeatedState());
        character.attack();

        // Пример использования Strategy паттерна
        character.setStrategy(new MeleeStrategy());
        character.fight();

        character.setStrategy(new RangedStrategy());
        character.fight();

        character.setStrategy(new MagicStrategy());
        character.fight();

        // Пример использования Template паттерна
        GameAction attack = new AttackAction();
        attack.executeAction();

        GameAction defend = new DefendAction();
        defend.executeAction();

        GameAction heal = new HealAction();
        heal.executeAction();

        // Пример использования Visitor паттерна
        BoostEffect boost = new BoostEffect();
        DamageEffect damage = new DamageEffect();

        boost.applyBoost(character);
        damage.applyDamage(character);
    }
}
