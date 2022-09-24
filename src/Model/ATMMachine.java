package Model;

public class ATMMachine {


    private int totalMoney;
    String address;
    String bank;

    public ATMMachine() {
        totalMoney = 10000;
    }

    public ATMMachine(int totalMoney) {
        this.totalMoney = totalMoney;
    }


    public void printMoney() {
        System.out.println(totalMoney);
    }


    public void inputMoney(int totalMoney) {
        if (totalMoney > 5000)
            this.totalMoney = totalMoney;
    }

}
