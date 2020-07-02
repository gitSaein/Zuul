zuul

##### ribbon (retry)

      Spring Cloud에서 클라이언트 사이드 로드밸런서로 Ribbon을 이용하고 있습니다.
      만약 내부 서버로 request가 실패했을 경우 재시도를 하고 다른 서버로 시도하는 역할
      
      - serverList (로드 밸런싱 대상 서버 목록)
      - rule (요청을 보낼 서버를 선택하는 논리, 로드 밸런싱)
      - ping (서버 list 의 생존 유무 판단)
      
#####ribbon config
- rule:  로드밸런싱 룰
- ping:  서버의 실시간 가용성 탐지
- serverList: 