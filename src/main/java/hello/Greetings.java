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
                    greeting = "Boa tarde!" + pronome;
                }else{
                    greeting = "Boa noite!" + pronome;
                }
                break;
            case "en":
                if (period == 1){
                    greeting = "Good Morning!" + pronome;
                }else if (period == 2){
                    greeting = "Good Afternoon!" + pronome;
                }else{
                    greeting = "Good Evening!" + pronome;
                }
                break;
            case "de":
                if (period == 1){
                    greeting = "Guten Morgen!" + pronome;
                }else if (period == 2){
                    greeting = "Guten Nachmittag!" + pronome;
                }else{
                    greeting = "Gute Abend!" + pronome;
                }
                break;
            case "fr":
                if (period == 1){
                    greeting = "Bonjour!" + pronome;
                }else if (period == 2){
                    greeting = "Bonne soirée!" + pronome;
                }else{
                    greeting = "Bonsoir!" + pronome;
                }
                break;
            case "se":
                if (period == 1){
                    greeting = "God Morgon!" + pronome;
                }else if (period == 2){
                    greeting = "God Eftermiddag!" + pronome;
                }else{
                    greeting = "God Kväll!" + pronome;
                }
                break;
            case "in":
                if (period == 1){
                    greeting = "shubh prabhaat!" + pronome;
                }else if (period == 2){
                    greeting = "namaskaar!" + pronome;
                }else{
                    greeting = "susandhya!" + pronome;
                }
                break;
        }
    }
    
    
}