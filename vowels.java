import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vcount=0;
        int ccount=0;
        int digit=0;
        System.out.print("ENTER A STRING: ");
        String str=sc.nextLine();
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'){
                vcount++;
            }
            else if(str.charAt(i)>=0){
                digit++;
            }
            else{
                ccount++;
            }
        }
        System.out.println("TOTAL NUMBER OF VOWELS IS: "+vcount);
        System.out.println("TOTAL NUMBER OF CONSONANTS IS: "+ccount);
        System.out.print("TOTAL NUMBER OF DIGITS IS: "+digit);
    }
}