# Decision Tree

#### Introduction
- **Decision Tree Algorithm**:
  - A classification scheme generating a tree and a set of rules from a given dataset.
  - Divides records into two subsets: training set and test set.
  - Attributes can be numerical or categorical.

- **Properties of a Decision Tree**:
  - Inner nodes represent attributes.
  - Edges represent tests on attributes.
  - Leaves represent classes.
  - Constructed based on training data using a top-down strategy.

#### Decision Tree Example
- **Dataset**:
  - Attributes include numerical (temperature, humidity) and categorical (outlook, wind).
  - Aim: Determine whether to play baseball based on attribute values.

- **Rules Derived from Decision Tree**:
  - If it is sunny and humidity ≤ 75%, then play.
  - If it is sunny and humidity > 75%, then do not play.
  - If it is overcast, then play.
  - If it is rainy and not windy, then play.
  - If it is rainy and windy, then do not play.

#### Constructing Decision Trees
- **Greedy Strategy**:
  - Uses locally optimal decisions to partition data.
  - **Hunt’s Algorithm**:
    - Constructs the tree recursively in a top-down manner.
    - All training examples start at the root.
    - Attributes are selected based on heuristic or statistical measures.
    - Tree stops growing if all samples at a node belong to the same class, no attributes remain for partitioning, or no samples are left.

- **Common Algorithms**:
  - ID3 (Iterative Dichotomizer 3): Uses information gain.
  - CART (Classification and Regression Trees): Uses Gini index.
  - C4.5: An extension of ID3 using gain ratio.

#### Splitting Criteria and Measures
- **Entropy**:
  - Measures homogeneity of a set of examples.
  - $Entropy(S) = - (p/t)log2(p/t) - (n/t)log2(n/t)$, where p and n are the counts of positive and negative examples.
  - Pure sets have entropy 0, and sets with equal class distribution have entropy 1.

- **Information Gain**:
  - Measures reduction in entropy after a split.
  - Choose the attribute with the highest information gain.

- **Gini Index**:
  - Measures impurity of a node.
  - $Gini(S) = 1 - Σ (p_i^2)$, where p_i is the probability of an instance belonging to class i.

#### Rule Extraction
- **IF-THEN Rules**:
  - Derived from paths from the root to the leaf nodes.
  - Each path forms a conjunction of attribute-value pairs.
  - Easier for humans to understand.

#### Classification Task
- **Process**:
  - Traverse the tree from root to leaf to classify an unknown instance.
  - Apply attribute tests at each node until reaching a leaf.

- **Accuracy**:
  - Measured by the percentage of correctly classified test data.
  - Accuracy for each rule can be calculated based on the test data.

#### Pruning
- **Issues**:
  - **Underfitting**: Both training and test errors are large due to an overly simple model.
  - **Overfitting**: Training errors are small, but test errors are large due to a complex model.

- **Pruning Techniques**:
  - **Prepruning**: Stop tree construction early if splitting does not improve a predefined measure.
  - **Postpruning**: Remove branches from a fully grown tree using a validation set to choose the best-pruned tree.

- **Comparison**:
  - Prepruning is faster but may miss interactions between attributes.
  - Postpruning is preferred as it considers the entire tree.

#### Strengths and Weaknesses
- **Strengths**:
  - Generate understandable rules.
  - Handle numerical and categorical attributes.
  - Identify important fields for prediction or classification.
  - Perform classification with minimal computation.

- **Weaknesses**:
  - Computationally expensive to grow the tree.
  - Some decision trees handle only binary-valued target classes.
  - Error-prone with too many classes.
 
### Example
Sure! Let's go through a detailed example of constructing a decision tree using a small dataset and calculating information gain to determine the best attribute for splitting at each step.

### Example Dataset

Consider a simple dataset with four attributes: Outlook, Temperature, Humidity, and Windy. The target variable is whether to play tennis or not (PlayTennis). Here’s the dataset:

| Day  | Outlook | Temperature | Humidity | Windy | PlayTennis |
|------|---------|-------------|----------|-------|------------|
| D1   | Sunny   | Hot         | High     | False | No         |
| D2   | Sunny   | Hot         | High     | True  | No         |
| D3   | Overcast| Hot         | High     | False | Yes        |
| D4   | Rain    | Mild        | High     | False | Yes        |
| D5   | Rain    | Cool        | Normal   | False | Yes        |
| D6   | Rain    | Cool        | Normal   | True  | No         |
| D7   | Overcast| Cool        | Normal   | True  | Yes        |
| D8   | Sunny   | Mild        | High     | False | No         |
| D9   | Sunny   | Cool        | Normal   | False | Yes        |
| D10  | Rain    | Mild        | Normal   | False | Yes        |
| D11  | Sunny   | Mild        | Normal   | True  | Yes        |
| D12  | Overcast| Mild        | High     | True  | Yes        |
| D13  | Overcast| Hot         | Normal   | False | Yes        |
| D14  | Rain    | Mild        | High     | True  | No         |

### Step-by-Step Construction

1. **Calculate the Entropy of the Entire Dataset (S)**:

   Entropy is given by:
   \[
   $$\text{Entropy}(S) = -p_{\text{yes}} \log_2(p_{\text{yes}}) - p_{\text{no}} \log_2(p_{\text{no}})$$
   \]
   - Total examples (S): 14
   - Positive examples (PlayTennis = Yes): 9
   - Negative examples (PlayTennis = No): 5

   \[
   $$p_{\text{yes}} = \frac{9}{14}, \quad p_{\text{no}} = \frac{5}{14}$$
   \]

   \[
   $$\text{Entropy}(S) = -\left(\frac{9}{14}\right) \log_2\left(\frac{9}{14}\right) - \left(\frac{5}{14}\right) \log_2\left(\frac{5}{14}\right)$$
   \]
   \[
   $$= -0.642857 \log_2(0.642857) - 0.357143 \log_2(0.357143)$$
   \]
   \[
   $$= -0.642857 \times (-0.459148) - 0.357143 \times (-1.485426)$$
   \]
   \[
   $$= 0.295656 + 0.530509 = 0.826$$
   \]

2. **Calculate the Information Gain for Each Attribute**:

   **Outlook**:
   - Possible values: Sunny, Overcast, Rain
   - Entropy for each subset:
     - Sunny: 5 examples (2 Yes, 3 No)
     - Overcast: 4 examples (4 Yes, 0 No)
     - Rain: 5 examples (3 Yes, 2 No)

   \[
   $$\text{Entropy(Sunny)} = -\left(\frac{2}{5}\right) \log_2\left(\frac{2}{5}\right) - \left(\frac{3}{5}\right) \log_2\left(\frac{3}{5}\right)$$
   \]
   \[
   $$= -0.4 \log_2(0.4) - 0.6 \log_2(0.6) = 0.971$$
   \]

   \[
   $$\text{Entropy(Overcast)} = -\left(\frac{4}{4}\right) \log_2\left(\frac{4}{4}\right) - \left(\frac{0}{4}\right) \log_2\left(\frac{0}{4}\right) = 0$$
   \]

   \[
   $$\text{Entropy(Rain)} = -\left(\frac{3}{5}\right) \log_2\left(\frac{3}{5}\right) - \left(\frac{2}{5}\right) \log_2\left(\frac{2}{5}\right) = 0.971$$
   \]

   Weighted sum for Outlook:
   \[
   $$\text{Entropy(Outlook)} = \left(\frac{5}{14}\right) \times 0.971 + \left(\frac{4}{14}\right) \times 0 + \left(\frac{5}{14}\right) \times 0.971$$
   \]
   \[
   $$= 0.347 + 0 + 0.347 = 0.694$$
   \]

   \[
   $$\text{Gain(S, Outlook)} = \text{Entropy(S)} - \text{Entropy(Outlook)} = 0.826 - 0.694 = 0.132$$
   \]

   **Temperature**:
   - Possible values: Hot, Mild, Cool
   - Entropy for each subset:
     - Hot: 4 examples (2 Yes, 2 No)
     - Mild: 6 examples (4 Yes, 2 No)
     - Cool: 4 examples (3 Yes, 1 No)

   \[
   $$\text{Entropy(Hot)} = -\left(\frac{2}{4}\right) \log_2\left(\frac{2}{4}\right) - \left(\frac{2}{4}\right) \log_2\left(\frac{2}{4}\right) = 1$$
   \]

   \[
   $$\text{Entropy(Mild)} = -\left(\frac{4}{6}\right) \log_2\left(\frac{4}{6}\right) - \left(\frac{2}{6}\right) \log_2\left(\frac{2}{6}\right) = 0.918$$
   \]

   \[
   $$\text{Entropy(Cool)} = -\left(\frac{3}{4}\right) \log_2\left(\frac{3}{4}\right) - \left(\frac{1}{4}\right) \log_2\left(\frac{1}{4}\right) = 0.811$$
   \]

   Weighted sum for Temperature:
   \[
   $$\text{Entropy(Temperature)} = \left(\frac{4}{14}\right) \times 1 + \left(\frac{6}{14}\right) \times 0.918 + \left(\frac{4}{14}\right) \times 0.811$$
   \]
   \[
   $$= 0.286 + 0.393 + 0.232 = 0.911$$
   \]

   \[
   $$\text{Gain(S, Temperature)} = \text{Entropy(S)} - \text{Entropy(Temperature)} = 0.826 - 0.911 = -0.085$$
   \]

   **Humidity**:
   - Possible values: High, Normal
   - Entropy for each subset:
     - High: 7 examples (3 Yes, 4 No)
     - Normal: 7 examples (6 Yes, 1 No)

   \[
   $$\text{Entropy(High)} = -\left(\frac{3}{7}\right) \log_2\left(\frac{3}{7}\right) - \left(\frac{4}{7}\right) \log_2\left(\frac{4}{7}\right) = 0.985$$
   \]

   \[
   $$\text{Entropy(Normal)} = -\left(\frac{6}{7}\right) \log_2\left(\frac{6}{7}\right) - \left(\frac{1}{7}\right) \log_2\left(\frac{1}{7}\right) = 0.592$$
   \]

   Weighted sum for Humidity:
   \[
   $$\text{Entropy(Humidity)} = \left(\frac{7}{14}\right) \times 0.985 + \left(\frac{7}{14}\right) \times 0.592$$
   \]
   \[
   $$= 0.493 + 0.296 = 0.789$$
   \]

   \[
   $$\text{Gain(S, Humidity)} = \text{Entropy(S)} - \text{Entropy(Humidity)} = 0.826 - 0.789 = 0.037$$
   \]

   **Windy**:
   - Possible values: False, True
   - Entropy for each subset:
     - False: 8 examples (6 Yes, 2 No)
     - True: 6 examples (3 Yes, 3 No)

   \[
   $$\text{Entropy(False)} = -\left(\frac{6}{8}\right) \log_2\left(\frac{6}{8}\

right) - \left(\frac{2}{8}\right) \log_2\left(\frac{2}{8}\right) = 0.811$$
   \]

   \[
   $$\text{Entropy(True)} = -\left(\frac{3}{6}\right) \log_2\left(\frac{3}{6}\right) - \left(\frac{3}{6}\right) \log_2\left(\frac{3}{6}\right) = 1$$
   \]

   Weighted sum for Windy:
   \[
   $$\text{Entropy(Windy)} = \left(\frac{8}{14}\right) \times 0.811 + \left(\frac{6}{14}\right) \times 1$$
   \]
   \[
   $$= 0.463 + 0.429 = 0.892$$
   \]

   \[
   $$\text{Gain(S, Windy)} = \text{Entropy(S)} - \text{Entropy(Windy)} = 0.826 - 0.892 = -0.066$$
   \]

### Decision
- The attribute with the highest information gain is chosen as the root node.
- From the calculations, **Outlook** has the highest information gain (0.132).

### Next Steps
1. **Split the Dataset Based on Outlook**:
   - Create subsets for Sunny, Overcast, and Rain.

2. **Repeat the Process for Each Subset**:
   - For each subset, calculate the entropy and information gain for the remaining attributes.
   - Continue splitting the dataset and growing the tree until all samples at a node belong to the same class or no attributes remain for partitioning.

This step-by-step process illustrates how to construct a decision tree by calculating entropy and information gain to choose the best attribute for splitting at each step.

### Key Concepts
- **Overfitting**: Too complex models that fit training data too well, capturing noise.
- **Underfitting**: Too simple models that do not capture the underlying data patterns.
- **Entropy and Gini Index**: Measures of impurity or uncertainty in data.
- **Pruning**: Techniques to simplify the tree and avoid overfitting.

### Conclusion
Decision Trees are a versatile and interpretable classification method but must be carefully constructed and pruned to avoid overfitting and underfitting. Properly balanced, they provide a powerful tool for decision-making with clear visualizations and understandable rules.
