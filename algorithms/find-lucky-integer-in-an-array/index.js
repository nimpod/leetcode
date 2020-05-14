/*  
    Initial brute force solution:
        Runtime = 72ms, faster than 28.88%
        Memory = 36MB, less than 100%
        Time complexity = O(N^2)
*/
var findLucky = function(arr) {
    let values = new Map()
    
    // sort the array, just in case
    arr.sort();
    
    // strip the array down to single elements
    var elements = new Set(arr);
    
    // populate map with information about frequency of each element in the array
    for (let elem of elements) {
        let counter = 0;
        for (let i = 0; i <= arr.length; i++) {
            if (arr[i] === elem) {
                counter++;
            } else {
                values.set(elem, counter);
            }            
        }        
    }
    
    let luckyNumbers = [];

    // retrieve the 'lucky' numbers
    for (let [key, value] of values) {
        if (key === value) {
            luckyNumbers.push(key);
        }
    }
    
    // either return the (biggest) lucky number, or -1 in the case that there were no lucky numbers
    return luckyNumbers.length > 0 ? Math.max(...luckyNumbers) : -1;
};