package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
//@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

  /*  @Bean(name="ivan")
    People people1(){
        var p = new People();
        p.setName("Ivan");
        return p;
    }

    @Bean
    @Primary
    People people2(){
        var p = new People();
        p.setName("Petr");
        return p;
    }
    @Bean
    People people3(){
        var p = new People();
        p.setName("Masha");
        return p;
    }*/
}
