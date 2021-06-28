package javaCollection;

import java.util.*;

public class Uncle implements Comparable<Uncle>{
	 private String name;
	    private Map<Niece, String> presents = new HashMap<Niece, String>();

	    public void setName(String name)
	    {
	        this.name = name;
	    }

	    public String getName()
	    {
	        return this.name;
	    }

	    public Map<Niece, String> getPresents()
	    {
	        return this. presents;
	    }

	    public boolean addPresent(Niece recipient, String description)
	    {
	        if(!presents.containsValue(description) && !recipient.getPresents().containsValue(description) || description == null)
	        {
	            presents.put(recipient, description);
	            recipient.getPresents().put(this, description);
	            return true;
	        }
	        return false;
	    }

	    public void listPresents()
	    {
	        System.out.println("=========================================");
	        System.out.println("Daftar hadiah dari : " + this.name + ":");
	        for (Map.Entry<Niece, String> entry : presents.entrySet()) 
	        {
	            System.out.print("- ");
	            System.out.print((entry.getValue()==null ? "Tidak ada hadiah untuk " : entry.getValue() + " untuk "));
	            System.out.println(entry.getKey().getName());
	        }
	    }

	    @Override
	    public String toString()
	    {
	        return "nama: " + name;
	    }

	    @Override
	    public boolean equals(Object other)
	    {
	        if(other == this) return true;
	        if(other == null) return false;
	        if(getClass() != other.getClass()) return false;
	        return name.equals(((Uncle)other).name);
	    }

	    @Override
	    public int hashCode()
	    {
	        return name.hashCode();
	    }

	    @Override
	    public int compareTo(Uncle other)
	    {
	        return name.compareTo(other.name);
	    }
}
