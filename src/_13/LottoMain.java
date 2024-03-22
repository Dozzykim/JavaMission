package _13;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoMain {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> temp = new ArrayList<>();
        Lotto lotto = Lotto.getInstance();
    
        do {
            System.out.print("몇 게임?  ");
            int count = input.nextInt();
            /* 5게임이하인지 체크 */
            if (count > 5) {
                System.out.println("한 장에 최대 5 게임만 가능합니다.");
                continue;
            }

            /* count만큼 게임 돌리기 */
            for (int i = 0; i < count; i++) {
                System.out.print("[" + (i+1) + " 게임] (1. 자동 / 2. 수동) : ");
                int gameSet = input.nextInt();
                input.nextLine();

                /* 자동/수동 체크 */
                switch (gameSet) {
                    case 1: /* 자동추첨 */
                        /* 싱글톤 패턴으로 생성한 유일한 인스턴스를 getInstance로 가져와 사용 */
                        lotto.getNumbers();
                        break;
                    
                    case 2: /* 수동추첨 */
                        /* 수동입력시, 중복체크 로직 입력해야함 */
                        break;

                    default:
                        System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                        i--;
                        continue;
                }
            }

            // 최종



            break;
        } while (true);



        input.close();
    }

}


//싱글톤 패턴..

/*
 * 로또판매점
 * 
 * 
 */