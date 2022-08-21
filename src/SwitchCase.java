public class SwitchCase {
    String str = "AMAN";
    public int count(){
        int counter = 0;
        for(int i=0;i<str.length();i++)
        {

            char ch = str.charAt(i);
            switch(ch){
                case 'a':    // I'm not using break
                case 'A':
                case 'E':
                case 'e':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'U':
                case 'u':
                    counter++;
                default:
                    continue;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        SwitchCase sc = new SwitchCase();
        System.out.println(sc.count());
    }
}



/*
if(ch == 'e', ch =='E' ch == 'i' || ch =='I')
count++;


* switch(c){ // either a character or an integer
* case a:
* //logic here
* break;
* case b:
* //logic
* break;
* default:
* //logic or you can simple write continue
* }
*
*
*break -
continue -- break breaks the loop it brings you out if any execution....
for(int i=0;i<6;i++)
if(i == 3)// this becomes true the loop will break, stop
break;

continue -- you do what you want just that skip this this iteration..
if(i==3)
continue;
System.out.println(i);
*1,2,4,5,6
*
*
*
*
* */
