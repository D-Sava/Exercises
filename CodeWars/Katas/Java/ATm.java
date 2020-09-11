public class ATm {
    public static void main(String[] args){

        int[] exchange = {500,200,100,50,20,10};

        int money = 1770;
        int numberOfNotes = 0;

        int i = 0;//counter for array
        int j;//number of notes by exchange
        int k;//rest of the money

        while(i != exchange.length){
            j = money / exchange[i];
            k = money % exchange[i];
            money = k;

            i++;
            numberOfNotes+=j;
        }

        if(money > 0)
            System.out.println("-1");

        System.out.println("Number of notes: "+numberOfNotes);
    }
}
