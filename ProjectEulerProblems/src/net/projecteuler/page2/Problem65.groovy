package net.projecteuler.page2

import org.apache.commons.math3.fraction.Fraction;

class Problem65 {

	def static main(def args) {
		
		def eFract = [2]
		
		for (int i=1; i<3; i++) {
			eFract << [1, 2*i, 1]
		}
		def e = eFract.flatten()	
		
		println e
				
	}
}
