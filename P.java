package Tiendita;

import java.util.Scanner;

public class P {

	
	double Contador= 8000,Secretario=5000,Limpieza=3000,Traductor=7500,Diseñador=6000;
	double sindicato=1,montoINSS,Deducciones;
	//horas extras 100;
	int horas;
	double horasExtr,TotalDeducciones;
	double INSS=4;
	double IR,IR1=15.6;
	int h;
	double SalarioBruto,Extra,Salario;
	double salarioNeto,montoSind;
  
	
	public void MostrarEmpleados() {
		
		String Empleados []=new String[10];
		String Cargo[]=new String[10];
		
		Empleados[0]="Alejandro Bustamante";
	    	Cargo[0]="Contador";
		
		Empleados[1]="Pedro soza";
		    Cargo[1]="Limpieza";
		
		Empleados[2]="Alejandra Rosales";
		    Cargo[2]="Abogada";
		
		Empleados[3]="Maria Baltodano";
		    Cargo[3]="Secretaria";
		
		Empleados[4]="Julio Suarez";
		    Cargo[4]="Diseñador";
		
		Empleados[5]="Mario Mendez";
		    Cargo[5]="Traductor";
		
		Empleados[6]="Nallely Altamirano";
		    Cargo[6]="Gerente";
		
		Empleados[7]="Andrea Monterrosa";
			Cargo[7]="Ingeniera";
		
		Empleados[8]="Marvin Flores";
			Cargo[8]="Supervisor";
		
		Empleados[9]="Ana Flores";
			Cargo[9]="Limpieza";
		
		System.out.println( "_________________________________________________________");
		System.out.println("         Empleados   "+"\t"+"                Cargo");	
		System.out.println("||_________________________________________________________||");
		
		for (int i=0;i<Empleados.length;i++) {
			
			
			System.out.print(Empleados[i]);
             System.out.print("\t" );
             System.out.print("\t");
			System.out.println("   \t"+ Cargo[i]);
			
		}
	}
	
	
	/////////////////////////////////////
	public void MostrarPagosPorCargos() {
		String PagoPorCargo[]=new String[9];
		PagoPorCargo[0]="Contador/a  : 8000";
		PagoPorCargo[1]="Limpieza    : 3000";
		PagoPorCargo[2]="Abogado/a   : 10000";
		PagoPorCargo[3]="Secretario/a: 5000";
		PagoPorCargo[4]="Diseñador/a : 6000";
		PagoPorCargo[5]="Traductor/a : 7500";
		PagoPorCargo[6]="Gerente     : 10000";
		PagoPorCargo[7]="Ingeniero/a : 15000";
		PagoPorCargo[8]="Supervisor/a: 9000";
		
		for(int i1=0;i1<PagoPorCargo.length;i1++) {
			System.out.println("\t"+"\t"+PagoPorCargo[i1]);
		}
		
		
	}

	////////////////////////////////////////
	
	public void pago() {

		Scanner lector=new Scanner(System.in);
		
		int c=0;
		System.out.println("_________Pago de Planilla de trabajadores____________");
		System.out.println("");
		
		
		String Empleados []=new String[10];
		String Cargo[]=new String[10];
		
		Empleados[0]="Alejandro Bustamante";
		Cargo[0]="Contador";
		
		Empleados[1]="Pedro soza";
		Cargo[1]="Limpieza";
		
		Empleados[2]="Alejandra Rosales";
		Cargo[2]="Abogada";
		
		Empleados[3]="Maria Baltodano";
		Cargo[3]="Secretaria";
		
		Empleados[4]="Julio Suarez";
		Cargo[4]=" Diseñador";
		
		Empleados[5]="Mario Mendez";
		Cargo[5]="Traductor";
		
		Empleados[6]="Nallely Altamirano";
		Cargo[6]="Gerente";
		
		Empleados[7]="Andrea Monterrosa";
		Cargo[7]="Ingeniera";
		
		Empleados[8]="Marvin Flores";
		Cargo[8]="Supervisor";
		
		Empleados[9]="Ana Flores";
		Cargo[9]="Limpieza";
		
			
		String PagoPorCargo[]=new String[9];
		PagoPorCargo[0]="Contador/a  : 8000";
		PagoPorCargo[1]="Limpieza    : 3000";
		PagoPorCargo[2]="Abogado/a   : 10000";
		PagoPorCargo[3]="Secretario/a: 5000";
		PagoPorCargo[4]="Diseñador/a : 6000";
		PagoPorCargo[5]="Traductor/a : 7500";
		PagoPorCargo[6]="Gerente     : 10000";
		PagoPorCargo[7]="Ingeniero/a : 15000";
		PagoPorCargo[8]="Supervisor/a: 9000";
		
		for(int i1=0;i1<PagoPorCargo.length;i1++) {
			System.out.println("\t"+"\t"+PagoPorCargo[i1]);
		}
		System.out.println("\n");
		
		for (int i=0;i<Cargo.length;i++) {
			System.out.println("\t"+i+"\t"+Cargo[i]);
			
			
			
		System.out.println("\n");
			
	    System.out.println("Cual es el salario de "+Empleados[i]+"  segun la tabla anterior?");
	    System.out.println("Ingrese salario Bruto: ");
	    SalarioBruto=lector.nextDouble();
	    System.out.println("Trabajó Horas Extras?"+"\n"+"1. si"+"\n"+"2. No");
	  h=lector.nextInt();
		if(h==1) {
		System.out.println("Ingrese la cantidad de horas extras en el mes");
		horas=lector.nextInt();
					
					
		}else
		if(h>2) {
		System.out.println("Ingrese lo que se le pide, nada mas");
					}	

		horasExtr=horas*100;
		//Extra=SalarioBruto+horasExtr;
		montoSind=Salario*(sindicato/100);
				
    	double salarioNeto[]=new double[10];
		Salario=horasExtr+SalarioBruto; 
		if(Salario>=10000) {
		IR=Salario*(IR1/100);
				}
				
		montoINSS=Salario*(INSS/100);
		//	horasExtr++;
		TotalDeducciones=montoINSS+IR-montoSind;
				
				salarioNeto[i]=Salario-TotalDeducciones;
				System.out.println("Salario Neto de "+Empleados[i]+"es: "+salarioNeto[i]);
				System.out.println("\n");
				
			
			
		}
			

		
	}

	///////////////////////////////////////






public static void main(String[] args) {
	
/////////////////////////////////////////////////////////
	//VARIABLES///
boolean	continuar=false;
int opc = 0,opcion = 0;
///////////////////////////////////////////
Scanner lector=new Scanner(System.in);
////////////////////////////////////////////

do {
	do {
	 try {
			continuar=false;
			
			System.out.println("__________Pago de Planilla de Empleados____________"+" \n"+"___________________________________");
		System.out.println();
					System.out.println("1.Mostrar Lista de Empleados");
					System.out.println("2.Realizar Pagos");
					System.out.println("3.Mostar total de pagos"); 
					opc=lector.nextInt();
		 }catch (Exception a) {
				System.out.println("Error!, no puede ingresar letras ni simbolos");
				lector.next();
		continuar=true;
			}
}while(continuar);

 ////////////
	////////////////
	///////////////////
	
 switch(opc) {
 
 case 1: 
         P p=new P();
         p.MostrarEmpleados();
	break;
	
 case 2:
		P p1=new P();
	    p1.pago();
	 break;
	 
 case 3:
	

	 break;

	
		}

 
 
 
 
	 
 boolean seg;
 ////////////////////////
 ///////////////////////
	do {
	 try {
		 seg=false;
						
		Scanner lector1=new Scanner(System.in);
				
					/*		System.out.println();
							System.out.println(); */
		
		System.out.println("Opcion 1: Continuar con el programa");
		System.out.println("Opcion 2: Salir del programa");
		System.out.print("Opcion : ");
		opcion = lector1.nextInt();
		System.out.println("\n");
		if (opcion <= 0) {
		while (opcion<= 0) {
		System.out.println("Ha ingresado una opcion invalida");
		System.out.print("Opcion : ");
		opcion = lector1.nextInt();
		while (opcion >= 3) {
	    System.out.println("Usted ha ingresado una opcion invalida, favor ingrese una opcion valida");
	    System.out.print("Opcion : ");
		opcion = lector1.nextInt();
							
                       }
				}
		}
		
		if(opcion==2) {
		System.out.println("Gracias por utilizar el programa");
		System.out.println();
						}
					
		
	 }catch (Exception a) {
	 System.out.println("Error, no puede ingresar letras ni simbolos");
	 System.out.println("\n");
	  seg= true;
		}
	}while(seg);		
						
						 
    }while(opcion==1);
			

   	}/////////////main

}
