function oddishOrEvenish(num) {

	num = String(num);
	let result = 0;

	for(let i = 0; i < num.length; i++){
		let selected = Number(num[i]);
		result += selected;
	}

	return result%2===0 ? 'Evenish' : 'Oddish';
	
}