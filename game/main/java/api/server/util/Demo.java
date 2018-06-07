package api.server.util;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo<A, B> {
    A a;
    class B{}
    public static void main(String[] args) throws Exception {
        if (StringUtils.isEmpty("1.2.6") || StringUtils.isEmpty("1.3.")) {
            throw new Exception("参数错误");
        }
        List<String> b1 = new ArrayList<>(Arrays.asList("3.2.6".split("\\.")));
        List<String> b2 = new ArrayList<>(Arrays.asList("2.3..369".split("\\.")));
        int result = 0;
        for (int i = 0; i < Math.min(b1.size(), b2.size()); i++) {
            int a = Integer.parseInt(b1.get(i));
            int b = Integer.parseInt(b2.get(i));
            result = a > b ? 1 : (a < b ? -1 : 0);
            if (result != 0) break;
        }
        if (result == 0) {
            result = b1.size() > b2.size() ? 1 : (b1.size() < b2.size() ? -1 : 0);
        }
        System.out.println(result);
    }
}




