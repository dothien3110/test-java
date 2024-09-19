//Viết chương trình tim và in ra màn hình những số có 3 chữ số vừa chia hết cho 2, vừa chia hết cho 3, vừa chia hết cho 5. Chủ ý in 5 số trên 1 dòng.
public class LTM_1 {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Cac so co 3 chu so chia het cho 2,3,5 la:");
        for(int i=100;i<999;i++){
            if(i%2==0 && i%3==0 && i%5==0){
                System.out.print(i+" ");
                count++;
                if(count%5==0){
                    System.out.println();
                    }
                
            }
        }    
    }
}
