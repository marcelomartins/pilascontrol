package pilascontrol

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

@Controller("/login") 
class Login {

    @Get(produces = MediaType.TEXT_PLAIN) 
    public String index() {
        return "Hello World2"; 
    }

}