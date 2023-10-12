package Stream_With_FunctionalInrAndByFun;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {

        BiPredicate<String, String> biPredicate = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s1, String s2) {
                return s1.equals(s2);
            }
        };
        System.out.println(biPredicate.test("madam", "madam"));



        /*BiPredicate<String,String> equalsPredicate = ( s1,  s2) -> s1.equals(s2);
        System.out.println(equalsPredicate.test("madam", "madam"));
*/
//and operators
        BiPredicate<String, String> equalsPredicate = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> lengthsPredicate = (s1, s2) -> s1.length() == s2.length();
        boolean output = lengthsPredicate.and(equalsPredicate).test("madam", "madam");
        System.out.println("Output : " + output);

//or operators
        BiPredicate<String, String> equalsPredicate1 = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> lengthsPredicate1 = (s1, s2) -> s1.length() == s2.length();
        boolean orOutput = lengthsPredicate1.or(equalsPredicate1).test("madam", "madam");
        System.out.println("orOutput : " + orOutput);

        BiPredicate<String, String> equalsPredicate2 = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> lengthsPredicate2 = (s1, s2) -> s1.length() == s2.length();
        boolean orOutput1 = lengthsPredicate2.or(equalsPredicate2).test("abc", "def");
        System.out.println("orOutput : " + orOutput1);
        System.out.println(equalsPredicate.test("madam", "madam"));

    }
}
