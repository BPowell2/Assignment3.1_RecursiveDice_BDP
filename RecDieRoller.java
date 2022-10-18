/* this is the recursive die roller class
 * 10/18/22
 * @author Benjamin Powell
 * @version 1.0
 * @since 2022-18-10
 */

import java.util.Random;

	public class RecDieRoller {
		
		
		/*this method allows you to put in any number on a die and set it as a target to be rolled as many times as you set totalrolls 2
		 * @params Target , Totalrolls , meanfinder , timesRolled
		 */
		public static void diceRoll(int Target , int Totalrolls, double meanFinder, int timesRolled ) {
			
			
			
			
			
			Random Select = new Random();
			
			int Selected = Select.nextInt(7);
			
			System.out.println(Selected);
			
				if(Selected == Target && Totalrolls != 0) {
				
					System.out.println("congrats you rolled a  "+Selected);
					System.out.println(timesRolled+" is the amount of rolls it took to get "+ Selected);
					meanFinder = meanFinder + timesRolled;
					timesRolled = 0;
					
					diceRoll(Target, Totalrolls -1, meanFinder, timesRolled);
					
				
				
				
				}//end of if
				if(Selected != Target && Totalrolls != 0) {
					
					timesRolled++;
					diceRoll(Target, Totalrolls, meanFinder, timesRolled);
					
					
					
				}//end of if
				
				if(Totalrolls==0) {
					
					System.out.println("the mean amount it took to get the target was "+meanFinder/100);
					
				}//end of if 
				
			
			
			
			
			
					
		}//end of diceRoll method

}//end of class 
