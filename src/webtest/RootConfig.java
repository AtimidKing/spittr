package webtest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by king on 2017/6/26.
 */
@Configuration
@ComponentScan(basePackages={"webtest"},excludeFilters={
        @Filter(type= FilterType.ANNOTATION,value=EnableWebMvc.class)})
public class RootConfig {

}
