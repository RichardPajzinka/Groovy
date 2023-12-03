def text = "toot je priklad retazca"
text = text + " a toto je dalši retazec"
//vieme aj minusovat ,ak potrebujeme z toho retazcadat nieèo preè
text - "je"

def slovo = "Na"
slovo*5

def veta = "toto je kratka veta"
veta[-1]
veta[0,1,2,4,5]

//range - slicing
def tmp = veta[0..3]
println tmp

def sprava = "nalodenie prebehne zajtra polnoci"
sprava[0..8,18..-1]

println sprava.reverse()
//println text

//compareTo
def a = 1 <=> 2;
println a