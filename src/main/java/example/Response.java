package example;

public class Response {
    String plan_id;
    String product_id;
    Boolean proceed;

    public String getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(String plan_id) {
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

    public Response(String plan_id, String product_id, Boolean proceed) {
        this.plan_id = plan_id;
        this.product_id = product_id;
        this.proceed = proceed;
    }

    public Response() {
    }
}
