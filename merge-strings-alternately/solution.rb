# @param {String} word1
# @param {String} word2
# @return {String}
def merge_alternately(word1, word2)
  i = 0
  merged = +""

  while i < word1.length || i < word2.length
    merged << word1[i] if i < word1.length
    merged << word2[i] if i < word2.length
    i += 1
  end

  merged
end
