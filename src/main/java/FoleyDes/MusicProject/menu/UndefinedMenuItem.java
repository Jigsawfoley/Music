package FoleyDes.MusicProject.menu;

import	java.util.Scanner;
public class UndefinedMenuItem implements IExecuatable	
{
				
	
	
	Scanner	input	=	new	Scanner(System.in);
				
	public	UndefinedMenuItem(){}
				
	
	public void	execute()	{	 	
						
		System.out.println("The	class	"	+	UndefinedMenuItem.class.getName()	+	"	is	a	placeholder	menu	item.");
		
		System.out.println("	\n	Press	enter	return	to	the	main	menu");
		
		this.input.nextLine();
							}
}