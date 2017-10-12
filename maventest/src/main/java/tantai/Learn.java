package tantai;
import javax.annotation.Resource;

public class Learn
{
	@Resource(name= "goodbye1")
	private SayGoodbye sayGoodbye;

	public Learn()
	{

	}

	public Learn(SayGoodbye sayGoodbye)
	{
		this.sayGoodbye = sayGoodbye;
	}

	public void setSayGoodbye(SayGoodbye sayGoodbye)
	{
		this.sayGoodbye = sayGoodbye;
	}

	public void printMessage1()
	{
		System.out.println("Message : "+sayGoodbye.getMessage1());
	}

	
}