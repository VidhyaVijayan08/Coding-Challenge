/**
 * 
 */

 
 function mergeIntervals(intervals) {
    if (intervals.length === 0) return [];
    
    // Sort intervals by starting time
    intervals.sort((a, b) => a[0] - b[0]);
    
    const merged = [intervals[0]];
    
    for (let i = 1; i < intervals.length; i++) {
        const last = merged[merged.length - 1];
        const current = intervals[i];
        
        if (last[1] >= current[0]) {
            last[1] = Math.max(last[1], current[1]);
        } else {
            merged.push(current);
        }
    }
    
    return merged;
}

console.log(mergeIntervals([[1, 3], [2, 6], [8, 10], [15, 18]]));
