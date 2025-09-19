
public class Sorting {
				public static void main(String args[]){
								StringBuilder newsb = new StringBuilder("Tony");
								System.out.println(newsb);
								newsb.setCharAt(3, 'e');
								System.out.println(newsb);
								
								//StringBuilder newsb = new StringBuilder();
								
								for(int i =0; i < newsb.length()/2; i++){
												int front = i;
												int back = newsb.length()-1-i;
												
												char temp = newsb.charAt(front);
												newsb.setCharAt(front, newsb.charAt(back));
												newsb.setCharAt(back, temp);
												
								}
								System.out.println(newsb);
								
				}
}