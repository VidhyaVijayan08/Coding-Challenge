/**
 * 
 */

 function findShortestWord(words) {
    return words.reduce((shortest, word) => word.length < shortest.length ? word : shortest, words[0]);
}

console.log(findShortestWord(["apple", "banana", "kiwi", "grapefruit"]));
