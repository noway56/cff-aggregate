package com.cff.starter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.function.Predicate;


/**
 *  application
 *
 * @author luwu
 */
@SpringBootApplication
@Slf4j
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        ApplicationContext context = application.run(args);
        log.info("*********************scan spring beans*************************");
        Arrays.stream(context.getBeanDefinitionNames())
            .filter(new Predicate<String>() {
                @Override
                public boolean test(String s) {
                    return !(s.contains("spring")
                            || s.contains("Servlet")
                            || s.contains("app")
                            || s.contains("transaction")
                            || s.contains("jdbc")
                            || s.contains("sql")
                            || s.contains("data")
                            || s.contains("mvc"));
                }
            })
            .sequential().forEach(log::info);
        log.info("*********************scan end*************************");
    }

    /**
     * 实现SpringBootServletInitializer可以让spring-boot项目在web容器中运行
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources(this.getClass());
        return super.configure(builder);
    }
}
