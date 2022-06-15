.data

s: .asciiz "Enter an integer N from 2 to 100: "

.text

li $t0 2   						#count = 2 = t0
li $v0 4						#syscall code for print_str
la $a0 s 						#use s as an argument for syscall 
syscall 						#print_str
li $v0 5     						#syscall code for read_int 
syscall 						#read_int
add $v1 $v1 $v0   					#v1 = v0
loop1:   
bge $t0 $v1 end    					#if count >= input, end the program
move $a0 $t0      					#t0 is now the argument to be passed to isPrime
jal isPrime     					#call isPrime 
beq $v0 $zero next 					#if v0=0(not prime) then branch to else 
li $v0 1						#syscall code for print_int
move $a0 $t0     					#counter is used as argument for syscall 
syscall							#print_int 
li $v0 11						#syscall code for print_char
li $a0 ' '      					#use space character as argument for syscall         
syscall							#print_char
addi $t0 $t0 1  					#count++ 
j loop1       						#jump back to loop1 
next: 	#skip this number
addi $t0 $t0 1 						#count++
j loop1     						#jump back to loop1   
isPrime: 
li $t1 1      						#t1=1
addi $t2 $a0 -1						#t2 = input - 1
loop2: 
beq $t2 $t1 notPrime					#if (input - 1) = t1, branch to notPrime
div $a0 $t2   						#input/(input - 1)
mfhi $t3       						#t3 = remainder
beq $t3 $zero exit 					#if remainder = 0 (divisible by that number), exit this loop 
addi $t2 $t2 -1   					#t2--
j loop2      						#jump back to loop2 
notPrime: 
li $v0 1  						#set v0 to 1 to return it 
jr $ra 							#jump to the next line after this procedure was called
exit: 
li $v0 0   						#set v0 to 0 to return it 
jr $ra 							#jump to the next line after this procedure was called
end:
