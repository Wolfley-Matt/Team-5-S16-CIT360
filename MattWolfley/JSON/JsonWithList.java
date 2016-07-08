/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JsonWithList;

import java.util.ArrayList;  
import java.util.List;  
import org.json.simple.JSONValue;  
public class JsonWithList{    
public static void main(String args[]){    
  List arr = new ArrayList();  
  arr.add("Matt");    
  arr.add("Wolfley");    
  arr.add(new Integer (2084967015));   
  String jsonText = JSONValue.toJSONString(arr);  
  System.out.print(jsonText);  
}} 
