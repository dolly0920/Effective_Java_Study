package com.example.sypark9646.item20;

import java.util.ArrayList;
import java.util.List;
import com.example.sypark9646.item20.interface_default_method.Animal;
import com.example.sypark9646.item20.interface_default_method.Cat;
import com.example.sypark9646.item20.interface_default_method.Dog;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InterfaceDefaultMethodTest {

    @DisplayName("lambda에서 interface default method 동작 테스트")
    @Test
    void traverseAnimals() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());

        animals.forEach(Animal::jump);
    }
}
