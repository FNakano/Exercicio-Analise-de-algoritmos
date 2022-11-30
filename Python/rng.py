import sys
def printf(format, *args):
    sys.stdout.write(format % args)

seed=0x5DEECE66D;
def setSeed(new_seed):
    global seed
    seed = (new_seed ^ 0x5DEECE66D) & ((1 << 48) - 1)

def next(bits):
    global seed 
    seed = (seed * 0x5DEECE66D + 0xB) & ((1 << 48) - 1)
    return (seed >> (48 - bits))


for i in range (0,50):
	printf ("%d ", next(31))

