//pravy string (Java String)
// 1 string
def s = 'toto je string'

println s

//GString Groovy
//podpora string interpolacie
//2 string
def s2 = "toto je druhy string (GString) ${1+9}"
println s2
println s2.getClass().getName()


//3 string
def s4 = /toto je itež string/
println s4 
println s4.getClass().getName()

//4 string
//multiline - viacriadkove retazce
def s5 = '''
napriklad tu možem nieèo napisat
tu možem nieèo napisat
taktiez tu
'''
println s5 
println s5.getClass().getName()

//lebo pracujeme s GStringom ako objekt
GString s6 = new "Richard Pajzinka"
println s6
println s6.getClass().getName()