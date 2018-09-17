 static int[] rotLeft(int[] a, int d) {
        int b[] = new int[a.length];
        for (int i=0;i<a.length;i++){
           int j = (i+(a.length-d))%a.length;
            b[j]=a[i];
        }
        return b;
    }
