package tantai;

public class Learn
{
	private Say say;

	public Learn()
	{
		
	}

	public Learn(Say say)
	{
		this.say = say;
	}

	public void setSay(Say say)
	{
		this.say = say;
	}

	public void Say()
	{
		this.say.Say();
	}
}