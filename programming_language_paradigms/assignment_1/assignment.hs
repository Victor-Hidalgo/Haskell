char_to_int '0' = 0
char_to_int '1' = 1
char_to_int '2' = 2
char_to_int '3' = 3
char_to_int '4' = 4
char_to_int '5' = 5
char_to_int '6' = 6
char_to_int '7' = 7
char_to_int '8' = 8
char_to_int '9' = 9
char_to_int x = error "Number not between 0 and 9"

repeat_char c 0 = []
repeat_char c n = c : repeat_char c (n-1)
 
decode [] = []
decode (x:y:xs) = repeat_char x (char_to_int y) ++ decode xs

int_to_char 0 = '0'
int_to_char 1 = '1'
int_to_char 2 = '2'
int_to_char 3 = '3'
int_to_char 4 = '4'
int_to_char 5 = '5'
int_to_char 6 = '6'
int_to_char 7 = '7'
int_to_char 8 = '8'
int_to_char 9 = '9'
int_to_char x = error "Number not between 0 and 9"

length_char x [] = 0
length_char x (y:ys)
 | y == x = 1 + length_char x ys
 | otherwise = 0
 
drop_char x [] = []
drop_char x (y:ys)
 | y == x = drop_char x ys
 | otherwise = y : ys
 
encode [] = []
encode (x:xs) = x : (int_to_char (length_char x (x:xs))) : encode (drop_char x xs)         
 