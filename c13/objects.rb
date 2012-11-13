class Objects

	attr_accessor :value
	
	@value2
	private
	def method_private
		@value2 = "fuck this"
	end

end

o = Objects.new
p o.send("method_private")

o.value=5
p o.value
