package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
        if(str.equals("앱")) {
        	this.App();
        }

        else {
        	super.execute(str);
        }
        
    }
 
    //메소드작성
    public void App() {	//str이 앱이면 실행
    	System.out.println("앱실행");
    }
    //메소드작성
    public void playMusic() {	//앱이아니고 다른거면 playmusic 실행 
    	System.out.println("다운로드해서 음악재생");
    }
    
    
}
