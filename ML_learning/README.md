## Concepts learnt
### 9-16-2016
#### OLS (ordinary least square): linear regression in which sum of squared error is minimized. 
<img src="http://www.sciweavers.org/tex2img.php?eq=%20%5Cmin_%7Bw%7D%20%7C%7CXw-y%7C%7C_2%5E2&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0" align="center" border="0" alt=" \min_{w} ||Xw-y||_2^2" width="125" height="28" />

#### Ridge regression: penalize large parameters by using following objective function:
<img src="http://www.sciweavers.org/tex2img.php?eq=%20%5Cmin_%7Bw%7D%20%7C%7CXw-y%7C%7C_2%5E2%20%2B%20%20%5Calpha%20%7C%7Cw%7C%7C_2%5E2&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0" align="center" border="0" alt=" \min_{w} ||Xw-y||_2^2 +  \alpha ||w||_2^2" width="201" height="28" />

#### Lasso regression: like Ridge, but L1, like such:
<img src="http://www.sciweavers.org/tex2img.php?eq=%20%5Cmin_%7Bw%7D%20%20%5Cfrac%7B1%7D%7B2n_%7Bsamples%7D%7D%20%7C%7CXw-y%7C%7C_2%5E2%20%2B%20%20%5Calpha%20%7C%7Cw%7C%7C_1&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0" align="center" border="0" alt=" \min_{w}  \frac{1}{2n_{samples}} ||Xw-y||_2^2 +  \alpha ||w||_1" width="281" height="47" />

#### Elastic Net: trade off between Ridge and Lasso by both L1 and L2 regularization.
<img src="http://www.sciweavers.org/tex2img.php?eq=%20%5Cmin_%7Bw%7D%20%20%5Cfrac%7B1%7D%7B2n_%7Bsamples%7D%7D%20%7C%7CXw-y%7C%7C_2%5E2%20%2B%20%20%5Calpha%5Crho%20%20%7C%7Cw%7C%7C_1%20%2B%20%5Cfrac%7B%5Calpha%20%281-%5Crho%29%7D%7B2%7D%7C%7Cw%7C%7C_2%5E2&bc=White&fc=Black&im=png&fs=12&ff=arev&edit=0" align="center" border="0" alt=" \min_{w}  \frac{1}{2n_{samples}} ||Xw-y||_2^2 +  \alpha\rho  ||w||_1 + \frac{\alpha (1-\rho)}{2}||w||_2^2" width="428" height="49" />

### 10-6-2016
#### Confusion Matrix, AUC, plotting of ROC curve
![confusion matrix terminology](http://www.dataschool.io/simple-guide-to-confusion-matrix-terminology/)
![how to plot ROC curve](http://www.dataschool.io/roc-curves-and-auc-explained/)
![sklearn example of ROC curve](http://scikit-learn.org/stable/auto_examples/model_selection/plot_roc.html#sphx-glr-auto-examples-model-selection-plot-roc-py)
