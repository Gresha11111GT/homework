package ls;

public class ls9 {
    public static void main(String[] args) {
        user Gresha_11111_GT = new user();
        Gresha_11111_GT.name = "Gregory";
        Gresha_11111_GT.age = 15;
        Gresha_11111_GT.login = "Gresha_11111_GT";
        Gresha_11111_GT.password = "1234509876";


        user Val = new user();
        Val.name = "Valera";
        Val.age = 30;
        Val.login = "Vel";
        Val.password = "0987612345";


        Gresha_11111_GT.print();
        Val.print();
    }
}