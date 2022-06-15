	.text
	addi $s0, $s0, 6	# Initialize s0 to 6
	mul $t0, $s0, $s0	# $t0 = $s0 * $s0 (which is $s0^2)
	mul $t0, $t0, $s0	# $t0 =  $t0($s0^2) * $s0 = $s0^3
	subi $t0, $t0, 93	# $t0 = $t0($s0^3) - 93
	mul $t0, $t0, $t0	# $t0 = $t0^2 = ($s0^3 - 93)^2
	add $t0, $t0, $s0	# $t0 = $t0 (($s0^3 - 93)^2 + $s0)
	sll $t0, $t0, 2		# $t0 << 2
	div $t1, $t0, 4		# $t1 = $t0 / 4
				
				#$t0 = 0x0000ec7c
				#$t1 = 0x00003b1f