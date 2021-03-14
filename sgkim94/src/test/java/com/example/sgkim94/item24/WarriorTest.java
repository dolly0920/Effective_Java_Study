package com.example.sgkim94.item24;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class WarriorTest {

    @Test
    @DisplayName("전사가 공격한 후 공격 데미지를 리턴한다")
    void attack() {
        Warrior warrior = new Warrior(10);

        WowRunnable countOfAttack = warrior.attack(5);
        Command damage = countOfAttack.run();

        assertThat(damage.retrieveDamage()).isEqualTo(10 * 5);
    }
}
