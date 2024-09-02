/**
 * 
 */

 
 function mergeSortedArrays(nums1, nums2) {
    const merged = [];
    let i = 0, j = 0;
    
    while (i < nums1.length && j < nums2.length) {
        if (nums1[i] < nums2[j]) {
            merged.push(nums1[i]);
            i++;
        } else {
            merged.push(nums2[j]);
            j++;
        }
    }
    
    while (i < nums1.length) {
        merged.push(nums1[i]);
        i++;
    }
    
    while (j < nums2.length) {
        merged.push(nums2[j]);
        j++;
    }
    
    return merged;
}

// Test the function
console.log(mergeSortedArrays([1, 3, 5], [2, 4, 6]));
// Output: [1, 2, 3, 4, 5, 6]
