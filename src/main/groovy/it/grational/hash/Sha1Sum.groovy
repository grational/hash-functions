package it.grational.hash

import java.security.MessageDigest

class Sha1Sum implements HashFunction {

	private final String input

	Sha1Sum(String inp) {
		this.input = inp
	}

	String digest() {
		def digest = MessageDigest.getInstance("SHA1").digest(this.input.getBytes())
		new BigInteger(1, digest).toString(16)
	}

}
