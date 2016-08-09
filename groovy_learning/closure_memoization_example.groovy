def cl = {a, b -> 
    sleep(30)
    a+b}
    
 mem = cl.memoize()
 
 def callClosure(a, b) {
     def start = System.currentTimeMillis()
     mem(a, b)
     println "Inputs(a=$a, b=$b) - took ${System.currentTimeMillis()-start} msecs."
 }

callClosure(1,2)
callClosure(1, 2)
callClosure(2, 3)
callClosure(2, 3)
callClosure(3, 4)
callClosure(3, 4)
callClosure(1, 2)
callClosure(2, 3)
callClosure(3, 4)
