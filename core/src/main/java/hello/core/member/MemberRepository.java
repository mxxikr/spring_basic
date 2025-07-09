package hello.core.member;

// 회원 저장소
public interface MemberRepository {

    void save(Member member); // 회원 저장

    Member findById(Long memberId);
}