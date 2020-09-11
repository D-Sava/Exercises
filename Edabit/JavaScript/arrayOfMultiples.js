function arrayOfMultiples (num, length) {
	let arr = [];
	let count = 0;
	for(let i = num; count < length; i+=num){
		arr.push(i);
		count++;
	}
	return arr;
}