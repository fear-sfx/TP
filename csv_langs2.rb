#csv_prog2

require "csv"
ruby_n = 0; pyth_n = 0; perl_n = 0;
ruby_s = 0; pyth_s = 0; perl_s = 0;

printf "Enter file/ dir+file : "
file = gets.chomp

CSV.foreach(file) do |row|
	if row[5] == "ruby"
		ruby_n += 1
		ruby_s += row[2].to_i
	elsif row[5] == "python"
		pyth_n += 1
		pyth_s += row[2].to_i
	else
		perl_n += 1
		perl_s += row[2].to_i
	end
end

printf "\nTotal " 
print ruby_n
printf " in ruby, "
print pyth_n
printf " in python and "
print perl_n
printf " in perl. Sum(ruby) = "
print ruby_s
printf " ; sum(python) = "
print pyth_s
printf " ; sum(perl) = "
print perl_s
printf "\n\n"

