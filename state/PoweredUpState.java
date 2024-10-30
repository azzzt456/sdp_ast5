package state;

public class PoweredUpState implements CharacterState {
    @Override
    public void attack() {
        System.out.println("Powered attack with double damage!");
    }
}
