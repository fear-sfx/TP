require "csv"

file_name = gets.chomp

x = Array.new(50) {0}
y = Array.new(50) {0}
i = 0

CSV.foreach(file_name) do |row|
	x[i] = row[1].to_i
	while y[i] < x[i] / 2
		y[i] = Random.rand(x[i])
	end
	i += 1
end

i = 0
	CSV.open("export.csv", "wb") do |row|
		while i <50
			row << [ i.to_s , x[i].to_s, y[i].to_s ]
			i += 1
		end
end
