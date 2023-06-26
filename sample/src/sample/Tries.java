package sample;

import java.util.HashMap;
import java.util.Map;

public class Tries {
	static class triNode{
		Map<Character, triNode> child;
		boolean isW;
		
		public triNode() {
			child=new HashMap<>();
			isW=false;
		}
	}
	public triNode root;
	
	public void insert(String wrd) {
		triNode node=root;
		for(char c:wrd.toCharArray()) {
			node.child.putIfAbsent(c, new triNode());
			node=node.child.get(c);
		}
		node.isW=true;
	}
	public boolean search(String wrd) {
		triNode node=root;
		for(char c:wrd.toCharArray()) {
			if(!node.child.containsKey(c)) {
				return false;
			}
			node=node.child.get(c);
		}
		return node.isW;
	}
	public boolean startswith(String wrd) {
		triNode node=root;
		for(char c:wrd.toCharArray()) {
			if(!node.child.containsKey(c)) {
				return false;
			}
			node=node.child.get(c);
		}
		return true;
	}

}
