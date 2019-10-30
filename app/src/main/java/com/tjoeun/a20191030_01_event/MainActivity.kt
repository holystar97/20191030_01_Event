package com.tjoeun.a20191030_01_event

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // xml에 그려진 초기 값 이라고 적힌 텍스트 뷰의 글자를 "실행 후" 로 변경



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        firstTextView.text="실행 후"

        okBtn.setOnClickListener {
            firstTextView.text="확인버튼 클릭됨"

            var inputId=loginIdEdt.text.toString()
            resultTxt.text=inputId

            Log.d("입력값 ", inputId)

            Toast.makeText(this,inputId,Toast.LENGTH_SHORT).show()


        }

        okBtn.setOnLongClickListener {

            firstTextView.text="확인버튼 롱 클릭"

            return@setOnLongClickListener true
        }

        // 라벨@에 대한 예시 책 49P

        firstFor@ for (i in 0..10){
            secondFor@ for(j in 0..10){
                if(j==2){
                    break@firstFor
                }
            }
        }

        var stringList:ArrayList<String> = ArrayList()

        //"김민경" 이름 추가해보기

        stringList.add("김민경")
        stringList.add("조경진")
        stringList.add("구민성")

        var intList:ArrayList<Int> = ArrayList()
        intList.add(10)
        intList.add(20)
        intList.add(30)

        Log.d("정수배열길이",String.format("%d",intList.size))


        // 구민성은 몇번째로 넣엇을까? 어느 위치에?

        val indexOfKoo = stringList.indexOf("구민성")
        Log.d("구민성님의 위치", String.format("%d",indexOfKoo))


        stringList.remove("조경진")

        var a=10
        var b=20
        var c= if (a==b){
            Log.d("로그","둘이 같다")
        } else{
            Log.d("로그","둘이 다르다")
        } // 이런 문법도 가능함 책 39p

        when(a){
            0,1 ->Log.d("when 연습", "a가 0이나 1이다 ")
            in 2..5->Log.d("when연습 ", "a가 2~5사이다")
            in intList -> Log.d("when연습","a가 intList에 포함")
            !in intList -> Log.d("when연습", "a가 inList에 불포함")

        }

        //커밋 1번용 주석

        for (name in stringList){
            Log.d("사람이름", name)
        }


        //커밋 2번용 주석

        for (i in 0..5){
            Log.d("숫자찍기" , String.format("%d",i))
        }


    }
}
