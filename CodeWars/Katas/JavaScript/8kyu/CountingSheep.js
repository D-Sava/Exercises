function countSheeps(arrayOfSheep) {
  var counter = 0;
  for(var i=0; i<arrayOfSheep.length; i++){
    if(arrayOfSheep[i] === true)
      counter++;
  }
  return counter;
}