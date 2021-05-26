public class Tree {
	Node head;

	public Tree() {
		this.head = null;
	}

	public class Node {
		Node left;
		Node right;
		int data;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	// 정상 등록 여부 반환
	public boolean insert(int data) {
		Node newNode = new Node(data);
		Node ptrNode = this.head;

		if (this.head == null) {
			this.head = newNode;
		} else {
			while (true) {
				// 더 작을 경우 왼쪽 확인
				if (data < ptrNode.data) {
					if (ptrNode.left != null) {
						ptrNode = ptrNode.left;
					} else {
						ptrNode.left = newNode;
						break;
					}
				// 더 클 경우 오른쪽 확인
				} else {
					if (ptrNode.right != null) {
						ptrNode = ptrNode.right;
					} else {
						ptrNode.right = newNode;
						break;
					}
				}
			}
		}
		return true;
	}
}
