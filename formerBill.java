public class formerBill {
    private double interest;
    private double tax;
    private double usage;
    private double penalty;
    private String meterNum;

    public static int kiloWatHr = 32;

    public formerBill() {
        interest = 0;
        tax = 0;
        usage = 0;
        penalty = 0;
        meterNum = "";
    }

    public formerBill(double interest, double tax, double usage) {
        this.interest = interest;
        this.tax = tax;
        this.usage = usage;
    }

    public formerBill(double i, double t, double u, double p, String mn) {
        interest = i;
        tax = t;
        usage = u;
        penalty = p;
        meterNum = mn;
    }

    public double getInterest() {
        return interest;
    }

    public double getTax() {
        return tax;
    }

    public double getUsage() {
        return usage;
    }

    public double getPenalty() {
        return penalty;
    }

    public String getMeterNum() {
        return meterNum;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setUsage(double usage) {
        this.usage = usage;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public void setMeterNum(String meterNum) {
        this.meterNum = meterNum;
    }

    public void billInfo() {
        System.out.println("Interest: " + interest);
        System.out.println("Tax: " + tax);
        System.out.println("Usage: " + usage);
        System.out.println("Penalty: " + penalty);
        System.out.println("Meter Number: " + meterNum);
        System.out.println("KiloWatt per Hour: " + formerBill.kiloWatHr);
    }

    public double ComputeBill(){
        double tim = usage * 8.4510;
        double itr = (1+(interest/12));
        double total = tim + itr + tax;
        return total;
    }
}
