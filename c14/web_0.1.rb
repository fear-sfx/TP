require 'net/http'  

class Site



end

class Link
	attr_accessor :value

	def download
	  response = Net::HTTP.get_response(URI.parse(value))
	  f = File.open('content.html', 'w')
	  f.write(response.body)
	end  
end

class Page 
	def content
		File.open('content.html', 'r') do |read|
		while(line = read.gets)
			puts line
		end
		end
	end
	def get_links
		links = Hash.new
		File.open('content.html', 'r') do |read|
		while(line = read.gets)
			sth = URI.extract(line)
			puts sth
		end
		end
	end

end

#s = Link.new
#s.value = "http://en.wikipedia.org/wiki/Tuesday"
#s.download

p = Page.new
#p.content
p.get_links
