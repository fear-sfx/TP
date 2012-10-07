# Технологично училище Електронни системи - http://http://www.elsys-bg.org/
# 11б клас
# №27
# Тодор Маноилов
# Да се разработи програма, изчисляваща броя на задачите написани на Ruby/Python/Perl, както и сумата от номерата на ученици писали на даден език.

require "csv"
ruby_n = 0; pyth_n = 0; perl_n = 0;
ruby_s = 0; pyth_s = 0; perl_s = 0;

printf "Enter file/ dir+file : "
file = gets.chomp

CSV.foreach(file) do |row|
	if row[5] == "Ruby"
		ruby_n += 1
		ruby_s += row[2].to_i
	elsif row[5] == "Python"
		pyth_n += 1
		pyth_s += row[2].to_i
	else
		perl_n += 1
		perl_s += row[2].to_i
	end
end

printf "\nTotal " 
print ruby_n
printf " in Ruby, "
print pyth_n
printf " in Python and "
print perl_n
printf " in Perl. Sum(ruby) = "
print ruby_s
printf " ; sum(python) = "
print pyth_s
printf " ; sum(perl) = "
print perl_s
printf "\n\n"

