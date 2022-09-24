package Model;

public class AtmCard extends Card {

    public AtmCard(int money) {
        this.money = money;
    }

    public void printMoney() {
        System.out.println("print money of ATM" + money);
    }


}
