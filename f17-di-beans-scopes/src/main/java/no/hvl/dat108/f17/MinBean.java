package no.hvl.dat108.f17;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class MinBean {

    private int id;
    
    public MinBean(){
        id=LocalDateTime.now().getNano();
    }

    public int getId() {
        return id;
    }

}
