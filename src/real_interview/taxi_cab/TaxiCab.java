package real_interview.taxi_cab;

public class TaxiCab {

    public static String getPairs(int n) {
        boolean show4104 = false;

        int i = 0;
        while(Math.pow(i, 3) <= n) {
            i++;
            int j = 0;
            while(Math.pow(j, 3) + Math.pow(i, 3) <= n) {
                j++;
                if(i == j || j < i) continue;
                double total = Math.pow(j, 3) + Math.pow(i, 3);
                if(total == 4104) {
                    show4104 = true;
                    System.out.println("Show 4104");
                    System.out.println(total + ",(" + i + "," + j + ")");
                }
                else {
                    show4104 = false;
                }



                int ii = 1;
                while(Math.pow(ii, 3) <= total) {
                    ii++;
                    double jjDouble =  Math.pow(total - Math.pow(ii, 3), 1/3);
                    int jj = (int)jjDouble;
//                    if(jj < ii) continue;
                    if(Math.pow(ii, 3) + Math.pow(jj, 3) == total &&
                        ii != i && ii != j && jj != i && jj != j) {
                        System.out.println(total + ",(" + i + "," + j + ")," + "(" + ii + "," + jjDouble + ")");
                    }
                }


            }
        }

        return null;
    }



}
