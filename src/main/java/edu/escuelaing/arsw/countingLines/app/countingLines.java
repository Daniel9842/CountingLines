package edu.escuelaing.arsw.countingLines.app;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
//@author Daniel Santiago Ducuara Ardila 

/**
 * This class counts the number of lines in a file.
 */
public class countingLines 
{	

/**this method reads the file and executes the method toDecide.
*@param args is a list of strings, contains the required parameters in the program.
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
/**this method analyzes the first input and decides what the program does.
*@param lines is a list of strings, each value contains a line from the file.
*@param option is the type of count that you want to perform.
*@return the value of the count.
*/
    public static int toDecide(List<String> lines,String option){
    	//Count is a variable that stores the number of lines.
    	int count = 0;
    	
    	if(option.equals("phy")) {
    		count = lines.size();
    	}
    	else if(option.equals("loc")){
    		count = locCount(lines);
    	} else {
    		System.out.println("Esta no es una entrada correcta, ingrese phy o loc");
    	}
    	return count;
    	
    }
    
/**this method counts the number of lines in a file without the comments and white lines.
*@param lines is a list of strings, each value contains a line from the file.
*@return the value of the count.
*/
    public static int locCount(List<String> lines){
    	//commentType2 is a variable which controls if the line is inside a comment.
    	boolean commentType2 = false;
    	//value is a variable that stores the number of lines.
    	int value = 0;
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
				value+=1;
			}
			if(commentType2IndexEnd!=-1) {
				commentType2 = false;
			}
		}
		return value;
    }
}		