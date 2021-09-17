# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        start = ListNode();
        current = start;
        
        carry = 0
        while l1 or l2 : 
            l1 = ListNode(0) if l1 == None else l1
            l2 = ListNode(0) if l2 == None else l2
            
            sum = l1.val + l2.val + carry
            current.next = ListNode(sum % 10)
            carry = sum // 10
            
            current = current.next
            l1 = l1.next
            l2 = l2.next
            
        if carry == 1:
            current.next = ListNode(1)
            
        
        return start.next            
        