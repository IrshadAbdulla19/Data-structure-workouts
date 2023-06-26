package problemsDataStruc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DataStrct {
	static class triNode{
		Map<Character, triNode>child;
		boolean isW;
		
		public triNode() {
			child=new HashMap<>();
			isW=false;
		}
	}
	private triNode root;
	
	public DataStrct() {
		root=new triNode();
	}
	public void insert(String str) {
		triNode node=root;
		for(char c:str.toCharArray()) {
			node.child.putIfAbsent(c, new triNode());
			node=node.child.get(c);
		}
		node.isW=true;
	}
	public boolean search(String str) {
		triNode node=root;
		for(char c:str.toCharArray()) {
			if(!node.child.containsKey(c)) {
				return false;
			}
			node=node.child.get(c);
		}
		return node.isW;
	}


}
