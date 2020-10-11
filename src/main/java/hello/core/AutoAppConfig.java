package hello.core;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import static org.springframework.context.annotation.ComponentScan.*;

@Configuration
@ComponentScan(
        // basePackages = "hello.core.member",  -> hello.core.member 패키지가 scan 시작이 됨
        //                                      -> 지정하지 않으면 @ComponentScan이 붙은 설정 정보 클래스 패키지가 시작 위치가 됨
        // @Bean이 붙은 것들과 충돌되므로
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class))
public class AutoAppConfig {

    /*
    @Bean(name = "memoryMemberRepository")
    MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
     */

}