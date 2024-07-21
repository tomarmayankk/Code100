package String;
//calculate the frequency of characters in a string
public class Q8 {
    public static void main(String[] args){
        String str = "abcDeabDbc";
        getFrequency(str);
    } 
    static void getFrequency(String str){
        char[] strArr = str.toCharArray();
        int[] freq = new int[str.length()]; 
        for(int i = 0; i< strArr.length; i++){
            freq[i] =1;
            for(int j = i+1; j< strArr.length; j++){
                if(strArr[i] == strArr[j]){
                    freq[i]++;
                    strArr[j] = '0';
                }
            }
        }
       System.out.println("Characters and their corresponding frequencies"); 
       for(int i = 0; i <freq.length; i++) { 
       if(strArr[i] != ' ' && strArr[i] != '0') 
          System.out.println(strArr[i] + "-" + freq[i]); 
       } 
    }
}
