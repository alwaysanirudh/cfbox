package jm_logic;

public class Request {
    Integer plan_id;
    String product_id;
    Integer step_num;
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
    
    public Integer getStep_num() {
        return step_num;
    }

    public void setStep_num(Integer step_num) {
        this.step_num = step_num;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
    public Request(Integer plan_id, String product_id, Integer step_num,Data data) {
        this.plan_id = plan_id;
        this.product_id = product_id;
        this.step_num = step_num;
        this.data = data;
    }

    public Request() {
    }
}
