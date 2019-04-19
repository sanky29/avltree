import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
//import the eyception file
import java.util.NoSuchElementException;
import java.util.Scanner;
public class BestFit {
	//define class dustbin as
	public class dustbin {

		//define id as
		private long id;
		
		//define max_capacity as
		private int max_c;
		
		//define current capacity as
		private int curr_c;
		
		//define variable to store the no of objects
		private int no_of_objects;
		
		//define nodes of list as
		private List<object> object_list = new ArrayList<object>(); 
		
		//write function to change thi
		public long show_id() {
			
			//just return it
			return(id);
		}
		//write function to change thi
		public int show_curr_capacity() {
				
			//just return it
			return(curr_c);
		}
		//write function to change thi
		public int show_max_capacity() {
			
			//just return it
			return(max_c);
		}
		//write function to change current size
		public void change_cc(int new_c) {
			
			//just change curr_c
			curr_c = new_c;
		}
		//define function to show_objects
		public int show_no_objects() {
			
			//just return no_of_objects
			return(no_of_objects);
		}
		//now return head
		public List<object> show_object(){
			
			//just return the head
			return(object_list);
		}
		//write function to add object
		public void add_object(object new_object) {
			curr_c = curr_c - new_object.show_size();
			
			object_list.add(new_object);
			
			//change no_of_objects by 1
			no_of_objects++;
			//decrease current size as
			
		}
		//write function to delete object
		public void delete_object(object dobject) {
			
			object_list.remove(dobject);
			curr_c = curr_c + dobject.show_size();
			no_of_objects--;
		
		}
		//write function to print objects
		public void print_object() {
			for(object t : object_list) {
				System.out.println(t.show_id() + " " + t.show_size());
			}
		}
		//define constructor as
		public dustbin(long nid, int nc) {
			
			//just define new id and max_capacity as
			id = nid;
			max_c = nc;
			
			//and all to default
			no_of_objects = 0;
			curr_c = nc;
		}
		//define constructor as
		public dustbin() {
			
			//and all to default
			id = 0;
			max_c = 0;
			no_of_objects = 0;
			curr_c = 0;
		}
	}
	//define the object class
	public class object {

		//now just store id
		private long id;
		
		//define size as
		private int size;
		
		//define its bin as
		private dustbin bin;
		
		//just write function to shoe id
		public long show_id() {
			
			//just return id
			return(id);
		}
		
		//write function to return it
		public int show_size() {
			
			//just return size
			return(size);
		}
		//show bin
		public dustbin show_bin() {
			
			//just return the bin
			return(bin);
		}
		public object(long nid , int s, dustbin x) {
			id = nid;
			size = s;
			bin = x;
		}
	}
	//define avl tree node
	public class anode<E> {

		//define id as
		private long id;
		
		//define height as
		private int height;
		
		//define left_child
		private anode<E> left_child;
		
		//define right child
		private anode<E> right_child;
		
		//is avl
		private boolean isavl;
		
		//parent node
		private anode<E> parent;
		
		//private element
		private E element;
		
		//write function to show all this
		public long show_id() {
			
			//just return the id
			return(id);
		}
		//write function to change id
		public void change_id(long new_id) {
				
			//just return the id
			id = new_id;
		}
			
		//write function to show height
		public int show_height() {
			
			//just return height
			return(height);
		}
		//change height
		public void change_height(int new_h) {
			
			//just change h
			height = new_h;
		}
		//write function to show left child
		public anode<E> show_left_child(){
			
			//just return the left child
			return(left_child);
		}
		//write function to show left child
		public anode<E> show_right_child(){
			
			//just return the left child
			return(right_child);
		}
		//write function to change right child
		public void change_right_child(anode<E> new_rc) {
			
			//just change right child
			right_child = new_rc;
			
		}
		//write public function for changing left child
		public void change_left_child(anode<E> new_lc) {
			
			//just change right child
			left_child = new_lc;		
		}
		//show avl_condition
		public boolean isavl() {
			
			//just return isavl
			return(isavl);
		}
		//change avl_condition
		public void change_isavl(boolean nc) {
					
			//just change isavl
			isavl = nc;
		}
		//show parent
		public anode<E> show_parent() {
			
			//just return parent
			return(parent);
		}
		//change parent
		public void change_parent(anode<E> np) {
			
			//just return parent
			parent = np;
		}
		//show element
		public E show_element() {
			
			//just return element
			return(element);
		}
		//change element
		public void change_element(E new_element) {
			
			//just change element
			element = new_element;
		}
		//write constructor
		public anode (E new_element , long nid){
			
			//make new_element as
			element = new_element;
			height = 1;
			isavl = true;
			id = nid;
			parent = null;
			left_child = null;
			right_child = null;
					
		}
	}

	//define avl tree class
	public class atree<E> {
	 
		//define root
		public anode<E> root;
		
		//now write function to search in tree
		public anode<E> search_element(long sid){
			
			//define loacal variable temp
			anode<E> temp = root;
			
			//define dir variable
			long dir = root.show_id() - sid;
			
			//now run while loop
			while(temp != null && dir != 0) {
				
				
				//check dir
				if (dir < 0) {
					
					//change temp as
					temp = temp.show_right_child();
				}
				//else go left
				else {
					
					//change temp
					temp = temp.show_left_child();
				}
				//if temp is not null change dir
				if (temp != null) {
					
					//change dir
					dir = temp.show_id() - sid;
				}
			}
			//now check conditions
			if (dir == 0) {
				
				//just return temp
				return(temp);
			}
			//else throw error
			else {
				
				//throw error
				throw new NoSuchElementException ("not found");
			}
		}
		
		//just add function to add element
		public void add_element(anode<E> new_element) {

			//just search for nearest element
			//define loacal variable z
			anode<E> y = root;
			root.change_parent(null);
			//define anode y
			anode<E> x = new_element;
			
			//define sid as
			long sid = new_element.show_id();
			//define dir variable
			long dir = sid - root.show_id();
					
			//now run while loop
			while((y.show_right_child() != null && dir > 0) ||
					(y.show_left_child() != null && dir < 0)){
						
				//check dir
				if (dir > 0) {
							
					//change z as
					y = y.show_right_child();
				}
				
				//else go left
				else {
							
					//change z
					y = y.show_left_child();
				}			
				//change dir
				dir = sid - y.show_id();
			}
			//now check conditions
			if (dir == 0) {
				
				//just throw eyception z
				//throw error
				throw new NoSuchElementException ("alreadz eyist");
			}
			
			//else throw error
			else if (dir > 0) {
						
				//add to right of z
				y.change_right_child(new_element);
			}
			//else do the following
			else {
				
				//add to left
				y.change_left_child(new_element);
				
				
			}

			//also change parent of new_element
			new_element.change_parent(y);
			
			//change height of the z
			y.change_height(2);
			
			//define new variable to store parent
			anode<E> z = y.show_parent();
			
			
			//now if y is root all things are sorted
			if( y != root) {
				
				//define a as
				anode<E> a = z.show_parent();
				
				//now chnage height of z
				z.change_height(3);
				
				//now change z isavl condition
				if (z.show_right_child() == null || z.show_left_child() == null ) {
					
					//change avl condition
					z.change_isavl(false);
					
				}
			
				//now check for above tree
				//see the first problem in tree
				while(a != null && z.isavl() == true ) {

					//change height of parent
					a.change_height(Math.max(z.show_height() + 1,a.show_height()));
					
					//change avl condition of a
					//if right child is not null
					if(a.show_right_child() != null && a.show_left_child() != null) {
					
						//change avl condition
						a.change_isavl(Math.abs(a.show_left_child().show_height() - a.show_right_child().show_height()) < 2);
					}	
					//else do the both child eyist and will go forward
					else{
						
						//change avl condition
						a.change_isavl(z.show_height() < 2);
					}			
					// now change y
					x = y;
					
					//go for parent
					y = z;
				
					//and now change a
					z = a;
				
					//and change a
					a = a.show_parent();
					}
				
				
				//need to rotate the tree
				dir = z.show_id() - y.show_id();
				
				//now define dir2
				long dir2 = y.show_id() - x.show_id();
				
				//if 
				if(z.isavl() == false) {
						
					//change isavl case of z
					z.change_isavl(true);	
					
					//check conditions on dir and dir2
					if (dir*dir2 > 0) {
						
						//change height of z
						z.change_height(z.show_height() - 2);
						
						//some common functions are
						y.change_parent(z.show_parent());
						
						//change parent of z
						z.change_parent(y);
						
						//if y is left child then
						if (dir > 0) {
							
							//then it follows x is left child
							//now inorder is x , y, z
							//so y will come in middle and x on left and z in right
							//check right child of y	
							
							//now add it left child of z
							z.change_left_child(y.show_right_child());
										
							//change right child of y
							y.change_right_child(z);
							
						
			
							if (z.show_left_child() != null) {
								
								//change parent of left child of z
								z.show_left_child().change_parent(z);					
							}			
						}
						//in this case the thing looks like 
						// x- right , y , z - left
						else {

							//then it follows x is right child
							//now inorder is z, y, x
							//so y will come in middle and z on left and x in right
							//check left child of y
							//now add it left child of z
							z.change_right_child(y.show_left_child());
							
							//change right child of y
							y.change_left_child(z);
			
			                //if left child is not null
						
							if (z.show_right_child() != null) {
								
								//change parent of left child of z
								z.show_right_child().change_parent(z);
							}
							
						}
			
					}
					//else dir*dir1 <0 then
					else {
						
						//change height of z
						z.change_height(z.show_height() - 2);
					
						//change height of x
						x.change_height(x.show_height() + 1);
						
						//now change height of y
						y.change_height(y.show_height() - 1);
						
						//some common functions are
						x.change_parent(z.show_parent());
						
						//now change parent of z
						z.change_parent(x);
						
						//change parent of y
						y.change_parent(x);
						
							
						//if y is left child then
						if (dir < 0) {
							
							//then it follows x is left child
							//now in order is z,x,y
							//so x will come in middle and z on left and y in right
							//check  children of x
								
							//now add it left child of z
							z.change_right_child(x.show_left_child());
								
							//change left child of y
							y.change_left_child(x.show_right_child());
						
							//now change child of x
							x.change_right_child(y);
							
							//and left child as
							x.change_left_child(z);
							
							//both will equal if they have null
							if (z.show_right_child() != null) {
							    	
								//change their parent
								z.show_right_child().change_parent(z);}
							if (y.show_left_child() != null) {
								//and left child as
								y.show_left_child().change_parent(y);	
							
						}}
						//else the in order traversal is
						// y,x,z
						else {
							
							//now add it left child of z
							z.change_left_child(x.show_right_child());
								
							//change left child of y
							y.change_right_child(x.show_left_child());
						
							//now change child of x
							x.change_left_child(y);
							
							//and left child as
							x.change_right_child(z);
							
							//both will equal if they have null
							if (z.show_left_child() != null) {
							    	
								//change their parent
								z.show_left_child().change_parent(z);}
							if (y.show_right_child() != null) {
								//and left child as
								y.show_right_child().change_parent(y);	
							
						}
							
						}
					}
					//now if a is null then
					if (a != null) {
						
						//now change a's child
						if (dir*dir2 >0) {
							//change child of a
							if (a.show_left_child() == z) {
								
								//change left child of a
								a.change_left_child(y);
							}
							
							//else left child
							else {
								
								//change right child
								a.change_right_child(y);		
							}
						}
						//else x is child
						else {
							//change child of a
							if (a.show_left_child() == z) {
								
								//change left child of a
								a.change_left_child(x);
							}
							
							//else left child
							else {
								
								//change right child
								a.change_right_child(x);
							}
						}
					}
					//now if a is null the
					if (a == null) {
					
						//check dir*dir2
						if (dir*dir2 > 0) {
							
							//make y as root
							root = y;
						}
						//else do the following
						else {
							
							//make x as root
							root = x;
						}
					}
				}
			}
		}
		
		//define function to delete
		public void delete_element(long sid) {
		
			//now define a node y
			anode<E> y = root;
			
			//define a variable dir as
			long dir = y.show_id() - sid;
			
			//now search for int sid
			while((dir < 0 && y.show_right_child() != null)||
					dir > 0 && y.show_left_child() != null) {
				
				//if dir < 0 go for right child
				if (dir < 0) {
					
					//just go for right child
					y = y.show_right_child();
				}
				//for left one
				else {
					
					//left one child
					y = y.show_left_child();
				}
				//change dir
				dir = y.show_id() - sid;
			}
			//if dir != 0 we have error
			if (dir != 0 ) {
				
				//throw error
				throw new NoSuchElementException("no such element found");
			}
			
			//else go for three cases
			else {
				
				//if we have both left child and left child have
				if (y.show_left_child() != null && y.show_right_child() != null ) {
					
					//go for in order traversal from y
					anode<E> temp = y.show_right_child();
					
					//now while temp.leftchild != null go like this
					while( temp.show_left_child() != null) {
						
						//go for left child of temp
						temp = temp.show_left_child();
					}
					
					//now just change the node positions
					y.change_element(temp.show_element());
					
					//now change id
					y.change_id(temp.show_id());
					
					if (y.show_id() == y.show_right_child().show_id()) {
					
						//change child of temp parent
						y.change_right_child(temp.show_right_child());
					}
					//else do the following thimg
					else {
						
						//change the right child
						temp.show_parent().change_left_child(temp.show_right_child());
					}
					if (temp.show_right_child() != null) {
						
						//then do the following thing
						temp.show_right_child().change_parent(temp.show_parent());
					}
				}
				//if both child are null
				else if(y.show_left_child() == null && y.show_right_child() == null) {
					
					//check root condition
					if(y != root) {
						
						//redefine dir
						dir = y.show_id() - y.show_parent().show_id();
						
						//just change the parents child
						if (dir > 0 ) {
							//change right child
							y.show_parent().change_right_child(null);
						}
						//else left child
						else {
							
							//change left child
							y.show_parent().change_left_child(null);
						}
					}
				}
				
				//now if only left child is null
				else if (y.show_left_child() == null) {
					
					//just change right child of 
					y.show_right_child().change_parent(y.show_parent());
					
					//check if y is root or not
					if(y != root) {
						//redefine dir
						dir = y.show_id() - y.show_parent().show_id();
						
						//now if dir > 0 then it is right child
						if (dir > 0 ) {
							
							//change right child
							y.show_parent().change_right_child(y.show_right_child());
						}
						//else change left child
						else {
							
							//change left child
							y.show_parent().change_left_child(y.show_right_child());
						}
					}
					//if y == root then
					else {
						
						//make right child as root
						root = y.show_right_child();
						
					}
				}
				//now if only left child is null
				
				else if (y.show_right_child() == null) {
					y.show_left_child().change_parent(y.show_parent());
					//check if y is root or not
					if(y != root) {
						
						//redefine dir
						dir = y.show_id() - y.show_parent().show_id();
					
						
						//now if dir > 0 then it is right child
						if (dir > 0 ) {
		
							//change right child
							y.show_parent().change_right_child(y.show_left_child());
							
						}
						//else change left child
						else {
							
							//change left child
							y.show_parent().change_left_child(y.show_left_child());
						}
					
					}
					//if y == root then
					else {
						
						//make right child as root
						root = y.show_left_child();
							
						
					}
				}
				
				//declare z as
				anode<E> z;
				
				//define z as
				if (y.show_parent() == null) {
					
					//then define z as
					z = root;
				}
				//else it is parent
				else {
					
					//define a as
					z = y.show_parent();
					
				}
				
				//now check height of z
				//if height of z > 2 we have problem
				if (z.show_height() > 2) {
					
					//now change the avl conditon 
					//and rotate the tree
					if(z.show_left_child() == null) {	
						//chabge y as
						y = z.show_right_child();
						
						//change height of z
						z.change_height(1);
						
						//change child of z
						z.change_right_child(null);
						
						//define x as
						anode<E> x = y.show_left_child();
						
						if (x == null) {
							
							//chabge left child of y
							y.change_left_child(z);
								
							//then change parent of right child
							y.change_parent(z.show_parent());
				
							if (z != root) {
								if (z.show_parent().show_id() - z.show_id() > 0) {
									z.show_parent().change_left_child(y);
								}
								else {
									z.show_parent().change_right_child(y);
								}
							}
							//change parent of z
							z.change_parent(y);
						}
						//else do the following
						else {
							//now change accordingly
							x.change_parent(z.show_parent());
							if (z != root) {
								if (z.show_parent().show_id() - z.show_id() > 0) {
									z.show_parent().change_left_child(x);
								}
								else {
									z.show_parent().change_right_child(x);
								}
							}
							
							//change parent of z
							z.change_parent(x);
							
							//change parent of y
							y.change_parent(x);
							
							//change left child of y
							y.change_left_child(null);
							
							//change child of x
							x.change_right_child(y);
							x.change_left_child(z);
							
							//see right child of y 
							if(y.show_right_child() == null) {
								
								//change height of y
								y.change_height(1);
								
								//change height of x
								x.change_height(2);
							}
							//else do following thing
							else {	
								//do as
								x.change_height(3);
							}
						}	
					}
					//now change the avl conditon 
					//and rotate the tree
					else if(z.show_right_child() == null) {
						
						//chabge y as
						y = z.show_left_child();
						//change height of z
						z.change_height(1);
						
						//change child of z
						z.change_left_child(null);
						
						//define x as
						anode<E> x = y.show_right_child();
				
						if (x == null) {
							
							//chabge left child of y
							y.change_right_child(z);
								
							//then change parent of right child
							y.change_parent(z.show_parent());
							if (z != root) {
								if (z.show_parent().show_id() - z.show_id() > 0) {
									z.show_parent().change_left_child(y);
								}
								else {
									z.show_parent().change_right_child(y);
								}
							}
						
							//change parent of z
							z.change_parent(y);
						}
						//else do the following
						else {
							
							//now change accordingly
							x.change_parent(z.show_parent());
							if (z != root) {
								if (z.show_parent().show_id() - z.show_id() > 0) {
									z.show_parent().change_left_child(x);
								}
								else {
									z.show_parent().change_right_child(x);
								}
							}
							
							//change parent of z
							z.change_parent(x);
							
							//change parent of y
							y.change_parent(x);
							
							//change left child of y
							y.change_right_child(null);
							
							//change child of x
							x.change_right_child(z);
							x.change_left_child(y);
							
							//see right child of y 
							if(y.show_left_child() == null) {
							
								//change height of y
								y.change_height(1);
								
								//change height of x
								x.change_height(2);
							}
							//else do following thing
							else {
								
								//do as
								x.change_height(3);
							}
						}			
					}
					else {
						z.change_height(Math.max(z.show_right_child().show_height(), z.show_left_child().show_height()) + 1);
					}
					//check condition for root
					if (z != root) {
						
						//now z has parent then
						z = z.show_parent();
						
						//change x as
						anode<E> x = z.show_left_child();
						
						//define y child as
						y = z.show_right_child();
						
						//the two variables
						int a = 0;
						int b = 0;
						
						//define two variables as 
						if (x != null) {
							
							//then
							 a = x.show_height();
						}
						//amd if v is null
						if (y != null) {
							
							//then
							b = y.show_height();
						}
						
						//now run while loop
						while(z == null || z.show_height() != Math.max(a,b) +1) {
							
						
							//now change height of z
							z.change_height(Math.max(a,b) +1);
							
							//now check avl conition
							if (Math.abs(a - b) > 1) {
								
								//check which one is problem
								if (a > b) {
									
									int lx = 0;
									int ly = 0;
									
									
									//now x is taller child
									//check right child and left child
									if (x.show_left_child() != null) {
										
										//again take taller child
										lx = x.show_height() - x.show_left_child().show_height();
									}	
									//check condition on dir
									if (x.show_right_child() != null) {
										ly = x.show_height() - x.show_right_child().show_height();
									}
									if (lx <= ly) {	
											
										//common thing
										z.change_left_child(x.show_right_child());
										x.change_parent(z.show_parent());
										
										//now on right child make comment
										if (z.show_left_child() != null) {
											
											//just do this
											z.show_left_child().change_parent(z);
											
											if (z.show_left_child().show_height() == a - 1) {
												
												//change heights as
												z.change_height(a);
												x.change_height(a+1);
											}
											else {
												z.change_height(a-1);
												x.change_height(a);
											}
										}	
												
										//change parent of y and z
										z.change_parent(x);
										x.change_right_child(z);
										z = x.show_parent();
										if (z != null) {
											if(z.show_id() - x.show_id() > 0) {
												z.change_left_child(x);
											}
											else {
												z.change_right_child(x);
											}
										}
										else {
											root = x;
										}
									}
									//now in other conditions
									else {
										y = x.show_right_child();
										y.change_parent(z.show_parent());
										x.change_parent(y);
										z.change_parent(y);
										x.change_right_child(y.show_left_child());
										y.change_left_child(x);
										z.change_left_child(y.show_right_child());
										y.change_right_child(z);
										z.change_height(b+1);
										y.change_height(a);
										x.change_height(b+1);
										
										//now null conditions
										if (x.show_right_child() != null) {
											
											//change parent
											x.show_right_child().change_parent(x);
												}
										//now null conditions
										if (z.show_left_child() != null) {
											
											//change parent
											z.show_left_child().change_parent(z);
										}
										z = y.show_parent();
										if (z != null) {
											if(z.show_id() - y.show_id() > 0) {
												z.change_left_child(y);
											}
											else {
												z.change_right_child(y);
											}
										}
										else {
											root = y;
										}
									}
								}
								//now other way round
								else if (a < b) {
									int lx = 0;
									int ly = 0;
								
									
									//now x is taller child
									//check right child and left child
									if (y.show_right_child() != null) {
										
										//again take taller child
										lx = y.show_height() - y.show_right_child().show_height();
									}	
									//check condition on dir
									if (y.show_left_child() != null) {
										ly = y.show_height() - y.show_left_child().show_height();
									}
									//check condition on dir
									if (lx <= ly) 			//common thing
										z.change_right_child(y.show_left_child());
										y.change_parent(z.show_parent());
										
										//now on right child make comment
										if (z.show_right_child() != null) {
											
											//just do this
											z.show_right_child().change_parent(z);
											
											if (z.show_right_child().show_height() == b - 1) {
												
												//change heights as
												z.change_height(b);
												y.change_height(b+1);
											}
											else {
												z.change_height(b-1);
												y.change_height(b);
											}
										}	
												
										//change parent of y and z
										z.change_parent(y);
										y.change_left_child(z);
										z = y.show_parent();
										if (z != null) {
											if(z.show_id() - y.show_id() > 0) {
												z.change_left_child(y);
											}
											else {
												z.change_right_child(y);
											}
										}
										else {
											root = y;
										}
									}
									//now in other conditions
									else {
										x = y.show_left_child();
										x.change_parent(z.show_parent());
										y.change_parent(x);
										z.change_parent(x);
										y.change_left_child(x.show_right_child());
										x.change_right_child(y);
										z.change_right_child(x.show_left_child());
										x.change_left_child(z);
										z.change_height(a+1);
										x.change_height(b);
										y.change_height(a+1);
										
										//now null conditions
										if (y.show_left_child() != null) {
											
											//change parent
											y.show_left_child().change_parent(y);
												}
										//now null conditions
										if (z.show_left_child() != null) {
											
											//change parent
											z.show_left_child().change_parent(z);
										}
										z = x.show_parent();
										if (z != null) {
											if(z.show_id() - x.show_id() > 0) {
												z.change_left_child(x);
											}
											else {
												z.change_right_child(x);
											}
										}
										else {
											root = x;
										}
									}
								}
						
								a = 0;
								b = 0;
							x = z.show_left_child();
							y=z.show_right_child();
							if (x != null || y != null) {
								if (x != null) {
							a = x.show_height();}
								if (y != null) {
									b = y.show_height();
								}
								}
							
							 
				
						}
					}
					if (z == root && z.show_parent() != null) {
						root = z.show_parent();
					}
				}
			}
		}
		
		public atree (anode<E> x){
			root = x;
		}
		//make static function for inorder traversal

	}

        
		atree<dustbin> bin_tree;
		
		atree<object> object_tree;
		
		atree<atree<dustbin>> capacity_tree;
		
		anode<atree<dustbin>> max_anode;
		
		public void add_bin(long nid , int capacity) {
			//first create a bin
			dustbin new_bin = new dustbin(nid , capacity);
			
			//add it do bin tree
			bin_tree.add_element(new anode<dustbin> (new_bin, nid));
			
			//now find a node in capacity tree with same capacity and add it to the new tree
		     try {
		    	//just search and add new_bin to it
		    	 capacity_tree.search_element(capacity).show_element().add_element(new anode<dustbin> (new_bin, nid));
		     }
		
		     
		     catch (Exception e){
		    	 //or else define new anode of capacity tree and add the node
		    	 //first define the anode for tree
		    	 anode<dustbin> for_tree = new anode<>(new_bin, nid);
		    	 
		    	 //define tree on this
		    	 atree<dustbin> tree_of_new = new atree<dustbin>(for_tree);
		    	 
		    	 //now define the anode for capacity tree
		    	 anode<atree<dustbin>> for_capacity_tree =  new anode<atree<dustbin>>(tree_of_new, capacity);
		    	 //add this node to capacity tree
		    	 capacity_tree.add_element(for_capacity_tree);
		    	 
		    	 //check max_condition
		    	 if(max_anode.show_id() < capacity ) {
		    		 max_anode = for_capacity_tree;
		    	 }
		     }
		     
	}
		public long add_object(long obj_id , int s) {
			//check for valid object
			if(s <= max_anode.show_id()) {
				//define the destined tree
				atree<dustbin> destined_tree = max_anode.show_element();
				
				//now create new object
				dustbin bin_obj_add = destined_tree.root.show_element();
				
				//first crate object
				object new_object = new object(obj_id, s, bin_obj_add);
				
				//now add object to it
				bin_obj_add.add_object(new_object);
				
				//now just add this bin to capacity tree
				anode<dustbin> new_anode_of_bin = new anode<>(bin_obj_add, bin_obj_add.show_id());
		
				//now search for same capacity node in 
				try {
					//just search and add
					capacity_tree.search_element(bin_obj_add.show_curr_capacity()).show_element().add_element(new_anode_of_bin);
					
				}
				//else
				catch(Exception e) {
					//create new capacity anode and add to tree
					atree<dustbin> new_tree = new atree<>(new_anode_of_bin);
					
					//make capacity anode
					anode<atree<dustbin>> new_capacity_node = new anode<>(new_tree, bin_obj_add.show_curr_capacity());	
				
					//add this to capacity tree
					capacity_tree.add_element(new_capacity_node);
					
					
					}
				
				
				
				//now shift bin from one node to other in capacity tree
				if (destined_tree.root.show_height() != 1) {
					
					//delete root from tree
					destined_tree.delete_element(bin_obj_add.show_id());
					
					
				}
				//else we have only on node in atree
				else {	
					//just delete the node as
				
					capacity_tree.delete_element(max_anode.show_id());
				
			
					//now search for new max bin
					max_anode = capacity_tree.root;
					//now while the right child is not null do
					while(max_anode.show_right_child() != null) {
						//change max anode as
						max_anode = max_anode.show_right_child();
					}
						
				}
				//check if object_tree is not null
				anode<object> object_anode = new anode<>(new_object, obj_id);
				if (object_tree != null) {
					
					object_tree.add_element(object_anode);
				}
				//make new tree
				else {
					object_tree = new atree<>(object_anode);
				}
				//return id of bin
				return(bin_obj_add.show_id());
			}
			//else throe exception
			else {
				throw new NoSuchElementException("the invalid object");
			}
			
		}
		public long delete_object(long obj_id) {
			//first search element in the object tree
			object to_delete = object_tree.search_element(obj_id).show_element();
			
			//now just see its bin
			dustbin its_bin = to_delete.show_bin();
			int temp = its_bin.show_curr_capacity();
			//define the destined tree
			atree<dustbin> destined_tree = capacity_tree.search_element(temp).show_element();
			//delete object from tree and bin

			its_bin.delete_object(to_delete);
			
			if (object_tree.root.show_height() != 1) {
				
				object_tree.delete_element(obj_id);
				
			}
			else {
				
				object_tree = null;
			}
			//find the tree which stoes the dustbin
			//now just add this bin to capacity tree
			anode<dustbin> new_anode_of_bin = new anode<>(its_bin, its_bin.show_id());
			
			//now search for same capacity node in 
			
			try {
				//just search and add
				capacity_tree.search_element(its_bin.show_curr_capacity()).show_element().add_element(new_anode_of_bin);
			
			}
			//else
			catch(Exception e) {
				//create new capacity anode and add to tree
				atree<dustbin> new_tree = new atree<>(new_anode_of_bin);
				
				//make capacity anode
				anode<atree<dustbin>> new_capacity_node = new anode<>(new_tree, its_bin.show_curr_capacity());	
			
				//add this to capacity tree
				capacity_tree.add_element(new_capacity_node);
				
				}
			if (destined_tree.root.show_height() != 1) {
				
				//delete root from tree
				destined_tree.delete_element(its_bin.show_id());
				
				
			}
			//else we have only on node in atree
			else {	
				capacity_tree.delete_element(temp);
				
				
			}
					max_anode = capacity_tree.root;
					while(max_anode.show_right_child() != null) {
						max_anode = max_anode.show_right_child();
					}
				
		
		
		
		
			return(its_bin.show_id());
		}
		public List<object> content(long nbin_id) {
			dustbin x = bin_tree.search_element(nbin_id).show_element();
			x.print_object();
			return(x.show_object());
		}
		public BestFit(long bin_id , int bin_size ) {
			dustbin x = new dustbin(bin_id , bin_size);
			anode<dustbin> for_bin_tree = new anode<>(x,bin_id);
			bin_tree = new atree<>(for_bin_tree);
			anode<atree<dustbin>> for_capacity_tree = new anode<>(new atree<>(for_bin_tree), bin_size);
			capacity_tree = new atree<>(for_capacity_tree);
			max_anode = new anode<>(new atree<>(for_bin_tree), bin_size);
		}



		public static void main (String args[]) {
			
			
			
			try {
			FileInputStream in = new FileInputStream("input.txt");
			Scanner scanf = new Scanner(in);
			String temp = scanf.nextLine();
			long z = Long.parseLong(temp);
			temp = scanf.nextLine();
			String[] tempa = temp.split(" ");
			BestFit x = new BestFit(Long.parseLong(tempa[1]), Integer.parseInt(tempa[2]));
			for(long i = 1L ; i <=  z ; i ++) {
				System.out.println(i);
				temp = scanf.nextLine();
				tempa = temp.split(" ");
				switch(tempa[0]) {
				
				case "1":
					x.add_bin(Long.parseLong(tempa[1]), Integer.parseInt(tempa[2]));

					break;
				case "2":
					x.add_object(Long.parseLong(tempa[1]), Integer.parseInt(tempa[2]));

					break;
				case "3":
				     x.delete_object(Long.parseLong(tempa[1]));

					break;
				case "4":
		             x.content(Long.parseLong(tempa[1]));
					break;
		
				}
			/*2 45 34*/	
			
			}
			

			
			
			}
			catch (FileNotFoundException e1) {
				System.out.println("file not found");
			}
		
		}
	
}
