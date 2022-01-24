import java.util.ArrayList;
import java.util.List;

class Solution6 {
    //Stringbuilder
    //List<Stringbuilder>
    //s.toCharArray()
    //StringBuilder can be connected together as a new StringBuilder
    public String convert(String s, int numRows) {
        //special answer
        if(numRows < 2 )
            return s;
            
        List<StringBuilder> rows= new ArrayList<StringBuilder>();
        for(int i = 0; i < numRows; i++){
            //loop to add corresponding StringBuilder into list
            rows.add(new StringBuilder());
        }

        int j = 0;
        int flag = -1;

        for(char c : s.toCharArray()){
            rows.get(j).append(c);
            //judge if reach the boundary
            if(j == 0 || j == numRows -1 ){
                flag = -flag;
            }
            j += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder sb: rows){
            res.append(sb);
        }
        return res.toString();
    }
}
