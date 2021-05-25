package parsingformatingstring;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Nemanja Koprivica
 */
public class ParsingFormatingString {

    public static void main(String[] args) {

        String text = "John.Davidson/05082004/Belgrade "
                + "Michael.Barton/01011998/Krakov "
                + "Ivan.Perkinson/23051986/Moscow";

        //Deljenje stringa
        String[] str = text.split("[./ ]");

        //Formatiranje datuma
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");

        //Pomoćni brojač za petlju
        int n = 0;

        //Kreiranje liste 
        ArrayList<Person> list = new ArrayList<>();

        //for Petlja za kreiranje objekata, smeštanje u listu i ispis podataka iz kreiranih objekata 
        for (int i = 0; i < str.length / 4; i++) {
            LocalDate date = LocalDate.parse(str[n + 2], formatter);
            list.add(new Person(str[n], str[n + 1], date, str[n + 3]));
            System.out.println(list.get(i).toString());
            n += 4;
        }

        
    }

}
