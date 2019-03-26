package jp.co.yahoo.manager;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRouteBuilder extends RouteBuilder {

    @Override
    public void configure() {
//        from("timer://foo?fixedRate=true&period=2000").to("mock:test");
    }
}
