package Jd1june2019.Lection11.Task3;

import lombok.Getter;

import java.util.Scanner;
@Getter
public  class Input {

    private final int  inputN;

    public Input(){
    Scanner sc =new Scanner(System.in);
        System.out.println("задайте степень");
   this.inputN=sc.nextInt()
   ;
  }
}
