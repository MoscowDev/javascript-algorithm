function calculateMedian(arr) {
  const sortedArr = arr.slice().sort((a, b) => a - b);
  const len = sortedArr.length;
  let median;
  if (len % 2 === 0) {
    median = (sortedArr[len / 2 - 1] + sortedArr[len / 2]) / 2;
  } else {
    median = sortedArr[Math.floor(len / 2)];
  }
  return median;        
}

console.log(calculateMedian([2,5,1,9,8]));
console.log(calculateMedian([20,15,21,16,17]));