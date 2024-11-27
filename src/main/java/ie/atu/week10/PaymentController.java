package ie.atu.week10;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @PostMapping
    private String makePayment(@RequestBody Person person){
        System.out.println("Response Gotten");
        return "Got person details " + person;
    }

}
