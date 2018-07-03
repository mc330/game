import api.server.util.PayRequestDto;
import api.server.util.ValidationUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.xerial.snappy.Snappy;

import java.io.*;
import java.util.*;

public class MyTest {


    @Test
    public void test() {
       /* List<Person> people = new ArrayList<>();
        people.parallelStream().allMatch(p -> p.id == 4);*/
        System.out.println(MyTest.class);
//        System.out.println(Integer.);

    }

    @Test
    public void test1() throws Exception {
        PayRequestDto payRequestDto = new PayRequestDto();
        ValidationUtils.validate(payRequestDto);
    }

    public static byte[] compress(byte srcBytes[]) throws Exception {
        return Snappy.compress(srcBytes);
    }

    public static byte[] uncompress(byte[] bytes) throws Exception {
        return Snappy.uncompress(bytes);
    }

    @Test
    public void test2() throws Exception {
        String s = "sd                ssdfg             sdfghsdf sfgsdfg    gh".replaceAll(" +", " ");
        System.out.println(s);
    }

    private void ss(int n) throws Exception {
        File fileIn = new File("C:\\Users\\15303\\Desktop\\001.jpg");
        File fileOut = new File("C:\\Users\\15303\\Desktop\\002.jpg");
        System.out.println(fileIn.getName()+":"+fileIn.length());
        byte[] bytes = IOUtils.toByteArray(new FileInputStream(fileIn));
        byte[] compress = compress(bytes);
        IOUtils.write(compress, new FileOutputStream(fileOut));
        System.out.println(fileOut.getName()+":"+fileOut.length());
        n++;
        if (n<100){
            ss(n);
        }
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
