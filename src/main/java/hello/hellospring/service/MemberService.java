package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

//@Service
public class MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }
    // 테스트 단계에서 맴버서비스, 맴버리포지터리 객체 두개다 생성하기보다는
    // 맴버 서비스에서 한번 리포지터리까지 생성해서 같은 객체로 테스트할수있게 생성
    // DI 디펜던시인잭션
    /**
     *
     * 회원 가입
     */
    public Long join(Member member){
        validateDuplciateMember(member); // 중복회원검증
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplciateMember(Member member) {
        memberRepository.findByName(member.getName())
            .ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
            });
        /* 두가지 코드를 합쳐서 위와 같이 사용 가능
        Optional<Member> result = memberReopsitory.findByName(member.getName());
        result.ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
        */
    }
    /**
     *
     * 전체 회원 조희
     */
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }

}
