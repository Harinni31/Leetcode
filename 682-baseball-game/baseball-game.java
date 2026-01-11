class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list=new ArrayList<>();
        int sum=0;
        int d=0;
        for(int i=0;i<operations.length;i++)
        {
           /* if(Character.isDigit(operations[i].charAt(0)))
            {
                list.add(Integer.parseInt(operations[i]));
            }*/
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
        return ans;
    }
}