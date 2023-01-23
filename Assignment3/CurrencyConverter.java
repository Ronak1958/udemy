public class CurrencyConverter {
    int rupee = 63;
    int dirham = 3;
    int _yen = 107;
    int $australian =2 ;
    /*int dollar ;
    int Rupee = 63;*/
    double[] exchangeRates={63.0,3.0,107.0,2.0};

    double computeTransferAmount(int countryIndex,double amount){
            return exchangeRates[countryIndex]*amount;
    }
    double computeTransferFee(int countryIndex,double amount){
            return computeTransferAmount(countryIndex, amount)*0.02;
    }

    void printCurrency(){
        System.out.println("rupee : " + exchangeRates[0]);
        System.out.println("dirham : " + exchangeRates[1]);
        System.out.println("_yen : " + exchangeRates[2]);
        System.out.println("$australian : "+ exchangeRates[exchangeRates.length-1]);

       /*  System.out.println("dollar : " + dollar);
        System.out.println("Rupee : " + Rupee);*/

    }
    
    
}
