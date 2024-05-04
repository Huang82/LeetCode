public int[] TwoSum(int[] nums, int target)
{
    // 優化版本，思路，一般人沒有特別想怎麼優化大概都是使用雙重迴圈尋找數值
    // 但可以使用HashMap的方式來尋好先前的輪巡過的數字就可以不用雙重迴圈了
    Dictionary<int, int> dir = new Dictionary<int, int>();
    int count = nums.Length;

    for (int i = 0; i < count; i++)
    {
        int num = nums[i];
        int findNum = target - num;

        if (dir.ContainsKey(findNum))
            return new int[2] { dir[findNum], i };

        dir[num] = i;
    }

    // 不會跑來這邊
    return null;
}