package kim.andy.WuTangFinancial;

/**
 * Created by andykim on 1/12/17.
 */
public class WuTangFinancial {
    double usd = 1.00;
    double euroToDollar = 0.94;
    double britishPoundToDollar = 0.82;
    double indianRupeeToDollar = 68.32;
    double australianDollarToDollar = 1.35;
    double canadianDollarToDollar = 1.32;
    double singaporeDollarToDollar = 1.43;
    double swissFrancToDollar = 1.01;
    double malaysianRinggitToDollar = 4.47;
    double japaneseYenToDollar = 115.84;
    double chineseRenminbiToDollar = 6.92;

public void moneyConverter(double firstCurrencyRate, double endCurrencyRate, double howMuchFirstCurrency){


    double answer = firstCurrencyRate/endCurrencyRate;
    double finalAnswer = answer*howMuchFirstCurrency;

    System.out.println(finalAnswer);



}
    public static void main(String[] args) {

    WuTangFinancial printMoney = new WuTangFinancial();
        printMoney.moneyConverter(0.82, 0.94, 4.00);

    }



}



