# (s1,s0): 64-bit product (s1: prodLeft, s0 prodRight)
# t0: 32-bit multiplier
# t1: 32-bit multiplicand

# Algorithm:
# Product(left_half) = 0, product(right_half) = multiplier
# for 32 iteration {	
# if (product[0] == 1)	//if(multiplier[0] == 1)
#   left-half of product += multiplicand
# shift-right product by 1
# }

.text
	#assume any values for multiplier and multiplicand
	addi	$t0, $0, 6553712	# multiplier
	addi	$t1, $0, 4365537	# multiplicand
	
	# Multiplication algorithm starts here
