# Fancy-Barcodes-2022
A Java applet I created based on exercises in my Java course at Software University, used to scan the validity of a barcode format using regular expressions. 

#Features
1. The user inputs the number of barcodes to be checked.
2. The inputted string is passed through a regular expression check with the following pattern: @#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+
   
  (@, #, an uppercase letter, at least 4 uppercase or lowercase letters or digits from 0 to 9, an uppercase letter, @, #)
  
4. If the string matches the regular expression, the barcode is valid.

5. The product group number is shown.
   
6. If the string between the two uppercase letters contains digits, the product group number becomes those digits joined together.

7. If the string between the two uppercase letters does not contain digits, the product group number is "00".

8. If the string does not match the regular expression, the user gets a message stating "Invalid barcode".
