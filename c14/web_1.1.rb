require 'rubygems'
require 'net/http'
require 'open-uri'
require 'nokogiri'

$link = 'http://lubo.elsys-bg.org/software_engineering/'
$count = 0

def get_content(url)

  @@value = ($count.to_s + '_content.html')

  response = Net::HTTP.get_response(URI.parse(url))

  f = File.new("#{@@value}", "w")
  f.write(response.body)
  f.close
end

def get_urls

  @@value = (($count).to_s + '_content.html')

  f = File.open("#{@@value}")
  doc = Nokogiri::XML(f)
  f.close

  list = doc.css('a').map { |link| link['href'] }

  f = File.open("urls.txt", 'a')
  f.puts(list)
  f.close
end

get_content($link)
get_urls

File.open("urls.txt").each do |line|
  $count += 1
  if line =~ URI::regexp
    get_content(line)
  end
  if $count > 1 then break end
end
