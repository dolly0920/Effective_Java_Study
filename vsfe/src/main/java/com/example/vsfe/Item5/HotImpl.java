package com.example.vsfe.Item5;

import org.springframework.stereotype.Service;

@Service
public class HotImpl implements ChickenService {
    @Override
    public SourceType getSourceType() {
        return SourceType.SPICY;
    }

    @Override
    public void makeChicken(int number) {
        System.out.println("불닭 치킨 한마리 잘 튀겼습니다~~~ 지금 " + (number + 1) + "마리 있으니까 식기전에 배달하세요!");
    }

    @Override
    public int deliverChicken(int number) {
        if(number == 0) {
            System.out.println("불닭 치킨이요?? 튀긴게 없는데요?");
            return 0;
        }
        System.out.println("불닭 치킨 한마리 배달!! 남은 치킨은 " + (number - 1) + "마리에요.");
        return number - 1;
    }
}
