import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Model {
    private boolean randomizer(double coefficient) {
        Random random = new Random();
        return (random.nextDouble() * 2 + 0.05) * coefficient >= 0.5;
    }


    List getAnswer(int val) {
        /*
          @val: int in [1;6] - number of double classes
         * We use List because:
         * 1. Cannot use a single String - all '\n' symbols are ignored while casting
         * 2. Cannot cast pure ArrayList correctly
         */
        List answer = new ArrayList<>();
        answer.add("Why would you even ask about this?\n");
        String sub = "";
        double coeff;

        switch (val) {
            case 1:
                coeff = 0.0;
                sub = "No one visits the university just for a single class\n";
                break;
            case 2:
                coeff = 0.8;
                sub = "Two double classes, seems like you'll have a good day\n";
                break;
            case 3:
                coeff = 0.6;
                sub = "Three classes sound reasonable\n";
                break;
            case 4:
                coeff = 0.4;
                sub = "Four double classes.. perhaps, you can miss some useless lectures\n";
                break;
            case 5:
                coeff = 0.2;
                sub = "Five double classes a day: you have an opportunity to surprise everyone \n";
                break;
            case 6:
                coeff = 0.1;
                sub = "Six classes a day: perhaps, your surname is somehow related to birds, isn't it? ";
                break;
            default:
                coeff = -10.0;

        }

        answer.add(sub);
        sub = "";
        boolean flag = randomizer(coeff);
        if (flag) {
            sub = "You will go to your university tomorrow\n";
        } else {
            sub = "No,no, you won't go to the university tomorrow\n";
        }
        answer.add(sub);
        return (answer);
    }
}
