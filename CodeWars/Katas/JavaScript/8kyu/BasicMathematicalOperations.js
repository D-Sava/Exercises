function basicOp(operation, value1, value2)
{
  switch(operation){
    case '+':{
      return value1+value2;
    }
    case '-':{
      return value1-value2;
    }
    case '*':{
      return value1*value2;
    }
    case '/':{
      if (value2 != 0)
        return value1/value2;
    }
  }
}

//Tests
console.log(basicOp('+', 4, 7));//11
console.log(basicOp('-', 15, 18));//-3
console.log(basicOp('*', 5, 5));//25
console.log(basicOp('/', 49, 7));//7