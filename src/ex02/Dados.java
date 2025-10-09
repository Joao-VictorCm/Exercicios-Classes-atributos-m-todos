package ex02;

public class Dados {
	public String name;
	public double grossSalary;
	public double tax;
	public double porcent;
	
	
	public double netSalary() {
		return grossSalary - tax;
	};
	
	public double increasesalary(double porcent) {
		this.porcent = porcent;
		return (porcent / 100) * grossSalary + grossSalary - tax;
		
	};
	
	public String toString() { 
		return "Dados atualizados: " +name+ ", $"+increasesalary(porcent);
	}

}
