package services;

import java.util.HashMap;
import java.util.Map;

public class DictionaryImpl implements Dictionary {
    static Map<String, String> dictionary = new HashMap<>();
    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("book", "sách");
        dictionary.put("pen", "cây bút");
    }
    @Override
    public String search(String english) {
        String result = dictionary.get(english);
        if (result != null){
            return result;
        }else {
            return "not found";
        }
    }
}
