# char ch_arr[101];
# int  int_arr[101];
# main(){
#   int s0 = 0;
#   for(s0 = 0; s0 < 101; s0++){
#       ch_arr[s0] = 'a';
#       int_arr[s0] = s0;	
#   }
# }
.data
ch_arr:	.space 101	
		.align 4
int_arr:	.space 404
.text		
main:
	li 	$s1, 0x61		# ASCII for 'a'
	li 	$s0, 0		# loop counter
	li 	$s2, 101		# loop upper bound
	la 	$s3, ch_arr		# base address of ch_arr in $s3
	la	$s4, int_arr	# base address of int_arr in $s4
loop:	beq 	$s0, $s2, exit	# terminate loop when s0>=101 
	add 	$t0, $s3, $s0   	# $t0 = address of ch_arr[s0]
	sb  	$s1, ($t0)		# ch_arr[s0] = 'a'
	sll 	$t0, $s0, 2   	# $t0: 4 * s0
	add 	$t0, $t0, $s4   	# $t0 = address of int_arr[s0]
	sw 	$s0, ($t0)	    	# int_arr[s0] = s0
	addi 	$s0, $s0, 1   	# s0++
	j loop
exit:	li 	$v0, 10		# code for exit
	syscall