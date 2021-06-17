public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int refill = 1540;
        if (refill>1000) {refill=
            refill + refill/100 ;
        } else {
            refill=refill;
        }
        int totalBalance = currentBalance + refill;

        System.out.println(totalBalance);
    }
}