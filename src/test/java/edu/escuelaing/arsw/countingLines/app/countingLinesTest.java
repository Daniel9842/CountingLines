package edu.escuelaing.arsw.countingLines.app;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import junit.framework.*;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * Unit test for simple countingLines.
 * @author Daniel Santiago Ducuara Ardila 
 */
public class countingLinesTest 
    extends TestCase
{
/**
 * this test verifies that the number of lines is correct with the phy parameter.
 */
	  public void testPhy() {
		  int value = 0;
		  List<String> lines;
		  try {
			lines = Files.readAllLines(Paths.get("/Users/Portatil/OneDrive/Documentos/ARSW/Taller1CountingLines/countingLines/src/test/java/edu/escuelaing/arsw/countingLines/app/testPhy.txt"),
				        StandardCharsets.UTF_8);
			value = countingLines.toDecide(lines,"phy");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		  
	   assertEquals(17,value);
	  }
/**
 * this test verifies that the number of lines is correct with the single comments and with the loc parameter.
 */
	  public void testLocSingleLineComments() {
		  int value = 0;
		  List<String> lines;
		  try {
			lines = Files.readAllLines(Paths.get("/Users/Portatil/OneDrive/Documentos/ARSW/Taller1CountingLines/countingLines/src/test/java/edu/escuelaing/arsw/countingLines/app/testLocLineSingleComments.txt"),
				        StandardCharsets.UTF_8);
			value = countingLines.toDecide(lines,"loc");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		  
	   assertEquals(17,value);
	  }
/**
 * this test verifies that the number of lines is correct with the multi-line comments and with the loc parameter.
 */
	  public void testLocMultiLineComments() {
		  int value = 0;
		  List<String> lines;
		  try {
			lines = Files.readAllLines(Paths.get("/Users/Portatil/OneDrive/Documentos/ARSW/Taller1CountingLines/countingLines/src/test/java/edu/escuelaing/arsw/countingLines/app/testLocMultiLinesComments.txt"),
				        StandardCharsets.UTF_8);
			value = countingLines.toDecide(lines,"loc");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		  
	   assertEquals(14,value);
	  }
/**
 * this test verifies that the number of lines is correct with white lines and with the loc parameter.
 */
	  public void testLocWhiteLines() {
		  int value = 0;
		  List<String> lines;
		  try {
			lines = Files.readAllLines(Paths.get("/Users/Portatil/OneDrive/Documentos/ARSW/Taller1CountingLines/countingLines/src/test/java/edu/escuelaing/arsw/countingLines/app/testLocWhiteLines.txt"),
				        StandardCharsets.UTF_8);
			value = countingLines.toDecide(lines,"loc");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		  
	   assertEquals(9,value);
	  }
/**
 * this test verifies that the number of lines is correct with document comments and with the loc parameter.
 */
	  public void testLocDocumentComments() {
		  int value = 0;
		  List<String> lines;
		  try {
			lines = Files.readAllLines(Paths.get("/Users/Portatil/OneDrive/Documentos/ARSW/Taller1CountingLines/countingLines/src/test/java/edu/escuelaing/arsw/countingLines/app/testLocDocumentComments.txt"),
				        StandardCharsets.UTF_8);
			value = countingLines.toDecide(lines,"loc");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		  
	   assertEquals(29,value);
	  }
/**
 * this test verifies that the number of lines is correct with the single,multi-line,document comments and with the loc parameter.
 */
	  public void testLocComments() {
		  int value = 0;
		  List<String> lines;
		  try {
			lines = Files.readAllLines(Paths.get("/Users/Portatil/OneDrive/Documentos/ARSW/Taller1CountingLines/countingLines/src/test/java/edu/escuelaing/arsw/countingLines/app/testLocComments.txt"),
				        StandardCharsets.UTF_8);
			value = countingLines.toDecide(lines,"loc");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		  
	   assertEquals(35,value);
	  }
/**
 * check the error in the document address
 */
	  public void testFileNotFound() {
		  List<String> lines;
		  String val = null;
		  try {
			lines = Files.readAllLines(Paths.get(val),
				        StandardCharsets.UTF_8);
		} catch (Exception e) {
			assertTrue(true);
		}
	    }
}
