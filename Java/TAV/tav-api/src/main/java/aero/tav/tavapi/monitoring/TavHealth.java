package aero.tav.tavapi.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TavHealth implements HealthIndicator {
    @Override
    public Health health() {
        if(CheckDBConnection()) {
            return Health.up().withDetail("Eveything seems ok",100).build();
        }
        return Health.down().withDetail("DB Connection has been lost",2).build();
    }

    private boolean CheckDBConnection(){
        return false;
    }
}
