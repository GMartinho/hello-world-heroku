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
    private String greeting;
    private String period;
    
    public Greetings() {
    }
        
    
    public String getGreetings() {
        return greeting;
    }
    
    public void setGreetings(String value) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        if(hour > 6 && hour < 12){
            period = "morning";
        }else if(hour > 12 && hour < 18){
            period = "afternoon";
        }else{
            period = "evening";
        }
	
        switch (value){
            case "":
            case "pt":
                if (period == "morning")
                    greeting = "Bom dia!";
		        else if (period == "afternoon")
                    greeting = "Boa tarde!";
		        else
                    greeting = "Boa noite!";
                break;

            case "en":
                if (period == "morning")
                    greeting = "Good Morning!";
		        else if (period == "afternoon")
                    greeting = "Good Afternoon!";
		        else
                    greeting = "Good Evening!";
                break;

            case "de":
                if (period == "morning")
                    greeting = "Guten Morgen!";
		        else if (period == "afternoon")
                    greeting = "Guten Nachmittag!";
		        else
                    greeting = "Gute Abend!";
                break;

            case "fr":
                if (period == "morning")
                    greeting = "Bonjour!";
		        else if (period == "afternoon")
                    greeting = "Bonne soirée!";
		        else
                    greeting = "Bonsoir!";
                break;
            
            case "se":
                if (period == "morning")
                    greeting = "God Morgon!";
		        else if (period == "afternoon")
                    greeting = "God Eftermiddag!";
		        else
                    greeting = "God Kväll!";
                break;

            case "in":
                if (period == "morning")
                    greeting = "shubh prabhaat!";
		        else if (period == "afternoon")
                    greeting = "namaskaar!";
		        else
                    greeting = "susandhya!";
                break;
        }
    }
    
    
}