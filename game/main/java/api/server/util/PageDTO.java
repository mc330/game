package api.server.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class PageDTO implements Serializable {
    private static final long serialVersionUID = -8742884557811174133L;

    private Long currentPage = 1L;
    private Long totalPage = 0L;
    private Long total = 0L;
    private Long isLast = 0L;
    private List<?> list = new ArrayList<>();

    public PageDTO() {
    }

    public PageDTO(Long currentPage, Long totalPage, Long total, Long isLast, List<?> list) {
        setCurrentPage(currentPage);
        setTotalPage(totalPage);
        setTotal(total);
        setIsLast(isLast);
        setList(list);
    }

    public Long getCurrentPage() {
        return currentPage == null || currentPage < 1 ? 1 : currentPage;
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage == null || currentPage < 1 ? 1 : currentPage;
    }

    public Long getTotalPage() {
        return totalPage == null || totalPage < 0 ? 0 : totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage == null || totalPage < 0 ? 0 : totalPage;
    }

    public Long getTotal() {
        return total == null || total < 0 ? 0 : total;
    }

    public void setTotal(Long total) {
        this.total = total == null || total < 0 ? 0 : total;
    }

    public Long getIsLast() {
        return isLast == null ? 0 : 0L;
    }

    public void setIsLast(Long isLast) {
        this.isLast = isLast == null ? 0 : 0L;
    }

    public List<?> getList() {
        return list == null ? new ArrayList<>() : list;
    }

    public void setList(List<?> list) {
        this.list = list == null ? new ArrayList<>() : list;
    }
}
