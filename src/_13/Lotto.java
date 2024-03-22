package _13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/*싱글톤 패턴*/ 
public class Lotto {
    Random randInt = new Random();
    int n;
    
    // 생성자에 private를 걸어서 인스턴스 생성을 막음!!(유일한 인스턴스)
    private Lotto () {}

    /* 유일한 인스턴스 생성 */
    private static Lotto lotto;

    public static Lotto getInstance() {
        if (lotto == null) {
            lotto = new Lotto();
        }
        return lotto;
    }
    

    //로또번호를 넣을 리스트 생성
    
    //자동 선택시
    public ArrayList<Integer> getNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            n = randInt.nextInt(45)+1;
            if (numbers.contains(n)) {
                i--;
                continue;
            }
            numbers.add(n);
        }
        numbers.sort(null);
        return numbers;
    }
    //수동
    //수동을 여기서 구현해야하나..?
    public ArrayList<Integer> setNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        return numbers;
    }
}

// 컬렉션 추가해서,,, 뽑은 번호 배열을 컬렉션에 저장... ?