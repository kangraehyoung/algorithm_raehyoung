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
		
		
		
		
	
	
	}

}
