/*  
    Initial brute force solution:
        Runtime = 880ms, faster than 12.2%
        Memory = 37.2MB, less than 100%
        Time complexity = O(N^2)
*/
var containsDuplicate = function(nums) {
    let N = nums.length;
    for (let i = 0; i < N; i++) {
        for (let j = i+1; j < N; j++) {
            if (nums[i] == nums[j]) {
                return true;
            }
        }
    }
    return false;
};


/*  
    Revised solution:
        Runtime = 56ms, faster than 97.26%
        Memory = 40MB, less than 88.24%
        Time complexity = O(N)
*/
var containsDuplicate = function(nums) {
    var numsConvertedToSet = new Set(nums);
    return !(numsConvertedToSet.size == nums.length);
};