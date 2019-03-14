/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

public class List_inArraySlots {

    private int filledElements; // the number of elements in this list
    
    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */
    // private int[] typeOfElements;

    private Element[] list;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        list = new Element[INITIAL_CAPACITY];
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
	return filledElements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
	String result = "[";
        for( int elemIndex = 0; elemIndex < filledElements; elemIndex++){
	    result += list[ elemIndex] + ",";
	}
        return result + "]";
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int type
                       , int    intValue
                       , double doubleValue
                       , String stringValue
                       ) {
	 if (filledElements == list.length) expand();
	 
	 list[filledElements] = new Element(type, intValue, doubleValue, stringValue);
	 
	 filledElements++;
	 return true;
     }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
     private void expand() {
        System.out.println( "expand... (for debugging)");
           /* S.O.P. rules for debugging:
              Working methods should be silent. But during
              development, the programmer must verify that
              this method is called when that is appropriate.
              So test using the println(), then comment it out.
              */
	Element[] biggerList = new Element[filledElements * 2];
	for (int i = 0; i < filledElements; i++){
	    biggerList[i] = list[i];
	}
	list = biggerList;
     }

  public Element get(int index){
<<<<<<< HEAD
      return list[index];
=======
	Element ele = new Element(typeOfElements[index],
	intElements[index],
	doubleElements[index],
	stringElements[index]);
	return ele;
	
>>>>>>> 115ba0435e759ebeac71acb7fda98f21e71bf1d6
    }
}
