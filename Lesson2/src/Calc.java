
public class Calc {

	public float addition(float x, float y) {
		return x + y;
	}

	public float subtraction(float x, float y) {
		return x - y;
	}

	public float multiplacation(float x, float y) {
		return x * y;
	}

	public float division(float x, float y) {
		
		if (y == 0) {
			y = 1;
		}
		return x / y;
	}

	public char min(String str) {
		
		char ch1 =  str.charAt(0);
		
		for (int i = 0; i < str.length(); i++)
		{
			if (ch1 >  str.charAt(i))
			{
				ch1 = str.charAt(i);
			}
		}
		
		return ch1;
	}
	
	public char max(String str) {
		
		char ch1 =  str.charAt(0);
		
		for (int i = 0; i < str.length(); i++)
		{
			if (ch1 <  str.charAt(i))
			{
				ch1 = str.charAt(i);
			}
		}
		
		return ch1;
	}
}
