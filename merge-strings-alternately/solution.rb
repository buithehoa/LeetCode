# @param {String} word1
# @param {String} word2
# @return {String}
def merge_alternately(word1, word2)
  length = word1.length <= word2.length ? word1.length : word2.length
  short_word = word1
  long_word = word2

  if word1.length > word2.length
    short_word = word2
    long_word = word1
  end

  merged = ""

  for i in 0...short_word.length
    merged = "#{merged}#{word1[i]}#{word2[i]}"
  end

  merged = "#{merged}#{long_word[short_word.length..long_word.length]}"

  merged
end
