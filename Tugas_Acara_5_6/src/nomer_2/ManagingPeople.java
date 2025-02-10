/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomer_2;

/**
 *
 * @author Acer
 */
public class ManagingPeople {
     public static void main(String[] args) {
        Person p1 = new Person("Arial",37);
        Person p2 = new Person("Joseph",15);
        
        if (p1.getAge()==p2.getAge()){
            System.out.println(p1.getAge()+" is the same age as"+p2.getAge());
        }else {
            System.out.println(p1.getName()+" is not the same age as "+p2.getName());
        }
        
    }
}
