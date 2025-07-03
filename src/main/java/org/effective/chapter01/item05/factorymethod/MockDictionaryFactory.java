package org.effective.chapter01.item05.factorymethod;

import org.effective.chapter01.item05.DefaultDictionary;
import org.effective.chapter01.item05.Dictionary;
import org.effective.chapter01.item05.MockDictionary;

public class MockDictionaryFactory implements DictionaryFactory{

    @Override
    public Dictionary getDictionary() {
        return new MockDictionary();
    }
}
