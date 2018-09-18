# QuickBrownFox
## Requirements
1. Determine if a sentence contains all the letters of the alphabet.

## Ideas
1. Use a Set to keep track of the letters in the sentence.
1. For each letter in the sentence:
    1. Make sure it is a character in the alphabet.
    1. Change it to lower case.
    1. Use "contains()" to determine if the letter is already being tracked.
        1. Add it if it is not already in the Set
1. Check to set if the set contains 26 objects