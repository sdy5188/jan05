package arrayList01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AL02 {
	public static void main(String[] args) {
		
		List<Integer>list = new ArrayList<Integer>();
		
		list.add(10);
//		list.add(11.1);
//		list.add("dd");
		
		int num = list.get(0);
		
		
//		리스트를 새로 만들어주세요.
//		랜덤에서 숫자가 나오면
//		크기 순서대로 저장하는 메소드를 만들어주세요.
//		랜덤은 6번만 실행해주세요.
		
//		[3, 5, 6, 9]
//		같은 숫자는 x
		List<Integer> lotto = new ArrayList<Integer>();
	      while (lotto.size() < 6) {
	         int ra = (int) (Math.random() * 45) + 1;
	         if (lotto.indexOf(ra) == 0) {
	            continue;
	         }
	         if (lotto.size() == 0) {
	            lotto.add(ra);// 첫 숫자라 저장하기
	         } else if (lotto.indexOf(ra) == -1) {
	            for (int i = 0; i < lotto.size(); i++) {
	               if (lotto.get(i).compareTo(ra) == 1) {
	                  lotto.add(i, ra);
	                  break;
	               } else if (lotto.get(i).compareTo(ra) == -1) {
	                  for (int j = i + 1; j < lotto.size() - 1; j++) {
	                     if (lotto.get(j) > ra) {
	                        lotto.add(j, ra);
	                        break;
	                     }
	                  }
	               }
	            }
	         }
	      }
		System.out.println(lotto);
	}
}
