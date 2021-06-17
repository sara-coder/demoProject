package luvtocode.annodemo.com;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("luvtocode.annodemo.com")
@PropertySource("classpath:menu.properties")
public class FoodConfig {

}
