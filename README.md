# Make Change

### Overview:
The MakeChange program allows a user to enter the price of an item followed by the tender rendered for the item. The program will return the change due to the purchaser by aggregated by the largest USD denomination to the smallest. A $20 bill is the highest denomination for change.

### How to use:

The user will first enter the price of the object. The user will then enter the amount paid for the item. If the amount paid matches the price of the item, the system will notify the user no change is due. If the amount paid is less than the price of the item, the user will be notified they need to increase the amount paid.
### Technologies:

Conditionals
Modulus operator

Use larges modular to calculate down resetting the total each time.

### Lessons Learned:
Had an issue with rounding when aggregating the penny denomination. A round statement was inserted to resolve the issue.

#####################
