/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;
import java.beans.*;
import java.io.Serializable;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;
import java.util.Date;  
import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author gmartinho
 */
public class ActualDate implements Serializable {
    private String date;
    
    public ActualDate() {
    }
    
    public String getDate() {
        return date;
    }
    
    public void setDate(String value) {
        Date currentDate = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        String strDate = dateFormat.format(currentDate);

        String dateText;
        
        switch (value){
            case "":
            case "pt":
                dateText = "Data e horário atual no Brasil: ";
                date = dateText + strDate;
                break;
            case "en":
                dateText = "Current date and time in USA: ";
                date = dateText + strDate;
                break;
            case "de":
                dateText = "Aktuelles Datum und Uhrzeit in Deutschland: ";
                date = dateText + strDate;
                break;
            case "fr":
                dateText = "Date et heure actuelles en France: ";
                date = dateText + strDate;
                break;
            case "se":
                dateText = "Aktuellt datum och tid i Sverige: ";
                date = dateText + strDate;
                break;
            case "in":
                dateText = "bhaarat mein vartamaan tithi aur samay: ";
                date = dateText + strDate;
                break;
        }
    }

}