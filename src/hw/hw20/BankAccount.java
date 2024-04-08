package hw.hw20;

public class BankAccount {
    private String name;
    private int money;
    private boolean stateOfAcc;

    public BankAccount(String name) {
        this.money = 0;
        this.stateOfAcc = true;
         this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isStateOfAcc() {
        return stateOfAcc;
    }

    public void setStateOfAcc(boolean stateOfAcc) {
        this.stateOfAcc = stateOfAcc;
    }
    public void addMoney(int moneyToAdd){
        this.money += moneyToAdd;
    }
    public void removeMoney(int moneyToRemove){
        this.money -= moneyToRemove;
    }
}