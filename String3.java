public class String3 {

public static void getshortestPath(String s){
    int i=0;
    int x1=0, x2=0;
    int y1=0, y2=0;
    while(i< s.length()){
        if(s.charAt(i)=='W'){
            x2--;
        }
        else if(s.charAt(i)=='E'){
            x2++;
        }
        else if(s.charAt(i)=='N'){
            y2++;
        }
        else if(s.charAt(i)=='S'){
            y2--;
        }
        i++;
    }
    int dist=(int) Math.sqrt(((x2-x1)*(x2-x1))+ ((y2-y1)*(y2-y1)));
    System.out.println(dist);
}

    public static void main(String[] args){
        String s="WNEENESENNN";
        getshortestPath(s);
    }
}
