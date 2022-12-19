public class Payment{
    private String month;
    private int date;
    private String method;
    private double amount;

    public static int num = 6;

    public Payment() {
        month = "";
        date = 0;
        method = "";
        amount = 0;
    }

    public Payment(String m, int d, String md, double a){
        month = m;
        date = d;
        method = md;
        amount = a;
        
    }
    public String getMonth(){
        return month;
    }

    public int getDate() {
        return date;
    }

    public String getMethod() {
        return method;
    }
    public double getAmount() {
        return amount;
    }
    public void setMonth(String month){
        this.month = month;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void paymentInfo() {
    	System.out.println();
        System.out.println("Month: " + month);
        System.out.println("Date of the Month: " + date);
        System.out.println("Method 'Online' or 'Casher': " + method);
        System.out.println("Amount to Pay: " + amount);
        System.out.println();
    }

    public double ComputePayment(){
        if (date > num){
            double total = (amount*.05);
            return total;

              
        }
    }
}
