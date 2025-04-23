public class App {
    public static void main(String[] args) throws Exception {

        //Challenge1
        System.out.println("Week Day: " + Challenge1.weekDay);
        System.out.println("Unread Mails: " + Challenge1.unreadMails);
        System.out.println("Kosovo Population: " + Challenge1.kosovoPopulation);
        System.out.println("World Population: " + Challenge1.worldPopulation);
        System.out.println("Quotation: " + Challenge1.quotation);
        System.out.println("Is True: " + Challenge1.isTrue);
        System.out.println("Pi: " + Challenge1.pi);
        System.out.println("Total Bill: " + Challenge1.totalBill);

        //Challenge2
        Object[] types = {Challenge2.weekDay, Challenge2.unreadMails, Challenge2.kosovoPopulation, Challenge2.worldPopulation};
        for(Object type: types){
            System.out.println(type);
        }

        //Challenge4
        Challenge4.divideByZero();

        //Challenge5
        Challenge5.readFile();

        //Challenge6
        Challenge6.readFile();

        //Challenge7
        Challenge7.readCSVFile();
    }
}