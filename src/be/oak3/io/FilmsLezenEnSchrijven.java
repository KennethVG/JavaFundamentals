package be.oak3.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by vangike on 24/03/2017.
 */
public class FilmsLezenEnSchrijven {

    public static void main(String[] args) {


        // Stap 1: verwijzen naar onze file met data:
        File file = new File
                ("C:\\Users\\vangike\\Documents\\Cursussen OAK3\\Java Programming Language (JVN001)\\Dag5_JDBC_IO\\oef2.csv");

        // Stap2: lijst van gegevens lezen:
       try(FileReader fileReader = new FileReader(file);
       BufferedReader bufferedReader = new BufferedReader(fileReader)
           ;FileWriter writer = new FileWriter("C:\\Users\\vangike\\Desktop\\tienfilms.txt")){

           String result = null;
           List<Film> films = new ArrayList<>();
           while((result = bufferedReader.readLine()) != null) {
               //System.out.println(result);
               Film film = new Film(result);
               films.add(film);
           }

           List<Film> eersteTien =  films.stream().
                   limit(10).sorted(Comparator.comparing(Film::getFilmgegevens))
                   .collect(Collectors.toList());

         String[] woorden = eersteTien.get(2).getFilmgegevens().split("\t");

           for (String w: woorden)
               System.out.println(w);


           // Stap: schrijven naar bestand:
           for (Film f: eersteTien){
               writer.write(f.getFilmgegevens() + System.lineSeparator());
           }


       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }


}}
