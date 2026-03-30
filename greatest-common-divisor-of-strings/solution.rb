# @param {String} str1
# @param {String} str2
# @return {String}
def gcd_of_strings(str1, str2)
    # Early exit: if concatenations don't match, no common divisor exists
    return "" if str1 + str2 != str2 + str1
    
    # The GCD string length must be the GCD of both string lengths
    gcd_length = str1.length.gcd(str2.length)
    
    # Return the prefix of that length
    str1[0...gcd_length]
end
