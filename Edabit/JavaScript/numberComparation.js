function isEqual(num1, num2) {
	if(Number.isInteger(num1) && Number.isInteger(num2))
		return num1 == num2 ? true : false;
	else
		return false;
}