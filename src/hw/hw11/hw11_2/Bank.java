package hw.hw11.hw11_2;

import hw.hw11.hw11_1.Book;
import hw.hw9.hw9_2.Student;

import java.util.Arrays;
import java.util.Objects;

public class Bank {
    static BankAccount[] bankAccounts;

    public Bank() {
        bankAccounts = new BankAccount[0];
    }
    public void addBankAcc(String name) {
        bankAccounts = Arrays.copyOf(bankAccounts, bankAccounts.length + 1);
        bankAccounts[bankAccounts.length - 1] = new BankAccount(name);
    }

    public void blockBankAcc(String name) {
        for (int i = 0; i < bankAccounts.length; i++) {
            if(Objects.equals(bankAccounts[i].getName(), name)) {
                bankAccounts[i].setStateOfAcc(false);
                break;
            }
        }
    }
    public void unblockBankAcc(BankAccount name) {
        name.setStateOfAcc(true);
    }
    public void addMoney(String name, int moneyToAdd){
        BankAccount ba = getCardByName(name);
        if (ba!=null){
            if (ba.isStateOfAcc()){
                ba.addMoney(moneyToAdd);
                System.out.println("Бабла стало більше");
            }
            else
                System.out.println("Ваш рахунок заблоковано");
        }
        else System.out.println("Такого рахунку не знайдено гигиги");
    }
    public void removeMoney(String name, int moneyToRemove){
        BankAccount ba = getCardByName(name);
        if (ba!=null){
            if (ba.isStateOfAcc()) {
                if (!(ba.getMoney() < moneyToRemove)){
                    ba.setMoney(ba.getMoney()-moneyToRemove);
                    System.out.println("Бабла стало менше");
                }
                else
                    System.out.println("На рахунку не достатньо грошей");
            }
            else
                System.out.println("Ваш рахунок заблоковано");
        }
        else System.out.println("Такого рахунку не знайдено гигиги");
    }
    public void transferMoney(String name1, int moneyToTransfer, String name2){
        BankAccount ba1 = getCardByName(name1);
        BankAccount ba2 = getCardByName(name2);
        if (ba1!=null && ba2!=null){
            if (ba1.isStateOfAcc()) {
                if (ba2.isStateOfAcc()) {
                    if (ba1.getMoney() > moneyToTransfer) {
                        ba1.removeMoney(moneyToTransfer);
                        ba2.addMoney(moneyToTransfer);
                    }
                    else System.out.println("На рахунку не достатньо грошей");
                } else System.out.println("Ваш рахунок заблоковано");
            } else {
                System.out.println("Ваш рахунок заблоковано");
            }
        }
        else System.out.println("Такого рахунку не знайдено гигиги");
    }
    public void info(String name){
        BankAccount ba = getCardByName(name);
        if (ba!=null)
            System.out.println("Грошей на рахунку: "+ba.getMoney()+", стан акаунту: "+ba.isStateOfAcc()+", ім'я на яке зареєстрований рахунок: "+ba.getName());
        else System.out.println("Такого рахунку не знайдено гигиги");
    }
    public void infoAll(){
        for (BankAccount ba : bankAccounts) {
            System.out.println("Грошей на рахунку: "+ba.getMoney()+", стан акаунту: "+ba.isStateOfAcc()+", ім'я на яке зареєстрований рахунок: "+ba.getName());
        }
    }
    private BankAccount getCardByName(String name) {
        for (BankAccount bankAccount : bankAccounts) {
            if (Objects.equals(bankAccount.getName(), name)) {
                return bankAccount;
            }
        }
        return null;
    }
}
