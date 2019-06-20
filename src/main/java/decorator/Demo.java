package decorator;

/**
 * @author yebing
 */
public class Demo {
    public static void main(String[] args) {
        Person employee = new Employee();
        /* 管理者A会普通程序员的工作 */
        employee = new ManagerA(employee);
        /* 管理员B会管理者A的工作 */
        employee = new ManagerB(employee);
        employee.doCoding();
    }
}
