package principal;


import modelo.DataHora;

public class Main {

	public static void main(String[] args) {
		System.out.println("Boa noite");
		DataHora dtH1,dtH2;
		dtH1 = new DataHora(12,12,1950);
		dtH2 = new DataHora(12,12,1950,6,15,0);
		System.out.println("Data 1: ");
		System.out.println(dtH1);
		System.out.println("Data 2: ");
		System.out.println(dtH2);
		}

	}


