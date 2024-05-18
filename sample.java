def find_second_largest(arr):
    # Initialize the first and second largest to the smallest possible values
    first = second = float('-inf')
    
    for num in arr:
        # Update first and second accordingly
        if num > first:
            second = first
            first = num
        elif num > second and num != first:
            second = num
            
    return second

# Example usage
arr = [12, 35, 1, 10, 34, 1]
second_largest = find_second_largest(arr)
print(f"The second largest element is {second_largest}")
