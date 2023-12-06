package com.biswa.collection;

import java.util.*;

class Main
{
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;

		/* expected Output
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/

        List<int[]> list = splitArray(original, splitSize);
        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
    }

    public static List<int[]> splitArray(int[] array, int splitSize) {

        List<int[]> list= new ArrayList<int[]>();

        if(array==null || array.length==0)
        {
            return list;
        }

        int from=0;
        int to =0;
        int slice=0;

        while(slice<array.length){
            to = from + Math.min(splitSize,array.length - to);
            int[] newSlice= Arrays.copyOfRange(array,from,to);
            list.add(newSlice);
            slice +=newSlice.length;
            from=to;
        }

        return list;
    }
}