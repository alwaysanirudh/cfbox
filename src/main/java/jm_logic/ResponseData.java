package jm_logic;

public class ResponseData {
    String initial_offer;
    String tenure;
    String interest_rate;
    String emi;

    public String getInitial_offer() {
        return initial_offer;
    }

    public void setInitial_offer(String initial_offer) {
        this.initial_offer = initial_offer;
    }

    public String getTenure() {
        return tenure;
    }

    public void setTenure(String tenure) {
        this.tenure = tenure;
    }

    public String getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(String interest_rate) {
        this.interest_rate = interest_rate;
    }

    public String getEmi() {
        return emi;
    }

    public void setEmi(String emi) {
        this.emi = emi;
    }
    public ResponseData(Boolean proceed) {
        if (proceed) {
            this.initial_offer = "100000";
            this.tenure = "6 months";
            this.interest_rate = "18%";
            this.emi = "16850";
        } else {
            this.initial_offer = "no offer available";
        }
    }

    public ResponseData() {
    }
}
