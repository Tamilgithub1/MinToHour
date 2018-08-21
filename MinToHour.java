import java.util.*;
public class te {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int m=in.nextInt();
	int h=m/60;
	m%=60;
	System.out.println(h+" "+m);
}
}
