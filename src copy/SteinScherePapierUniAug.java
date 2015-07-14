import java.util.Random;
import javax.swing.JOptionPane;
public class SteinScherePapierUniAug {
public static void main(String[] args) {
String[] values = { "Stein", "Schere", "Papier" };
Object selectedValue = values[0];
String message = new String();
int machineSelection, userWins = 0, computerWins = 0, equal = 0;
Random rnd = new Random(); // Zufallsgenerator initialisieren
boolean userWasWinner = false;
while (selectedValue != null) {
machineSelection = rnd.nextInt(3); // Computer-Auswahl
message += "Bitte neue Auswahl treffen!";
selectedValue = JOptionPane.showInputDialog(null, message,
"Stein, Schere, Papier", JOptionPane.INFORMATION_MESSAGE, null,
values, values[0]);
if (selectedValue != null) {
// Gleiche Auswahl behandeln
if (selectedValue.equals(values[machineSelection])) {
equal++;
message = "Gleiche Auswahl (" + selectedValue + "). ";
continue;
}
switch (machineSelection) {
case 0: // Computer w¬ahlt "Stein"
if (selectedValue.equals("Schere")) userWasWinner = false;
else userWasWinner = true; // Benutzer w¬ahlt Papier
break;
case 1: // Computer w¬ahlt "Schere"
if (selectedValue.equals("Papier")) userWasWinner = false;
else userWasWinner = true; // Benutzer w¬ahlt Stein
break;
case 2: // Computer w¬ahlt "Papier"
if (selectedValue.equals("Stein")) userWasWinner = false;
else userWasWinner = true; // Benutzer w¬ahlt Schere
break;
}
if (userWasWinner) {
userWins++;
message = "Benutzer gewinnt:\n" + selectedValue + " gewinnt gegen "
+ values[machineSelection] + "! ";
} else {
computerWins++;
message = "Computer gewinnt:\n" + values[machineSelection]
+ " gewinnt gegen " + selectedValue + "! ";
}
}
}
// Endergebnis anzeigen
String cWins = computerWins == 1 ? " Sieg " : " Siege ";
String uWins = userWins == 1 ? " Sieg " : " Siege ";
JOptionPane.showMessageDialog(null, equal + " Unentschieden\n"
+ computerWins + cWins + "des Computers\n" + userWins + uWins
+ "des Benutzers", "Ergebnis", JOptionPane.INFORMATION_MESSAGE);
}
}
