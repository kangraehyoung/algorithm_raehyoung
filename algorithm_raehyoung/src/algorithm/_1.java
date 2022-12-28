package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		
		
		/*
		 * #자동완성 검색 기능 구현 
		 * 
		 * 1. 검색 시 자음, 모음, 받침 분리하여 검색되도록 컨트롤러에서 로직 구현 필요. 분리된 키워드를 문자열로 받아야함.... 로직 수정 필요
		 *    ex) 파라미터 값 keyword를 검색하려 할 때 keyword가 자음, 모음, 받침을 분리하여 값을 넘겨서 검색되도록 하는 작업
		 *    
		 * 방법1
		 * 1번의 키워드로 select문을 수행한다고 가정하면 검색될 키워드를 DB에 저장할 때 자음, 모음, 받침을 분리된 값이 들어가야 하므로
		 * view에서 출력해줄떄 분리된 자음, 모음, 받침을 합쳐주는 로직을 추가로 작성해야한다고 생각됨.
		 * 
		 * 방법2 ***
		 * 검색될 게시글을 insert할 때 테이블에 원래의 키워드와 자음, 모음, 받침이 분리된 키워드가 저장될 수 있는 컬럼을 만들어서 분리된 자음, 모음, 받침
		 * 으로 select문을 수행 하더라고 출력될 view에서는 분리된 키워드가 아닌 원래의 키워드를 출력해주면 될것.
		 * 
		 * 2. 사용자가 검색한 키워드의 검색 카운트를 담을 수 있는 컬럼도 필요하다 생각됨. 자동완성 검색 기능을 사용한다고 가정했을때
		 * 	  가장 위에 자동완성 되는 단어는 카운트가 가장 높은 키워드가 와야 하기 때문, 또 검색 시 select 뿐만 아니라 insert문도 같이 실행해서 사용자가 검색하는 단어를 수집하는 기능도 필요해보임.
		 * 
		 * 3. 검색될 키워드를 입력하는 input에 onchange 속성을 줘서 input 태그에 변화가 생길때마다 submit을 수행하여 그때그때
		 * 	  상황에 맞게 자동완성 된 키워드가 뜨지않을까 생각됩니다..
		 * 
		 * 4. 먼저 컨트롤러 이용해서 완성되는 검색어 테스트 후 ajax로 변경예정, 검섹 테스트는 https://github.com/jhin1129/FinalProejct_VODA에 product 부분 검색 기능 수정해서 테스트 할 것
		 * 
		 */
		
		
		// 참조 사이트 https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=xsnake&logNo=100205421762
		
		// ㄱ ㄲ ㄴ ㄷ ㄸ ㄹ ㅁ ㅂ ㅃ ㅅ ㅆ ㅇ ㅈ ㅉ ㅊ ㅋ ㅌ ㅍ ㅎ 
		final char[] ja = {0x3131, 0x3132, 0x3134, 0x3137, 0x3138, 0x3139, 0x3141, 0x3142, 0x3143, 0x3145,
				0x3146, 0x3147, 0x3148, 0x3149, 0x314a, 0x314b, 0x314c, 0x314d, 0x314e};
		// ㅏㅐㅑㅒㅓㅔㅕㅖㅗㅘㅙㅚㅛㅜㅝㅞㅟㅠㅡㅢㅣ
		final char[] mo = {0x314f, 0x3150, 0x3151, 0x3152, 0x3153, 0x3154, 0x3155, 0x3156, 0x3157, 0x3158,
				0x3159, 0x315a, 0x315b, 0x315c, 0x315d, 0x315e, 0x315f, 0x3160,	0x3161,	0x3162,
				0x3163};
				// X ㄱㄲㄳㄴㄵㄶㄷㄹㄺㄻㄼㄽㄾㄿㅀㅁㅂㅄㅅㅆㅇㅈㅊㅋㅌㅍㅎ
		final char[] ba = {0x0000, 0x3131, 0x3132, 0x3133, 0x3134, 0x3135, 0x3136, 0x3137, 0x3139, 0x313a,
				0x313b, 0x313c, 0x313d, 0x313e, 0x313f, 0x3140, 0x3141, 0x3142, 0x3144, 0x3145,
				0x3146, 0x3147, 0x3148, 0x314a, 0x314b, 0x314c, 0x314d, 0x314e};
				
			List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
			
			String tempStr = "아악악아아악아";
			
			System.out.println(tempStr);
			
			for(int i = 0 ; i < tempStr.length();i++){
				// 리스트에 저장하기 위해 Map에 저장 후 list에 저장
				Map<String, Integer> map = new HashMap<String, Integer>(); 
				
				char test = tempStr.charAt(i);
				
				if(test >= 0xAC00){
					char uniVal = (char) (test - 0xAC00);
						
					char ja1 = (char) (((uniVal - (uniVal % 28))/28)/21);
					char mo1 = (char) (((uniVal - (uniVal % 28))/28)%21);
					char ba1 = (char) (uniVal %28);
						

					System.out.print(ja[ja1] +""+ mo[mo1]+"");
					
					if((char)ba1 != 0x0000) {
						
					System.out.print(ba[ba1]);
					
					map.put("ja1", (int) ja1);
					map.put("mo1", (int) mo1);
					map.put("ba1", (int) ba1);
					
					list.add(map);
					
					}
					
				}
			}
			
			// 실행 결과 : 아악악아아악아 ㅇㅏㅇㅏㄱㅇㅏㄱㅇㅏㅇㅏㅇㅏㄱㅇㅏ
			// 리스트 ㅇㅏㅇㅏㄱㅇㅏㄱㅇㅏㅇㅏㅇㅏㄱㅇㅏ를 하나의 문자열로 만들어야함.
	}

}
