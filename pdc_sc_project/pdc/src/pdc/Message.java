/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc;


public class Message {
    String msg="";
    Message father= new Message();
    
    public int equ(Message a, Question b){
        if(a.father.msg.equals(b.answer))
            return 1;
        else
            return 0;
    }
}

class Question{
    String puzzle="";
    String answer="";
}
