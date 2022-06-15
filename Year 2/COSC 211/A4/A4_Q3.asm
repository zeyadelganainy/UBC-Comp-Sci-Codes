.data

input: .space 5				#reserve 4 chars and 1 null terminator

.text 

li $v0, 8				#read string code for syscall
la $a0, input				#address to save
li $a1, 5				#how long it is
syscall					#read it
la $t0, input				#put address of input in t0
lb $t1, ($t0) 				#load data of first digit into t1
addi $t2, $t1, -48 			#t2 = t1 - 48 ('0'), converting from unicode to decimal
mul $t3, $t2, 8				#converting binary to decimal
add $s0, $s0, $t3 			#$s0 = $s0 + $t3
lb $t1, 1($t0)				 #same as above but for 2nd digit
addi $t2, $t1, -48 			
mul $t3, $t2, 4				#multiply by 4 instead of 8 (2^2 instead of 2^3)
add $s0, $s0, $t3 
lb $t1, 2($t0)				 #same as above but for 3rd digit
addi $t2, $t1, -48 			
mul $t3, $t2, 2				#multiply by 2 instead of 4 (2^1 instead of 2^2)
add $s0, $s0, $t3 
lb $t1, 3($t0) 				# #same as above but for 4nd digit 
addi $t2, $t1, -48
mul $t3, $t2, 1 			#multiply by 1 instead of 2 
add $s0, $s0, $t3
addi $s0, $s0, 48 			#convert it from decimal to ASCII again
bge $s0, 57, next 			#if input >= 57 ('9'), branch to next
li $v0, 11 				#print_char code for syscall
la $a0, '\n'				#print a new line
syscall					#print character
addi $s0, $s0, -48 			#'0' = 48
li $v0, 1				#print_int code for syscall
la $a0,($s0)				#print the value in s0 (sum)
syscall					#print int
j end					#jump to end
next:
	addi $s0, $s0, 7		#letters start at 65 but numbers end at 58 in ascii, so i added 7.			
	A:	
		li $s1, 'A'
		bne $s0, $s1, B		#if input != 'A', branch to B
		j print			#jump to print
	B:				
		li $s1, 'B'		#same idea as above
		bne $s0, $s1, C
		j print
	C:				#same idea as above
		li $s1, 'C'
		bne $s0, $s1, D
		j print
	D:				#same as above
		li $s1, 'D'
		bne $s0, $s1, E
		j print
	E: 				#same as above
		li $s1, 'E'
		bne $s0, $s1, F
		j print
	F: 				#same as above
		li $s1, 'F'
		bne $s0, $s1, end
		j print
print:
	li $v0, 11 			#syscall code for print_char
	la $a0, '\n'			#put a new line char to print
	syscall				#print character			
	la $a0,($s1)			#put sum as argument to print
	syscall				#print character
end: