## NMF (Non-negative Matrix Factorization)
Decompose a matrix V of size (m x n) to muliplication of two smaller matrices W (of size m x r) and H (of size r x n) so that V = WH and r < min(m, n). If V is a matrix in which there are m samples and n features, then information in V can be stored with less parameters in W and H, and that the features are reduced from n -> r. When reconstituting V from W and H, every row in V equals to sum of all columns in W weighted by corresponding column in H.  

There is no analytical solution to NMF, and instead, numerical approximate is done by minimize squared(||V - WH||) with respect to W and H subject to the constraints W, H >= 0. Possible numerical methods include coordinate descent and muliplicative update. In coordinate descent, W is fixed and H is optimized, and then H is fixed and W is optimized, the process iterates until tolerance is met. 

#### References
[youtube video lecture on NMF]()

