// This time no story, no theory. The examples below show you how to write function accum:
// Examples:
// accum("abcd") -> "A-Bb-Ccc-Dddd"
// accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
// accum("cwAt") -> "C-Ww-Aaa-Tttt"
// The parameter of accum is a string which includes only letters from a..z and A..Z.

function accum(s) {

  let arr = [];

  for(let i = 0; i < s.length; i++){
     i>0 ? arr.push(s[i].toUpperCase() + s[i].toLowerCase().repeat(i)) : arr.push(s[i]); 
  }

  return arr.join('-');

}

console.log(accum("ZpglnRxqenU"));//Should return: "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu
