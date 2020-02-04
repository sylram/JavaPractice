import org.junit.Test;
import org.junit.Assert;


public class CalendarDateTest {

    @Test
    public  void getCalendarDateYearTest(){
        CalendarDate cal = new CalendarDate(2000,1,1);
        int year = 2000;
        int actualYear = cal.getYear();

        Assert.assertEquals(year,actualYear);
    }

    @Test
    public void compareToTest(){
        CalendarDate calendarDate1 = new CalendarDate(1999,4,4);
        CalendarDate calendarDate2 = new CalendarDate(1988,3,1);
        String actual = calendarDate1.compareTo(calendarDate2);

        Assert.assertEquals(actual,"After");


    }
}
