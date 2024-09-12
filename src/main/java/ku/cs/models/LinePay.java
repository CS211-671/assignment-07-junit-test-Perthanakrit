package ku.cs.models;

public class LinePay implements Cash{
    private String lineID;
    private String lineAccountName;
    private double balance;

    public  LinePay(String lineID, String lineAccountName, double balance){
        this.lineID = lineID;
        this.lineAccountName = lineAccountName;
        this.balance = balance;
    }

    // ....... getter ......

    @Override
    public boolean getCash(double amount) {
        if (balance >= amount){
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String getInfo() {
        return "LinePay line id : "+lineID;
    }

    @Override
    public String toString() {
        return "LinePay{" +
                "lineID='" + lineID + '\'' +
                ", lineAccountName='" + lineAccountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
