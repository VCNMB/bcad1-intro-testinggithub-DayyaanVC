/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses1;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PrjClasses1 {
    
    private static students s = new students();

    public static void main(String[] args) {
       
        
        String strName = JOptionPane.showInputDialog(null, "Please Enter Student Name");
                
        String strCourse = JOptionPane.showInputDialog(null, "Please Enter Student COurse");
        double dblAvg= Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter student course"));
        
        s.setName(strName);
        s.setCourse(strCourse);
        s.setAverage(dblAvg);
        print();
        
        
    }
    public static void print()
    {
        String strDisplay = "The updated student avaerage results are: \n" + 
                "Student: " + s.getName() + "\n" + 
                "COurse: " + s.getCourse() + "\n" +
                "Updated Average: " + s.getAverage() + "%" ;
        
        JOptionPane.showMessageDialog(null, strDisplay);
    }
}
