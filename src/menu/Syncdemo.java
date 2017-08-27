/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author Duc
 */
public class Syncdemo {
    public static void main(String[] args) {
final Counter ct = new Counter();
// Create new runable object t1,
// therefore t1 is a thread is using Counter object ct
Runnable t1 = ct::count;
// Create new runable object t2,
// therefore t2 is a thread is using Counter object ct.
// Both t1 and t2 are using ct at the same time,
// so ct is called shared-resource
Runnable t2 = ct::countdown;
new Thread(t1).start();
new Thread(t2).start();
    }
    
}
