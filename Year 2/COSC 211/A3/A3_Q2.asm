.data
s1: .asciiz "Enter a 3 digit number: "			#saved the string into s1 to be used to ask for input
s2: .asciiz "The sum of the 3 digits is: "		#saved this string in s2 to be used in output
.text							
li $v0 4						#syscall code for print_str
la $a0 s1						#load address of s1 as an argument for printing
syscall							#print string
li $v0 5						#syscall code for read_int
syscall							#read int (stored in $v0)
move $t1, $v0						#move value of v0 (our input) to t1
addi $t2, $t2, 100					#created a variable to be used for seperating each character by div (currently 100)
div $t1, $t2						#divided t1 by t2 (100) to get number of hundreds
mflo $t0						#moved quotient to t0, this is the number of hundreds
mfhi $t1						#moved remainder to t1, this number will be divided again to find num of tens
addi $t2, $t2, -90					#changed value of t2 from 100 to 10
div $t1, $t2						#divided t1 by t2 (10) to get number of tens
mflo $t3						#moved quotient to t3, this is the number of tens
mfhi $t1						#moved remainder to t1, this is the number of ones
add $t0, $t0, $t1					#t0 += t1 (added number of hundreds to number of ones)
add $t0, $t0, $t3					#t0 += t3 (added number of hundreds and ones to number of tens), this is the required value
li $v0, 4						#syscall code for print_str						
la $a0, s2						#load address of s2 as an argument for printing
syscall							#print string
li $v0 1						#syscall code for print_int
la $a0 ($t0)						#load address of t0 as argument for printing
syscall							#print integer