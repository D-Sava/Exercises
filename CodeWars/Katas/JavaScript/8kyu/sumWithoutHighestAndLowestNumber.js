function sumArray(array) {
  if(array === null)
    return 0;

  else if(array.length <= 1)
    return 0;
    
  else{
      array = array.sort(function(a,b){return a-b});
      let x = array.shift(array);
      let y = array.pop(array);
      return array.reduce((a,b) => a+b,0);
    }
}