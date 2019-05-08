package real_interview.atlassian.CityAttractions;

public class CityAttractions {

    /**
     *
     * @param n - Number of places (hotel included)
     * @param m - Number of bidirectional roads
     * @param u - List of start of bi direction road (m length)
     * @param v - List of end of bi directional (m
     * @param beauty - The beauty of each node (m length)
     * @param time
     * @return
     */
    public static int findMax(int n, int m, int max_time, int[] u, int[] v, int[] beauty, int[] time) {

        int[][] timeRoutes = new int[n][n];

        for(int i = 0; i < m; i++) {
            timeRoutes[u[i]][v[i]] = time[i];
            timeRoutes[v[i]][u[i]] = time[i];
        }
        return findMaxRecurse(0, 0, 0, max_time, timeRoutes, beauty);
    }


    private static int findMaxRecurse(int node, int time, int beauty, int max_time, int[][] timeRoutes, int[] beauties) {
        if(time > max_time) return -1;

        int currentBeauty = beauties[node];
        beauty += currentBeauty;
        beauties[node] = 0;

        int max = 0;
        for(int i = 0; i < timeRoutes.length; i++) {
            if(timeRoutes[node][i] != 0) {
//                System.out.println("Exploring path: " + i + ", Beauty is: " + beauty);
                int currentMax = findMaxRecurse(i, time + timeRoutes[node][i], beauty, max_time, timeRoutes, beauties);
                //Replace max. If we reached -1 and we're back at hotel, the max is just hte current beauty
                if(currentMax == -1 && node == 0) {
                    currentMax = beauty;
                }
                if(currentMax > max) {
                    max = currentMax;
                }

            }
        }

        beauties[node] = currentBeauty;

        return max;
    }

}
