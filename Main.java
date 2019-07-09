import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        boolean test;
        Main obj = new Main();
        int[] nums = new int[]{1, 2, 1, 41};
        System.out.println(obj.maxMirror(nums));
    }

    //Array3 - maxSpan
    public int maxSpan(int[] nums) {
        int counter = 0;
        if (nums.length != 0) {
            counter = nums.length - 1;
            if (nums[0] == nums[nums.length - 1])
                counter++;
        }
        return counter;
    }

    //Array3 - fix34
    public int[] fix34(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4 && nums[j - 1] != 3) {
                        temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }

    //Array3 - fix45
    public int[] fix45(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 4)
                for (int j = 0; j < nums.length; j++)
                    if (nums[j] == 5) {
                        if (j == 0) {
                            temp = nums[i + 1];
                            nums[i + 1] = nums[j];
                            nums[j] = temp;
                        }
                        if (j != 0 && nums[j - 1] != 4) {
                            temp = nums[i + 1];
                            nums[i + 1] = nums[j];
                            nums[j] = temp;
                        }
                    }
        return nums;
    }

    //Array3 -canBalance
    public boolean canBalance(int[] nums) {
        int LeftPart = 0;
        int RightPart = 0;
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            RightPart = 0;
            LeftPart = 0;

            for (int z = 0; z < nums.length - i; z++)
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

        return length == (inner.length);
    }

    //Array3-squareUP
    public int[] squareUp(int n) {
        int[] array = new int[n * n];
        int control = n;
        int counter = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = counter;
            if (counter > control) {
                array[i] = 0;
            }
            if (counter == n) {
                counter = 0;
                control--;
            }

            counter++;

        }
        return array;
    }

    //Array3 -seriesUp
    public int[] seriesUp(int n) {
        int[] Pattern = new int[n * (n + 1) / 2];
        int series = 0;
        int num = 0;
        for (int z = 0; z < n; z++) {
            OuterBreak:
            {
                series++;
                for (int i = 0; i < Pattern.length; i++) {
                    for (int j = 0; j < series; j++) {
                        Pattern[num] = j + 1;
                        num++;
                    }
                    break OuterBreak;
                }
            }
        }
        return Pattern;
    }

    //Array3 - mixMirror
    public int maxMirror(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; ++i)
            for (int j = max + 1; j < nums.length - i + 1; ++j)
                for (int k = i; k < nums.length - j + 1; ++k) {
                    Boolean mir = true;
                    for (int m = 0; mir && m < j; ++m)
                        mir = nums[i + m] == nums[k + j - m - 1];
                    if (mir) max = j;
                }
        return max;
    }


}

