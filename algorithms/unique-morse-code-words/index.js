var uniqueMorseRepresentations = function(words) {
    var dictionary = new Map();
  
    var alphabet = 'abcdefghijklmnopqrstuvwxyz';
    var morsecodes = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."];
  
    for (var i=0; i < alphabet.length; i++) {
      dictionary.set(alphabet[i], morsecodes[i]);
    }
    
    var transformations = new Set();
  
    for (var i=0; i < words.length; i++) {
      var answer = "";
      var word = words[i];
      for (var j=0; j < word.length; j++) {
        answer += dictionary.get(word.charAt(j));
      }
      transformations.add(answer);
    }
  
    return transformations.size;
  };