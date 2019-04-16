package prj5;

import java.io.FileNotFoundException;
import java.text.ParseException;

public class ProjectRunner {
    /**
     * Project Runner
     * 
     * @param args array
     * @throws FileNotFoundException
     * @throws ParseException
     * @author Joshua Mathew
     * @version 2019.4.16
     */
    @SuppressWarnings("unused")
    public static void main(String[] args)
        throws FileNotFoundException,
        ParseException
         {  

        SongReader reader;
        
        if (args.length < 2) {
                reader = new SongReader("songNames.txt", "surveryData.txt");

        }
        else {
                reader = new SongReader(args[0], args[1]);
        }
        
    }
}
