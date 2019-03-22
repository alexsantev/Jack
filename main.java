public class main {
    public static void main (String[] args){
        int n; n=9;
        name[] ar;
        ar=new name[n];
        //ar[0]=new cat();
        int i;
        for(i=0;i<n;i++){
            switch (i) {
                case 0:
                    ar[i] = new Jack_house();
                    break;
                case 1:
                    ar[i] = new psheno();
                    break;
                case 2:
                    ar[i] = new bird();
                    break;
                case 3:
                    ar[i] = new cat();
                    break;
                case 4:
                    ar[i] = new dog();
                    break;
                case 5:
                    ar[i] = new cow();
                    break;
                case 6:
                    ar[i] = new grandma();
                    break;
                case 7:
                    ar[i] = new pastyh();
                    break;
                case 8:
                    ar[i] = new cock();
                    break;
                // write more case
            }
            for (int j=i;j>=0;j--){
                ar[j].execute();
            }
            System.out.println("");
        }
    }
}