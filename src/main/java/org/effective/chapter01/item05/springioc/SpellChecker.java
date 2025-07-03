package org.effective.chapter01.item05.springioc;

import org.effective.chapter01.item05.Dictionary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpellChecker {

    public Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word){
        return dictionary.contains(word);
    }

    public List<String> suggestions(String type){
        return dictionary.closeWordsTo(type);
    }
}
