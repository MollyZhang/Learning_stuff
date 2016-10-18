### Key points:
0. ascii: 0-128 really simple symbols that can be stored in a byte
1. unicode: 1.1 million all kinds of crazy symbols storesd as an abstract sequence of code points. 
    unicode can be encoded as (utf-8, utf-7, utf-16 etc) which maps different seuqence sof bytes to unicode code points
2. I/O: always byte string
3. different library's APIs accept different encoding, sometimes ascii, sometimes unicode
