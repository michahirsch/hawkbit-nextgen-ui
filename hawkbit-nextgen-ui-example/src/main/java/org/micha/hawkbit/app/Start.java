package org.micha.hawkbit.app;

import org.eclipse.hawkbit.EnableJpaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vaadin.spring.annotation.EnableVaadin;

@SpringBootApplication
@EnableJpaRepository
@EnableVaadin
public class Start {

    /**
     * Main method to start the spring-boot application.
     *
     * @param args
     *            the VM arguments.
     */
    // Exception squid:S2095 - Spring boot standard behavior
    @SuppressWarnings({ "squid:S2095" })
    public static void main(final String[] args) {
        SpringApplication.run(Start.class, args);
    }

}
