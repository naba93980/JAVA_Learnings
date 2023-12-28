package Java8Features.Optional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalClass {
    public static void main(String[] args) {

        Optional<String> emptyData= Optional.empty(); 
        System.out.println(emptyData.isPresent());
        System.out.println(emptyData.orElse("nai bhai"));

        Optional<String> data = Optional.of("Naba name is present"); 
        data.ifPresent((s)->System.out.println(s));
        // data.ifPresent(System.out::println); u can use this - method referencing
        System.out.println(data.get());

        System.out.println(data.filter((s)->s.length()>100).orElse("kom ase"));

        Stream<String> dataUc = data.stream().map((s)->s.toUpperCase());
        dataUc.forEach(s->System.out.println(s));

        // the above line detail definition below
        // Consumer<String> cons = new Consumer<String>() {
        //     public void accept(String t) {
        //         System.out.println(t);
        //     };
        // };
        // dataUc.forEach(cons);
    }
}
