package strings;

public class String_Builder_Buffer {


	public static void StringEg(String s1) {
		s1 = s1 + "Kumari";
	}
	public static void stringBufferEg(StringBuffer s2)
	{s2.append("Kumari");
	}
	public static void stringBuilderEg(StringBuilder s2)
	{s2.append("Kumari");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Meenakshi";

		StringEg(s1);
		System.out.println("Using String 	 : "+s1);

		//conversting string object to string buffer
		StringBuilder s2 = new StringBuilder(s1);
		stringBuilderEg(s2);
		System.out.println("Using String Builder : "+s2);

		//conversting string buffer to string object
		String sBuff=s2.toString();
		System.out.println("String buffer is converted to string");

		StringBuffer s3 = new StringBuffer(s1);
		stringBufferEg(s3);
		System.out.println("Using String Buffer  : "+s3);
		
		
		// This statement will make str 
        // point to new String constant("Meeni")
        // rather than modifying the previous 
        // String constant
		// its stored in the heap area (string pool)
		String tempString = "Nitin";
		tempString = "Meeni";
		System.out.println("temp string is :"+ tempString);
		
		
		//created in the heap area not in the string pool area
		String teststringObject = new String("Testing String Object");
		System.out.println(teststringObject);

		
		//testing ==, .equals, and compareTo
		String str1 = "Nitin Yadav";
		String str2 = new String("Nitin Yadav");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.compareTo(str2));
	}

}
