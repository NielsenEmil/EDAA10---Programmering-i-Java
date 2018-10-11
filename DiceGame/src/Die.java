
public class Die {
	public Die(){}
	public int rollDie()
	{
	    int rollResult = (int)(Math.random()*6 + 1);
	    return rollResult;
	}
}
