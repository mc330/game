package api.server.util;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;


public class PayRequestDto {

    /**
     * 支付完成时间
     **/
//    @NotEmpty(message = "支付完成时间不能空")
    @Size(min = 0, max = 14, message = "支付完成时间长度不能超过{max}位")
    private String payTime="1";

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }
}