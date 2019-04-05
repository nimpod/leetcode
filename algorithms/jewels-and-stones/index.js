// initial brute force solution:
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
  
  
  // revised solution:
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