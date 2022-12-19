public class Employee {
  private String name;
  private String role;
  private double salary;

  public Employee(String name, String role, double salary) {
    this.name = name;
    this.role = role;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public String getRole() {
    return role;
  }

  public double getSalary() {
    return salary;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
  
}

