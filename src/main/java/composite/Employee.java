package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 雇员信息
 * @author yebing
 */
public class Employee {
   /** 雇员姓名 */
   private String name;
   /** 部门 */
   private String dept;
   /** 薪资 */
   private int salary;
   /** 下属 */
   private List<Employee> subordinates;

   public Employee(String name,String dept, int sal) {
      this.name = name;
      this.dept = dept;
      this.salary = sal;
      subordinates = new ArrayList<Employee>();
   }

   public void add(Employee e) {
      subordinates.add(e);
   }

   public void remove(Employee e) {
      subordinates.remove(e);
   }

   public List<Employee> getSubordinates(){
     return subordinates;
   }


   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDept() {
      return dept;
   }

   public void setDept(String dept) {
      this.dept = dept;
   }

   public int getSalary() {
      return salary;
   }

   public void setSalary(int salary) {
      this.salary = salary;
   }

   @Override
   public String toString() {
      return "Employee{" +
              "name='" + name + '\'' +
              ", dept='" + dept + '\'' +
              ", salary=" + salary +
              ", subordinates=" + subordinates +
              '}';
   }
}