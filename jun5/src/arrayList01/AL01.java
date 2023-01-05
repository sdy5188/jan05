package arrayList01;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//랩퍼 클래스 생각하고 하실 컬렉션
public class AL01 {

	public static void main(String[] args) {
//		< > 제네릭 1.5추가 되었습니다. 내부 타입 요소 지정
		ArrayList<Integer> list = new ArrayList<Integer>();
//		값 추가 .add();
		
		list.add(150);
		list.add(110);
		list.add(100);
		list.add(199);
		list.add(85);
		list.add(75);
		
//		값 출력 .get(index);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
//		size()
		System.out.println(list.size());//갯수
		
		
//		list의 마지막 데이터 출력
		System.out.println(list.get(list.size()-1));
		
//		1~20까지 짝수만 순서대로 저장해주세요
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		for (int i = 1; i <= 20; i++) {
			if(i%2 == 0) {
				list2.add(i);
			}
			
		}
		System.out.println(list2);
		
//		.remove(index); index값지움
		list2.remove(0);
		
		System.out.println(list2);
		
		list.clear();//초기화
		System.out.println(list.size());//0
//		짝수만 남기기
		for (int i = 1; i <= 20; i++) {
			list.add(i);
		}
		System.out.println(list);
		for (int i = 0; i < list.size()/2; i++) {
			list.remove(i);
		}
		System.out.println(list);
		
		list.clear();
		
		System.out.println("선생님꺼==============");
		for (int i = 1; i <= 20; i++) {
			list.add(i);
		}
		for (int i = list.size() - 2; i >= 0;  i -= 2) {
			list.remove(i);
		}
		System.out.println(list);
//		[2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
		
		list.add(0,100);
		
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list);
		
//		선생님꺼에 짝수 있던거에 홀수 끼워넣기
//		값이 있어?
		list.contains(20);
		System.out.println(list.contains(100));
		
		list.isEmpty();//비어있어?
		
		list.subList(0, 10);
		
		Collections.shuffle(list);//섞기
		System.out.println(list);
//		[6, 18, 10, 14, 8, 2, 100, 4, 16, 20, 12]
		
		Collections.sort(list);
		System.out.println(list);
//		[2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 100]
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
//		[100, 20, 18, 16, 14, 12, 10, 8, 6, 4, 2]
		
//		값의 위치를 반환
		list.indexOf(10);
//		index에 10이 없다면 -1 있다면 index숫자나옴
		System.out.println(list.indexOf(10));
		
		
		
		
		System.out.println("선생님꺼==============");
//		광표형
//		for(int i=0; i<list.size();i++) {
//	         if(list.get(i) % 2 == 1) {
//	            list.remove(i);
//	         }
//	      }
//	      System.out.println(list);
//		홀수만 남기기
		for (int i = 20; i >= 1; i--) {
			list.add(i);
		}
//		System.out.println(list);
		for (int i = 0; i < list.size()/2 ; i++) {
			list.remove(i);
		}
//		System.out.println(list);
		list.clear();
//		다른사람 짝수남기기
		for (int i = 1; i < 20; i++) {
			list.add(i);
			list.remove(list.size()-1);
			list.add(1+i++);
			
//			System.out.println(list);
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
