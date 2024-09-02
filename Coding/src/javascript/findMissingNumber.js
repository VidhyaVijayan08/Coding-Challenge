/**
 * 
 */
function findMissingNumber(nums) {
    const n = nums.length;
    const sum = n * (n + 1) / 2;
    const arraySum = nums.reduce((acc, num) => acc + num, 0);
    return sum - arraySum;
}

// Test the function
console.log(findMissingNumber([3, 0, 1]));
// Output: 2
