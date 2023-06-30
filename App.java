public class App {
    public static void main(String[] args) {

        Currency todaysCurrency    = new Currency("EUR","MDL",17.50f,"2020-01-01");
        Currency tomorrowsCurrency = todaysCurrency.setDateAndValue("2020-01-02", 18.00f); // Au fost create 2 obiecte de tip Currency,
                                                                                                      // al doilea prin crearea unei clone si modificarea ei

        System.out.println(todaysCurrency);
        System.out.println(tomorrowsCurrency);
        
    }
}

final class Currency implements Cloneable {
    private String baseCode;
    private String code;
    private Float value;
    private String date;

    public Currency(String baseCode, String code, Float value, String date) {
        this.baseCode = baseCode;
        this.code = code;
        this.value = value;
        this.date = date;
    }

    public final String getBaseCode() {
        return baseCode;
    }

    public final String getCode() {
        return code;
    }

    public final Float getValue() {
        return value;
    }

    public final String getDate() {
        return date;
    }

    public final Currency setBaseCode(String baseCode) {
        Currency clonnedCurrency = null;
        try {
            clonnedCurrency = (Currency)this.clone();
            clonnedCurrency.baseCode = baseCode;
        } catch (CloneNotSupportedException e) {
           System.out.println("CLONE ERROR!");
        }
        return clonnedCurrency;
    }

    public final Currency setCode(String code) {
        Currency clonnedCurrency = null;
        try {
            clonnedCurrency = (Currency)this.clone();
            clonnedCurrency.code = code;
        } catch (CloneNotSupportedException e) {
           System.out.println("CLONE ERROR!");
        }
        return clonnedCurrency;
    }

    public final Currency setValue(Float value) {
        Currency clonnedCurrency = null;
        try {
            clonnedCurrency = (Currency)this.clone();
            clonnedCurrency.value = value;
        } catch (CloneNotSupportedException e) {
           System.out.println("CLONE ERROR!");
        }
        return clonnedCurrency;
    }

    public final Currency setDate(String date) {
        Currency clonnedCurrency = null;
        try {
            clonnedCurrency = (Currency)this.clone();
            clonnedCurrency.date = date;
        } catch (CloneNotSupportedException e) {
           System.out.println("CLONE ERROR!");
        }
        return clonnedCurrency;
    }

    public final Currency setDateAndValue(String date, Float value) {
        Currency clonnedCurrency = null;
        try {
            clonnedCurrency = (Currency)this.clone();
            clonnedCurrency.date  = date;
            clonnedCurrency.value = value;
        } catch (CloneNotSupportedException e) {
           System.out.println("CLONE ERROR!");
        }
        return clonnedCurrency;
    }

    @Override
    public String toString() {
        return "Currency [" + baseCode + " - " + code + ", " + value + ", " + date + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
}