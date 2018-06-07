package api.server.util;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/18.
 */
public  class PageUtil{

    public static Map<String, Object> paging(Integer count, Integer page, Integer pageSize) {
        if (count == null || page == null || pageSize == null) {
            count = 0;
            page = 0;
            pageSize = 10;
        }
        Map<String, Object> map = new HashMap();
        map.put("currentPage", page + 1);
        map.put("totalPage", (count - 1) / pageSize + 1);
        map.put("total", count);
        map.put("isLast", count <= (page + 1) * pageSize ? 1 : 0);
        return map;
    }

}
