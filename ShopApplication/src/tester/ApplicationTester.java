package tester;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Stream;

import com.core.Book;
import com.core.Publication;
import com.core.Tape;

public class ApplicationTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		Map<Integer, Publication> map = new HashMap<Integer, Publication>();

		while (exit) {
			System.out.println(
					"1.Publish new book \n2.Publish new Tape \n3.List all book publications ordered by publish date in descendig order"
							+ "\n4.List top 5 publications of current year based on rating"
							+ "\n5.Remove all publicattions which are 5 year old \n6.Show all Publicatins \n0.Exit");
			switch (sc.nextInt()) {
			case 1:
				Book b4 = new Book("CHATRAPATI SHIVAI MAARAJ", 3500, LocalDate.parse("1997-05-15"), 10, 360);
				Book b5 = new Book("Panipat", 2700, LocalDate.parse("1995-09-02"), 9, 450);
				Book b1 = new Book("Ramayan", 2000, LocalDate.parse("2023-12-20"), 10, 600);
				Book b2 = new Book("Shivpuran", 2050, LocalDate.parse("2008-01-30"), 9, 700);
				Book b3 = new Book("Mahabharat", 3000, LocalDate.parse("2002-03-10"), 8, 650);

				map.put(b1.getId(), b1);
				map.put(b2.getId(), b2);
				map.put(b3.getId(), b3);
				map.put(b4.getId(), b4);
				map.put(b5.getId(), b5);
				break;

			case 2:
				Tape t1 = new Tape("Dilwale", 40, LocalDate.parse("2023-01-25"), 10, 40);
				Tape t2 = new Tape("Dillagi", 100, LocalDate.parse("2023-05-12"), 9, 40);
				Tape t3 = new Tape("Zoom", 60, LocalDate.parse("2023-08-18"), 7, 40);
				Tape t4 = new Tape("Honey3.0", 200, LocalDate.parse("2023-01-09"), 10, 40);
				Tape t5 = new Tape("Thaikkudam Bridge", 400, LocalDate.parse("2023-03-27"), 10, 40);

				map.put(t1.getId(), t1);
				map.put(t2.getId(), t2);
				map.put(t3.getId(), t3);
				map.put(t4.getId(), t4);
				map.put(t5.getId(), t5);
				break;

			case 3:
				System.out.println(
						"----------All book publications ordered by publish date in descendig order----------");
				map.values().stream().filter(p -> (p instanceof Book))
						.sorted(Comparator.comparing(Publication::getPublishDate).reversed())
						.forEach(p3 -> System.out.println(p3));
				break;

			case 4:
				System.out.println("---------top 5 publications of current year based on rating---------");

				map.values().stream().filter(p -> p.getPublishDate().getYear() == LocalDate.now().getYear())
						.sorted(Comparator.comparing(Publication::getRatings).reversed()).limit(5)
						.forEach(p -> System.out.println(p));

				break;
			case 5:
				System.out.println("Remove all publicattions which are 5 year old");
				LocalDate fiveYearsAgo = LocalDate.now().minusYears(5);
				System.out.println(map.values().removeIf(p -> p.getPublishDate().isBefore(fiveYearsAgo)));

				break;
			case 6:
				System.out.println("----------Available Publications----------");
				map.values().forEach(p1 -> System.out.println(p1));
				break;
			case 0:
				exit = false;
				System.out.println("EXIT SUCCESS!!!");
				break;

			default:
				break;
			}
		}

	}

}
