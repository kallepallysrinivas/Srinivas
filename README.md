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

srinivassruby perimeter.rb
Enter the radius of the circle:
2
The perimeter (circumference) of the circle is: 12.57
The area of the circle is: 12.57rinivassrinivas

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



5.
def calculate_circle_properties(radius)
  # Calculate the perimeter (circumference)
  perimeter = 2 * Math::PI * radius
  
  # Calculate the area
  area = Math::PI * radius**2
  ruby perimeter.rb
Enter the radius of the circle:
2
The perimeter (circumference) of the circle is: 12.57
The area of the circle is: 12.57
  return perimeter, area
end

# Main script
puts "Enter the radius of the circle:"
radius = gets.chomp.to_f  # Get user input and convert it to a float

if radius < 0
  puts "Please enter a positive number for the radius."
else
  perimeter, area = calculate_circle_properties(radius)
  
  puts "The perimeter (circumference) of the circle is: #{perimeter.round(2)}"
  puts "The area of the circle is: #{area.round(2)}"
end

output:


ruby perimeter.rb
Enter the radius of the circle:
2
The perimeter (circumference) of the circle is: 12.57
The area of the circle is: 12.57
