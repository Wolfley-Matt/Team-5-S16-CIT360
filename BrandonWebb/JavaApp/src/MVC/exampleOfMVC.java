/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author brandonmichaelwebb
 */
public class exampleOfMVC {

   public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      model model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
      view view = new view();

      controller controller = new controller(model, view);

      controller.updateView();

      //update model data
      controller.setStudentName("John");

      controller.updateView();
   }

   private static model retriveStudentFromDatabase(){
      model student = new model();
      student.setName("Robert");
      student.setRollNo("10");
      return student;
   }
}

