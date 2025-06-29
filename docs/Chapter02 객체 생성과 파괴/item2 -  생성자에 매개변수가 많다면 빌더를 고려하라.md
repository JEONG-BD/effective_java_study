# Item 2 - 생성자에 매개변수가 많다면 빌더를 고려하라. 
## [목차]

[점층적 생성자 패턴](#1-점증척-생성자-패턴telescoping-constructor-pattern)  
[자바빈즈](#2-자바빈즈javabeans-pattern)  
[생성자 빌더 패턴](#3-생성자-빌더-패턴)  


## 1. 점증척 생성자 패턴(telescoping constructor pattern
- 정적 팩토리와 생성자에는 똑같은 제약이 하나 있다. 선택적 매개변수가 많을 때 대응하기가 어렵다. 
- 필수 매개변수 혹은 필수 매개변수와 선택 매개변수를 받는 생성자 형태로 선택 매개변수를 전부 다 받는 생성자까지 늘려가는 방식이다. 
- 원하는 매개 변수를 포함한 생성자 중 가장 짧은 것을 골라 호풀출하면 된다. 
- 점층적 생성자 패턴도 쓸 수는 있지만 매개변수가 많아지면 클라이언트 코드를 작성 및 읽기 어렵다. 
```java
public class NutritionFacts {
    private final int servingSzie;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public NutritionFacts(int servingSzie, int servings){
        this(servingSzie, servings, 0);
    }


    public NutritionFacts(int servingSzie, int servings,
                          int calories){
        this(servingSzie, servings, calories, 0);
    }

    public NutritionFacts(int servingSzie, int servings,
                          int calories, int fat){
        this(servingSzie, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSzie, int servings,
                          int calories, int fat, int sodium){
        this(servingSzie, servings, calories, fat, sodium, 0);
    }

    public NutritionFacts(int servingSzie, int servings,
                          int calories, int fat,
                          int sodium, int carbohydrate){
        this.servingSzie = servingSzie;
        this.servings =servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        // 점층적 생성자
        NutritionFacts cocaCola = new NutritionFacts(240, 8);

    }
}
```
## 2. 자바빈즈(JavaBeans pattern) 
- 자바 빈즈는 매개변수가 없는 생성자로 객체를 생성 후 세터 메서드를 호출해서 원하는 매개변수의 값을 설정하는 방식이다. 
- 코드가 길어지지만 인스턴스를 만들기 쉽고 더 읽기도 쉬운 코드가 된다. 
- 자바빈즈 패턴에서는 객체 하나를 만들려면 여러 개의 메서드를 호출하고 객체가 완전히 생성되기 전까지 일관성이 무너진다. 
- 점층적 생성자 패턴에서는 매개변수가 유효한지 생성자에서만 확인하면 되지만 그 장치가 사라진다. 
- 일관성이 무너지는 문제 때문에 <u>**자바빈즈 패턴에서는 클래스를 불변으로 만들 수 없다.**</u>
### 2.1 자바빈? 
- 자바빈이란 재사용 가능한 컴포넌트를 만들기 위한 일종의 <u>**프로그래밍 규약**</u>을 따르는 자바 클래스다. 
- 자바빈은 아래 규약을 권장햔다. 
  - 기본 생성자(public, argument 없음)  
  - 필드는 private, 접근은 setter/getter 
  - 직렬화가 가능 해야 한다. 
```java
public class NutritionFacts {
    private int servingSzie = -1;
    private int servings = -1;
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFacts() {
    }

    public void setServingSzie(int val) {
        this.servingSzie = val;
    }

    public void setServings(int val) {
        this.servings = val;
    }

    public void setCalories(int val) {
        this.calories = val;
    }

    public void setFat(int val) {
        this.fat = val;
    }

    public void setSodium(int val) {
        this.sodium = val;
    }

    public void setCarbohydrate(int val) {
        this.carbohydrate = val;
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts();
        cocaCola.setServingSzie(240);
        cocaCola.setCalories(8);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);

    }
}
```
## 3. 객체 얼리기(freezing)
- 임의의 객체를 불변객체로 만들어 주는 기능이다. 

## 5. 생성자 빌더 패턴(Builder pattern)
- 점층적 생성자 패턴의 안전성과 자바 빈즈의 가독성을 겸비한 빌더패턴이다. 
- 클라이언트킄 필요한 객체를 직접 만드는 대신에 필수 매개변수만으로 생성자를 호출해 빌더 객체를 얻는다. 
- 빌더 객체가 제공하는 일종의 메서 메서드로 원하는 매개변수들을 설정한다. 
- 마지막으로 매개변수가 없는 build 메서드를 호출해 객체를 얻는다. 
- 빌더 패턴은 파이썬과 스칼라에 있는 매개변수를 흉내낸 것이다. 
- 빌더 패턴은 계층적으로 설계된 클래스와 함께 쓰기에 좋다. 
```java
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;


    public static class Builder {

        private final int servigSize;
        private final int servings;
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servigSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            calories = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servigSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new Builder(240, 30)
                .calories(10)
                .sodium(9)
                .carbohydrate(27)
                .build();

    }
}

// lombok 
@Builder()
@AllArgsConstructor(access = AccessLevel.PRIVATE)
// 빌더패턴은 생성자가 생긴다는 단점이 있지만 @AllArgsConstructor(access = AccessLevel.PRIVATE) 이용해서 극복 가능
public class NutritionFacts {
    private final int servingSize ;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;


    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFactsBuilder()
                .servings(10)
                .servingSize(20)
                .calories(30)
                .fat(40)
                .sodium(10)
                .carbohydrate(1)
                .build();
}
```

***
> 조슈아 블로그, 『 Effective Java 3/E』, 인사이트 (2018)  
