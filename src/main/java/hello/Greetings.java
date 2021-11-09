/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;
import java.beans.*;
import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author gmartinho
 */
public class Greetings implements Serializable{
    private int period;
    private String greeting;
    private String pron;
    
    public Greetings() {
    }

    public String getPron() {
        return pron;
    }

    public void setPron(String value) {
        pron = value;
    }
        
    
    public String getGreeting() {
        return greeting;
    }
    
    public void setGreeting(String value) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        String pronome = getPron();

        if(hour > 6 && hour < 12){
            period = 1;
        }else if(hour > 12 && hour < 18){
            period = 2;
        }else{
            period = 3;
        }
	
        switch (value){
            case "":
            case "pt":
                if (period == 1){
                    greeting = "Bom dia!" + pronome;
                }else if (period == 2){
                    greeting = "Boa tarde!";
                }else{
                    greeting = "Boa noite!";
                }
                break;
            case "en":
                if (period == 1){
                    greeting = "Good Morning!";
                }else if (period == 2){
                    greeting = "Good Afternoon!";
                }else{
                    greeting = "Good Evening!";
                }
                break;
            case "de":
                if (period == 1){
                    greeting = "Guten Morgen!";
                }else if (period == 2){
                    greeting = "Guten Nachmittag!";
                }else{
                    greeting = "Gute Abend!";
                }
                break;
            case "fr":
                if (period == 1){
                    greeting = "Bonjour!";
                }else if (period == 2){
                    greeting = "Bonne soirée!";
                }else{
                    greeting = "Bonsoir!";
                }
                break;
            case "se":
                if (period == 1){
                    greeting = "God Morgon!";
                }else if (period == 2){
                    greeting = "God Eftermiddag!";
                }else{
                    greeting = "God Kväll!";
                }
                break;
            case "in":
                if (period == 1){
                    greeting = "shubh prabhaat!";
                }else if (period == 2){
                    greeting = "namaskaar!";
                }else{
                    greeting = "susandhya!";
                }
                break;
        }
    }
    
    
}