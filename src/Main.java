class die{
    public static int roll(){
        int maxValue = 6;
        int minValue = 1;
        return  (int)(Math.random() * maxValue) + minValue;

    }
}


public class Main {
    static String bar(int qty){
        String output = "";
        for(int b = 0; b < qty; b++){
            output += "#";
        }
        return output;
    }
    public static void main(String[] args) {
        // 3 - 18
        int[] counter = new int[16];

        //roll 3 times x 100
        for (int i = 0; i < 1000; i++) {
            int value = die.roll() + die.roll() + die.roll();
            counter[value - 3]++;
        }

        for (int s = 3; s <= 18; s++){
            int qty = counter[s - 3];
            System.out.printf("|%s(%d:%d)\n", bar(qty), s, qty);
        }
//        int twos = 0;
//        int threes = 0;
//        int fours = 0;
//        int fives = 0;
//        int sixes = 0;
//        int sevens = 0;
//        int eights = 0;
//        int nines = 0;
//        int tens = 0;
//        int eleven = 0;
//        int twelve = 0;
//
//        for (int i = 0; i < 10; i++)
//        int value = die.roll() + die.roll();
//        if (value == 2){
//            twos++;
//        } else if (value == 3) {
//            threes++;
//        }else if (value == 4) {
//            fours++;
//        }else if (value == 5) {
//            fives++;
//        }else if (value == 6) {
//            sixes++;
//        }else if (value == 7) {
//            sevens++;
//        }else if (value == 8) {
//            eights++;
//        }else if (value == 9) {
//            nines++;
//        }else if (value == 10) {
//            tens++;
//        }else if (value == 11) {
//            eleven++;
//        }else if (value == 12) {
//            twelve++;
//        }
//        System.out.println(twos);
//        System.out.println(threes);
//        System.out.println(fours);
//        System.out.println(fives);
//        System.out.println(sixes);
//        System.out.println(sevens);
//        System.out.println(eights);
//        System.out.println(nines);
//        System.out.println(tens);
//        System.out.println(eleven);
//        System.out.println(twelve);
    }
}
