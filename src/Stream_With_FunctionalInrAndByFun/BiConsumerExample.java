package Stream_With_FunctionalInrAndByFun;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample implements BiConsumer<String, Integer> {

    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = new BiConsumerExample();
        biConsumer.accept("java", 20000);


        BiConsumer<String, Integer> biConsumer1 = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s2, Integer i2) {
                System.out.println("Annonymous Impl Approach  : " + s2 + " : " + i2);
            }

        };
        biConsumer1.accept("Welcome", 143);


        BiConsumer<String, Integer> biConsumer2 = (s3, i3) ->
                System.out.println("Lambda Approach  : " + "key : " + s3 + " , value : " + i3);

        biConsumer2.accept("Jay Shree Ram", 108);


        Map<String, Integer> map = new HashMap<>();
        map.put("Ravi", 5000);
        map.put("Sumit", 15000);
        map.put("Tannu", 25000);

//        map.forEach(biConsumer2);

        map.forEach((k, v) -> System.out.println(k + ", " + v));
    }

    @Override
    public void accept(String s1, Integer i1) {
        System.out.println("Traditional Approach  " + "input1 : " + s1 + " : input2 : " + i1);
    }
}
