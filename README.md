1.  def multliple_string(str,n)
return str*n
end
print multliple_string('srinivas',5),"\n\n"
print multliple_string('srinivas',4),"\n\n"
print multliple_string('srinivas',3),"\n\n"
print multliple_string('srinivas',2),"\n\n"
print multliple_string('srinivas',1),"\n\n"
output:
srinivassrinivassrinivassrinivassrinivas

srinivassrinivassrinivassrinivas

srinivassrinivassrinivas

srinivassrinivas

srinivas

2.   print "Enter number:"
num=gets.chomp.to_i;
if(num%2==0)
print("Number is Even");
end
if(num%2!=0)
print("Number is ODD");
end
                                                                                                          
output:
Enter number:12
Number is Even

Enter number:12
Number is Even

3.   print "Enter number:"
num=gets.chomp.to_i;
if(num%2==0)
print("Number is Even");
end
if(num%2!=0)
print("Number is ODD");
end          

 output:  
 
ruby else.rb
Enter number:121
Number is ODD

ruby else.rb
Enter number:2
Number is Even

4.print "Enter number1: "
num1 = gets.chomp.to_i
print "Enter number2: "
num2 = gets.chomp.to_i
print "Enter number3: "
num3 = gets.chomp.to_i

if num1 > num2 && num1 > num3
  large = num1
elsif num2 > num3
  large = num2
else
  large = num3
end

print "Largest number is: #{large}\n"

output:
ruby elseif.rb
Enter number1: 520
Enter number2: 52
Enter number3: 63
Largest number is: 520





