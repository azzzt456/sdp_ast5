package template;

public abstract class GameAction {
    public final void executeAction() {
        prepare();
        performAction();
        complete();
    }

    protected abstract void performAction();

    private void prepare() {
        System.out.println("Preparing to perform action...");
    }

    private void complete() {
        System.out.println("Action completed.");
    }
}

