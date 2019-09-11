package nullconcept;

public class NullConceptClass {

	static Object ob;
	static String str;
	static NullConceptClass newObj;

	public static void main(String[] args) {

		// 7.casting
		String s = (String) null;
		System.out.println(s + "123");
		System.out.println(s.charAt(0));// null pointer exception
		System.out.println(s.length());// null pointer exception

		// 6. comparision System.out.println(null == null);// true
		System.out.println(null != null);// false

		// 5. static vs non static
		NullConceptClass obj1 = null;
		obj1.funcStatic();// will work if function is static
		obj1.funcNonStatic();// null pointer exception if function is non static

		// 4. instanceof

		Integer num1 = null;
		Integer num2 = 10;
		System.out.println(num2 instanceof Integer);// true
		System.out.println(num1 instanceof Integer);// false

		// 3. null can't be assinged to any primitive data type

		Integer i = null;
		int j = i;// NullPointerException System.out.println(j);

		// 2. Default value of any/Object reference is null

		System.out.println(ob);
		System.out.println(str);
		System.out.println(newObj);

		// 1. Case sensitive

		Object obj = null;

	}

	public static void funcStatic() {
		System.out.println("in function 1");
	}

	public void funcNonStatic() {
		System.out.println("in function 2");
	}
}
