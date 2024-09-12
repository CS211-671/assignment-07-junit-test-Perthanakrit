package ku.cs.models;

public class TrueMoneyCard implements Cash{
    private String serialNumber;
    private double value;

    public TrueMoneyCard(String serialNumber, double value){
        this.serialNumber = serialNumber;
        this.value = value;
    }

    //.......... getter ...........

    @Override
    public boolean getCash(double amount) {
        if (amount == value){
            value = 0;
            return true;
        }
        return false;
    }

    @Override
    public String getInfo() {
        return "TrueMoneyCard serial number: "+serialNumber;
    }

    @Override
    public String toString() {
        return "TrueMoneyCard{" +
                "serialNumber='" + serialNumber + '\'' +
                ", value=" + value +
                '}';
    }
}
