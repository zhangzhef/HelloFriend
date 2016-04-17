package cn.itcast.maven;



import static org.junit.Assert.assertEquals;

import org.junit.Test;




public class HelloFriendTest {
	@Test
	public void tesHelloFriend(){
		
		HelloFriend helloFriend = new HelloFriend();
		String results = helloFriend.sayHelloToFriend("litingwei");
		assertEquals("Hello litingwei! I am John",results);		

	}
}