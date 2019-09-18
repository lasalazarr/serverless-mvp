package com.advance.partner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionScan;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@FunctionScan
@SpringBootApplication
public class SavePartnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SavePartnerApplication.class, args);
    }

    @Bean
    public Function<In, Out> function() {
            return value -> new Out(value.save());
    }
}

class In {

    private String value;

    In() {
    }

    public In(String value) {
        this.value = value;
    }

    public String save() {
        return value.replaceAll("\\w(?=\\w{4})", "*");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Out {

    private String value;

    Out() {
    }

    public Out(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}