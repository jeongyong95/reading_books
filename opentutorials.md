#   docker 맛보기 요약

##  도커를 앱스토어로 비유하면
- 앱스토어 === docker hub
- 앱 === image
- 프로세스 === container

##  docker
- 하나의 이미지로 여러개의 컨테이너를 생성할 수 있음
  - `docker run [option] image [command]`
- 애플리케이션은 컨테이너에 격리되어 있고, 컨테이너는 도커 호스트 내부에 격리되어 있음
- 외부에서 컨테이너의 애플리케이션과 통신을 하려면 port forwarding을 해야함
- 컨테이너를 생성할 때 port forwarding을 옵션으로 지정할 수 있음
  - `docker run -p {도커_호스트_포트}:{컨테이너_포트} image ...`
  - 포트만 지정하면 프로토콜은 `tcp`로 묵시적 지정
- 컨테이너 내부에서 명령을 수행하려면
  - `docker exec {container} {command}`