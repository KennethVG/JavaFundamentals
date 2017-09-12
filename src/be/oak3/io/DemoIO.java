package be.oak3.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by vangike on 20/04/2017.
 */
public class DemoIO {

    public static void main(String[] args) {

        /*Path path = Paths.get("C:\\");
        Path path1 = path.resolve("myFolder");
        Path path2 = path1.resolve("File.txt");
        System.out.println(path2);
        System.out.println(path2.getParent());

        try {
            if(Files.notExists(path1)) {
                Files.createDirectory(path1);
                Files.createFile(path2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileSystem fs = FileSystems.getDefault();
        System.out.println(fs.getSeparator());
        for (Path p :
                fs.getRootDirectories()) {
            System.out.println(p);
        }*/

        Path p = Paths.get("C:\\myFolder\\File.txt");
        try {
            //Files.lines(p).forEach(System.out::println);
            //List<String> list = Files.readAllLines(p);
            //list.forEach(System.out::println);

            //Files.write(p,list, Charset.defaultCharset(), StandardOpenOption.APPEND);
            BufferedWriter bw = Files.newBufferedWriter(p, Charset.defaultCharset(), StandardOpenOption.APPEND);
            bw.newLine();
            bw.write("Ik zen een beest!");
            bw.newLine();
            bw.close();

            Files.lines(p).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
