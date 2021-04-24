package Shape;

public class Shape {
		   private boolean filled;
		   private String color;

		   public Shape() {
		      filled = true;
		      color = "green";
		   }

		   public Shape(String colorIn, boolean filledIn) {
		       filled = filledIn;
		      color = colorIn;
		   }

		   public String getColor() {
		     return color;
		   }

		   public void setColor(String colorSetIn) {
		      color = colorSetIn;
		   }

		   public boolean isFilled()
		   {
		     if (filled == true)
		     {
		         return true;
		     }
		     else
		     {
		         return false;
		     }
		   }
		   
		   public void setFilled(boolean filledSetIn) {
		      filled = filledSetIn;
		   }
		   /**
		    * Create a new square at default position with default color.
		    */
		   public String toString()
		   {
		       String isNot = "";
		       if(isFilled() == false)
		       {
		           isNot = "not ";
		        }
		           return "A Shape with color of " + color + " and is " + isNot + " filled. ";
		        
	}
}