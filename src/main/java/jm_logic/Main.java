package jm_logic;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;

public class Main implements RequestHandler<Request, Response> {

    public Response handleRequest(Request request, Context context) {
        
        Boolean proceed = false;

        if( Integer.parseInt(request.data.last_six_months_average) > 150000 && Integer.parseInt(request.data.applicant_pan) > 600) {
            proceed = true;
        }
        return new Response(request.plan_id,request.product_id,proceed,request.data);
    }
}
