package net.projecteuler

import java.math.RoundingMode;

import org.apache.commons.math3.fraction.Fraction

class Problem71 {

	def static main(def args) {
		long m;
		long bestm = 0, bestn = 1;

		(1..1000000).each {n->
			m = (n*3-1)/7;
			if( m*bestn > n*bestm ){
				bestm = m;
				bestn = n;
			}
		}
		println "$bestm, $bestn"
	}
}
