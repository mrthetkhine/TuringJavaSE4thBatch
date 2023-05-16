
import java.util.Optional;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macbook
 */
interface Inc 
{
    int func(int x);
}
public class OptionalDemo {
 
            
    public static void main(String[] args) {
        Integer i = 3;
        //i++;
        //Inc inc = (x)-> x +1;
        
        Optional<Integer> data = Optional.ofNullable(i);
        
        Optional<Integer> result = data.map(x->x+1)
                                       .map(x-> x * 2) ;
        if(result.isPresent())
        {
            System.out.println("Value "+result.get());
        }
    }
}
