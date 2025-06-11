# Item 1 - 생성자 대신에 정적 팩터리 메서드를 고려하라. 
## 목차 

[생성자 팩터리 메서드]()  
[장점]()
* [이름을 가질수 있다.]()
* [호출될 때 마다 인스턴스를 새로 생성하지 않아도 된다.]()
* [반환 타입의 하위 타입 객체를 반환할 수 있는 능력이 있다.]()
* [입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.]()
* [정적 팩터리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재 하지 않아도 된다.]()

[단점]()
* [하위 클래스를 만들 수 없다.]()
* [정적 팩터리 메서드는 프로그래머가 찾기 어렵다.]()


## 생성자 팩터리 메서드
- 클라이언트가 클래스의 인스턴스를 얻는 전통적인 수단은 public 생성자다. 
- 클래스는 생성자와 별도로 정적 팩터리 메서드(static factory method)를 제공할 수 있다. 
## 장점 
### 이름을 가질수 있다.
- 생성자에 넘기는 매개변수와 생성자 자체만으로는 반환될 객체의 특성을 설명할 수 없다. 
```java
// Constructor Overloading
public Order(Product product, boolean prime) {
    this.prime = prime;
    this.urgent = urgent;
}

public Order(Product product, boolean urgent) {
    this.product = product;
    this.urgent = urgent;
}
public Order(boolean urgent, Product product) {
    this.product = product;
    this.urgent = urgent;
}
```
- 정적 팩터리는 명명만 잘 하면 반환된 객체의 특성을 묘사하기 쉽다.
- 한 클래스에 시그니처가 같은 생성자가 여러개 필요할 것 같으면 생성자를 정적 팩터리 메서드로 바꾸고 각각의 차이를 드러내는 이름을 짓자. 
```java
public static Order primeOrder(Product product){
    Order order = new Order();
    order.prime = true;
    order.product = product;
    return  order;
}

public static Order urgentOrder(Product product){
    Order order = new Order();
    order.urgent = true;
    order.product = product;
    return  order;
}
```
### 호출될 때 마다 인스턴스를 새로 생성하지 않아도 된다. 

- 불변 클래스는 인스턴스를 미리 만들어 놓거나 새로 생성한 인스턴스를 캐싱하여 재활용하는 식으로 불필요한 객체 생성을 피할 수 있다. 
#### 플라이웨이트 패턴(Flyweight Pattern)
- 정리..
#### instance controlled 
- 반복되는 요청에 같은 객체를 반환하는 식으로 정적 팩터리 방식의 클래스는 언제 어느 인스턴스를 살아 있게 할지를 통제할 수 있다. 
- 이러한 클래스를 인스턴스 통제 클래스라고 한다.
- 싱글턴 생성이 가능하고, 인스턴스화 불가, 불변값 클래스에서 동치인 인스턴스가 단 하나임을 보장 가능하다. 

### 반환 타입의 하위 타입 객체를 반환할 수 있는 능력이 있다. 
- 반환할 객체의 클래스를 자유롭게 선택할 수 있게 하는 유연성이 있다. 
- API를 만들때 이 유연성을 응용하면 구현 클래스를 공개하지 않고 그 객체를 반환할 수 있어 API를 작게 유지할 수 있다. 
- 자바 8 부터 인터페이스가 정적 메서드를 가질 수 없다는 제한이 풀렸기 때문에 인슽턴스화 불가 동반 클래스를 둘 필요가 없다. 

### 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다. 
- 반환 타입의 하위 타입이기만 하면 어떤 클래스의 객체를 반환하든 상관없다.

### 정적 팩터리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재 하지 않아도 된다. 
- 서비스 제공자 프레임워크를 만드는 근간이 된다. 
- 서비스 제공자 프레임워크에서의 제공자는 서비스의 구현체다. 
- 서비스 제공자 프레임워크는 3개의 핵심 컴포넌트로 이루어진다. 
  - 서비스 인터페이스(구현체의 동작을 정의)
  - 제공자 등록 API(제공자가 구현체를 등록할때 사용) 
  - 서비스 접근 API(클라이언트가 서비스의 인스턴스를 획득할 때 사용)
  - 서비스 제공자 인터페이스 (인터페이스의 인스터스를 생성) 
- 서비스 제공자 인터페이스가 없으면 각 구현체를 인스턴스로 만들때 리플렉션을 사용해야 한다. 
```java
ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
Optional<HelloService> first = loader.findFirst();
first.ifPresent(h -> {
    h.hello();
});
```
## 단점 
### 하위 클래스를 만들 수 없다. 
- 상속을 하려면 접근 지정자가 public, protected 생성자가 필요하기 때문에 정적 팩터메 메서드만으로는 하위 클래스를 만드는 것이 불가능하다. 

### 정적 팩터리 메서드는 프로그래머가 찾기 어렵다.
- 생성자 처럼 API 설명에 명확히 드러나지 않기 때문에 사용자는 정적 펙터리 메서드를 방식 클래스를 인스턴스화 할 방법을 알아내야 한다. 
#### 정적 팩터레 메서드 명명방식 
- from 
  - 매개 변수를 하나 받아서 해당 타입의 인스턴스를 반환한다.   
- of 
  - 여러 매개변수를 받아 적합한 타입의 인스턴스는 반환한다.
- valueOf 
  - from과 of의 더 자세한 버전 
- instance, getInstance 
  - 매개변수로 명시한 인스턴스를 반환하지만 같은 인스턴스임을 보장하지 않는다. 
- create newInstance 
  - instance, getInstance와 같지만 매번 새로운 인스턴스를 생성해 반환함을 보장한다.
- getType 
  - getInstance와 같은나 생성할 클래스가 아닌 다른 클래스에 팩터리 메서드에 쓴다.
- newType 
  - newInstance와 같은나 생성할 클래스가 아닌 다른 클래스에 팩터레 메서드를 정의할 때 쓴다. 
- type 
  - getType와 newType의 간결한 버전 
***
> 조슈아 블로그, 『 Effective Java 3/E』, 인사이트 (2018)  
