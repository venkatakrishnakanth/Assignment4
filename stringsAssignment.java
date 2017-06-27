// Submitted By Venkata Krishna Kanth Musunuru.


/**String s =”This is a java class”

1)How many words in a String?
2)Length of the String?
3)How many single character words in the String?
4)Reverse each word ?
5)Reverse entire String
6)Replace java with SQL
7)Letter at the center
8)Index of j at center
9)Number of times each letter repeated.
10)Identify a letter which is not repeated.
11)Identify the index of each word
12)Identify the index of each word
13)Convert the entire String in to upper case ?*/




class strassgnmnt{
	
	private static String KK="";
	public void numOfWords(String str){
		
		System.out.println("1.) Number of words in the string are: "+str.split("\\s+").length); 
		}
	
	public void lengthOfString(String str){
		
		System.out.println("2). Length of the given string is: "+ str.length());
	}
	
	public void singleCharacterWords(String str){
		String[] str1 = str.split("\\s+");
		int k=0;
		for(int i=0; i<str1.length;i++)
		{
			if(str1[i].length()==1){
				k++;
			}
		}
		System.out.println("3). Number of Single Word Characters are: "+k);
	}
	
	
	
	public void reverseEachWord(String str){
		
		String[] str1 = str.split("\\s+");
		String out ="";
		for(int i=0;i< str1.length;i++){
			
			out+=" "+new StringBuilder(str1[i]).reverse().toString();
		}
		
		System.out.println("4). The Each word reversed string is: "+out);
	}
	
	public void reverseEntireString(String str){
		System.out.println("5). The entire reversed string is: "+new StringBuilder(str).reverse().toString());
	}
	
	public void replaceJavaWithSQL(String str){
		String replaced = str.replace("java", "SQL");
		System.out.println("6). After replacing with java with SQL: "+replaced);
	}
	
	public void LetteratThecentre(String str){
		String replaced=str.replace(" ", "");
		System.out.println("7). Letter at the centre is: "+replaced.charAt((replaced.length()/2)-1));
		
	}
	
	public void indexOfJ(String str){
		System.out.println("8). The index of J is: "+ str.indexOf("j"));
		System.out.println("8). The index of J excluding spaces is: "+ str.replace(" ", "").indexOf("j"));
	}
	
	public void numOfTimeLetterRepeated(String str){
		String ch = str.replace(" " , "");
		m1(ch,"");
		System.out.println("9). After counting, the number of times each letter is repeated: "+KK);
		
	}
	
	public String m1(String ch, String S){
		
		if(ch.length()>0){
			
			int count=0;
			for(int j=0;j<ch.length();j++){
				if(ch.charAt(0)==ch.charAt(j))
					count++;
			}
			S+=ch.charAt(0)+":"+count+"  ";
			ch=ch.replaceAll(ch.substring(0, 1), "");
			m1(ch,S);
		}else{
			KK=S;
		}		
		
		return KK;
	}
	
	public void letterNotRepeated(String str){
		
		String ch = str.replace(" " , "");
		String TJ = m1(ch,"");
		String[] kk = TJ.split("\\s+");
		TJ="";
		for(int i=0;i<kk.length;i++){
			String[] mysplit = kk[i].split(":");
			if(mysplit[1].equals("1")){
				TJ+=mysplit[0]+", ";
			}
		}
		System.out.println("10).Letters "+TJ+"occured only once");
	}
	
	
	public void indexOfEachWord(String str){
		String[] str1 = str.split("\\s+");
		int len=0;
		for(int i=0;i<str1.length;i++){
			System.out.println("11).index of '"+str1[i]+"' is: "+str.indexOf(str1[i],len));
			len+=str1[i].length();
		}
		
	}
	
	public void toUpper(String str){
		System.out.println("13).The given string in Uppercase is: "+str.toUpperCase());
	}
	
	
}


public class stringsAssignment {

	public static void main(String[] args) {
		
		String str = "This is a java class";
		strassgnmnt mystr = new strassgnmnt();
		mystr.numOfWords(str);
		mystr.lengthOfString(str);
		mystr.singleCharacterWords(str);
		mystr.reverseEachWord(str);
		mystr.reverseEntireString(str);
		mystr.replaceJavaWithSQL(str);
		mystr.LetteratThecentre(str);
		mystr.indexOfJ(str);
		mystr.numOfTimeLetterRepeated(str);
		mystr.letterNotRepeated(str);
		mystr.indexOfEachWord(str);
		mystr.toUpper(str);
		
		
		
		
	}

}
