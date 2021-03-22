package POO;

import java.util.Scanner;

public class POO 
{
	public static void main(String[] args)
	{
	Scanner ler = new Scanner(System.in);	
	int php,pmr,parm,cpuhp,cpuap,cpuad,cpuarm,cpumr,atk;
	double crit1,crit2,cpuhpr = 0,phpr = 0,pad,pap;
	crit1 = 1.5;
	crit2 = 2.0;

	php = 500;
	pad = 15;
	pap = 5;
	parm = 4;
	pmr = 10;

	cpuhp = 515;
	cpuap = 16 ;
	cpuad = 7;
	cpuarm = 5;
	cpumr = 5;
	
	do {

	System.out.println("Escolha seu ataque ");
	System.out.println("\nOpções: "+"\n1)Ataque Físico"+"\n2)Ataque Mágico"+"\n3)Ataque Crítico\n ");
	atk = ler.nextInt();
	switch(atk)
	{
	case 1:cpuhpr = (cpuhp-pad+cpuarm) ;
			System.out.println("HP inimigo restante: "+cpuhpr);
		break;
		 
	case 2:cpuhpr = (cpuhp-pap+cpumr);
	System.out.println("HP inimigo restante: "+cpuhpr);
		break;
		 
	case 3:cpuhpr = (cpuhp-(crit1*pad)+cpuarm);
	System.out.println("HP inimigo restante: "+cpuhpr);
		break;
	
	default : 
		System.out.println("n inválido");
		 
	}
	
	System.out.println("\nTurno da CPU");
	
	
	}
	while(cpuhpr>0 || phpr>0);

}
}