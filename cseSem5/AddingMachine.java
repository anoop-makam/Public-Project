/* 
 * @author : Anoop Makam
 */



package cse360assignment02;
/* 
 * Importing package called cse360assignment02
 */

public class AddingMachine {
  private int total;
  /*
   * public method , initializes the private variable 
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  /*
   * getTotal() gets total 
   * @return 0
   */
  public int getTotal () {
    return 0;
  }
  /*
   * void function to add 
   * @param value to be added
   */
  public void add (int value) {
	  total += value;
  }
  /*
   * void function to subtract 
   * @param value to be subtracted
   */
  public void subtract (int value) {
	  
  }
  /*
   * @return concatination of String
   */
  public String toString () {
    return "";
  }
  /*
   * void funciton , used to clear.
   */
  public void clear() {
  }
}
