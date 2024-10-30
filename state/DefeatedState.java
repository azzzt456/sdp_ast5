package state;

public class DefeatedState implements CharacterState {
    @Override
    public void attack() {
        System.out.println("Cannot attack. Character is defeated.");
    }
}
