# Data Structure - Tree
- Node와 Branch로 이루어져있으며 사이클이 존재하지 않는 형태의 데이터 구조
- 용어
  * Node - 데이터를 저장하는 요소 
  * Root Node - 최상단 Node
  * Level - Root node(Level 0)로 부터의 노드 깊이
  * Parent Node - 바로 상위 Level 노드
  * Child Node - 바로 하위 Level 노드
  * Sibling Node - 동일한 Parent & Level에 위치한 노드
  * Leaf Node - Child가 없는 Node
  * Depth - Tree의 최대 Level
- 이진 탐색 트리(Binary Search Tree)
  * 각 노드가 최대 2개 Branch를 가짐
  * 데이터 저장 시 아래와 같은 추가 조건을 가짐
    * 왼쪽 Child 노드는 Parent Node보다 작은 값 오른쪽 Child Node는 더 큰 값을 가짐
  .
