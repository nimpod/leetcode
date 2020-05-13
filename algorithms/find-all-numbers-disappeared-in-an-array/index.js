
var findDisappearedNumbers = function(nums) {
    let N = nums.length;
    let range = [];
    
    // populate array with numbers 1 -> N
    for (let i = 0; i < N; i++) {
        range[i] = i+1;
    }
    
    // remove numbers from the 'range' array that exist in the nums array
    for (var n of nums) {
        let index = range.indexOf(n);
        if (index > -1) {
            range.splice(index, 1);
        }
    }
    
    return range;
};