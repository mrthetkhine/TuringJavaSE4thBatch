
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macbook
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        
        map.put("user1", "10239383");
        map.put("user2", "833727727");
        map.put("user3", "394949999");
        map.put("user1", "1000000000");
        
        System.out.println("GetValue "+map.get("user1"));
        System.out.println("valuecontain "+map.containsValue("1000000000"));
        
        for(String key : map.keySet())
        {
            System.out.println("Key "+key);
        }
        for (Map.Entry<String,String> keyValue : map.entrySet()) {
            System.out.println("Key "+ keyValue.getKey() + " Value "+keyValue.getValue());
        }
    }
}
