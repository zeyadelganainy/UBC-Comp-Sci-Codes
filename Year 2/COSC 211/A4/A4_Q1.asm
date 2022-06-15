.data
msg1: .asciiz	"Hex digit X2 in decimal is "			#saved the string into msg1 to be used to present answer
msg2: .asciiz	"Unrecognized hex digit. Try again: "		#saved the string into msg2 to be used as error message
.text
read:	#will be used to ask for new valid input
	li $v0, 12						#syscall code for read_char
	syscall							#read character
	blt $v0, 48, error_msg					#if char < 48 (unicode for 0), branch to error_msg
	bge $v0, 58, case2					#if char >= 58 (numbers end at 57), branch to case2
case1: 	#if input between 48-57 (0 - 9)
	addi $s1, $v0, -48					#s1 = v0 (input) - 48, this converts unicode to hex char
	sll $s1, $s1, 1						#shifting s1 left is equal to multiplying it by 2^1 = 2
	j print_num						#jump to print_msg
case2:  #checking if the input is between A and F (65-70)
	blt $v0, 65, error_msg 					#if char < 65, branch to error_msg
	bge $v0, 71, error_msg					#if char >= 71, branch to error_msg
	addi $s2, $v0, -55					#s1 = v0 (input) - 55, this converts unicode to hex char	
A:	#is input = A?
	li $s1, 'A'						#load 'A' = 65 into s1			
	bne $v0, $s1, B						#if input != 65, branch to B				
	sll $s2, $s2, 1						#shift left to multiply by 2
	j print_letter						#jump to print_letter
B:	#is input = B?						#similar to above
	li $s1, 'B'
	bne $v0, $s1, C
	sll $s2 $s2 1
	j print_letter					
C:	#is input = C?						#similar to above
	li $s1, 'C'
	bne $v0, $s1, D
	sll $s2 $s2 1
	j print_letter					
D:	#input = D?						#similar to above
	li $s1, 'D'
	bne $v0, $s1, E
	sll $s2 $s2 1
	j print_letter
E:	#input = E?						#similar to above
	li $s1, 'E'
	bne $v0, $s1, F
	sll $s2 $s2 1
	j print_letter
F:								#similar to above
	li $s1, 'F'
	bne $v0, $s1, error_msg
	sll $s2 $s2 1
	j print_letter
error_msg:
	li $v0, 11 						#syscall code for print_char
	la $a0, '\n'						#prints a new line
	syscall							#print character
	li $v0, 4						#syscall for print_str
	la $a0, msg2						#load msg2 to be printed
	syscall							#print string
	li $v0, 11 						#syscall code for print_char
	la $a0, '\n'						#prints a new line
	syscall							#print character
	j read 							#jump back to read to ask for input again
print_num:
	li $v0, 11 						#syscall code for print_char
	la $a0, '\n'						#prints a new line
	syscall							#print character
	li $v0, 4						#syscall for print_str
	la $a0, msg1						#load msg1 to be printed
	syscall							#print string
	li $v0, 1						#syscall for print_int
	la $a0, ($s1)						#load s1 to be printed
	syscall							#print int
	j end							#jump to the end of the program
print_letter:
	li $v0, 11 						#syscall code for print_char
	la $a0, '\n'						#prints a new line
	syscall							#print character
	li $v0, 4						#syscall for print_str
	la $a0, msg1						#load msg1 to be printed
	syscall							#print string	
	sll $s1, $s1, 1						#shifting s1 left by 2^1 bits and save it in s1
	li $v0, 1						#syscall for print_int
	la $a0, ($s2)						#load s1 to be printed
	syscall							#print int
end: