package LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Kiran";
        char target = ' ';
        char target2 = 'a';
        
        boolean ans = search(name, target);
        if(ans == true) System.out.println(target+" Found in -> "+name);
        else System.out.println(target+" not found in "+name);

        boolean ans2 = search2(name, target2);
        if(ans2 == true) System.out.println(target2+" Found in -> "+name);
        else System.out.println(target2+" not found in ->"+name);
    }

    // Search a character in a string, return true if present else false
    static boolean search(String str, char ch){
        if(str.length()==0) return false;       // we use .length() method 

        for(int i=0; i<str.length(); i++){
            if(ch == str.charAt(i)) return true;
        }
        
        return false;
    }

    // Search a character in a string, return true if present else false -> USING FOR-EACH LOOP
    static boolean search2(String str, char ch){
        if(str.length()==0) return false;       // we use .length() method 

        // toCharArray() method converts string into str-array
        for(char element : str.toCharArray()){
            if(ch == element) return true;
        }
        
        return false;
    }
}
