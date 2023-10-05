public class Main {
    public static void main(String[] args) {

        int balance = 5000;
        double interest = balance *.17;
        double oneMonth = balance + interest;
        double interest2 = oneMonth * .17;
        double twoMonth = oneMonth + interest2;
        

        System.out.println("After your first month your balance is " + oneMonth +".");
        System.out.println("After your second month your balance is " + twoMonth +".");
    }
}