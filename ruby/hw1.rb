class Array
	def to_hash
		hash = Hash.new
		self.each do |elem|
			hash[elem[0]] = elem[1]
		end
		return hash
	end

	def index_by
		hash = Hash.new
		self.each do |elem|
			hash[yield elem] = elem
		end
		return hash
	end

	def subarray_count(arr)
		count = 0
		for i in 0..self.size-1
			if self[i] == arr[0] && self[i+1] == arr[1]
				count = count + 1
			end
		end
		return count
	end

	def occurences_count
		hash = Hash.new(0)
		self.each do |elem|
			if hash.has_key?(elem)
				hash[elem] = hash[elem] + 1
			else
				hash[elem] = 1
			end
		end
		return hash
	end

	def densities
		hash = self.occurences_count
		arr = Array.new(self.size){0}
		iterator = 0
		self.each do |elem|
			arr[iterator] = hash[elem]
			iterator = iterator + 1
		end
		return arr
	end
end

# list_hash = [["one", 1], ["two", 2]]
# p list_hash.to_hash

# list_index = ["Dani", "Tony", "Mihaela"]
# p list_index.index_by { |s| s.length }

# list_sub = [1, 2, 2, 2, 2, 3]
# p list_sub.subarray_count([2,2])
# p list_sub.subarray_count([2,3])

# list_occur = %w[a a b c b a]
# p list_occur.occurences_count

# list_dens = [:a, :a, :a]
# p list_dens.densities
