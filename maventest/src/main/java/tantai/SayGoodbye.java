package tantai;
import org.springframework.beans.factory.annotation.Required;

public class SayGoodbye
{
	private String message1;
	private String message2;

	private String message3;

	public SayGoodbye(){
		System.out.println("Inside TextEditor constructor 2." );
	}

	public SayGoodbye(String message1)
	{
		this.message1 = message1;
	}


	public void setMessage1(String message1)
	{
		this.message1 = message1;
	}
	@Required
	public void setMessage2(String message2)
	{
		this.message2 = message2;
	}



	public String getMessage1()
	{
		System.out.println("GeT"+message1);
		return message1;
	}

	@Override
	public String toString() {
		return "SayGoodbye{" +
				"message1='" + message1 + '\'' +
				", message2='" + message2 + '\'' +
				", message3='" + message3 + '\'' +
				'}';
	}
}