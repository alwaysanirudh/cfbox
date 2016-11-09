package example;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;

public class Hello implements RequestHandler<Request, Response> {

    public Response handleRequest(Request request, Context context) {
        
        Integer plan_id = 29;
        String product_id = "58e3e82e-7471-44fe-934d-c95e9f14dc40";
        Boolean proceed = false;

        if( Integer.parseInt(request.last_six_months_average) > 100000 && Integer.parseInt(request.applicant_pan) > 600) {
            proceed = true;
        }
        
        return new Response(plan_id,product_id,proceed);
    }
}
