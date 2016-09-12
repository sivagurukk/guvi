int main() {

	int x,y,t,x1=1;
	scanf("%d %d",&x,&y);
	t=x;
	int i;
	while(x!=0)
	{
		x1*=x%10;

		x=x/10;
	}
	if((x1*t)==y)
		printf("seed");
	else
		printf("not seed");
	return 0;
}
