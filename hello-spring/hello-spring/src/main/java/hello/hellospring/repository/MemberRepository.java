package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository { // interface
    Member save(Member member); // 회원이 저장소에 저장됨.
    Optional<Member> findById(Long id); // 저장소에서 id 찾아옴. Optional은 null 반환과 관련됨
    Optional<Member> findByName(String name);
    List<Member> findAll(); // 모든 회원 리스트 반환.
}
