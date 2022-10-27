/* this is the recursive die roller class
 * 10/18/22
 * @author Benjamin Powell
 * @version 1.0
 * @since 2022-18-10
 */

import java.util.Random;

	public class RecDieRoller {
		
		

		/*this method allows you to put in any number on a die and set it as a target to be rolled as many times as you set totalrolls 2
		 * @params Target
		 */

		public static void diceRoll(int Target) {


			Random Select = new Random();

			int Selected = Select.nextInt(7);

			System.out.println(Selected);

			if(Selected != Target) {
				diceRoll(Target);
				}//end of while
					else {
						System.out.println("congrats you rolled a  "+Selected);
				}//end of else					
		}//end of diceRoll method

		public static void main(String [] args) {
			RecDieRoller.diceRoll(2);
		
			}//end of main
}//end of class 
