  /* INITIAL BRUTE FORCE SOLUTION
      Runtime = 64ms    faster than 81.34% of solutions
      Memory = 35MB     faster than 12.75% of solutions
  */
 var numJewelsInStones = function(J, S) {
    var jewelStoneCounter = 0;
    for (var s = 0; s < S.length; s++) {
      for (var j = 0; j < J.length; j++) {
        if (S.charAt(s) == J.charAt(j)) {
          jewelStoneCounter++;
          break;
        }
      }
    }
    return jewelStoneCounter;
  }
  
  
  /* REVISED SOLUTION
      Runtime = 60ms    faster than 100.0% of solutions
      Memory = 34.3MB   faster than 40.89% of solutions
  */
  var numJewelsInStones = function(J, S) {
      var jewelStoneCounter = 0;
      var setJ = new Set(J);
      for (var s = 0; s < S.length; s++) {
          if (setJ.has(S[s])) {
              jewelStoneCounter++;
          }
      }
      return jewelStoneCounter;
  };
  
  var ex1 = numJewelsInStones("aA", "aAAbbbb");  
  console.log(ex1);