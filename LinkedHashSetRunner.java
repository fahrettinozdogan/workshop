import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LinkedHashSetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new LinkedHashSet<>();
		System.out.println("Please enter number of test case: ");
		Scanner scan=new Scanner(System.in);
		int NumberOfTestCase=scan.nextInt();
		for (int i=0;i<NumberOfTestCase; i++) {
			set.clear();
			System.out.println("please enter number of test queries;");
			int numberOfQueries= scan.nextInt();
			for (int j=0;j<NumberOfTestCase;j++) {
				for (int k = 0; k < numberOfQueries; k++) {
					String querySymbol=scan.next();
					if (querySymbol.equals("a")) {
						int number=scan.nextInt();
						set.add(number);
					}
					else if (querySymbol.equals("b")) {
						List<Integer> list=new ArrayList<>();
						for (Integer integer : set) {
							list.add(integer);
						}
//						set.stream().sorted().collect(Collectors.toList());
						Collections.sort(list);
						for (Integer integer : list) {
							System.out.print(integer+" ");
						}
					}
					else if (querySymbol.equals("c")) {
						int number=scan.nextInt();
						set.remove(number);
					}
					else if (querySymbol.equals("d")) {
						int number=scan.nextInt();
						System.out.println(isPresent(set, number));
					}
					else if (querySymbol.equals("e")) {
						System.out.println(set.size());
					}
					else if (querySymbol.equals("f")) {
						for (Integer integer : set) {
							System.out.print(integer+" ");
						}
					}else {
						System.out.println("please enter correct query symbol");
					}
				}
			}
		}
	}
	public static int isPresent(Set<Integer> set, int number) {
		if (set.contains(number)) {
			return 1;
		} else {
			return -1;
			}
		}
	}


