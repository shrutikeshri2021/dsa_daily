public class bitmani1 {

    public static void evenodd(int n){
        int bitmask=1;
        System.out.println(((n & bitmask)==0)?"even":"odd");
    }

        public static void ithbit(int n, int number){
        int bitmask=(1<<n);
        System.out.println(((number & bitmask)==0)?"0":"1");
    }
    public static int  setithbit(int n, int number){
        int bitmask=(1<<n);
        int x= number | bitmask;
        System.out.println("set"+(number | bitmask));
        return x;
    }
    public static int clearithbit(int n, int number){
        int bitmask=~(1<<n);
        int x=number & bitmask;
        System.out.println("clear"+(number & bitmask));
        return x;
    }
    public static void updateithbit(int n, int number, int newBit){
        /*
        if(newBit==0){
            clearithbit(n,number);
        }
        else{
            setithbit(n,number);
        }
 */
        number=clearithbit(n,number);
        int BitMask= newBit<<n;
        System.out.println(number|BitMask);
    }

    public static void clearIBits(int n, int number){
        int BitMask= ~(0) <<n;
        System.out.println(number& BitMask);
    }
    public static void clearRangeBits(int i,int j, int number){
        int n= ~(0) << (j+1);
        System.out.println(Integer.toBinaryString(n));
        int m = (1<<(i))-1;
        System.out.println(Integer.toBinaryString(m));
        int BitMask= n|m;
        System.out.println( Integer.toBinaryString(BitMask));
        System.out.println(Integer.toBinaryString(number & BitMask));
    }
    public static boolean poweroftwo(int n){
        int i=0;
        while(i<=(n/2)){
                int m =(1<<(i));
            if(n==m){
                    System.out.println("true");
                    return  true;
                }
            i++;
            }
            return false;
    }
    //or
    public static boolean poweroftwo(int n){
        return (n &(n-1))==0;
    }
//no of 1s
    public static void countsetbits (int n){
        int count=0;
        while(n>0){
            if((n%2)!=0){
                count++;
            }
            n=(n)>>1;
        }
        System.out.println(count);
    }

    //difficult, study
    public static int exponent(int a, int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }



    public static void main(String args[]){
        //System.out.println(exponent(3,5));
        //operators
        /*
        System.out.println(~5);System.out.println(5 & 6);System.out.println(5|6);
        System.out.println(5^6);System.out.println(5 <<2);System.out.println(5>>2);
       */
        //-+clearRangeBits(2,7, 0b100111010011);
        //countsetbits (16);
        //System.out.println(poweroftwo(32));
        /*
        evenodd(5);
        evenodd(0);
        evenodd(6);
        evenodd(11);
        ithbit(0,10);
        ithbit(1,10);
        ithbit(2,10);
        ithbit(3,10);
        ithbit(0,0b111001010);
        ithbit(1,0b111001010);
        ithbit(2,0b111001010);
        ithbit(3,0b111001010);
        ithbit(4,0b111001010);
        ithbit(5,0b111001010);
        ithbit(6,0b111001010);
        setithbit( 0,10);
        setithbit(1,10);
        setithbit(2,10);
        setithbit(3,10);
        clearithbit(1,10);
        updateithbit(2,10,1);
        clearIBits(3,15);
    */
    }
}
