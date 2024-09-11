public class Playing_with_Good_String {
    public static void main(String[] args) {
        String s="dehweiufshdbchakallldnwidqweqwo";

        
    }
    public static int playing(String s){
        int ans=0, count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.chatAt(i);
            if(isvowels(ch)){
                count++;
            }else{
                ans=Math.max(ans,count);
            }
            }
        }

    }

