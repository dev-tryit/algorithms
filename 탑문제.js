function solution(heights) {
    let returnArr = []
    
    for(let i=(heights.length-1) ; i >= 0  ; i--) {
        returnArr[i] = 0;
        for(let j=(i-1) ; j >= 0  ; j--) {
            if(heights[j] > heights[i]) {
                returnArr[i] = j+1;
                break;
            }
        }
    }
    
    return returnArr;
}
