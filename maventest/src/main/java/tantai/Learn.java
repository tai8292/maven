package tantai;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class Learn
{
	@Autowired
	@Qualifier("sayGoodbye")
	public SayGoodbye sayGoodbye;

	public Learn()
	{
		System.out.println("Inside TextEditor constructor 1." );
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
		System.out.println("Message : "+(sayGoodbye == null));
		System.out.println("Message : "+sayGoodbye.getMessage1());
	}

	@Override
	public String toString() {
		return "Learn{" +
				"sayGoodbye=" + sayGoodbye +
				'}';
	}
}