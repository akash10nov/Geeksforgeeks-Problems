/*
 * Complete the function below.
 */

    static int getMinTimeDifference(String[] times) {
        int len=times.length;
        int[][] hourMin=new int[len][2];
        for(int i=0;i<len;i++)
        {
          
            hourMin[i][0]=Integer.parseInt(times[i].substring(0,2));
            hourMin[1][1]=Integer.parseInt(times[i].substring(3));
        }
        int min=1000;
        for(int i=1;i<len;i++)
        {
            
            if(hourMin[i-1][0]>hourMin[i][0])
            {
                
                int hourDiff=hourMin[i-1][0]-hourMin[i][0];
                int hourDiff2=24-hourDiff;
                int min2=(hourDiff2*60)+(hourMin[i][1]-hourMin[i-1][1]);
                int min1=(hourDiff*60)+(hourMin[i-1][1]-hourMin[i][1]);
                if(min1<min)
                    min=min1;
                if(min2<min)
                    min=min2;
                
            }
            else if(hourMin[i-1][0]>hourMin[i][0])
            {
                int hourDiff=hourMin[i][0]-hourMin[i-1][0];
                int hourDiff2=24-hourDiff;
                int min2=(hourDiff2*60)+(hourMin[i-1][1]-hourMin[i][1]);
                int min1=(hourDiff*60)+(hourMin[i][1]-hourMin[i-1][1]);
                if(min1<min)
                    min=min1;
                if(min2<min)
                    min=min2;   
            }
            else
            {
                if(Math.abs(hourMin[i][1]-hourMin[i-1][1])<min)
                {
                    min=hourMin[i][1]-hourMin[i-1][1];
                }
            }
                    
        }
        return min;

    }

