package decorator;

/**
 * @author yebing
 */
public class ManagerA implements Person {
    private Person person;

    public ManagerA(Person person) {
        this.person = person;
    }

    @Override
    public void doCoding() {
        person.doCoding();
        doEarlyWork();
    }

    public void doEarlyWork() {
        System.out.println("Project manager can mirCroService!");
    }
}