package OOP.src;

// encapsulation
public class Employee {
  private int salary;
  private int overtime;
  private int payPerHour;

  public void setSalary(int salary) {
    if (salary <= 0) {
      throw new IllegalArgumentException("Salary cannot be below 0");
    }

    this.salary = salary;
  };

  public int getSalary() {
    return this.salary;
  }

  public void setOvertime(int overtime) {
    if (overtime < 0) {
      throw new IllegalArgumentException("Overtime cannot be below 0");
    }

    this.overtime = overtime;
  }

  public int getOvertime() {
    return this.overtime;
  }

  public void setPayPerHour(int payPerHour) {
    if (payPerHour <= 0) {
      throw new IllegalArgumentException("Pay per our cannot be below 0");
    }

    this.payPerHour = payPerHour;
  }

  public int getPayPerHour() {
    return payPerHour;
  }

  public int calculateWage() {
    return this.salary + (this.overtime * this.payPerHour);
  }

}