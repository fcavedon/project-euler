package net.projecteuler.page2

class Problem64 {
	
	def static continuedFraction(def S) {
		def a = []
		def m = []
		def d = []

		a[0] = Math.floor(Math.sqrt(S))
		d[0] = 1
		m[0] = 0

		for (int i=0; i<10*a[0]; i++) {
			m[i+1] = ((d[i]*a[i])-m[i])
			d[i+1] = ((S-(m[i+1]*m[i+1]))/d[i])
			a[i+1] = ((a[0]+m[i+1])/d[i+1]) as Integer

			if (a[i+1]==(2*a[0]).intValue()) break
		}

		return a
	}
	
	def static main(def args) {
		def count = 0
		(2..10000).each {
			def fract = continuedFraction(it)
			if ((fract.size()-1)%2==1) {
				count++
			}
		}
		println count
	}

}
