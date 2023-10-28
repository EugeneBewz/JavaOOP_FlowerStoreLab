package ua.edu.ucu.apps.lab7.payment_strategy;

public class PayPalPaymentStrategy implements Payment {
    public boolean isSignedIn;

    @Override
    public boolean pay(double price) {
        if (isSignedIn) {
            System.out.println("PayPal payment went successfully!");
            return true;
        } else {
            System.out.println("Something went wrong... Check whether you are signed in.");
            return false;
        }
    }

    // * This method will change status to true
    // * if user data matches the one in data base
    // private void setSignInStatus(boolean status) {
    //     this.isSignedIn = status;
    // }
}
