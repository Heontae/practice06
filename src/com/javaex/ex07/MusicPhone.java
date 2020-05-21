package com.javaex.ex07;

public class MusicPhone extends Phone{
    
    public void execute(String str){
        
        if("음악".equals(str)){//음악이면 playMusic 실행
            playMusic();
        }else{//아니면 phone에 execute(str)실행
            super.execute(str);
        }
        
    }
    
    protected void playMusic(){
        System.out.println("Mp3플레이어에서 음악재생");
    }
}
