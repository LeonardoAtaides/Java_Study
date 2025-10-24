
/*public interface NotificationService {
        void send(String message);
    }

    public class EmailNotification implements NotificationService{
        @Override
        public void send(String message){
            System.out.println("Sending email:" + message);
        }
    }

    public class EmployeeAlert{
        private NotificationService notifier;

        public void EmployeeManager(NotificationService notifier){
            this.notifier = notifier;

        }
        public void alert(String msg){
            notifier.send(msg);
        }

    }*/

    public interface PaymentMethod{
        void process(double amount);
    }

    class CreditCardPayment{

    }

    class PayPalPagament{

    }

    class EmailService{

    }

    class PayamentProcessor{

    }




/*class PaymentProcessor{
    public void processPayment(String type, double amount ){
        if (type.equals("credit_card")){
            System.out.println("Processing credit card payment of $" + amount);
        } else if(type.equals("paypal")){
            System.out.println("Processing paypal payment of $" + amount);
        }
    }

    public void sendConfirmationEmail(String type, double amount){
        System.out.println("Email sent confirming" + type + "payment of $" + amount);
    }
}*/





    public class Main {
        public static void main(String[] args) {

        }

    }
