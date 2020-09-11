// Return the number (count) of vowels in the given string.

// We will consider a, e, i, o, and u as vowels for this Kata.

// The input string will only consist of lower case letters and/or spaces.

var string = 'aei2';

function countVowels(str){
  var v = str.match(/[aeiou]/gi); // 'g' means to search for the whole string & 'i' means to include capital letters also while searching
  return v === null ? 0 : v.length;
}

console.log(countVowels(string));