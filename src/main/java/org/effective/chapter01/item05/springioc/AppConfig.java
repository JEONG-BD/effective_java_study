package org.effective.chapter01.item05.springioc;

import org.effective.chapter01.item05.Dictionary;
import org.effective.chapter01.item05.springioc.SpellChecker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
public class AppConfig {

    @Bean
    public SpellChecker spellChecker(Dictionary dictionary){
        return new SpellChecker(dictionary);
    }

    @Bean
    public Dictionary dictionary(){
        return new SpringDictionary();
    }
}
