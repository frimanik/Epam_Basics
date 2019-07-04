
public class Main {

    public static void main(String[] args) {
        boolean test;
        Main obj = new Main();
        System.out.println(obj.squareUp(2));
    }

    //Array3 - maxSpan
    public int maxSpan(int[] nums) {
        int counter = 0;
        if (nums.length!=0){
            counter = nums.length -1;
            if (nums[0]==nums[nums.length-1])
                counter++;
        }
        return counter;
    }

    //Array3 - fix34
    public int[] fix34(int[] nums) {
        int temp=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==3){
                for (int j=0;j<nums.length;j++)
                {
                    if (nums[j]==4 && nums[j-1]!=3)
                    {
                        temp = nums[i+1];
                        nums[i+1]=nums[j];
                        nums[j]=temp;
                    }
                }
            }
        }
        return nums;
    }

    //Array3 - fix45
    public int[] fix45(int[] nums) {
        int temp=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==4){
                for (int j=0;j<nums.length;j++)
                {
                    if (nums[j]==5)
                    {
                        if(j==0){
                            temp = nums[i+1];
                            nums[i+1]=nums[j];
                            nums[j]=temp;
                        }
                        if(j!=0 && nums[j-1]!=4)
                        {
                            temp = nums[i+1];
                            nums[i+1]=nums[j];
                            nums[j]=temp;}
                    }
                }
            }
        }
        return nums;
    }

    //Array3 -canBalance
    public boolean canBalance(int[] nums) {
        int LeftPart =0;
        int RightPart =0;
        boolean result =false;
        for (int i=0;i<nums.length;i++) {
            RightPart=0;
            LeftPart=0;

            for (int z=0;z<nums.length-i;z++)
                LeftPart += nums[z];

            for (int j = nums.length; j > nums.length - i; j--) {
                RightPart += nums[j - 1];
            }
            if (LeftPart == RightPart)
                result = true;

        }
        return result;
    }

    //Array3-linerIn
    public boolean linearIn(int[] outer, int[] inner) {
        int length = 0;
        for (int i = 0; i < inner.length; i++) {
            for (int j = 0; j < outer.length; j++) {
                if (inner[i] == outer[j]) {
                    length++;
                    break;
                }
            }
        }

        if (length == (inner.length)) return true;
        return false;
    }

    //Array3-squareUP
    public int[] squareUp(int n) {
        int[]Array = new int[n*n];
        int counter=Array.length-1;
        int num;
        int OuterIterator=n+1;

        for (int z=0;z<n;z++)
        {
            Mark1:
            {
                OuterIterator--;
                for (int i = counter; i > 0; i = i - n) {
                    counter = counter-n;
                    num = 1;
                    for (int j = 0; j < n; j++) {
                        Array[i - j] = num++;
                        if (num > OuterIterator)
                            break Mark1;
                    }
                }
            }
        }
        return Array;
    }

}

