#prog2

require "csv"
tasks = 0

printf "Enter file/ dir+file : "
file = gets.chomp

CSV.foreach(file) do |row|
	data = row.to_s
	arr = data.split(';')
	#arr = data.split(',')
	tasks += arr[5].to_i
end 

printf "\nTotal : "
print tasks
printf "\t tasks have been done. \n\n"
