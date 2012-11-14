# Технологично училище Електронни системи - http://http://www.elsys-bg.org/
# клас : 11б
# номер : 27
# име : Тодор Маноилов
# задача : Да се разработи калкулатор, работещ на принципа на обратния полски запис. (e.g. :	1 2 + 3 - 4 4 + * -> RES : 16)

args = gets.chomp.split(" ")
nums = Hash.new; res = 0.0; count = 1

for i in 0..(args.length - 1)
	case args[i]
	when (/[0-9.]/)
		if nums.length == 0
			res = args[i].to_f
			nums[nums.length] = args[i]
		else 
			nums[nums.length] = args[i] 
		end
	when "+"
		res = res + nums[count].to_f
		count = count + 1
	when "-"
		res = res - nums[count].to_f
		count = count + 1
	when "*"
		res = res * nums[count].to_f
		count = count + 1
	when "/"
		res = res / nums[count].to_f
		count = count + 1
	else
		puts "\nEnter a real operator"
	end
end

puts ("RES : " + res.to_s)
