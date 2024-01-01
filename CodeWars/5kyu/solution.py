

def perimeter(n) -> int:
    if n == 1:
        return 1
    if n == 2:
        return 2

    numbers: list = [1, 1, 2]
    sum = 0

    for i in range(n - 1):
        sum += numbers[i] + numbers[i - 1]
        numbers.append(sum)

    print(numbers)
    return 4*sum

print(perimeter(5))















































# def validPassword(element):
#     threes = False; threesCharacter=''
#     twos = False; twosCharatcer=''
#
#
#     for i in range(len(element)-2):
#         if element[i] == element[i+1] == element[i+2]:
#             if (threes == False):
#                 threes = True
#                 threesCharacter=element[i]
#             elif(threes==True):
#                 return False
#
#     for i in range(len(element)-1):
#         if element[i] != threesCharacter:
#             if element[i] == element[i+1]:
#                 if twos == False:
#                     twosCharatcer=element[i]
#                     twos = True
#                 else:
#                     return False
#
#
#
#
#
#     if(twos and threes):
#         return True
#     return False
#
#
# n = int(input())
#
# passwords = []
#
# for i in range(n):
#     passwords.append((input()))
#
# for i in passwords:
#     if len(i) < 10:
#         passwords.remove(i)
#
#
# sum = 0
# for i in range(len(passwords)):
#     if validPassword(passwords[i]):
#         sum += int(passwords[i][-1])
#
# print(sum)
#
#
