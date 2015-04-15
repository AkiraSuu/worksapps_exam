package factory;
/**
 * interface for questions
 * All questions are to achieve from this interface
 * 
 * flow like this: 
 * 1.show input informations ->
 * 2.Array initialization(Checked exceptions & String to char[]/iNt[]) -> 
 * 3.compare the array value & Output longest to property ->
 * 4.Iterator map to find longest length->
 * 5.printout the result with Start & length
 * 
 */

public interface BaseQuestion {
	//1. All of the require information is from here
	void sayHello();
	//2. Receiving  user`s input & delete space & convert  string array to  char[]/iNt[] array 
	void arrayInit();
	//3. Core method: iterator array and find right part save start_point & length into map
	void compareArray();
	//4. iterator map to find longest length
	void length_value();
	//5. printout result
	void printOut();



}
