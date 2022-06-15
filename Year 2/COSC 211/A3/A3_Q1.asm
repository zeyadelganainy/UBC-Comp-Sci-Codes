.data
s1: .asciiz "Enter three characters: "			#saved the string into s1 to be used to ask for input
s2: .asciiz "\nYour characters in reverse order: "	#new line, saved this string in s2 to be used in output
str: .space 4						#three characters and one for null terminator
.text
li $v0, 4						#syscall code for print_str
la $a0, s1						#load address of string to print
syscall							#print string
li $v0, 8						#syscall code for read_str
la $a0, str						#load address of string buffer (str)
li $a1, 4						#length of buffer 
syscall							#read string
li $v0, 4						#syscall code for print_str
la $a0, s2						#load address of string to print
syscall							#print string
la $t0 str						#load address of input into t0
lb $t1, ($t0)						#load value of 1st character from str into t1
lb $t2, 1($t0)						#load value of 2nd character into t2
lb $t3, 2($t0)						#load value of 3rd char into t3
li $v0, 11						#syscall code for print_char
move $a0, $t3						#move 3rd char into a0 to be printed
syscall							#print char
move $a0, $t2						#move 2nd char to be printed
syscall							#print char
move $a0, $t1						#move 1st char to be printed
syscall							#print char