package com.helenzys.interviewtask.data.repo

import NumberData
import android.graphics.Color

class Repo {

  private  var numbers : MutableList<NumberData> = arrayListOf()
    public fun getNumberList( size:Int):List<NumberData>{

        for( i in 0..size){
            var number:NumberData = if(i%2==1){
                NumberData(i,Color.GREEN)
            }else{
                NumberData(i,Color.RED)
            }
            numbers.add(number);
        }

         return numbers;
    }

}