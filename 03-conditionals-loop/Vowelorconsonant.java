import java.util.Scanner;

public class Sumofdigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence : ");
        String s = sc.nextLine();
        int vowel_count = 0;
        int consonant_count = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel_count++;
            }
            else if(ch=='.'||ch==','){
                continue;
            }
            else{
                consonant_count++;
            }
        }
        System.out.println("Vowel Count : "+vowel_count);
        System.out.println("Consonant Count : "+consonant_count);
        
    }
}