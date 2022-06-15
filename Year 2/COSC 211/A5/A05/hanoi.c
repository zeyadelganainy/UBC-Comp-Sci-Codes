include <stdio.h>
int main(){
  int t0;
  printf("Enter the number of disks:");
  scanf("%d", &t0);
  hanoi(t0, 0, 1, 2);
  return 0;
}

void hanoi(int n, int src, int dest, int helper){
	if (n != 0) {
		hanoi(n - 1, src, helper, dest);
		printf("Move disk %d from peg %d to peg %d.\n", n, src, dest);
		hanoi(n - 1, helper, dest, src);
	}
}
