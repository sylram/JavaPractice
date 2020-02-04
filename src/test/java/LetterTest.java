import org.junit.Assert;
import org.junit.Test;

public class LetterTest {

    @Test
    public void getSenderTest(){
        String actual = "Luis";
        Letter letter = new Letter(actual,"John");
        String sender = letter.getSender();


        Assert.assertEquals(sender,actual);
    }
    @Test
    public void getRecipientTest(){
        String given = "Maria";
        Letter letter = new Letter("Carlos", given);
        String actual = letter.getRecipient();
        Assert.assertEquals(given, actual);
    }

    @Test
    public void getTextTest(){
        Letter letter = new Letter("Juan", "Pedro");
        String given = "Dear Pedro:"+"\n\n"+"\n"+"Sincerely,"+"\n"+"Juan";
        String actual = letter.getText();

        Assert.assertEquals(given,actual);
    }

    @Test
    public void addLineTest(){
        Letter letter = new Letter("Jose","Ayelen");
        String given = "Te quiero mucho";
        letter.addLine(given);
        String actual = letter.body;

        Assert.assertEquals(given+"\n",actual);
    }

    @Test
    public void getTextWithBodyTest(){
        Letter letter = new Letter("Jose","Ayelen");
        String given = "Te quiero mucho";
        letter.addLine(given);
        String expected = "Dear Ayelen:"+"\n\n"+given+"\n\n"+"Sincerely,"+"\n"+"Jose";
        String actual = letter.getText();

        Assert.assertEquals(expected,actual);
    }
}
