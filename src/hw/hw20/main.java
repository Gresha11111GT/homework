package hw.hw20;

public class main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addBankAcc("Gresha");
        bank.addBankAcc("Posya");
        bank.addBankAcc("Slalav");
        Thread addMoney = new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                bank.deposit("Gresha", 250);
                bank.withdraw("Gresha", 100);
            }
        });
        Thread removeMoney = new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                bank.withdraw("Gresha", 100);
                bank.deposit("Gresha", 250);
            }
        });
        addMoney.start();
        removeMoney.start();
    }
}