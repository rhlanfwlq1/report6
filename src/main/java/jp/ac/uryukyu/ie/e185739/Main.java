package jp.ac.uryukyu.ie.e185739;

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Random;
import java.util.Scanner;

class BaseBall{

    static int strike =0;
    static int ball = 0;

    public static void main (String[] args) throws java.lang.Exception {
        int computer[] = new int[3]; //パソコンの定価
        int user[] = new int[3]; //ユーザの定価

        Random random = new Random();

        //ここからパソコンの定価
        //重複防止
        //random.nextInt(10); これは 1~9間にランダム

        //computer 3番実行中に1番目が0ならランダム値を入れる
        while (computer[0] == 0) {
            computer[0] = random.nextInt(10);
        }

        //computer 3中に1番目と2番目が重複したり,
        //2番目が0ならランダム値入れる
        while (computer[0] == computer[1] || computer[1] == 0) {
            computer[1] = random.nextInt(10);
        }

        //computer 3中に1番目と3番目が重複したり,
        //2番目と3番目が重複すれば,
        //3番目が0ならランダム値入れる
        while (computer[0] == computer[2] || computer[1] == computer[2] || computer[2] == 0) {
            computer[2] = random.nextInt(10);
        }

        //ユーザの定価

        Scanner s = new Scanner(System.in);

        while (strike < 3) { //ストライク3になる時まで無限ループ

            //3回繰り返してユーザーの入力を受ける。
            for (int i = 0; i < user.length; i++) {
                System.out.print("\n" + (i + 1) + "番目の数: ");
                user[i] = s.nextInt();

                //もし10以上だったり,0以下ならエラー出力
                while (user[i] >= 10 || user[i] <= 0) {
                    System.out.println("error: 1~9間に入力してください。");
                    System.out.print(i + 1 + "番目の数: ");
                    user[i] = s.nextInt();
                }
            }
            //結果チェック

            //strike,ballチェック
            for(int i = 0; i< 3; i++){
                for(int j=0; j<3; j++){

                    //コンピューター定価
                    //ユーザーが決めた値なら
                    if(computer[i] == user[j]){
                        //computer i番目と
                        //user j番目なら
                        //ストライク!
                        if(i==j){
                            strike+=1;
                        }else{  //違うとボール!
                            ball+=1;
                        }
                    }
                }
            }



        }
    }
}