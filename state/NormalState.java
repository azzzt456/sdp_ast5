package state;

public class NormalState implements CharacterState {
    @Override
    public void attack() {
        System.out.println("Normal attack with basic damage.");
    }
}
