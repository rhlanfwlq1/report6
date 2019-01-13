package jp.ac.uryukyu.ie.e185739;

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Random;
import java.util.Scanner;

class BaseBall{

    static int strike =0;
    static int ball = 0;

    public static void main (String[] args) throws java.lang.Exception
    {
        int computer[] = new int[3]; //パソコンの定価
        int user[] = new int[3]; //ユーザの定価

        Random random = new Random();

        //ここからパソコンの定価
        //重複防止
        //random.nextInt(10); これは 1~9間にランダム

        //computer 3番実行中に1番目が0ならランダム値を入れる
        while(computer[0] == 0){
            computer[0] = random.nextInt(10);
        }

        //computer 3中に1番目と2番目が重複したり,
        //2番目が0ならランダム値入れる
        while(computer[0] == computer[1] || computer[1] == 0){
            computer[1] = random.nextInt(10);
        }

        //computer 3中に1番目と3番目が重複したり,
        //2番目と3番目が重複すれば,
        //3番目が0ならランダム値入れる
        while(computer[0] == computer[2] || computer[1] == computer[2] || computer[2] == 0){
            computer[2] = random.nextInt(10);
        }


    }
}