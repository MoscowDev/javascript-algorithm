function getMatrix(arr) {

 
    const rows = arr.length;
    const cols = arr[0].length;
    const result = [];

    for (let j = 0; j < cols; j++) {
      const newRow = [];
      for (let i = 0; i < rows; i++) {
        newRow.push(arr[i][j]);
      }
      result.push(newRow);
    }

    return result;
  }

  console.log(getMatrix([[2,3,5],[1,6,9],[3,4,8]]));


