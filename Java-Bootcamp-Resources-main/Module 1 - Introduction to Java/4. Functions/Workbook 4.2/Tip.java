public class Tip {

    public static void main(String[] args) {
        double bill = 53.5;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
    
        //Task 2: Call a function that tips the waiter.
        tipTheWaiter(bill);
    }

    public static void tipTheWaiter(double bill){
        double tip = (15*bill)/100;

        System.out.println("Your service was wonderful! Please, accept this tip: "+tip);
    }

}