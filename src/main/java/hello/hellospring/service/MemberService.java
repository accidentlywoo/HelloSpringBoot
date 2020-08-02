package hello.hellospring.service;

import hello.hellospring.controller.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMomberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {
    private final MemberRepository memberRepository = new MemoryMomberRepository();

    /**
     * 회원가입
     */
    public Long join(Member member){
        // 이름이 같은 회원X
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {//alt+shift+T
        memberRepository.findByName(member.getName())
            .ifPresent(m -> {//Optional Method
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
    }

    /**
     * 전체 회원 조회
     */
    private List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
