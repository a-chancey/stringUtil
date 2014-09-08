package stringUtil;

import static org.junit.Assert.*;

import org.junit.*;


public class StringUtilTest {
	StringUtil stringUtil;
	String input = "boogity";
	
	@Before
	public void SetUp(){
		stringUtil = new StringUtil();
	}
	
	@Test
	public void StringReverserTest(){
		String result;
		
		result = stringUtil.reverser(input);
		assertEquals("ytigoob", result);
	}
	
	@Test
	public void DisemvowelerTest(){
		String VowelResult;
		String ConsonantResult;
		
		ConsonantResult = stringUtil.disemvoweler(input);
		VowelResult = stringUtil.disemconsonanter(input);
		
		assertEquals("bgty", ConsonantResult);
		assertEquals("ooi", VowelResult);
		
	}
}
