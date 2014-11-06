package com.learn.java;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class JavaObjectCreation implements Cloneable{
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException, IOException{
		System.out.println("java object creation");
		/*Object creation
		 * using new keyword*/
		JavaObjectCreation firstObject=new JavaObjectCreation();
		System.out.println("first object " +firstObject);
		/*Object creation using newInstance method
		 * Using reflection api*/
		Class className=Class.forName("com.learn.java.JavaObjectCreation");
		System.out.println("className " +className);
		/*Object creation using clone method
		 * for this you must implement Cloneable Interface*/
		JavaObjectCreation secondObject=(JavaObjectCreation) className.newInstance();
		System.out.println("second object " +secondObject);
		JavaObjectCreation thirdObject=(JavaObjectCreation) secondObject.clone();
		System.out.println("thirdObject" +thirdObject);
		
		/*Object Deserialization is another process to create object
		 * It means nothing just creating object from it serialized form
		 * 
		 * */
		InputStream is=null;
		ObjectInputStream ois=new ObjectInputStream(is);
		JavaObjectCreation fourth=(JavaObjectCreation) ois.readObject();
		System.out.println("fourthObject" +fourth);
	}

}
