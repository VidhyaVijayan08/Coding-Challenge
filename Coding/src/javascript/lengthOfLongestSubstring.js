/**
 * 
 */

 
 function lengthOfLongestSubstring(s) {
    let maxLen = 0;
    let start = 0;
    const charIndexMap = new Map();
    
    for (let end = 0; end < s.length; end++) {
        if (charIndexMap.has(s[end])) {
            start = Math.max(charIndexMap.get(s[end]) + 1, start);
        }
        charIndexMap.set(s[end], end);
        maxLen = Math.max(maxLen, end - start + 1);
    }
    
    return maxLen;
}

// Test the function
console.log(lengthOfLongestSubstring("abcabcbb"));
// Output: 3 (The longest substring is "abc")
