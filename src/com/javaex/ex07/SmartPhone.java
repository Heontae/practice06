package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
        if(str.equals("앱")) {
        	this.app();
        }
        else if(str.equals("음악")) {
        	this.downmusic();
        }
        else {
        	super.execute(str);
        }
        
    }
 
    //메소드작성
    public void app() {
    	System.out.println("앱실행");
    }
    //메소드작성
    public void downmusic() {
    	System.out.println("다운로드해서 음악재생");
    }
    
    
}
