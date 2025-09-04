public class Schaltjahr {
    public static void main(String[] args) {
        Integer [] arr = {725, 2003, 1792, 1602, 1996, 1900, 2000};
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ist Schaltjahr: " + schaltjahrprufung(arr[i]));
        }
        schaltjahrubeprufung(arr);
    }
    public static boolean schaltjahrprufung(Integer jahr){
        boolean bool = false;
        if (jahr > 1582){
            if (jahr % 4 == 0){
                if (jahr % 100 != 0 ){
                    if (jahr % 400 == 0){
                        bool = true;
                    }
                    bool = true;
                }
            }
        }else{
            bool = false;
        }
        return bool;
    }
    public static void schaltjahrubeprufung (Integer[]arr){
        boolean b = arr[0] > 1582 ? true : false;
        System.out.println(b);
    }
}
