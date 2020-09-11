function diffMaxMin(arr) {
	arr = arr.sort(function(a,b){return a-b});
	arrMax = arr[arr.length-1];
	arrMin = arr[0];
	
	return arrMax - arrMin;
}