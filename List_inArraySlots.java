/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

public class List_inArraySlots {

    private int[]    intElements;
    private double[] doubleElements;
    private String[] stringElements;
    private int filledElements; // the number of elements in this list
    
    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */
    private int[] typeOfElements;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
	intElements = new int[INITIAL_CAPACITY];
	doubleElements = new double[INITIAL_CAPACITY];
	stringElements = new String[INITIAL_CAPACITY];
	typeOfElements = new int[INITIAL_CAPACITY];
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
	    if (typeOfElements[elemIndex] == 0)
		result += intElements[ elemIndex] + ",";
	    else if (typeOfElements[elemIndex] == 1)
		result += doubleElements[ elemIndex] + ",";
	    else
		result += stringElements[ elemIndex] + ",";
	}
        return result + "]";
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int type   // same meaning as in typeOfElements
                       , int    intValue
                       , double doubleValue
                       , String stringValue
                       ) {
	 if (filledElements == typeOfElements.length) expand();
	 
	 if (type == 0)
	     intElements[filledElements] = intValue;
	 else if (type == 1)
	     doubleElements[filledElements] = doubleValue;
	 else
	     stringElements[filledElements] = stringValue;
	 
	 typeOfElements[filledElements] = type;
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
	int[] biggerInt = new int[typeOfElements.length * 2];
	for (int i = 0; i < filledElements; i++)
	    biggerInt[i] = intElements[i];
	intElements = biggerInt;
	
	double[] biggerDouble = new double[typeOfElements.length * 2];
	for (int i = 0; i < filledElements; i++)
	    biggerDouble[i] = doubleElements[i];
	doubleElements = biggerDouble;
	
	String[] biggerString = new String[typeOfElements.length * 2];
	for (int i = 0; i < filledElements; i++)
	    biggerString[i] = stringElements[i];
	stringElements = biggerString;

	int[] biggerType = new int[typeOfElements.length * 2];
	for (int i = 0; i < filledElements; i++)
	    biggerType[i] = typeOfElements[i];
	typeOfElements = biggerType;
     }

  public Element get(int index){
	Element ele = new Element(typeOfElements[index],
	intElements[index],
	doubleElements[index],
	stringElements[index]);
	return ele;
	
    }
}
