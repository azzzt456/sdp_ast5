import main.Character;
import state.*;
import strategy.*;
import template.*;
import visitor.*;

public class GameDemo {
    public static void main(String[] args) {
        Character character = new Character();

        character.setState(new NormalState());
        character.attack();

        character.setState(new PoweredUpState());
        character.attack();

        character.setState(new DefeatedState());
        character.attack();



        character.setStrategy(new MeleeStrategy());
        character.fight();

        character.setStrategy(new RangedStrategy());
        character.fight();

        character.setStrategy(new MagicStrategy());
        character.fight();



        GameAction attack = new AttackAction();
        attack.executeAction();

        GameAction defend = new DefendAction();
        defend.executeAction();

        GameAction heal = new HealAction();
        heal.executeAction();



        BoostEffect boost = new BoostEffect();
        DamageEffect damage = new DamageEffect();

        boost.applyBoost(character);
        damage.applyDamage(character);
    }
}
