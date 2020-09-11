function difference(nums) {
	nums = nums.sort(function(a,b){return a-b});
	return nums[nums.length-1] - nums[0];
}