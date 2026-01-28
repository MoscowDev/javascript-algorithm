function getUniqueValues(arr) {
  const occurrences = {};
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

  return {
    uniqueValues: unique,
    occurrences: occurrences
  };
}

console.log(getUniqueValues([1, 1, 2, 3, 3, 3, 4]));
