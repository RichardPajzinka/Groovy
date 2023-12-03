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

def kontrolujDochadzku(meno){
    //toto je elvis operator ?:
    $meno ?: "Elvis"
}

assert kontrolujDochadzku () == "Elvis has left the building"
assert kontrolujDochadzku (null) == "Elvis has left the building"
assert kontrolujDochadzku('Priscila') == "Elvis has left the building"


//switch
switch(10){
case 0:    assert false; break
case 0..9:    assert false; break
case [8,9,11]:    assert false; break
case Float:    assert false; break
default:    assert false
}

