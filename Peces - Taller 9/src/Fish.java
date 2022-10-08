
public class Fish {
	     private String nombre;
		 private String typeOfFish;
		 private int friendliness;
		 	
		 	public Fish() {
		 		nombre="Desconocido";
		       typeOfFish="Desconocido";
		       friendliness=3;}
		 	
		       public Fish(String n,String t, int f) {
		    	   nombre=n;
		    	   typeOfFish=t;
			       friendliness=f;}
		    	
			public int getFriendliness() {
				return friendliness;
			}

			public void setFriendliness(int friendliness) {
				this.friendliness = friendliness;
			}

			@Override
			public String toString() {
				return "Fish [nombre=" + nombre + ", typeOfFish=" + typeOfFish + ", friendliness=" + friendliness + "]";
			}
		       
		      
		       }
		    



