package Basic;
public class Ki_Tu_la_ma {

    public static void main(String[] args) {
        String s="MCMXCIV";
        String roman="0";
        s=s+roman;
        int sum=0;
        int len=s.length();
        int a=0;
        int b=0;

        char[] x = s.toCharArray();
        for(int i=0;i< len-1;i++){
            switch (x[i]){
                case 'I':
                    a =1;
                    break;
                case 'V':
                    a =5;
                    break;
                case 'x':
                    a =10;
                    break;
                case 'L':
                    a =50;
                    break;
                case 'C':
                    a =100;
                    break;
                case 'D':
                    a =500;
                    break;  
                case 'M':
                    a =1000;
                    break;                                                                              
            }

            switch (x[i+1]){
                 case 'I':
                    b =1;
                    break;
                case 'V':
                    b =5;
                    break;
                case 'x':
                    b =10;
                    break;
                case 'L':
                    b =50;
                    break;
                case 'C':
                    b =100;
                    break;
                case 'D':
                    b =500;
                    break;  
                case 'M':
                    b =1000;
                    break;                                                                            
            }
                if( a >= b) {sum+=a;} else {sum-=a;}
        }
        System.out.println(sum);

    }   
    
}
