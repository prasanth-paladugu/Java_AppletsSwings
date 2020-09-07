//EXAMPLE ON FRAME CREATION(IS-A)
import javax.swing.JFrame;						//PACKAGE OF JFRAME
public class EX2 extends JFrame
{
	public EX2()
	{
		setVisible(true);						//FRAME TO BE VISIBLE
		setSize(500,500);						//SIZE OF DIPLAYED FRAME
		setTitle("DP");							//SETTING NAME FOR FRAME
	}
	public static void main(String[]args)
	{
		new EX2();								//OBJECT CREATION
	}
}