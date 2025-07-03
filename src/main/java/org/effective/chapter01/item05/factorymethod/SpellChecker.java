package org.effective.chapter01.item05.factorymethod;

import org.effective.chapter01.item05.Dictionary;

public class SpellChecker {

    private Dictionary dictionary;

    public SpellChecker(DictionaryFactory dictionaryFactory) {
        this.dictionary = dictionaryFactory.getDictionary();
    }
    public SpellChecker(MockDictionaryFactory dictionaryFactory) {
        this.dictionary = dictionaryFactory.getDictionary();
    }
}
