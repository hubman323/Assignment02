package cse360assignment02;

public class AddingMachine {
  private int total;
  private int[] history;
  private int numOfOp;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = new int[1000];  //int array to hold each operation
    numOfOp = 0;   //number of operations
  }
  
  public int getTotal () {
    return total;    //total of all operations
  }
  
  public void add (int value) {
	  total += value;    //adds value to total
	  history[numOfOp] = value;  //stores value in the operation array
	  numOfOp++;  //increases the number of operations that have occurred
  }

  public void subtract (int value) {
	  total -= value;   //subtracts value from total
	  history[numOfOp] = (value*-1);  //stores negative value in the operation array
	  numOfOp++;  //increases the number of operations that have occurred
  }

  public String toString () {
    System.out.print("0");  //the total before any operations
	String str = "";  //empty string to be used to append operations to
    for(int i = 0; i < numOfOp; i++) {   //for loop to append operations to string
    	if(history[i] > 0) {   //if the operation is positive
    		str += " + ";   //append '+' sign
    		str += history[i]; //append operation to string
    	}
    	else {  //if the operation is negative
    		str += " - ";   //append '-' sign
    		str += (history[i]*-1); //append operation to string
    	}
    }
    
    return str;  //return the string
  }

  public void clear() {
	  for(int i = 0; i < numOfOp; i++) { //for loop to change all values in operation array to 0
		  history[i] = 0;   //changes each value to 0
	  }
	  numOfOp = 0;  //the number of operations goes back down to 0
  }
}
