# maxmark
package hunter;

public class Max_Mark {
	public static void main(String []args){
		
		String s1[]=new String[]{"arun","12","12","12"};
		String s2[]=new String[]{"deepak","14","16","12"};
		int a1[]=new int[s1.length];
		int a2[]=new int[s2.length];
		a1[1]=Integer.parseInt(s1[1]);
		a1[2]=Integer.parseInt(s1[2]);
		a1[3]=Integer.parseInt(s1[3]);
		a2[1]=Integer.parseInt(s2[1]);
		a2[2]=Integer.parseInt(s2[2]);
		a2[3]=Integer.parseInt(s2[3]);
		int total1=a1[1]+a1[2]+a1[3];
		int total2=a2[1]+a2[2]+a2[3];
		String max="";
		if(total1>total2){
			max=s1[0];
		}
		else{
			max=s2[0];
		}
		System.out.println(max);
	}
}
