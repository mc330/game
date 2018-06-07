import api.server.util.PayRequestDto;
import api.server.util.ValidationUtils;
import org.junit.Test;

import java.util.*;

public class MyTest {


    @Test
    public void test() {
        List<Person> people = new ArrayList<>();
        people.parallelStream().allMatch(p->p.id==4);

    }
    @Test
    public void test1() throws Exception {
        PayRequestDto payRequestDto = new PayRequestDto();
        ValidationUtils.validate(payRequestDto);
    }





    class Person {

        private Integer id;
        private String name;

        public Person(Integer id, String name) {
            this.id = id;
            this.name = name;
        }
        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }



    }
}
