public class Compound {

    public static void main(String[] args) {

        double startAmount = 100000;
        double rate = 5;
        double compoundInterest;
        int time = 3;

        System.out.println("The startAmount is " + startAmount + ". The interest rate is "+ rate + ", the time period is" + time);
        compoundInterest = startAmount * (Math.pow((1 + rate / 100), time)) - startAmount;
        System.out.println("The Compound Interest after "+ time +" years time period is " + compoundInterest);
    }



}
