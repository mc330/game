package api.server.util;

import javax.validation.constraints.NotNull;

public class PageVO {
    private Long page;
    private Long pageSize;
    private Long limitStart;

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page == null || page < 1 ? 1 : page;
        this.setLimitStart(null);
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize == null || pageSize < 0 ? 20 : pageSize;
        this.setLimitStart(null);
    }

    public Long getLimitStart() {
        return limitStart;
    }

    public void setLimitStart(Long limitStart) {
        if (limitStart == null && this.page != null && this.pageSize != null) {
            this.limitStart = this.page * this.pageSize;
        } else {
            this.limitStart = limitStart;
        }
    }
}
