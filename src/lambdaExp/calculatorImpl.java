package lambdaExp;
interface calculator{
//    void switchOn();
//    void sum(int input);
    int substract(int i1, int i2);
}

public class calculatorImpl {

    //this is a traditional way
//    @Override
//    public void switchOn() {
//        System.out.println("switch on");
//    }



    public static void main(String[] args) {
//this is a lambda expression
        //and here only one line that's wise  remove the {}; bracket.
//        calculator calculator = () -> System.out.println("switch on");
//        calculator.switchOn();
/*

        calculator calculator = (input) -> System.out.println("sum : " + input);
        calculator.sum(4546);
*/

        calculator calculator = (i1, i2) -> (i2 - i1);

        System.out.println(calculator.substract(8,20));


    }

    //syntax of lambda expression
    // () -> {body};

}
