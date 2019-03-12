public class Element {
    private int intValue;
    private double doubleValue;
    private String stringValue;
    private int typeValue;

    public Element(int type,
		   int intV,
		   double doubleV,
		   String stringV) {
	typeValue = type;
	intValue = intV;
	doubleValue = doubleV;
	stringValue = stringV;
    }

    public String toString(){
        if (typeValue == 0)
	    return intValue + "";
	else if (typeValue == 1)
	    return doubleValue + "";
	else
	    return stringValue;
    }
}
