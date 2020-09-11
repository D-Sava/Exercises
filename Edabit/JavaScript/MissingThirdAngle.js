function missingAngle(angle1, angle2) {
  
	let angle = 180 - (angle1 + angle2);
	
	if(angle < 90)
		return 'acute';
	if(angle === 90)
		return 'right';
	if(angle > 90 && angle < 180)
    return 'obtuse';
    
}