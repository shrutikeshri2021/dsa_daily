public class bitmani1 {

    public static void evenodd(int n){
        int bitmask=1;
        System.out.println(((n & bitmask)==0)?"even":"odd");
    }

        public static void ithbit(int n, int number){
        int bitmask=(1<<n);
        System.out.println(((number & bitmask)==0)?"0":"1");
    }
    public static void setithbit(int n, int number){
        int bitmask=(1<<n);
        System.out.println("set"+(number | bitmask));
    }

    public static void main(String args[]){
        //operators
        /*
        System.out.println(~5);System.out.println(5 & 6);System.out.println(5|6);
        System.out.println(5^6);System.out.println(5 <<2);System.out.println(5>>2);
       */
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

    }
}
