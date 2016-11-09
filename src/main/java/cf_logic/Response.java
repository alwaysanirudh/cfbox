package cf_logic;

public class Response {
    Integer plan_id;
    String product_id;
    Boolean proceed;
    Integer consumerId;
    Boolean claimed;
    Data data;

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

    public Boolean getProceed() {
        return proceed;
    }

    public void setProceed(Boolean proceed) {
        this.proceed = proceed;
    }

    public Integer getConsumerId() {
        return 23456;
    }

    public void setConsumerId(Integer consumerId) {
        this.consumerId = consumerId;
    }
    public Boolean getClaimed() {
        return false;
    }

    public void setClaimed(Boolean claimed) {
        this.claimed = claimed;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
    public Response(Integer plan_id, String product_id, Boolean proceed, Data data) {
        this.plan_id = plan_id;
        this.product_id = product_id;
        this.proceed = proceed;
        this.data = data;
    }

    public Response() {
    }
}
