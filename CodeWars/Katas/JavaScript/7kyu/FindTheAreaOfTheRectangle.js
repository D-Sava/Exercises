function area(d,l){
  var m = Math.sqrt(d**2 - l**2);
  var area = m*l;
  
  if((area%2==0)&&(d>l)){
    return area;
  }
  if((area%2!=0)&&(d>l)){
    var result = area.toFixed(2);
    return Number(result);
  }
  if(d<=l){
    return "Not a rectangle";
  }
}