class Solution {
    public int calPoints(String[] operations) {
      Stack<Integer> st=new Stack<>();
      int ans=0;
      for(int i=0;i<operations.length;i++)
      {
        if(operations[i].equals("+"))
        {
            st.push(st.get(st.size()-2)+st.get(st.size()-1));
        }
        else if(operations[i].equals("D"))
        {
            st.push(2*st.peek());
        }
        else if(operations[i].equals("C"))
        {
            st.pop();
        }
        else
        {
            st.push(Integer.parseInt(operations[i]));
        }
      }
      for(int num:st)
      {
        ans+=num;
        
      }
      return ans;
    }
}
 /* List<Integer> list=new ArrayList<>();
        int sum=0;
        int d=0;
        for(int i=0;i<operations.length;i++)
        {
           /* if(Character.isDigit(operations[i].charAt(0)))
            {
                list.add(Integer.parseInt(operations[i]));
            }
            if(operations[i].equals("+"))
            {
                sum=list.get(list.size()-1)+list.get(list.size()-2);
                list.add(sum);
            }
            else if(operations[i].equals("D"))
            {
                d=2*list.get(list.size()-1);
                list.add(d);
            }
            else if(operations[i].equals("C"))
            {
                list.remove(list.size()-1);
            }
            else
            {
                list.add(Integer.parseInt(operations[i]));
            }
        }
        int ans=0;
        for(int num:list)
        {
            ans+=num;
        }
        return ans;*/