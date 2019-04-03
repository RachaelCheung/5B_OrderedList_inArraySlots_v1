public interface OrderedList{
    // Return number of elements in the list
    int size();
   
	// Returns a String representation of the list
	String toString();
	
    // Append an int to appropriate place on list
    void add (int value);
 
    // Retrieve the int at index
    int get (int index);

    // Remove the int at index
    // shifting any elements after it to the left
    // Returns removed value
    int remove (int index);
}