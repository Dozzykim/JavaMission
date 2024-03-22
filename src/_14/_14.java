package _14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _14 {
    // day15-ex03 참고
    // day12-ex04 stringTokenizer 참고
    
    // student.txt 파일로부터 학생들의 성적정보 (번호/이름/성적/수업이름) 추출하여,
    // 성적순으로 내림차순, 번호 순으로 오름차순 정렬하여 출력

    public static void main(String[] args) {
        // FileReader - 문자 스트림 클래스
        // new FileReader("파일 경로");
        FileReader reader = null;

        /* fileReader로 한글자씩 받아온 글자를 저장할 String 변수 선언 */
        String inputString = "";

        try {
            reader = new FileReader("D:/DH/git repositories/JavaMission/src/_14/student.txt"); /* 문자열로 파일경로 지정 */
            int data = 0;

            // read : 한문자씩 유니코드로 읽어와서 int 타입으로 변환.
            // 더 이상 읽어올 문자가 없으면 -1 반환
             while ((data = reader.read()) != -1) {
                // 유니코드로 읽어오니까 문자타입으로 변환하여 프린트
                System.out.print((char) data);
                inputString += (char) data;
             }
             reader.close();
             System.out.println();
             
            /* 문자열을 쪼개줄 도구 : StringTokenizer 클래스 */
            StringTokenizer token = new StringTokenizer(inputString, "\n");
            System.out.println("토큰의 개수: " + token.countTokens());

            /* 쪼갠 토큰 출력하여 직접 확인 */
            while (token.hasMoreTokens()) {
                String cookie = token.nextToken();
                System.out.print(cookie + " ");
            }
            System.out.println();
            
             
            
        } catch (FileNotFoundException e) {
            System.err.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
        } catch (IOException e) {
            System.err.println("문자 입력 시 예외가 발생하였습니다.");
			e.printStackTrace();
        }

    }
   
}