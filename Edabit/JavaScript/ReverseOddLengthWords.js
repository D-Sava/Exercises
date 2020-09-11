function reverseOdd(str) {
	let word = '';
	str = str.split(' ');
	let newString = [];

	for(let i = 0; i < str.length; i++){
		word = str[i];
		if(word.length%2 === 1){
			word = word.split('').reverse().join('');
		}
		newString.push(word);
	}
	return newString.join(' ');
}