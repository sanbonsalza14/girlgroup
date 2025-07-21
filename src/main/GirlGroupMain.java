package main;

import view.ViewProcess;

import java.util.Scanner;

public class GirlGroupMain {
    ViewProcess viewProcess = new ViewProcess();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("소속사 정보");
            //서비스에서 소속사 정보 가져오기
            //뷰기능 호출하기
            viewProcess.getEntertainment();

            System.out.println("소속그룹 정보를 보려면 ID입력, 종료 :0");
            int num = sc.nextInt();
            if (num == 0) {
                return;
            }else {
                //서비스에서 소속사 정보 가져오기
                //뷰기능 호출하기
                viewProcess.findByEnterID();

            }
        }
    }
}
