package org.effective.chapter01.item05.dependencyinjection;

import org.effective.chapter01.item05.Dictionary;
import org.effective.chapter01.item05.DictionaryV1;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {

    private final Dictionary dictionary;

    //일반
    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    // factory
    public SpellChecker(DictionaryFactory dictionaryFactory) {
        this.dictionary = dictionaryFactory.get();
    }


    // supplier
    public SpellChecker(Supplier<Dictionary> dictionarySupplier) {
        this.dictionary = dictionarySupplier.get();
    }


    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String type) {
        return dictionary.closeWordsTo(type);
    }
}
