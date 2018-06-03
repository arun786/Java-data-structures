# Insertion Sort

    1. Sorting algorithm which is an efficient algorithm for small number of elements.
    2. It works like sorting of cards in the hands.
    
    
## Logic

    Given a set of elements.
    
    a[] = {5,2,5,6,8,1}
    
    Step 1 : use a for loop to iterate through the elements.
    
    for(int i= 1; i < a.length; i++)
    
    here we start from the second element as the logic is to compare it with elements on the left.
    
    Step 2 : assign a key starting from the second element.
    
    int key = a[i];, here we assigning the element 2 as the loop starts.
    
    Step 3 : our logic is to compare the key with the element towards the left of the key.
    
    int j = i - 1; so start from the very next element from the key.
    
    Step 4 : check whether the loop is greater than 0 and is greater than the key.
    
    while(j>0 && a[j] > key){
    
    Step 5 : move the element towards the right
    
    a[j+1] = a[j]
    
    Step 6 : Reduce the index j by 1, so that it can be compared to the next element.
    
    j--; 
    
    Step 7: once the condition fails, it comes out of the while loop and key is assigned to index j of the array.
    
    a[j+1] = key;
    
    Step 8 : Similarly continue for the next element on the for loop.
    
### Example :
        a = {5, 2, 4, 6, 1, 3};
        
        i = 1 and Key = 2
        j = 0 element 5
        Compare if j is greater than 0 and a at index 0 value = 5 is greater than or less than key 2
        ------------------
            Condition satisfies so a[1] 2 is swapped by a[0] 5
            After swapping a[1] 5 and a[0] 5
            index j reduced -1
        ------------------
        Once while loop condition is not satisfied...
        key assigned to a[0] 2
        When i = 1 completes, the array looks like this..
        2 5 4 6 1 3 
        ===========================
        i = 2 and Key = 4
        j = 1 element 5
        Compare if j is greater than 0 and a at index 1 value = 5 is greater than or less than key 4
        ------------------
            Condition satisfies so a[2] 4 is swapped by a[1] 5
            After swapping a[2] 5 and a[1] 5
            index j reduced 0
        ------------------
        Once while loop condition is not satisfied...
        key assigned to a[1] 4
        When i = 2 completes, the array looks like this..
        2 4 5 6 1 3 
        ===========================
        i = 3 and Key = 6
        j = 2 element 5
        Compare if j is greater than 0 and a at index 2 value = 5 is greater than or less than key 6
        Once while loop condition is not satisfied...
        key assigned to a[3] 6
        When i = 3 completes, the array looks like this..
        2 4 5 6 1 3 
        ===========================
        i = 4 and Key = 1
        j = 3 element 6
        Compare if j is greater than 0 and a at index 3 value = 6 is greater than or less than key 1
        ------------------
            Condition satisfies so a[4] 1 is swapped by a[3] 6
            After swapping a[4] 6 and a[3] 6
            index j reduced 2
        ------------------
        ------------------
            Condition satisfies so a[3] 6 is swapped by a[2] 5
            After swapping a[3] 5 and a[2] 5
            index j reduced 1
        ------------------
        ------------------
            Condition satisfies so a[2] 5 is swapped by a[1] 4
            After swapping a[2] 4 and a[1] 4
            index j reduced 0
        ------------------
        ------------------
            Condition satisfies so a[1] 4 is swapped by a[0] 2
            After swapping a[1] 2 and a[0] 2
            index j reduced -1
        ------------------
        Once while loop condition is not satisfied...
        key assigned to a[0] 1
        When i = 4 completes, the array looks like this..
        1 2 4 5 6 3 
        ===========================
        i = 5 and Key = 3
        j = 4 element 6
        Compare if j is greater than 0 and a at index 4 value = 6 is greater than or less than key 3
        ------------------
            Condition satisfies so a[5] 3 is swapped by a[4] 6
            After swapping a[5] 6 and a[4] 6
            index j reduced 3
        ------------------
        ------------------
            Condition satisfies so a[4] 6 is swapped by a[3] 5
            After swapping a[4] 5 and a[3] 5
            index j reduced 2
        ------------------
        ------------------
            Condition satisfies so a[3] 5 is swapped by a[2] 4
            After swapping a[3] 4 and a[2] 4
            index j reduced 1
        ------------------
        Once while loop condition is not satisfied...
        key assigned to a[2] 3
        When i = 5 completes, the array looks like this..
        1 2 3 4 5 6 
        ===========================
        1 2 3 4 5 6 