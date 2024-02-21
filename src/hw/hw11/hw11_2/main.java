package hw.hw11.hw11_2;

public class main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addBankAcc("Gresha");
        bank.addBankAcc("Posya");
        bank.addBankAcc("Slalav");
        bank.addMoney("Gresha", 10);
        bank.blockBankAcc("Gresha");
        bank.removeMoney("Gresha", 5);
        bank.infoAll();
        bank.removeMoney("Posya", 10);
        bank.transferMoney("Posya", 20, "Slalav");
        bank.infoAll();
        bank.addMoney("Posya", 10);
        bank.transferMoney("Posya", 5, "Slalav");
        bank.infoAll();
        bank.addMoney("qo4htowh4th",1650162587);
    }
}