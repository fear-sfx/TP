# Технологично училище Електронни системи - http://http://www.elsys-bg.org/
# клас : 11б
# номер : 27
# име : Тодор Маноилов
# задача : Да се разработи програма симулираща местата в самолет (27 реда, 2 колони и по 3 места в колона).
# На случаен принцип се генерират числа (между 1 и 3), определящи броя на пътниците, които ще се качат на самолета,
# като те задължително трябва седят един до друг. Програмата спира, когато целият самолет е пълен.

class AirPlane

	@@seats = Array.new(6) {Array.new(27)}

        def initialize
                i = 0; j = 0
                while (i < 6 and j < 27)
                        @@seats[i][j] = 0
                        i += 1
                        if(i == 6)
                                j += 1; i = 0
                        end
                end
        end

        def printSeats
                i = 0; j = 0
                while (i < 6 and j < 27)
                        print @@seats[i][j]
                        i += 1                        
                        if(i == 6)
                                j += 1; i = 0
                                printf "\n"
                        end
                        if(i == 3)
                                print "|  |"
                        end
                end
        end

	def addPpl(val)
		bool = [true, false]
		free = false
		i = 0; j = 0; flag = 0
		while(free == false and i < 27)
			if(@@seats[j][i] == 0)
				if(j+val <= 6)
					t = 0
					while(t < val)
						if(@@seats[j+t][i] != 0)
							i += 1; j = 0
							break;
						else
							free = true
							if(j < 3)
								flag = 1
							end
						end
						t += 1
					end
				else
					i += 1; j = 0;
					if(i >= 27)
						break;
					end
				end
			else
				j += 1
				if(j == 6)
					i += 1; j = 0
				end
				if(i > 27)
					break;
				end
			end
		end
		if(flag == 1 and j+val > 3)
			j += (3 - j)
		end
		t = 0
		while(t < val)
			@@seats[j+t][i] = val;
			t += 1
		end
	end


	def freeSeats
		i = 0; j = 0; counter = 0
		while(i < 27)
			while(j < 6)
				if(@@seats[j][i] == 0)
					counter += 1
				end
                	        j += 1
			end
			i += 1; j = 0
		end
		return counter
	end

end


plane = AirPlane.new
printf "Free seats before : "
print plane.freeSeats
printf "\n"

while(plane.freeSeats != 0)
	randNum = rand(3) + 1
	plane.addPpl(randNum)
end

plane.printSeats

printf "Free seats after : "
print plane.freeSeats
printf "\n"
