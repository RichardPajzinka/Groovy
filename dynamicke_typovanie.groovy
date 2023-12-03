//vieme povedat asi èo to je ale ak nevieme vieme dat def to je take ultimatne
def x = 1
//využivanie roznych reflexi
println x.getClass().getName()

def y = "1"
println y.getClass().getName()

x = "Karol"
println x.getClass().getName()

def datum = new Date()
println datum.getClass().getName()


//staticke typovanie
int a = 1
println a.getClass().getName()

def abc=1
assert abc.getClass() == java.lang.Integer
println "test prešiel"

abc = "abc"
assert abc.getClass() == java.util.Date
println "test prešiel 3"

// ukoncovacie sekvencie(escaped sequences)
// \n - new line
// \t - tab tabular
// \" "
// \' '
// \f - form feed