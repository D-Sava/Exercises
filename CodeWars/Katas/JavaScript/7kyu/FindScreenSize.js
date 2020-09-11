function findScreenHeight(width, ratio) {

  var str = ratio.split(':');
  
  const widthRatio = str[0];
  const heightRatio = str[1];
  
  return width + 'x' +(width*heightRatio)/widthRatio;
  
  //width:height=x:y;
  //width*y=height*x;
  //height=(width*y)/x;
}