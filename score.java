/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class score {
   static int righta;
   static int wronga;
   static int sc;
    score()
    { righta=0;
    wronga=0;
    sc=0;
    }   
   static void setrighta()
   { 
     righta++;
     sc=sc+4;
   }
      static void setwronga()
      {
          wronga++;
          sc=sc-1;
      }
}
