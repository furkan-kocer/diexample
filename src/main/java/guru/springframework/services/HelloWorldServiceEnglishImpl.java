package guru.springframework.services;

import com.sun.org.glassfish.external.probe.provider.annotations.ProbeProvider;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 10/26/15.
 */
@Component
@Profile("english")
public class HelloWorldServiceEnglishImpl implements HelloWorldService{
    @Override
    public String getGreeting() {
        return "Hello World!!!";
    }
}
