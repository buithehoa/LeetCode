# Copilot Instructions for This Repository

## Build, test, and lint commands

### Ruby track (`ruby/`)
- Install dependencies:
  - `cd ruby && bundle install`
- Run full Ruby test suite:
  - `cd ruby && bundle exec rspec`
- Run a single Ruby spec file:
  - `cd ruby && bundle exec rspec spec/two_pointers/merge_strings_alternatively_spec.rb`
- Run a single Ruby example by line:
  - `cd ruby && bundle exec rspec spec/two_pointers/merge_strings_alternatively_spec.rb:4`

### Java track (`Arrays/`)
- No Maven/Gradle wrapper is present; Java solutions are plain source files under `Arrays/src/com/leetcode/arrays`.
- JUnit 5 jars are vendored in `Arrays/lib/` and tests are authored as JUnit 5 classes beside solution classes.
- Typical execution path is IDE-based (IntelliJ): run a single test method/class from the gutter in `*Test.java`.

### Linting
- No repository lint tool configuration is present (no RuboCop, Checkstyle, SpotBugs, or equivalent config files).

## High-level architecture

This repository is a multi-track LeetCode practice workspace rather than a single app:

- `Arrays/` is a Java track with one class per problem (`ContainerWithMostWater`, `ThreeSum`, `NextPermutation`) and a matching JUnit test class per problem in the same package (`com.leetcode.arrays`).
- `ruby/` is a Ruby track organized by topic (`lib/two_pointers/...`) with RSpec tests under mirrored paths in `spec/`.
- `merge-strings-alternately/solution.rb` is a standalone Ruby solution script outside the `ruby/` gem-style layout, used as a separate solution artifact.

There is no shared runtime between Java and Ruby tracks; each problem solution is self-contained within its language folder.

## Key conventions in this codebase

- **One-problem/one-class (Java):** Each LeetCode problem maps to one Java class and one dedicated `*Test.java` file in the same package.
- **In-place mutation where problem expects it:** For problems like `NextPermutation`, tests assert the input array contents after calling the method, so preserve in-place behavior.
- **Order-insensitive assertions for combinatorial outputs:** `ThreeSumTest` compares result sets using `containsAll` in both directions rather than relying on list ordering.
- **Topic-based namespacing in Ruby:** Ruby implementations are grouped by problem category (`two_pointers`) and loaded in specs via `require_relative` paths that mirror `lib/`.
- **LeetCode-style function signatures in Ruby:** Methods retain LeetCode comment headers (`@param`, `@return`) and top-level function form rather than class wrappers.
- **Prefer extending existing tracks instead of inventing new structure:** Add new Java problems under `Arrays/src/com/leetcode/arrays/` with matching tests, and Ruby problems under `ruby/lib/<topic>/` with mirrored `ruby/spec/<topic>/`.
