require "csv"

class Popular
	@@arr = Array.new(30) {0}

	def initialize
		for i in 1..28
			if i == 21
				next
			end
			CSV.foreach("csvs/" + i.to_s + ".csv") do |row|
				@@arr[row[0].to_i - 1] += 1
			end
		end
	end

	def maxPopular
		max = @@arr[0]
		index = 0
		for i in 1..29
			if @@arr[i] > max
				max = @@arr[i]
				index = i
			end
		end

		print ("Max popular is num: " + (index + 1).to_s + " with " + @@arr[index].to_s + " votes \n")
	end

	def minPopular
		min = @@arr[0]
		index = 0
		for i in 1..29
			if @@arr[i] < min
				min = @@arr[i]
				index = i
			end
		end

		print ("Min popular is num: " + (index + 1).to_s + " with " + @@arr[index].to_s + " votes \n")
	end
	
	def mostTo
		clas = Array.new(30) { Array.new(0) {0} }
		res = Array.new(30) {0}

                i = 0; j = 0
                while (i < 30 and j < 30)
                        clas[i][j] = 0
                        i += 1
                        if(i == 30)
                                j += 1; i = 0
                        end
                end
       		
		for i in 1..28
			if i == 21 
				next
			end
			prev = 0
			CSV.foreach("csvs/" + i.to_s + ".csv") do |row|
				clas[prev][row[0].to_i - 1] += 1
				prev = row[0].to_i - 1
			end
		end

		for i in 0..29
			j = 0
			res[i] = clas[i][j]
			for j in 0..29
				if clas[i][j] > res[i]
					res[i] = j + 1
				end
			end
		end

		for i in 0..28
			print ("Num " + (i + 1).to_s + " has given mostly to num " + res[i].to_s + ". \n")
		end		
	end
end

who = Popular.new
who.maxPopular
who.minPopular
puts
who.mostTo
