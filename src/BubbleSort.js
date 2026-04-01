let arr = [5, 1, 4, 2, 8];
for (let j = 0; j <= arr.length - 1; j++) {
  for (let i = 0; i <= arr.length - 2 - j; i++) {
    if (arr[i] > arr[i + 1]) {
      let temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = temp;
    }
    console.log(arr);
  }
}
