public class CalendarDate {

    private int year;
    private int month;
    private int day;


    public CalendarDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    @Override
    public String toString() {
        return "CalendarDate{" +
                year + "/" + (month < 10 ? "0" : "") + month + "/" + (day < 10 ? "0" : "") + day  + '}';
    }

    public String compareTo(CalendarDate calDate){
        if (calDate instanceof CalendarDate){
            if(this.toString().compareTo(calDate.toString()) > 0){
                return "After";
            }
            else if(this.toString().compareTo(calDate.toString()) == 0){
                return "Equal";
            }
        }
        return "Earlier";
    }
    public static void main(String[] args) {
        CalendarDate calendarDate = new CalendarDate(2010,5,5);
        CalendarDate calendarDate1 = new CalendarDate(2010,5,5);
        System.out.println(calendarDate.toString());
        String s1 = "A";
        String s2 = "Alicia";
        s2 = s2.substring(0,1);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        String s="Sachin";
        s.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s2);
        System.out.println(calendarDate.compareTo(calendarDate1));
    }

}
