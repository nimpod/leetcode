var flipAndInvertImage = function(A) {    
  for (var i = 0; i < A.length; i++) {
      A[i] = A[i].reverse();
      for (var j = 0; j < A[i].length; j++) {
          A[i][j] = (A[i][j] == 1) ? 0 : 1;
      }      
  }
  return A;
};

flipAndInvertImage([[1,1,0],[1,0,1],[0,0,0]]);