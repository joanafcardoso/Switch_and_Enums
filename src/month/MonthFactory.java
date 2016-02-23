package month;

/**
 * Created by Cardoso on 02-Feb-16.
 */
public class MonthFactory {
    Month month;
    //String resultMonth;

    public MonthFactory(Month month){
        this.month=month;
    }

    public void convertMonth(){
        switch(month){
            case JANUARY: case FEBRUARY: case NOVEMBER: case DECEMBER:
                System.out.println("November, December, January and February are the coldest months.");
                break;
            case MARCH: case APRIL: case MAY:
                System.out.println("In March, April and May the weather gets warmer and days are longer");
                break;
            case JUNE: case JULY: case AUGUST:
                System.out.println("June, July and August are the warmest months.");
                break;
            default:
                System.out.println("In September and October the weather gets colder and days get shorter.");
                break;
        }
    }
}
