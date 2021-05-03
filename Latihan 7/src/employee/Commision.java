package employee;

public class Commision extends  Hourly{
	private  double  totalSales,commissionRate;

	public  Commision(String  eName,  String  eAddress,  String  ePhone,  String socSecNumber,  double  rate,  double  c)  {
	super(eName,  eAddress,  ePhone,  socSecNumber,  rate);
	this.commissionRate  =  c;
	//  TODO  Auto-generated  constructor  stub
	}

	public  double  getTotalSales()  {
	return  totalSales;
	}

	public  void  setTotalSales(double  totalSales)  {
	this.totalSales  =  totalSales;
	}

	public  double  getCommissionRate()  {
	return  commissionRate;
	}

	public  void  setCommissionRate(double  commissionRate)  {
	this.commissionRate  =  commissionRate;
	}

	public  void  addSales  (double  totalSales){
	this.totalSales  =  totalSales;
	}

	public  double  pay(){
	double  totalpay  =  super.pay()+commissionRate*totalSales; totalSales  =  0;
	return  totalpay;
	}

	public  String  toString()  {
	return  super.toString()+"\nTotal  Sales  :  "+totalSales;
	}

	}
