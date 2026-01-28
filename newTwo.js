function calculateMedian(arr) {

    let number = arr;
    
    for (let i = 0; i < number.length; i++) {
      for (let j = 0; j < number.length - i - 1; j++) {
        if (number[j] > number[j + 1]) {
          let temp = number[j];
          number[j] = number[j + 1];
          number[j + 1] = temp;
        }        
    }
                                                          
}
    let median;
    if (!number.length % 2 === 0) {
      median = number[Math.floor(number.length / 2)];
    }   
    return median;

   }
   console.log( calculateMedian([2,5,1,9,8])); 
   console.log( calculateMedian([20,15,21,16,17, 24]));