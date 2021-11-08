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
import java.time.ZoneId;
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
        
        String strDate;
        String dateText;
        
        switch (value){
            case "":
            case "pt":
                dateText = "Data e horário atual no Brasil: ";
                dateFormat.setTimeZone(TimeZone.getTimeZone("BRT"));
                strDate = dateFormat.format(currentDate); 
                date = dateText + strDate;
                break;
            case "en":
                dateText = "Current date and time in USA: ";
                dateFormat.setTimeZone(TimeZone.getTimeZone("EST"));
                strDate = dateFormat.format(currentDate); 
                date = dateText + strDate;
                break;
            case "de":
                dateText = "Aktuelles Datum und Uhrzeit in Deutschland: ";
                dateFormat.setTimeZone(TimeZone.getTimeZone("CET"));
                strDate = dateFormat.format(currentDate); 
                date = dateText + strDate;
                break;
            case "fr":
                dateText = "Date et heure actuelles en France: ";
                dateFormat.setTimeZone(TimeZone.getTimeZone("CET"));
                strDate = dateFormat.format(currentDate); 
                date = dateText + strDate;
                break;
            case "se":
                dateText = "Aktuellt datum och tid i Sverige: ";
                dateFormat.setTimeZone(TimeZone.getTimeZone("CET"));
                strDate = dateFormat.format(currentDate); 
                date = dateText + strDate;
                break;
            case "in":
                dateText = "bhaarat mein vartamaan tithi aur samay: ";
                dateFormat.setTimeZone(TimeZone.getTimeZone("IST"));
                strDate = dateFormat.format(currentDate); 
                date = dateText + strDate;
                break;
        }
    }

}