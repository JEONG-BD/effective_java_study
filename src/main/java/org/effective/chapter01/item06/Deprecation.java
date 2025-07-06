package org.effective.chapter01.item06;

public class Deprecation {

    private String name;
    /**
    * @deprecated in favor of
    * (@Link Deprecation(String)
    */
    @Deprecated(forRemoval = true, since = "1.2")
    public Deprecation() {
    }

    // TODO Annotation Processor
    // Annotation Processor	컴파일 시 애너테이션을 분석해서 코드 생성, 검증, 문서화 등을 수행
    // @deprecated java 1.0
    // @Deprecated java 5.0


    public Deprecation(String name) {
        this.name = name;
    }
}
