package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) { // 테스트 만들자~~ ctrl + shif + t
            return price * discountPercent / 100;
        }
        return 0;
    }
}
