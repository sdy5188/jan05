package wrapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//랩퍼클래스
// 능력단위 : (비NCS)웹표준 기술
// 능력단위요소 : (비NCS)웹표준 기술 

/* 자료구조형태 = 컬렉션
 * 컬렉션은 참조값(레퍼런스 R타입)만 담을 수 있습니다.
 * 
 * P타입은 저장할 수 없습니다.
 * 그래서 랩퍼 클래스로 변환 후 저장합니다.
 * 
 * 기본 자료형의 값을 컬렉션에 저장하기 위해서 사용합니다.
 * 모든 기본 자료형에 대해 그에 대응되는 랩퍼 클래스가 있습니다.
 * 
 * 기본 자료형의 값을 멤버 변수에 저장하고
 * 이 값 주변으로 값을 감싸고 있는 메소드가 있다고해서
 * 랩퍼(Wrapper, 감싸다) 클래스라고 불립니다.
 * 
 * 	기본 타입			랩퍼 클래스명
 * 	  byte					Byte
 *    short					Short
 * 	  int					Integer==풀네임
 * 	  long					Long
 * 	  float					Float
 * 	  double				Double
 * 	  boolean				Boolean
 * 	  char					Character==풀네임
 * 
 * 프로모션
 */
public class Wrapper {
	public static void main(String[] args) {
		
		//이제는 이렇게 안해도되서 취소선생김
		Byte b = new Byte((byte) 127);
		Byte b2 = 127;
		
		Integer iNum = new Integer(127);
		Integer iNum2 = 127;//오토박싱 <-> 언박싱
		
		byte bNum = iNum2.byteValue();//캐스팅이 아닙니다.
		short sNum = iNum2.shortValue();
		float fNum = iNum2.floatValue();
		
		iNum = Integer.MAX_VALUE;
		System.out.println(iNum);
		iNum2 = Integer.MIN_VALUE;
		System.out.println(iNum2);
		
		System.out.println(Byte.MAX_VALUE / Byte.MIN_VALUE);
		System.out.println(Byte.MIN_VALUE / Byte.MAX_VALUE);
		
		
		
//		오토박싱
		Integer inum3 = 127;
		Integer inum4 = new Integer(127);
//		형변환이 아닙니다. 기본 타입이 참조 타입으로 바뀝니다.
		
		if(inum3 == 127) {
			System.out.println("같아요");
		}
		else {
			System.out.println("달라요");
		}
		
		System.out.println(inum3.equals(127));
//		같으면 true, 다르면 false
		System.out.println(inum3.compareTo(127));
//		같으면 0, 앞 숫자가 크면 1, 뒷 숫자가 크면 -1
		
//		오토 언박싱
		int number = inum3;
//		inum23이 참조하고 있는 객체안에 있는 int값이
//		객체 밖으로 나와 number에 들어갑니다.
		System.out.println(number);
		
		Object obj = 10;
		System.out.println(obj);
		
		int result = (int) obj;
		System.out.println(result);
		
		result = ((Integer) obj).intValue();
		
		
		Set<Integer> lotto = new HashSet<Integer>();
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map;
		
	}
}






