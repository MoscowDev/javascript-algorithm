function getUniqueValues(arr) {
   occurrences = {};
  const unique = [];

  for (let i = 0; i < arr.length; i++) {

    if (!unique.includes(arr[i])) {
      unique.push(arr[i]);
    }

    if (occurrences[arr[i]]) {
      occurrences[arr[i]]++;
    } else {
      occurrences[arr[i]] = 1;
    }
  }

let answer = {}
  answer["unique"] = unique
   for (const [key, value] of Object.entries(occurrences)) {
         answer[key] = value;
   }
  return answer
}



console.log(getUniqueValues([1, 1, 2, 3, 3, 3, 4]));
