function solution(participant, completion) {
    let pMap = {};
    for (p of participant) pMap[p] = (pMap[p] ? pMap[p]: 0) + 1;
    for (c of completion) if(pMap[c]) pMap[p]-=1;
    
  
    for (k in pMap) {
      let v = pMap[k];
      if(v>0) return k;
    }
}
