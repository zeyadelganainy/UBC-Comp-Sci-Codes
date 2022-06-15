.data

input: .space 20			#reserve 20 characters

.text

la $s1, input				#save the address of input into s1
li $t0, 0 				#t0 = 0 (counter)
for:					#for loop that will run 20 times and read a single character every time
	bge $t0, 20, print 		#if t0 >= 20, branch to primt
	li $v0, 12			#syscall code for read_char
	syscall				#read character
	beq $v0, '\n' ignore 		#if the character is a new line character, branch to ignore
	beq $v0, '0', print 		#if the character is a '0', branch to print 
	sb $v0,($s1) 			#save the contents of s1 into v0
	addi $t0, $t0, 1 		#increment the counter t0
	addi $s1, $s1, 1 		#increment the address to store the next char in the right place
	j for				#jump back to beginning of for loop
print:
	li $v0, 11 			#syscall code for print_char
	la $a0, '\n'			#put a new line character as an argument for syscall
	syscall 			#print new line character
	li $v0, 4			#syscall code for print_str
	la $a0, input			#load input to be printed
	syscall				#print input
ignore:
	j for 				#do nothing with this character and jump back to the for loop
