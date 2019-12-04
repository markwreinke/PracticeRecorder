/**
 * A simple date class
 */
package practicerecorder;

import javax.xml.bind.annotation.XmlElement;

/**
 * This class holds onto a date
 * @author Mark
 */
public class DateClass implements Comparable{
    @XmlElement(name = "month")
    private String dateMonth;
    
    @XmlElement(name = "day")
    private String dateDay;
    
    @XmlElement(name = "year")
    private String dateYear;
    
    /**
     * Creates a new dateClass.
     * @param inputMonth
     * @param inputDay
     * @param inputYear 
     */
    public DateClass(String inputMonth, String inputDay, String inputYear){
        this.dateMonth = inputMonth;
        this.dateDay = inputDay;
        this.dateYear = inputYear;
    }
    /**
     * Default constructor.
     */
    public DateClass(){
        this("0","0","0");
    }
    
    /**
     * Returns the date as a string
     * @return 
     */
    public String getDate(){
        String returnDate = dateMonth + "-" + dateDay + "-" + dateYear;
        return returnDate;
    }
    
    /* Getter Methods */
    /**
     * Returns the month
     * @return 
     */
    public String getMonth(){
        return dateMonth;
    }
    
    /**
     * Returns the day
     * @return 
     */
    public String getDay(){
        return dateDay;
    }
    
    /**
     * Returns the year
     * @return 
     */
    public String getYear(){
        return dateYear;
    }
    
    /* Setter Methods */
    /**
     * Sets the month
     * @param newMonth 
     */
    public void setDateMonth(String newMonth){
        dateMonth = newMonth;
    }
    
    /**
     * Sets the day
     * @param newDay 
     */
    public void setDateDay(String newDay) {
        dateDay = newDay;
    }
    
    /**
     * Sets the year
     * @param newYear 
     */
    public void setDateYear(String newYear){
        dateYear = newYear;
    }

    /**
     * Comparto method lists the newer date first.
     * @param o
     * @return 
     */
    @Override
    public int compareTo(Object o) {
        DateClass compared = (DateClass)o;
        if(Integer.parseInt(dateYear) - Integer.parseInt(compared.getYear()) < 0){
            return 1;
        }
        else if(Integer.parseInt(dateYear) - Integer.parseInt(compared.getYear()) > 0){
            return -1;
        }
        else{
            if(Integer.parseInt(dateMonth) - Integer.parseInt(compared.getMonth()) > 0){
                return 1;
            }
            else if(Integer.parseInt(dateMonth) - Integer.parseInt(compared.getMonth()) < 0){
                return -1;
            }
            else{
                if(Integer.parseInt(dateDay) - Integer.parseInt(compared.getDay()) < 0){
                    return 1;
                }
                else if(Integer.parseInt(dateDay) - Integer.parseInt(compared.getDay()) > 0){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        }
    }
    
    @Override
    public String toString(){
        return this.getDate();
    }

    
}
