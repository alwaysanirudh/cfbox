package example;

public class Request {
    String last_six_months_average;
    String applicant_pan;

    public String getLast_six_months_average() {
        return last_six_months_average;
    }

    public void setLast_six_months_average(String last_six_months_average) {
        this.last_six_months_average = last_six_months_average;
    }

    public String getApplicant_pan() {
        return applicant_pan;
    }

    public void setApplicant_pan(String applicant_pan) {
        this.applicant_pan = applicant_pan;
    }

    public Request(String last_six_months_average, String applicant_pan) {
        this.last_six_months_average = last_six_months_average;
        this.applicant_pan = applicant_pan;
    }

    public Request() {
    }
}
