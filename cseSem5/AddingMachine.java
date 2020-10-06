/* 
 * @author : Anoop Makam
 */



package cse360assignment02;
/* 
 * Importing package called cse360assignment02
 */

public class AddingMachine {
	
//Private variables
  private int total;
  private string concat;
  /*
   * public method , initializes the private variable 
   */
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    concat = "0";
  }
  /*
   * getTotal() gets total 
   * @return 0
   */
  public int getTotal () {
    return total;
  }
  /*
   * void function to add 
   * @param value to be added
   */
  public void add (int value) {
	  total += value;
	  concat += " + " + value;
  }
  /*
   * void function to subtract 
   * @param value to be subtracted
   */
  public void subtract (int value) {
	  total -= value;
	  concat += " - " + value;
  }
  /*
   * @return concatination of String
   */
  public String toString () {
    return concat;
  }
  /*
   * void funciton , used to clear Memory.
   */
  public void clear() {
	  total = 0;
	  concat = "0";
  }
  
}
