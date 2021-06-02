package edu.escuelaing.arsw.countingLines.app;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
/**
 * Hello world!
 *
 */
//This class counts the number of lines in a file.
public class countingLines 
{	
	//Count is a variable that stores the number of lines.
	private static int count = 0;
	
	/*this method reads the file and executes the method toDecide.
	 *@params args is a list of strings, contains the required parameters in the program.
	 */
    public static void main( String[] args ) 
    {
    	//lines is a list of strings, each value contains a line from the file.
    	List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get(args[1]),
			        StandardCharsets.UTF_8);
			toDecide(lines,args[0]);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    /*this method analyzes the first input and decides what the program does.
	 *@params lines is a list of strings, each value contains a line from the file.
	 *@params option is the type of count that you want to perform.
	 */
    public static void toDecide(List<String> lines,String option){
    	if(option.equals("phy")) {
    		System.out.println(lines.size());
    	}
    	else if(option.equals("loc")){
    		locCount(lines);
    	} else {
    		System.out.println("Esta no es una entrada correcta, ingrese phy o loc");
    	}
    	
    }
    
    /*this method counts the number of lines in a file without the comments and white lines.
	 *@params lines is a list of strings, each value contains a line from the file.
	 */
    public static void locCount(List<String> lines){
    	//commentType2 is a variable which controls if the line is inside a comment.
    	boolean commentType2 = false;
		for(int i = 0; i < lines.size(); i++)
		{
			//string is a variable which contains a line from the file and removes the spaces.
			String string =  lines.get(i).replaceAll("\\s","");
			//these variables save the position if there is a comment on the line.
			int commentType1Index = string.indexOf("//"),commentType2IndexStart = string.indexOf("/*"),commentType2IndexEnd = string.indexOf("*/");
			if(commentType2IndexStart!=-1) {
				commentType2 = true;
			}
			//if these conditions are met, the line is counted.
			if(commentType1Index!=0 && string.length()>0 && commentType2==false) {
				count+=1;
			}
			if(commentType2IndexEnd!=-1) {
				commentType2 = false;
			}
		}
		System.out.println(count);
    }
}		