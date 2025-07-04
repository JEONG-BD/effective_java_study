package org.effective.chapter01.item05.springioc;

import org.effective.chapter01.item05.Dictionary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpringDictionary implements Dictionary {
    @Override
    public boolean contains(String word) {
        System.out.println("word = " + word);
        return false;
    }

    @Override
    public List<String> closeWordsTo(String typo) {
        return List.of();
    }
}
