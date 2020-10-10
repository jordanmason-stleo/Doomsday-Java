public class Doomsday{
        public static void main(final String[] args) {
         int BYear = 2020;
         int BDay = 22;
         int BMonth = 9;
         int mappedYear = BYear % 100;
         int[] intArray = new int[]{0 ,1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
         String[] StringDay = new String[]{"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"}; 
         
         if (BYear >= 2000) {
            mappedYear-=1; }
        if (BYear <= 1800) {
            mappedYear+=2;
            }
           
            mappedYear = (mappedYear / 4) + mappedYear;
            mappedYear += intArray[BMonth];

            if (BYear % 100 == 0) {
                if (BYear % 400 == 0 && BMonth == 1 || BMonth == 2) {
                    System.out.println(BYear + " was a leap year!");
                    mappedYear -= 1;
                } else {
                    mappedYear += 1;
                }
            } else if ((BYear % 100) % 4 == 0 ){
                if (BMonth == 1 || BMonth == 2 ){
                    mappedYear -=1;
                } else {
                    mappedYear += 1;
                }
            } else {
                System.out.println(BYear + " was not a leap year!");

            }
           
            mappedYear += BDay;
            mappedYear = mappedYear % 7;
            

            
            String monthDay = (StringDay[(((((mappedYear / 4) + mappedYear)) + intArray[BMonth]) + BDay) % 7]);
        
        System.out.println(mappedYear);
        System.out.println(monthDay);
}
}
