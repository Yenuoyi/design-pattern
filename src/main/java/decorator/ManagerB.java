package decorator;

/**
 * @author yebing
 */
public class ManagerB implements Person {
    private Person person;
    
    public ManagerB(Person person) {
        this.person = person;
    }
    @Override
    public void doCoding() {
        person.doCoding();
        doEndWork();
    }
    public void doEndWork() {
        System.out.println("Project manager can manage!");
    }
    
}
