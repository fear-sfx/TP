content = File.read("regex.html")

res = content.scan(/<a\s+href=\".*?\"/)

res.each do |r|
	p r[9..-2]
#	puts 
end
p res.length
