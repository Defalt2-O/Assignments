public class I_Holidays {
    public static void main(String[] args) {
        int day = 1, days = 0;
        while(day <= 31){
            if(day % 2 == 0){
                days++;
            }
            day++;
        }
        System.out.println("Kunal can go out for " + days + " days in August.");
    }
}
