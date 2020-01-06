/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electricity;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Bill {
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         boolean exit = false;
         
         while(exit != true)
         {
            System.out.println("Enter type of plan");
            System.out.println("1.Commercial");
            System.out.println("2.Domestic");
            System.out.println("3.Institutional");
            int plan = input.nextInt();

            System.out.println("Enter the units consumed");
            double units = input.nextDouble();

           Plans billInstance = null;

            switch(plan)
            {
                case 1: 
                    Commercial combill = new Commercial();
                    billInstance = combill;
                    break;
                case 2:
                    Domestic dombill = new Domestic();
                    billInstance = dombill;
                    break;
                case 3:
                    Institutional intbill = new Institutional();
                    billInstance = intbill;
                    break;
                default:
            }
            if(billInstance!= null)
            {
                System.out.println(billInstance.generatebill(units));
            }

            System.out.println("Do you want to Continue Y/N");
            char reply = input.next().charAt(0);
            if(reply == 'N' || reply == 'n')
            {
                exit = true;
                System.out.println("Exiting program...");
            }
            else
            {
                exit = false;
            }
        }
     }
}
