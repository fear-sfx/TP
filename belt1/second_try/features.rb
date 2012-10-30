# Технологично училище Електронни системи - http://http://www.elsys-bg.org/
# клас : 11б
# номер : 27
# име : Тодор Маноилов
# задача : Да се разработи програма, която да сумира времената на
# даден feature и да записва резултата в CSV файл.

require "csv"

time = 0.0
feature = "instance_create_update.feature"

CSV.open("output_file.csv", "w") do |csv|
	CSV.foreach("features.csv") do |row|
		if (row[1] != nil) && (row[1].include? feature)
			time += row[0].to_f
		end
	end
	csv << [time]
end
