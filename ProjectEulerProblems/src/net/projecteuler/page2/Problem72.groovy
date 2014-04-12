package net.projecteuler.page2

import java.math.RoundingMode;

import org.apache.commons.math3.fraction.Fraction

class Problem72 {

	def static main(def args) {
				
		def fracts = [] as Set
		
		(1..12000).each {d->
			(1..d-1).each {n->
				if ((n/d)<1) {
					fracts << new Fraction(n,d)
				}	
			}
		}
		println fracts.size()
	}
}
