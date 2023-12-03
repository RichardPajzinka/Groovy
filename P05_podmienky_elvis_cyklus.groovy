//package možeme brat ako folder
package control_flow
import java.text.NumberFormat
//java util login, može byt nejak log for J
import java.util.logging.Logger
import static javax.swing.JOptionPane.showInputDialog

//if , else , while,for
//println "Ahoj"
//dynamicke typovanie
def vekPouzivatela = showInputDialog "Kolko maš rokov: "
def iVekPouzivatela = vekPouzivatela.toInteger()
println "Mas " + iVekPouzivatela

/*podmienky , operatoris , < > == != <= >= , and log.sucin &&
or log sucet ||
*/
if (iVekPouzivatela > 18){
    println "dostaneš vodièak..."
} else {
    println "nedostaneš..."
}


// elvis operator 
//coelasce , ifnull , nvl
def meno = "Elvis"
def vysledok2 = meno ? meno : "Pavol"

