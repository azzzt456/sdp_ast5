package main;

import state.CharacterState;
import strategy.FightStrategy;

public class Character {
    private CharacterState state;
    private FightStrategy strategy;

    public void setState(CharacterState state) {
        this.state = state;
    }

    public void setStrategy(FightStrategy strategy) {
        this.strategy = strategy;
    }

    public void attack() {
        state.attack();
    }

    public void fight() {
        strategy.fight();
    }
}
