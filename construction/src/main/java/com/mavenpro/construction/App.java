package com.mavenpro.construction;

public class App 
{
	public double cost(String material,double area,boolean automation) {

		if(material.equals("Standard") && automation==false) {

			return 1200*area;
		}
		else if(material.equals("AboveStandard") && automation==false) {
			return 1500*area;
		}
		else if(material.equals("HighStandard") && automation==false) {
			return 1800*area;
		}
		else {
			return 2500*area;
			}
		}
}
