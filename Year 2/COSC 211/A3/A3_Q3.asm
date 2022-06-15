.data
s1: .asciiz "Enter a 3-digit hex number (all digits  must be from A to F): "	#saved the string into s1 to be used to ask for input
s2: .asciiz "The decimal equivalent is: "		#saved this string in s2 to be used in output
str: .space 4						#three characters and one for null terminator
.text
li $v0, 4						#syscall code for print_str
la $a0, s1						#load address of s1 into a0 to print it
syscall							#print string
li $v0, 8						#syscall code for read_str
la $a0, str						#load address of string buffer (str)
li $a1, 4						#length of buffer
syscall							#read string
la $t0, str						#load address of input into t0
lb $t1, ($t0)						#load value of 1st character from str into t1
lb $t2, 1($t0)						#load value of 2nd character into t2
lb $t3, 2($t0)						#load value of 3rd char into t3
addi $t1, $t1, -55					#set the letter's value to its hexadecimal one (A = 65,65-55=10,B=66,66-10=11,etc)
addi $t2, $t2, -55					#same as above but for 2nd character
addi $t3, $t3, -55					#same as above but for 3rd character
mul $t1, $t1, 256					#256 is 16^2, 256*first hexadecimal letter's weight will be used in finding sum
mul $t2, $t2, 16					#16^1, 16*second hexadecimal letter's weight also used in finding sum
add $t0, $t1, $t2					#t0 = t1+t2 
add $t0, $t0, $t3					#t0 = t1+t2+t3 and since they're all multiplied by their hexadecimal weight (t3*1 would be reduntant), this is the value
li $v0, 11						#syscall for print_char
li $a0, '\n'						#go to new line
syscall							#print character
li $v0, 1						#syscall for print_int
la $a0, ($t0)						#load address of t0 into a0 for printing
syscall							#print integer