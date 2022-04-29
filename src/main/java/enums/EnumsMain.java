package enums;

public class EnumsMain {

    public static void main(String[] args) {

        Person colin = new Person("Colin", "Bathgate", Month.JUNE);
        Person nicola = new Person("Nicola", "Aberdeen", Month.AUGUST);

        System.out.println("Colin was born in month number " + colin.getBirthMonth().getMonthNumber());
        System.out.println("Nicola was born in month number " + nicola.getBirthMonth().getMonthNumber());
    }



}
