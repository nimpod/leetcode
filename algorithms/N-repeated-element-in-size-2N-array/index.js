var repeatedNTimes = function(A)  {
    let uniqueElems = {};
  
    // iterate over each element in array A
    for (var elem of A) {
  
      // has this element been encountered before?...
      if (uniqueElems[elem]) {
        return elem;      // if yes, then return that element
      }
      
      // therefore this element has not been encountered before...
      else {
        uniqueElems[elem] = 1;    // so tell the map that we have now encountered it
      }
    }
  
    // each element was unique
    return null;
  };