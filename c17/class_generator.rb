File.open("Vehicle.java", "w") do |f|
	1.upto(10) do |i|
		f.write("class Vehicle#{i} extends Vehicle#{i+1}{}\n")
	end

	f.write("public class Vehicle extends Vehicle201{}\n")
end
