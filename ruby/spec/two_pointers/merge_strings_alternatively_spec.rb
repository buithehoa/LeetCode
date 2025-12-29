require_relative '../../lib/two_pointers/merge_strings_alternately'

RSpec.describe 'merge_alternately' do
  it 'returns correct indices' do
    expect(merge_alternately("abc", "pqr")).to eq("apbqcr")

    puts "Test case 1 passed"
  end
end

