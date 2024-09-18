s= "banana"
def solution(s):

    answer = []
    
    word_dict = {}
    
    # 문자열을 리스트로 만든 뒤, 하나씩 꺼낸ㄴ다
    for idx, word in enumerate(list(s)): 
        if word not in word_dict: # 처음 나온 문자일 시
            answer.append(-1) # 정답 배열에 -1을 붙인다
            word_dict[word] = idx # 딕셔너리에 해당 단어의 인덱스를 저장한다
        else: # 만약 나온적이 있는 문자일 시
            answer.append(idx - word_dict[word]) #해당 문자의 인덱스와 나온적 있는 문자의 인덱스의 차이를 구한 뒤,그 값을 넣는다 
            word_dict[word] = idx # 해당 문자의 위치를 갱신한다(가장 마지막으로 등장한 위치를 저장하는 의미가 됨)  
            
    return answer