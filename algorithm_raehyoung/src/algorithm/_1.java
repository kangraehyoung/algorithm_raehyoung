package algorithm;

public class _1 {

	public static void main(String[] args) {
		/*
		 * MVCB, 홈런볼, 데이터, 컨트롤러, 유저, 검색엔진 알고리즘, DBA
		 * 
		 * 1. MVC
		 *  Model : 데이터를 객체로 표현한 것 
		 *  View : 결과를 유저가 보는 화면에 보여주는것
		 *  Controller : 모델에 명령을 보내서 모델의 상태를 변경해주는것 (유저가 원하는 데이터를 볼 수 있도록)
		 *  			 DB와 연동하여 사용자가 입력한 데이터나 사용자에게 출력할 데이터를 다룸.
		 *  
		 *  MVCB????
		 *  
		 * 2. 데이터
		 * 	특정 주제에 대해서 수집된 정보
		 * 	홈런볼 -> 맛있다, 비싸다, 양이 많다, 너무 달다 
		 * 	모두 데이터라 볼 수 있음.
		 * 
		 * 3. DB, DBA
		 * 	DB : 데이터의 집합체
		 *  DBA : Database Administrator 데이터를 관리하는 사람
		 *  데이터를 수집, 보관, 권한 등을 관리
		 *  
		 * 4. 검색 엔진 알고리즘
		 *  검색 : select * from table where keyword like "%ㅎㄹㅂ%";
		 *  
		 *  
		 *  
		 * 	참고 : https://the-dev.tistory.com/30
		 *  https://needjarvis.tistory.com/345
		 *  검색 -> 색인 알고리즘, 엘라스틱 서치, 역색인
		 *  
		 *  색인 : 문서의 위치에 대한 index를 만들어서 빠르게 그 문서에 접근하고자 하는 것
		 *  역색인 : 문서 내의 문자와 같은 내용물의 맵핑 정보를 색인해놓는 것
		 *  
		 *  구글 : 크롤링 -> 색인 생성 -> 검색 결과 
		 *  크롤러라는 프로그램을 사용해서 페이지를 찾아 방문하고 페이지의 정보를 적어서 검색했을때 색인을 통해서 
		 *  최상의 검색 결과 게시
		 *  
		 *  결과의 순위 지정
		 *  참고 : https://www.google.com/intl/ko/search/howsearchworks/how-search-works/ranking-results/
		 *  
		 *  홈런볼 -> 홈런볼
		 *  홈런블 -> 홈런볼(수정된 검색어)
		 *  홈런벌 -> 홈런볼(수정된 검색어)
		 *  참고 : https://www.youtube.com/watch?v=J5RZOU6vK4Q&t=130s
		 *  
		 *  철자 오류를 수집하여 오류가 발생한 철자를 검색했을 떄 오류가 나지 않은 검색어로 검색된 페이지로 대체해서 출력해준다.
		 *  
		 *  
		 *  네이버 : c - rank
		 *  
		 *  
		 * 5. 자소분리
		 *  유니코드 한글 시작 44032, 끝 55199
		 *  
		 *  
		 * 6. 블록체인이란 -> 합의 알고리즘 PoW, PoS, DPoS
		 * 	  
		 *    참조 : https://medium.com/@kimjunyong/5-%EB%B8%94%EB%A1%9D%EC%B2%B4%EC%9D%B8-%ED%95%A9%EC%9D%98-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%95%8C%EC%95%84%EB%B3%B4%EA%B8%B0-1%ED%8E%B8-pow-pos-dpos-21f8e3b2c22a
		 *          https://www.markany.com/blog/%EB%B8%94%EB%A1%9D%EC%B2%B4%EC%9D%B8-%ED%95%A9%EC%9D%98-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98/
		 *          https://saintbinary.tistory.com/19
		 * 	  
		 *    블록 : 저장 단위
		 *    체인 : 무수히 많은 블록을 연결
		 *    
		 *    블록체인이 체인으로 유지되기 위해 합의 알고리즘이 필요 
		 *    합의 알고리즘 -> 다수의 참여자들이 하나의 통일된 의사결정을 하기 위해 사용하는 알고리즘
		 *    블록체인은 트랜잭션 정보를 기록한 일종의 분산장부로써, 각 노드가 각각의 장부를 가지고 있고 이 장부의 내용은 합의 알고리즘에 의해 동일하게 유지되는 것
		 *    
		 *    POW : 작업증명이다. 문제를 주어주고 조건을 만족하는 답을 찾아낸 노드에게 보상하는 합의 알고리즘
		 *    POS : PoS는 해당 블록체인에 대해 가지고 있는 지분율로 보상받게 되는 합의 방식이다. 즉 지분을 많이 가진 노드에 블록을 생성할 수 있는 권한을 부여하는 것
		 *    DPOS : 모든 노드가 합의에 참여하는 대신 모든 노드의 투표로 선출된 노드에게 권한을 위임해 합의하도록 하는 방식이다.
		 *    
		 *  7. 자동완성 기능
		 *  참조 : https://programming-tips.tistory.com/4 1편
		 *        https://programming-tips.tistory.com/5 2편
		 * 
		 */
		
		// 자음 모음 분리 로직
//		String[] ja = {"ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"};
//		String[] mo = {"ㅏ", "ㅐ", "ㅑ", "ㅒ", "ㅓ", "ㅔ", "ㅕ", "ㅖ", "ㅗ", "ㅘ", "ㅙ", "ㅚ", "ㅛ", "ㅜ", "ㅝ", "ㅞ", "ㅟ", "ㅠ", "ㅡ", "ㅢ", "ㅣ"};
//		String[] ba = {"", "ㄱ", "ㄲ", "ㄳ", "ㄴ", "ㄵ", "ㄶ", "ㄷ", "ㄹ", "ㄺ", "ㄻ", "ㄼ", "ㄽ", "ㄾ", "ㄿ", "ㅀ", "ㅁ", "ㅂ", "ㅄ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"};
//		String text = "가나다라강낭당랑";
//		
//		for (int i = 0; i < text.length(); i++) {
//			char uniVal = text.charAt(i);
//			
//			if(uniVal >= 0xAC00) {
//				System.out.println(uniVal + "->");
//				uniVal = (char)(uniVal - 0xAC00);
//				
//				char ja1 = (char)(uniVal/28/21);
//				char mo1 = (char)((uniVal)/28%21);
//				char ba1 = (char)(uniVal%28);
//				
//				System.out.println(ja[ja1] + mo[mo1] + ba[ba1]);
//			} else {
//				System.out.println(uniVal + "->" + uniVal);
//			}
//		}
		
		
		//자음 모음 분리 로직 
		String[] ja = {"ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"};
		String[] mo = {"ㅏ", "ㅐ", "ㅑ", "ㅒ", "ㅓ", "ㅔ", "ㅕ", "ㅖ", "ㅗ", "ㅘ", "ㅙ", "ㅚ", "ㅛ", "ㅜ", "ㅝ", "ㅞ", "ㅟ", "ㅠ", "ㅡ", "ㅢ", "ㅣ"};
		String[] ba = {"", "ㄱ", "ㄲ", "ㄳ", "ㄴ", "ㄵ", "ㄶ", "ㄷ", "ㄹ", "ㄺ", "ㄻ", "ㄼ", "ㄽ", "ㄾ", "ㄿ", "ㅀ", "ㅁ", "ㅂ", "ㅄ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"};
		String text = "가나다라강낭당랑";
		
		for (int i = 0; i < text.length(); i++) {
			char uniVal = text.charAt(i);
			
			if(uniVal >= 0xAC00) {
				System.out.println(uniVal + "->");
				uniVal = (char)(uniVal - 0xAC00);
				
				char ja1 = (char)(uniVal/28/21);
				char mo1 = (char)((uniVal)/28%21);
				char ba1 = (char)(uniVal%28);
				
				System.out.println(ja[ja1] + mo[mo1] + ba[ba1]);
			} else {
				System.out.println(uniVal + "->" + uniVal);
			}
		}
		
		
		
		
	
	
	}

}
