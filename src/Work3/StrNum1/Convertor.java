package Work3.StrNum1;

import java.text.NumberFormat;
import java.util.Locale;

public class Convertor {
    private final NumberFormat numFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
    private final NumberFormat numFormatCH = NumberFormat.getCurrencyInstance(Locale.CHINA);
    private final NumberFormat numFormatJAP = NumberFormat.getCurrencyInstance(Locale.JAPANESE);
    private final NumberFormat numFormatFR = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    private Locale locale;
    private double value;
    public Convertor(Locale locale, int value){
        this.value = value;
        this.locale = locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public String convToUS(){
        if (locale.equals(Locale.US)) {
            return numFormatUS.format(value);
        }
        else if (locale.equals(Locale.CHINA)) {
            return numFormatUS.format(value * 0.14);
        }
        else if (locale.equals(Locale.FRANCE)) {
            return numFormatUS.format(value * 1.07);
        }
        else if (locale.equals(Locale.JAPAN)) {
            return numFormatUS.format(value * 0.0068);
        }
        else{
            return "Неверный формат страны, доступные сраны: FRANCE, JAPAN, CHINA, US";
        }
    }
    public String convToCH(){
        if (locale.equals(Locale.US)) {
            return numFormatCH.format(value * 7.35);
        }
        else if (locale.equals(Locale.CHINA)) {
            return numFormatCH.format(value);
        }
        else if (locale.equals(Locale.FRANCE)) {
            return numFormatCH.format(value * 7.76);
        }
        else if (locale.equals(Locale.JAPAN)) {
            return numFormatCH.format(value * 0.05);
        }
        else{
            return "Неверный формат страны, доступные сраны: FRANCE, JAPAN, CHINA, US";
        }
    }
    public String convToJAP(){
        if (locale.equals(Locale.US)) {
            return numFormatJAP.format(value * 147.25);
        }
        else if (locale.equals(Locale.CHINA)) {
            return numFormatJAP.format(value * 20.07);
        }
        else if (locale.equals(Locale.FRANCE)) {
            return numFormatJAP.format(value * 157.94);
        }
        else if (locale.equals(Locale.JAPAN)) {
            return numFormatJAP.format(value);
        }
        else{
            return "Неверный формат страны, доступные сраны: FRANCE, JAPAN, CHINA, US";
        }
    }
    public String convToFR(){
        if (locale.equals(Locale.US)) {
            return numFormatFR.format(value * 0.93);
        }
        else if (locale.equals(Locale.CHINA)) {
            return numFormatFR.format(value * 0.13);
        }
        else if (locale.equals(Locale.FRANCE)) {
            return numFormatFR.format(value);
        }
        else if (locale.equals(Locale.JAPAN)) {
            return numFormatFR.format(value * 0.0063);
        }
        else{
            return "Неверный формат страны, доступные сраны: FRANCE, JAPAN, CHINA, US";
        }
    }
}
