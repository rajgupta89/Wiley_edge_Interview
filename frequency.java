import java.util.*;
class frequency{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        s=s.replaceAll("\\s","");
        HashMap<Character, Integer> li=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(li.containsKey(s.charAt(i)))
                li.put(s.charAt(i),li.get(s.charAt(i))+1);
            else
               li.put(s.charAt(i),1);
        }        
        for(Map.Entry<Character, Integer> ent:li.entrySet()){
            System.out.println(ent.getKey()+" - "+ent.getValue());                
            }
    }
}