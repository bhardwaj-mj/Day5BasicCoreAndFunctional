package FunctionalPrograms;

public class DistinctTriples {
    static void findTriplets(int array[],int n){
        boolean found=false;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(array[i]+array[j]+array[k]==0){
                        System.out.println(array[i]+"  "+array[j]+"  "+array[k]);
                        found=true;
                    }
                }
            }
        }
        if(found==false)
            System.out.println("not exist");
    }

    public static void main(String[] args) {
        int array[]={0,-1,2,-3,1};
        int n=array.length;
        findTriplets(array,n);
    }
}
