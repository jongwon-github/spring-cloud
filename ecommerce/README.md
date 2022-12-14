## Cloud Native Architecture
* 확장 가능한 아키텍처
  * 시스템의 수평적 확장에 유연
  * 확장된 서버로 시스템의 부하 분산, 가용성 보장
  * 시스템 또는 서비스 애플리케이션 단위의 패키지(컨테이너 기반 패키지)
  * 모니터링
  
* 탄력적 아키텍처
  * 서비스 생성 - 통합 - 배포, 비즈니스 환경 변화에 대응 시간 단축
  * 분활된 서비스 구조
  * 무상태 통신 프로토콜
  * 서비스의 추가와 삭제 자동으로 감지
  * 변경된 서비스 요청에 따라 사용자 요청 처리(동적 처리)
  
* 장애 격리
  * 특정 서비스에 오류가 발생해도 다른 서비스에 영향 주지 않음

## Cloud Native Application
<img width="692" alt="스크린샷 2022-12-13 오후 9 38 41" src="https://user-images.githubusercontent.com/58896783/207320442-4034aa1e-68d4-41bb-882a-d388d6ed3637.png">

Cloud 환경에서 IT 시스템을 구축하는 것을 Cloud Native Architecture(클라우드 네이티브 아키텍처)라 볼 수 있으며, Cloud 환경에서 기동되는 애플리케이션을 Cloud Native Application(클라우드 네이티브 애플리케이션)이라고 할 수 있습니다.   
이 중 Cloud Native Application 의 핵심이자 비즈니스 도메인의 서비스 로직을 구현하는 것이  Microservice 입니다.  
Microservice Architecture 는 기존에 단일 시스템 환경에서 Front-end, Back-end, Database 등의 구성요소를 모두 포함하여 배포하는 모놀리스 방식과 대변되는 개발 방식으로 애플리케이션이 구성하는 잘 나뉘어진 경계에 의해 서비스들을 분리하여 개발하고 운영하기 위한 Architecture 를 말합니다.   
Microservice Architecture 를 기반으로 개발되는 애플리케이션을 위해 Java(자바)와 Spring Framework, Spring Cloud 라는 기술을 사용할 수 있습니다.

Spring Cloud 는 분산 시스템 구성과 애플리케이션을 개발하기 위해 필요한 개발 환경과 서비스, 그리고 개발이나 구성에 관련된 패턴을 제공함으로써 Cloud Native Architecture 를 위한 Microservice 애플리케이션을 빠르게 개발할 수 있도록 제공하는 개발 도구이자, 개발 Platform 입니다.

## 링크 정보
Spring Cloud : https://spring.io/projects/spring-cloud  
IntelliJ IDEA Ultimate : https://www.jetbrains.com/ko-kr/idea  
Git : https://git-scm.com  
Visual Studio Code : https://code.visualstudio.com  
Postman : https://www.postman.com
