CC	= gcc -ansi -pedantic
CFLAGS = -Wall -Werror -g
FILE = mdu


$(FILE): $(FILE).o 
	$(CC) $(CFLAGS) $(FILE).c -o $(FILE)

all: $(FILE)

.PHONY: clean realclean
clean:
	 rm *.o
realclean : clean
	rm $(FILE)
