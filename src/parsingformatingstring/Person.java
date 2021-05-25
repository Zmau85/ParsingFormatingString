
package parsingformatingstring;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author Nemanja Koprivica
 */
public class Person {
    
    public String name;
    public String surname;
    public LocalDate date;
    public String birthPlace;
    
    //Konstruktor za klasu Person
    public Person(String name, String surname, LocalDate date, String birthPlace) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.birthPlace = birthPlace;
    }
   
    //Overridovana metoda za ispis podataka za klasu Person sa datumom formatiranim za traženi format ispisa
    @Override
    public String toString() {
        DateTimeFormatter formatter2= DateTimeFormatter.ofPattern("dd. MMM yyyy.", Locale.forLanguageTag("sr-Latn-RS"));
        return "Person{" + "Name: " + name + ", Surname: " + surname + ", Date: " + date.format(formatter2) + ", Birth Place: " + birthPlace + '}';
    }

    
}
