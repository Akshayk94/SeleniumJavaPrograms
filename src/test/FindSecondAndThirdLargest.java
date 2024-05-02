package test;

public class FindSecondAndThirdLargest {
    public static void main(String[] args) {
        int[] data={-4,-4,-4,-1,-2};
        //sort in descending order
        int temp;
        for (int a=0;a< data.length;a++){
            for (int b=a+1;b< data.length;b++){
                if (data[a]<data[b]){
                    temp=data[a];
                    data[a]=data[b];
                    data[b]=temp;
                }
            }
        }
        //print second and third-largest number
        for (int a=0;a<3;a++){
            if (a>0){
                System.out.println(data[a]);
            }
        }
    }
}
