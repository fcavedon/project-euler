package net.projecteuler

class Problem66 {

	def static main(def args) {
		def nums = []
		def toRemove = []
		def D = []

		(2..1000).each {
			nums << it
			toRemove << it*it
			if (it%4==0) {
				toRemove << it
			}
		}
		D = nums-toRemove

		def Sresult, x, y, maxX = 0

		D.each {S->
			def p = []
			def q = []

			def a = Problem64.continuedFraction(S)
			
			def r = a.findIndexOf {
				it == (2*a[0]).toInteger()
			}-1

			def period = a-a[0]

			r.times { a << period }

			a = a.flatten()

			p[0] = a[0]
			p[1] = (a[0]*a[1])+1

			for (int i=2; i<a.size(); i++) {
				p[i]=(a[i]*p[i-1])+p[i-2]
			}

			q[0] = 1
			q[1] = a[1]

			for (int i=2; i<a.size(); i++) {
				q[i]=(a[i]*q[i-1])+q[i-2]
			}

			if (r%2==1) {
				x = p[r]
				y = q[r]

				if (x>maxX) {
					maxX = x
					Sresult = S
				}
			} else {
				x = p[2*r+1]
				y = q[2*r+1]

				if (x>maxX) {
					maxX = x
					Sresult = S
				}
			}
		}
		println "$Sresult = ($x, $y)"
	}
}
