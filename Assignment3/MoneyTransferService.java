public class MoneyTransferService {
    
    public static void main(String[] args){
       // MoneyTransferService obj1 = new MoneyTransferService();
        CurrencyConverter cc = new CurrencyConverter(); 
        double transferAmount=cc.computeTransferAmount(0,1000);
        double transferFee=cc.computeTransferFee(0,1000);
        System.out.println("Transfer Amount: " + transferAmount);
        System.out.println("Transfer Fee: " + transferFee);
    }
    
}
