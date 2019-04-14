/**
 *
 **/
 package prj5;
 
import java.io.File;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Group 36
 * @version 2019.04.14
 * Creates a list of songs
 *
 */
public class Song {
  private LinkedList<Song> list;
  private Scanner scan;
  public SongList(String song)
  {
  	scan = new Scanner(new File(songs));
	list = new LinkedList<Song>;
	
	
  }
  
  /**
   *
  public LinkedList<Song> getList()
  {
  	return list;
  }
