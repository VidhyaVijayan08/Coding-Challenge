/**
 * 
 */

 function rotateArray(nums, k) {
    k = k % nums.length;
    const rotated = nums.slice(-k).concat(nums.slice(0, -k));
    for (let i = 0; i < nums.length; i++) {
        nums[i] = rotated[i];
    }
}

const arr = [1, 2, 3, 4, 5, 6, 7];
rotateArray(arr, 3);
console.log(arr);
