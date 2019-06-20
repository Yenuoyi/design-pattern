package facade;

/**
 * @author yebing
 */
public class Facade {
    private Shape chat;
    private Shape run;

    public Facade() {
        this.chat = new Chat();
        this.run = new Run();
    }

    public void Chat() {
        chat.doing();
    }

    public void run() {
        run.doing();
    }
}
