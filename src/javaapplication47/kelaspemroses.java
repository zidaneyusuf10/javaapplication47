/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47;

/**
 *
 * @author Y U S U F
 */
public class kelaspemroses  implements Runnable {
   private int id;
    
    public kelaspemroses(int id){
        this.id=id;
        
    }
    @Override
    public void run() {
        System.out.println("===============5160311097:"+id+"======");
        try{
                Thread.sleep(5000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
        System.out.println("tes:"+id+"====");
    }  
}
