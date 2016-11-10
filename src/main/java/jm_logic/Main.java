package jm_logic;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;
import com.google.gson.Gson;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.DataOutputStream;
import java.io.IOException;

public class Main implements RequestHandler<Request, Response> {

    public Response handleRequest(Request request, Context context) {
        
        Boolean proceed = false;

        if( Integer.parseInt(request.data.last_six_months_average) > 150000 && Integer.parseInt(request.data.applicant_pan) > 600) {
            proceed = true;
        }
        LogicData logic_data = new LogicData(request.plan_id,request.product_id,request.step_num,proceed,request.data);
        Gson gson=new Gson();
        String post_data = gson.toJson(logic_data);
        
        try {
            String url = "http://thebox.capitalfloat.io/thebox/plan/consumer_response.json";
            URL obj = new URL(url);

            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            //add reuqest header
            con.setRequestMethod("POST");
            con.setRequestProperty("Authorization", "fa0a619df9667fbd3b691e9feff52b80c3a399ad9139b2ad61f0ff1f");
            con.setRequestProperty("Content-Type", "application/json");
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(post_data);
            wr.flush();
            wr.close();

            int responseCode = con.getResponseCode();
            System.out.println("\nSending 'POST' request to URL : " + url);
            System.out.println("Post parameters : " + post_data);
            System.out.println("Response Code : " + responseCode);
        } catch (MalformedURLException e){
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

        return new Response();
    }
}
