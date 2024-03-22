import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 정수 n을 입력받아 로또번호를 n번 출력하시오.
 * ArrayList를 선언하여 1~45 사이의 랜덤한 값을 중복되지 않도록 저장하고 출력. *n번반복
 */
public class _12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randInt = new Random ();
        ArrayList<Integer> lottoList = new ArrayList<Integer>();
        
        System.out.print("몇 게임? >>  ");
        int N = input.nextInt();

        /* N번 돌아가는 반복문 */
        for (int k = 0; k < N; k++) {

            /* 로또번호 6자리 뽑는 반복문 */
            for (int i = 0; i < 6; i++) {
                int n = randInt.nextInt(45)+1;
                    //중복검사 => 리스트.contains(n) : 리스트 안에 방금뽑은 n이 있는지 t/f 체크
                    //t => 중복됨. 반복횟수 1번 줄여서 다시 뽑게함
                if (lottoList.contains(n)) {
                    i--;
                    continue;
                }
                //f => 중복없음. 그대로 리스트에 추가
                lottoList.add(n);
                }
        
            /* 리스트 오름차순 정렬 => .sort() */
            lottoList.sort(null);
            System.out.print("[" + (k+1) +" 게임] : ");
            /* foreach문으로 리스트에 있는 숫자들 한개씩 꺼내와서 출력 */
            for (Integer num : lottoList) {
                System.out.print(num + " ");
            }
            System.out.println();
            /* k번째 게임의 로또번호 모두 출력 후, 다음게임의 로또번호를 저장하기위해 리스트 비우기 */
            lottoList.clear();
        }

        input.close();
    }
}
