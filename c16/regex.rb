# rubular.com !!

f = File.open("bullshit.txt", "r") do |line|
	sth = line.gets.split(" ")
	for i in 0..sth.length-1
		puts sth[i] if (sth[i]=~/^[0-9]+$/)
	end
end
