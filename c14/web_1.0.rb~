
# Технологично училище Електронни системи - http://http://www.elsys-bg.org/
# клас : 11б
# номер : 27
# име : Тодор Маноилов
# задача : Some kind of shitty web crowler..

require 'rubygems'
require 'nokogiri'
require 'open-uri'
require 'net/http'

# $link = 'http://en.wikipedia.org/wiki/Tuesday'

class Site
#	@@url = link
	@@url = 'http://en.wikipedia.org/wiki/Tuesday'
	@@protocol = ""
	if @@url.include? 'https'
	  @@protocol = "https"
	else
	  if @@url.include? 'http'
	    @@protocol = "http"
	  else
	    @@protocol = "Not a valid link.."
	  end
	end
	def get_url
		return @@url
	end
	def get_protocol
		return @@protocol
	end
	def get_pages
		main_page = Page.new
		return main_page.get_links
	end		
end

class Link
#	@@value = link
	@@value = 'http://en.wikipedia.org/wiki/Tuesday'
	def get_value
		return @@value
	end
	def download
          response = Net::HTTP.get_response(URI.parse(@@value))
          f = File.open('content.html', 'w')
          f.write(response.body)

#	  page = Page.new
#	  page.set_url(@@value)
#	  page.set_content(response.body)
#	  puts ("Page contents :\n" + page_test.get_content)
        end
end

class Page
	@@url = ""
	@@content = ""
	def set_url(val)
		@@url = val
	end
	def set_content(val)
		@@content = val
	end
	@@links = ""
	def initialize
#		@@url = link
		@@url = 'http://en.wikipedia.org/wiki/Tuesday'
		@@content = Net::HTTP.get_response(URI.parse(@@url))
		@@content = @@content.body

		doc = Nokogiri::HTML(open(@@url))
		@@links = doc.css("a")
	end
	def get_url
		return @@url
	end
	def get_content
		return @@content
	end
	def get_links
		return @@links.length
	end
	def show_links
		for i in 0..@@links.length-1
		       	puts @@links[i]["href"]
		end
	end
end

link_test = Link.new
puts ("Link value : " + link_test.get_value)
link_test.download

puts
page_test = Page.new
puts ("Page URL : " + page_test.get_url.to_s)
puts ("Page links num : " + page_test.get_links.to_s)
#puts ("Page links :\n"); page_test.show_links
#puts ("Page contents :\n" + page_test.get_content)

puts
site_test = Site.new
puts ("Site URL : " + site_test.get_url)
puts ("Site protocol : " + site_test.get_protocol)
puts ("Site pages num : " + site_test.get_pages.to_s)
