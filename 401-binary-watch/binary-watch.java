class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list=new ArrayList<>();
        for(int hour=0;hour<=11;hour++)
        {
            for(int minute=0;minute<=59;minute++)
            {
               if(Integer.bitCount(hour)+Integer.bitCount(minute)==turnedOn)
               {
                list.add(String.format("%d:%02d",hour,minute));
               }
            }
        }
        return list;
    }
}