package jm_logic;

public class LogicData {
    Integer plan_id;
    String product_id;
    Integer step_num;
    Boolean proceed;
    Integer consumerId;
    Boolean claimed;
    ResponseData data;

    public Integer getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(Integer plan_id) {
        this.plan_id = plan_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public Integer getStep_num() {
        return step_num;
    }

    public void setStep_num(Integer step_num) {
        this.step_num = step_num;
    }
    public Boolean getProceed() {
        return proceed;
    }

    public void setProceed(Boolean proceed) {
        this.proceed = proceed;
    }

    public Integer getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Integer consumerId) {
        this.consumerId = consumerId;
    }
    public Boolean getClaimed() {
        return claimed;
    }

    public void setClaimed(Boolean claimed) {
        this.claimed = claimed;
    }

    public ResponseData getData() {
        return data;
    }

    public void setData(ResponseData data) {
        this.data = data;
    }
    public LogicData(Integer plan_id, String product_id, Integer step_num,Boolean proceed) {
        this.plan_id = plan_id;
        this.product_id = product_id;
        this.step_num = step_num;
        this.proceed = proceed;
        this.consumerId = 126;
        this.claimed = false;
        this.data = new ResponseData(proceed);
    }

    public LogicData() {
    }
}
