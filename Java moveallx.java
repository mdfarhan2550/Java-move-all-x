public class Main {
	public static void moveX(String str, int idx,int count, String newStr) {
			if(idx == str.length()) {
				for(int i=0; i<count; i++) {
					newStr += 'x';
				}
				System.out.println(newStr);
				return;
			}
		
			char currCh = str.charAt(idx);
			if(currCh == 'x') {
				count++;
				} else {
					newStr += currCh;
					}	
			moveX(str,idx+1,count,newStr);
	}
	public static void main(String[] args) {
		String str = "xaxbxcxxd";
		moveX(str,0,0,"");
	}
}