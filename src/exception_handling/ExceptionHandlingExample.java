package exception_handling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
       /* List<String> list = Arrays.asList("251","54","563");
        List<Integer> integerList = list.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(integerList);*/

       /* List<String> list = Arrays.asList("251","54","563");
        list.forEach(s-> System.out.println(Integer.parseInt(s)));*/

        /*List<String> list = Arrays.asList("251","54","xyz");
        list.forEach(s-> System.out.println(Integer.parseInt(s))); //throw NumberFormatException
        */


        /*List<String> list = Arrays.asList("251","54","xyz");
        list.forEach(s-> {
            try {
                System.out.println(Integer.parseInt(s));
            }catch (Exception ex){
                System.out.println("Exception : " + ex.getMessage());
            }
        });*/

       /* List<String> list = Arrays.asList("251","54","xyz");
        list.forEach(ExceptionHandlingExample::printList);*/

       /*  List<String> list = Arrays.asList("251","54","xyz");
        list.forEach(handleExceptionIfAny(s -> System.out.println(Integer.parseInt(s))));
*/

          /*List<String> list = Arrays.asList("251","54","xyz");
        list.forEach(handleGenericException(s -> System.out.println(Integer.parseInt(s)),NumberFormatException.class));*/

        /*List<Integer> list1 = Arrays.asList(1,0);
        list1.forEach((s -> System.out.println(10/s)));//ArithmeticException*/

        /*List<Integer> list1 = Arrays.asList(1,0);
        list1.forEach(handleGenericException(s -> System.out.println(10/s),ArithmeticException.class));//ArithmeticException
*/
        //handle Exception for checkedException
       /* List<Integer> list2 = Arrays.asList(10,20);
        list2.forEach(i -> {
            try {
                Thread.sleep(i);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });*/

        List<Integer> list2 = Arrays.asList(10, 20);
        list2.forEach(handleCheckedExceptionConsumer(i -> {
            Thread.sleep(i);
            System.out.println(i);
        }));

    }

   /* public static void printList(String s){
        try {
            System.out.println(Integer.parseInt(s));
        }catch (Exception ex){
            System.out.println("Exception : " + ex.getMessage());
        }
    }*/

    static Consumer<String> handleExceptionIfAny(Consumer<String> payload) {
        return obj -> {
            try {
                payload.accept(obj);
            } catch (Exception ex) {
                System.out.println("Exception : " + ex.getMessage());
            }
        };
    }

    static <Target, ExObj extends Exception> Consumer<Target> handleGenericException
            (Consumer<Target> targetConsumer, Class<ExObj> exObjClass) {
        return obj -> {
            try {
                targetConsumer.accept(obj);
            } catch (Exception ex) {
                try {
                    ExObj exObj = exObjClass.cast(ex);
                    System.out.println("Exception : " + ex.getMessage());
                } catch (ClassCastException ecx) {
                    throw ex;
                }
            }
        };
    }

    static <Target> Consumer<Target> handleCheckedExceptionConsumer
            (CheckedExceptionHandlerConsumer<Target, Exception> handlerConsumer) {
        return obj -> {
            try {
                handlerConsumer.accept(obj);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        };
    }
}
