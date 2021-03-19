package ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
class CarComp implements Comparator<Car2> {
	@Override
	public int compare(Car2 o1, Car2 o2) {return o1.disp - o2.disp;}
	
}

class CarComparator {

	public static void main(String[] args) {
		List<Car2> clist = new ArrayList<>();
		clist.add(new Car2(1800));
		clist.add(new Car2(1200));
		clist.add(new Car2(3000));
		List<ECar> elist = new ArrayList<>();
		elist.add(new ECar(1800, 55));
		elist.add(new ECar(1200, 87));
		elist.add(new ECar(3000, 99));
		
		CarComp comp = new CarComp();
		
		Collections.sort(clist, comp);
		Collections.sort(elist, comp);
		
		for(Iterator<Car2> itr = clist.iterator(); itr.hasNext();)
			System.out.println(itr.next().toString() + '\t');
		System.out.println();
		
		for(Iterator<ECar> itr = elist.iterator(); itr.hasNext();)
			System.out.println(itr.next().toString() + '\t');

	}

}
