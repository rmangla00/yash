package com.yash.AssignmentCore2;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.junit.Before;
import org.junit.Test;

public class SingletoneTest {
	
	Singletone obj1;
	
	@Before
	public void setUp() {
		obj1 = null;
	}

	@Test
	public void testSingletonPattern() {
		obj1 = Singletone.getInstance();
		Singletone obj2 = Singletone.getInstance();

		assertEquals(obj1.hashCode(), obj2.hashCode());
	}

	@Test
	public void testSerializationSingletonPattern() throws IOException, ClassNotFoundException {
		obj1 = Singletone.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
		out.writeObject(obj1);
		out.close();

		ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
		Singletone obj2 = (Singletone) in.readObject();
		in.close();

		assertEquals(obj1, obj2);
	}

}
