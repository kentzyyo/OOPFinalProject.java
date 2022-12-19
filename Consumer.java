public class Consumer {
  private String name;
  private String address;
  private String phone;
  private double monthlyConsumption;

  public Consumer(String name, String address, String phone, double monthlyConsumption) {
    this.name = name;
    this.address = address;
    this.phone = phone;
    this.monthlyConsumption = monthlyConsumption;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public String getPhone() {
    return phone;
  }

  public double getMonthlyConsumption() {
    return monthlyConsumption;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setMonthlyConsumption(double monthlyConsumption) {
    this.monthlyConsumption = monthlyConsumption;
  }

  public double calculateBill() {
    return monthlyConsumption * 0.1;
  }
}

