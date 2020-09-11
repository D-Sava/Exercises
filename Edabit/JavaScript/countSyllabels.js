function numberSyllables(word) {
	return word.split('').filter(i => i==='-').length+1;
}