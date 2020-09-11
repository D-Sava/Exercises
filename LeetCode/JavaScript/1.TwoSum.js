// Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Example:

// Given nums = [2, 7, 11, 15], target = 9,

// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].

let numArray = [2,7,11,15];
let target = 26;

function returnTwoSum(numArray,target){
  let selected;

  for(let i = 0; i < numArray.length-1; i++){
    selected = numArray[i];
    for(let j = i+1; j<= numArray.length;j++){
      if(numArray[i]+numArray[j]===target)
        return [i,j];
    }
  }
}

console.log(returnTwoSum(numArray,target));