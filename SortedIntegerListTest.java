package list;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class SortedIntegerListTest {

	// isEmpty()
	@Test
	public void isEmpty_Test1(){
		SortedIntegerList s = new SortedIntegerList();
		assertEquals(true, s.isEmpty());
	}

	@Test
	public void isEmpty_Test2(){
		SortedIntegerList s = new SortedIntegerList();
		s.insert(5);
		assertEquals(false, s.isEmpty());
	}

	@Test
	public void isEmpty_mutation_Test() {
		/**
		 * Mutant Killed: Line: 12
		 * Old line: return (first == null);
		 * New line: return (first != null);
		 */
		SortedIntegerList s = new SortedIntegerList();
		s.insert(5);
		assertEquals(true, s.isEmpty());
	}
	
	//size()
	@Test
	public void size_Test1(){
		SortedIntegerList s = new SortedIntegerList();
		s.insert(5);
		assertEquals(1, s.size());
	}
	@Test
	public void size_mutationTest(){
		/**
		 * Mutant Killed: Line: 17 
		 * Old line: int n = 0; 
		 * New line: int n = 5;
		 */
		SortedIntegerList s = new SortedIntegerList();
		s.insert(1);
		assertEquals(6, s.size());
	}
	
	//getFirst()
		@Test
		public void getFirst_Test1(){
			SortedIntegerList s = new SortedIntegerList();
			assertEquals(null, s.getFirst());
		}
		
		@Test
		public void getFirst_Test2(){
			SortedIntegerList s = new SortedIntegerList();
			s.insert(10);
			assertEquals(Integer.valueOf(10), s.getFirst());
		}
		
		@Test
		public void getFirst_mutation_Test(){
			/**
			 * Mutant Killed: Line: 29 
			 * Old line: return first.data;
			 * New line: return 5;
			 */
			SortedIntegerList s = new SortedIntegerList();
			s.insert(10);
			assertEquals(Integer.valueOf(5), s.getFirst());
		}
		
		//getLast()
		@Test
		public void getLast_Test1(){
			SortedIntegerList s = new SortedIntegerList();
			s.insert(5);
			s.insert(10);
			assertEquals(Integer.valueOf(10), s.getLast());
		}
		
		@Test
		public void getLast_Test2(){
			SortedIntegerList s = new SortedIntegerList();
			assertEquals(null, s.getLast());
		}
		
		@Test
		public void getLast_mutation_Test() {
			/**
			 * Mutant Killed: 
			 * Line: 42 
			 * Old line: return null; 
			 * New line: return 1;
			 */
			SortedIntegerList s = new SortedIntegerList();
			assertEquals(Integer.valueOf(1), s.getLast());
		}
		
		//get()
		@Test
		public void get_Test1() throws Throwable {
			SortedIntegerList s = new SortedIntegerList();
			try {
			assertEquals("incorrect index 1", s.get(1));}
			catch(Exception e) {}

		}
		
		@Test
		public void get_Test2(){
			SortedIntegerList s = new SortedIntegerList();
			s.insert(5);
			s.insert(7);
			assertEquals(Integer.valueOf(7), s.get(1));
		}
		
		@Test
		public void get_mutation_Test() {
			/**
			 * Mutant Killed: 
			 * Line: 49 
			 * Old line: curr = curr.next;
			 * New line: curr = curr;
			 */
			SortedIntegerList s = new SortedIntegerList();
			s.insert(5);
			s.insert(7);
			assertEquals(Integer.valueOf(5), s.get(1));
		}
		
		//firstIndexOf
		@Test
		public void firstIndexOf_Test1(){
			SortedIntegerList s = new SortedIntegerList();
			assertEquals(-1, s.firstIndexOf(1));
		}
		
		@Test
		public void firstIndexOf_Test2() {
			SortedIntegerList s = new SortedIntegerList();
			s.insert(1);
			s.insert(5);
			assertEquals(1, s.firstIndexOf(5));
		}
		
		@Test
		public void firstIndexOf_mutation_Test(){
			/**
			 * Mutant Killed: 
			 * Line: 67 
			 * Old line: return -1; 
			 * New line: return 2;;
			 */
			SortedIntegerList s = new SortedIntegerList();
			assertEquals(2, s.firstIndexOf(1));
		}
		
		//contains()
		@Test
		public void contains_Test1(){
			SortedIntegerList s = new SortedIntegerList();
			assertEquals(false , s.contains(1));
		}
		
		@Test
		public void contains_Test2()  {
			SortedIntegerList s = new SortedIntegerList();
			s.insert(1);
			assertEquals(true , s.contains(1));
		}
		
		@Test
		public void contains_mutation_Test()  {
			/**
			 * Mutant Killed: 
			 * Line: 71 
			 * Old line: return firstIndexOf(data) != -1; 
			 * New line: return firstIndexOf(data) == 1;
			 */
			SortedIntegerList s = new SortedIntegerList();
			s.insert(1);
			assertEquals(false , s.contains(1));
		}
	
		//insert()
		@Test
		public void insert_Test1() {
			SortedIntegerList s = new SortedIntegerList();
			s.insert(5);
			s.insert(10);
			s.insert(15);
			assertEquals(3, s.size());
		}
		
		@Test
		public void insert_mutation_Test(){
			/**
			 * Mutant Killed: 
			 * Line: 77
			 * Old line: if ((first == null) || (data <= first.data)) { 
			 * New line: if ((first == null) || (data == first.data)) {
			 */
			SortedIntegerList s = new SortedIntegerList();
			s.insert(1);
			s.insert(5);
			assertEquals(1, s.size());
		}
		
		//insertAll()
		@Test
		public void insertAll_Test1(){
			SortedIntegerList s = new SortedIntegerList();
			Integer[] dataArr = {5, 10, 15, 20, 25};
			s.insertAll(dataArr);
			assertEquals(5, s.size());
		}
		@Test
		public void insertAll_mutation_Test(){
			/**
			 * Mutant Killed: 
			 * Line: 91
			 * Old line: insert(dataArr[i]);
			 * New line: insert(dataArr[i+1]);
			 */
			SortedIntegerList s = new SortedIntegerList();
			Integer[] dataArr = {5, 10, 15, 20, 25};
			s.insertAll(dataArr);
			assertEquals(6, s.size());
		}
		
		//merge()
		@Test
		public void merge_Test1(){
			SortedIntegerList s = new SortedIntegerList();
			SortedIntegerList l = new SortedIntegerList();
			s.insert(10);
			s.insert(20);
			l.insert(7);
			l.insert(15);
			s.merge(l);
			assertEquals(4, s.size());
		}
		
		@Test
		public void merge_Test2(){
			SortedIntegerList s = new SortedIntegerList();
			SortedIntegerList l = new SortedIntegerList();
			s.insert(5);
			l.insert(7);
			s.merge(l);
			assertEquals(2, s.size());
		}
		@Test
		public void merge_mutation_Test(){
			/**
			 * Mutant Killed: 
			 * Line: 100
			 * Old line:  if (p1.data <= p2.data)
			 * New line:  if (p1.data == p2.data)
			 */
			
			SortedIntegerList s = new SortedIntegerList();
			SortedIntegerList l = new SortedIntegerList();
			s.insert(5);
			l.insert(0);
			assertEquals(2, s.size());
			
		}
}
