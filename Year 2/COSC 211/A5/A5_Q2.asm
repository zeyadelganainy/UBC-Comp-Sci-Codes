.data
s1: .asciiz "Enter the number of disks: "
s2: .asciiz "Move disk "
s3: .asciiz " from peg "
s4: .asciiz " to peg "
input: .space 4 #integer takes up 4 bytes

.text 

li $v0, 4	#print string (Enter num of disks)
la $a0, s1
syscall
li $v0, 5	#read int
syscall
#prologue
add $a0, $v0, $0 
li $a1, 0 
li $a2, 1 
li $a3, 2 
#Call
jal hanoi
j exit
hanoi:
addi $sp, $sp, -20
sw $ra, 16($sp) 
sw $a0, 12($sp)
sw $a1, 8($sp)
sw $a2, 4($sp)
sw $a3, 0($sp)
beq $a0, 0, next # base condition
lw $a2, 0($sp)
lw $a3, 4($sp)
addi $a0, $a0, -1 #n--
jal hanoi
#epilogue
lw $t0, 12($sp) #t0 = n
lw $t1, 8($sp) #t1 = src
lw $t2, 4($sp) #t2 = dest
lw $t3, 0($sp) #t3 = helper
li $v0, 4	
la $a0, s2	#print string (Move disk)
syscall
li $v0, 1	#print n
la $a0, ($t0)
syscall
li $v0, 4	#print string (from peg)
la $a0, s3
syscall
li $v0, 1	#print src
la $a0, ($t1)
syscall
li $v0, 4	#print string (to peg)
la $a0, s4
syscall
li $v0, 1	#print destination
la $a0, ($t3)
syscall
li $v0 11	#printing new line
li $a0 '\n'  
syscall
lw $a0, 12($sp) #loading arguments 
lw $a1, 0($sp)
lw $a2, 4($sp)
lw $a3, 8($sp)
addi $a0, $a0, -1 #decrementing n
jal hanoi
next:
lw $ra 16($sp) #load ra back into stack 
addi $sp $sp 20	#increase size od sp back
jr $ra   	#jump to ra
exit:
