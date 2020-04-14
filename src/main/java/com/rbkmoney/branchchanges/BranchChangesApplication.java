package com.rbkmoney.branchchanges;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class BranchChangesApplication extends SpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(BranchChangesApplication.class, args);
    }

}
