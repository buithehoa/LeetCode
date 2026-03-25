# @param {String} str1
# @param {String} str2
# @return {String}
def gcd_of_strings(str1, str2)
    str = str1.length < str2.length ? str1 : str2;

    divisors = []
    divisor = ""
    str.each_char do |c|
      divisor += c

      next if (str1.length % divisor.length != 0 || str2.length % divisor.length != 0)

      is_divisor1 = str1 == divisor * (str1.length / divisor.length)
      is_divisor2 = str2 == divisor * (str2.length / divisor.length)

      if is_divisor1 && is_divisor2
        divisors << divisor
      end
    end

    divisors.length == 0 ? "" : divisors.last
end
