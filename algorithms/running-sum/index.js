  /* INITIAL BRUTE FORCE SOLUTION
      Runtime = 112ms    faster than 5.63% of solutions
      Memory = 36.7MB    faster than 100% of solutions
  */
 var runningSum = function(nums) {
    let N = nums.length;
    let result = [];

    for (let i = 0; i < N; i++) {
        if (i === 0) {
            result[i] = nums[i];
        } 
        else if (i > 0) {
            result[i] = nums[i] + result[i-1];
        }
    }

    return result;
 };


 /* REVISED SOLUTION
      Runtime = 60ms    faster than 98.54% of solutions
      Memory = 36.8MB    faster than 100% of solutions
 */
 var runningSum = function(nums) {
    let N = nums.length;
    let result = [nums[0]];     // insert first element here, removes the need of having an the base conditional '''if (i === 0)''' checked every loop

    for (let i = 1; i < N; i++) {
        result.push(nums[i] + result[i-1]);         // treat the 'result' variable like a Set, meaning we can just push more stuff to the final list, rather than wasting time indexing into an array like we did before
    }

    return result;
 };
    
    
  var ex1 = runningSum([1,2,3,4]);  
  console.log(ex1);