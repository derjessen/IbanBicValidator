package de.torben.controllers;

import org.iban4j.BicFormatException;
import org.iban4j.BicUtil;
import org.iban4j.IbanFormatException;
import org.iban4j.IbanUtil;
import org.iban4j.InvalidCheckDigitException;
import org.iban4j.UnsupportedCountryException;

public class IbanBicForm {
    
    private String iban;
    private String bic;
    
    public void setIban(String iban){
        this.iban = iban;
    }
    
    public void setBic(String bic){
        this.bic = bic;
    }
    
    public String getIban(){
        return this.iban;
    }
    
    public String getBic(){
        return this.bic;
    }
    
    public String getValidateIban(){
    String tmp;
        try {
            IbanUtil.validate(iban);
            tmp = "Zulässig";
        } catch (IbanFormatException | InvalidCheckDigitException | UnsupportedCountryException e) {
            tmp = "Unzulässig: " + e.getMessage();
        }
        return tmp;
    }
    
    public String getValidateBic(){
    String tmp;
        try {
            BicUtil.validate(this.bic);
            tmp = "Zulässig";
        } catch (BicFormatException e) {
            tmp = "Unzulässig: " + e.getMessage();
        }
        return tmp;
    }
}
