package api.server.util;

import lombok.Data;

@Data
public class PageDTO {
    private Long currentPage;
    private Long totalPage;
    private Long total;
    private Long isLast;
}
