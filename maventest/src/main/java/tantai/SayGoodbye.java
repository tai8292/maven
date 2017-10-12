package tantai;
import org.springframework.beans.factory.annotation.Required;

public class SayGoodbye
{
	private String message1,message2,message3;

	public SayGoodbye(){}

	public SayGoodbye(String message1)
	{
		this.message1 = message1;
	}


	public void setMessage1(String message1)
	{
		this.message1 = message1;
	}
	
	public String getMessage1()
	{
		return message1;
	}
}