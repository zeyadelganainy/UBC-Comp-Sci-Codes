
#-----------------------------------------------------------------
# COSC 211: Assingment 2, Q1
#
# Register Usage:
# $s0, address of the data "len"
# $t0, address of the next character in "buffer"
# $t1, the number of characters so far   	
#-----------------------------------------------------------------

#data section

		.data     			# directive for data section

len: 		.word 0
buffer:		.space 10
		.align 4	
str:		.asciiz "Hello, Your ID = "

#code section
		.text  			# directive for code section
		.globl main  		# directive: main is visible to other files 
main: 
      	li $v0, 4    		# load system call code to $v0, 4 for print-string
      	la $a0, str  		# load address of the "str" to 1st arg 
      	syscall			# syscall to print	

      	li $v0, 8     		# 8: code reading string system call
      	la $a0, buffer
      	li $a1, 12
      	syscall

      	la $t0, buffer 		# $t0 points to buffer
      	la $s0, len			# $s0 points to len
      	lw $t1, ($s0)		# $t1 has the integer value of len (initially 0)

loop: 	lbu  $t2, ($t0)	      	# loops through the buffer     
      	beq  $t2, 0, exit     	# check for null character
      	beq  $t2, 0xA, exit   	# check \n symbol 	
      	addi $t0, $t0, 1		# increment $t0 to point to next character in buffer
      	addi $t1, $t1, 1		# increment $t1 (originally = len, initially = 0)	
      	j    loop			# repeat

exit: 	sw $t1, ($s0)		# save the number of characters into len
	
      	li $v0, 1			# display the number of characters
      	lw $a0, ($s0)
      	syscall	

#      	jr $ra			# return to start-up caller in SPIM (in exception.s)  

      	li $v0, 10			# exit
      	syscall 
