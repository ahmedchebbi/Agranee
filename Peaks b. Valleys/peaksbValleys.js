function PeaksbValleys(arr){
  var result = 0;
  if(arr.length > 2) {
    var pos = -1;
    var pos1 = -1;
    for(var i=1; i<arr.length;i++){
      if(arr[i] > arr[i-1]) {
       pos = i;
       if(pos1 != -1){
        result+=1;
        pos1 = -1;
        }        
      } else if(arr[i] < arr[i-1]) {
        pos1 = i;        
        if(pos != -1){
        result+=1;
        pos = -1;
        }        
      }
    }
  }
  return result;
}
