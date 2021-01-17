package dolly0920;

class Parent {
    int parent_member;

    void method() {
        System.out.println("parent method");
    }
}

class Child extends Parent {
    int child_member;

    void method() {
        System.out.println("child method");
    }
}

public class itemone {

    public static void main(String[] args) {
        Child testObject1 = new Child(); // Child
        testObject1.child_member = 10;

        Parent testObject2 = testObject1; // upcasting (child -> parent)
        testObject2.parent_member = 1;

        testObject2.method(); // 이미 오버라이딩 된 상태 ( parent에서 호출해도 당연히 children에서 오버라이딩된 내용이 실행됨 )
        System.out.println(testObject2.parent_member); // child_member는 접근자체가 안됨. ( testObject2는 Parent 인스턴스이므로 당연하다. )

        Child testObject3 = (Child) testObject2; // downcasting
        testObject3.method();
        System.out.println(testObject3.child_member); // upcasting -> downcasting과정에서도 데이터가 남아있음. (testObject2 상태에서 불러오지 못할 뿐이지 값은 사라지지 않음)
        // question : 이 때의 데이터는 오버라이딩되지 않았지만 저장이 되어있다. 업캐스팅과 다운캐스팅 사이에 gc가 발생하지 않아 그런건지, 아니면 항상 이 상태가 보장되는건지.
    }
}