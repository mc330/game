package api.server.util;


import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author mc330
 */
public class StringUtil extends StringUtils {

    /**
     * <p>Compare two version string which made up of number and points,
     * If str1 or str2 is not a version {@link String} ,Revalue 0.</p>
     *
     * <p>NOTE:This functionality is available in isBlank().</p>
     *
     * @param str1 the first version string.
     * @param str2 the second version string.
     * @return If str1 is less than str2, return -1; if str1 equals str2, return 0, otherwise return 1
     * @throws Exception
     */
    public static int compareVersionStr(String str1, String str2) {
        str1 = isVersionStr(str1) ? str1 : "0";
        str2 = isVersionStr(str2) ? str2 : "0";
        List<String> v1 = new ArrayList<>(Arrays.asList(str1.split("\\.")));
        List<String> v2 = new ArrayList<>(Arrays.asList(str2.split("\\.")));
        int result = 0;
        for (int i = 0; i < Math.min(v1.size(), v2.size()); i++) {
            int a = Integer.parseInt(v1.get(i));
            int b = Integer.parseInt(v2.get(i));
            result = a > b ? 1 : (a < b ? -1 : 0);
            if (result != 0) break;
        }
        if (result == 0) {
            result = v1.size() > v2.size() ? 1 : (v1.size() < v2.size() ? -1 : 0);
        }
        return result;
    }

    /**
     * <p>judge string is version {@link String} or not.</p>
     *
     * @param arrayStr
     * @return
     */
    public static boolean isVersionStr(String... arrayStr) {
        Pattern pattern = Pattern.compile("^\\d+(\\.\\d+)?$");
        for (int i = 0; arrayStr != null && i < arrayStr.length; i++) {
            if (isBlank(arrayStr[i]) || !pattern.matcher(arrayStr[i]).matches()) {
                return false;
            }
        }
        return true;
    }
}




