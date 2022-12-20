import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

// Consumer class represents a consumer of electricity
class Consumer {
  private String name;
  private String address;
  private int accountNumber;
  private double balance;

  public Consumer(String name, String address, int accountNumber, double balance) {
    this.name = name;
    this.address = address;
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public String getName() {
    return this.name;
  }

  public String getAddress() {
    return this.address;
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}

// Employee class represents an employee of the electric company
class Employee {
  private String name;
  private int employeeId;

  public Employee(String name, int employeeId) {
    this.name = name;
    this.employeeId = employeeId;
  }

  public String getName() {
    return this.name;
  }

  public int getEmployeeId() {
    return this.employeeId;
  }
}

// MeterReader class represents an employee who reads meters for the electric company
class MeterReader extends Employee {
  public MeterReader(String name, int employeeId) {
    super(name, employeeId);
  }

  public double readMeter(Consumer consumer) {
    // simulate reading the meter by returning a random number between 500 and 1000
    return 500 + Math.random() * 500;
  }
}

// Bill class represents an electricity bill for a consumer
class Bill {
  private Consumer consumer;
  private double amount;
  private String dueDate;

  public Bill(Consumer consumer, double amount, String dueDate) {
    this.consumer = consumer;
    this.amount = amount;
    this.dueDate = dueDate;
  }

  public Consumer getConsumer() {
    return this.consumer;
  }

  public double getAmount() {
    return this.amount;
  }

  public String getDueDate() {
    return this.dueDate;
  }
}

// Payment class represents a payment made by a consumer towards their electricity bill
class Payment {
  private Consumer consumer;
  private double amount;
  private String paymentDate;
  private String mode; // mode of payment

  public Payment(Consumer consumer, double amount, String paymentDate, String mode) {
    this.consumer = consumer;
    this.amount = amount;
    this.paymentDate = paymentDate;
    this.mode = mode;
  }

  public Consumer getConsumer() {
    return this.consumer;
  }

  public double getAmount() {
    return this.amount;
  }

  public String getPaymentDate() {
    return this.paymentDate;
  }

  public String getMode() {
    return this.mode;
  }
}
public class ElectricManagementSystem {
  private static final String CONSUMERS_FILE = "consumers.txt";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Consumer> consumers = new ArrayList<>();

    // Load consumers from file
    try {
      FileReader reader = new FileReader(CONSUMERS_FILE);
      Scanner fileScanner = new Scanner(reader);
      while (fileScanner.hasNextLine()) {
        String line = fileScanner.nextLine();
        String[] parts = line.split(",");
        String name = parts[0];
        String address = parts[1];
        int accountNumber = Integer.parseInt(parts[2]);
        double balance = Double.parseDouble(parts[3]);
        Consumer consumer = new Consumer(name, address, accountNumber, balance);
        consumers.add(consumer);
      }
      reader.close();
    } catch (Exception e) {
      // File does not exist or there was an error reading the file.
      // Either way, we just start with an empty list of consumers.
    }

    while (true) {
      

      System.out.println("\n-----------CURUSEKO-----------");
      System.out.println("1. Register consumer");
      System.out.println("2. Process payment");
      System.out.println("3. List consumers");
      System.out.println("4. Exit");
      System.out.print("\nEnter choice: "); //
      int choice = scanner.nextInt();

      if (choice == 1) {
        // register a new consumer
        System.out.print("\nEnter consumer name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Enter consumer address: ");
        String address = scanner.nextLine();
        System.out.print("Enter consumer account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter consumer balance: ");
        double balance = scanner.nextDouble();
        Consumer consumer = new Consumer(name, address, accountNumber, balance);
        consumers.add(consumer);
        System.out.println("\nConsumer registered successfully!");
      } else if (choice == 2) {
        // process a payment from a consumer
        if (consumers.isEmpty()) {
          System.out.println("\nNo consumers registered.");
        } else {
          System.out.print("Enter consumer account number: ");
          int accountNumber = scanner.nextInt();
          Consumer consumer = null;
          for (Consumer c : consumers) {
            if (c.getAccountNumber() == accountNumber) {
              consumer = c;
              break;
            }
          }
          if (consumer == null){
            System.out.println("Consumer not found.");
          } else {
            System.out.print("Enter payment amount: ");

            double amount = scanner.nextDouble();
            System.out.println("\nSelect mode of payment:");
            System.out.println("1. Cash");
            System.out.println("2. Check");
            System.out.println("3. Credit card");
            System.out.print("\nEnter choice: ");
            int paymentMode = scanner.nextInt();
            String mode = "\n";
            if (paymentMode == 1) {
              mode = "Cash";
            } else if (paymentMode == 2) {
              mode = "Check";
            } else if (paymentMode == 3) {
              mode = "Credit card";
            } else {
              System.out.println("\nInvalid choice. Payment not processed.");
              continue;
            }
            Payment payment = new Payment(consumer, amount, "today", mode);
            consumer.setBalance(payment.getAmount() - consumer.getBalance() );
            System.out.println("\nPayment of Php " + payment.getAmount() + " received from " + consumer.getName() + " by " + payment.getMode());
            System.out.println("New balance: Php " + consumer.getBalance());
          }
        }
      } else if (choice == 3) {
        // list all consumers
        if (consumers.isEmpty()) {
          System.out.println("\nNo consumers registered.");
        } else {
          System.out.println("\nConsumers:");
          System.out.println("Name"+"\t\t"+"Address"+"\t\t"+"Account"+"\t\t"+"Balance");
          System.out.println();
          for(Consumer c: consumers){
            //System.out.println("Name: " + c.getName() + ", Address: " + c.getAddress() + ", Account Number: " + c.getAccountNumber() + ", Balance: Php" +c.getBalance());
            System.out.println(c.getName() +"\t\t" + c.getAddress() + "\t\t" +c.getAccountNumber() +"\t\t"+ c.getBalance());
          }
        }
      } else if (choice == 4) {
        // exit the program
        System.out.println("\nExiting the program. Thank You!");

        break;
      } else {
        System.out.println("\nInvalid choice. Please try again.");
      }
    }
  }
}
