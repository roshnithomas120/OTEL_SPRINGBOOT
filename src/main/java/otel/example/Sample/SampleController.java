package otel.example.Sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payload")
public class SampleController {

    @GetMapping("/{id}")
    public String getPayloadById(@PathVariable int id){
        return "Id provided is "+id;
    }
}
