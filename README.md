# spring-multi-module

- 스프링 멀티모듈 스터디(Gemini Kim)
- https://www.youtube.com/watch?v=PdofVTuM-tE&t=11s&ab_channel=%EC%A0%9C%EB%AF%B8%EB%8B%88%EC%9D%98%EA%B0%9C%EB%B0%9C%EC%8B%A4%EB%AC%B4
- 코틀린이 자바 대비 코드 수를 간결하게 줄일 수 있음
- 롬복을 쓰는 것을 선호하는 편은 아님(자바 record, 코틀린 data class)
- 롬복을 쓰는 경우 사용하는 것을 정해서 사용함
- 코틀린 빌드가 너무 느림
- db-main의 jpa 의존성을 api, 클래스들을 internal이 아니게 만들면 다른 모듈에서 jpa관련 엔티티, 레포지토리등을 직접적으로 사용할 수 있음
- https://github.com/limyohwan/spring-boot-kotlin-template 참조
- 아키텍처는 계속해서 진화해나가며 상황에 맞추어 설계해 나가는걸 추천함