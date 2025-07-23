import java.util.*;
public class pascals_triangle {
    public List<Integer> genrow (int n){
        int ans=1;
        List<Integer> li=new ArrayList<>();
        li.add(ans);
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            li.add(ans);
        }
        return li;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> li=genrow(i);
            ans.add(li);
        }
        return ans;
    }
}