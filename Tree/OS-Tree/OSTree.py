#not compiled
#just a messy interface

import sys


class Node:
	def __init__(self, val):
		self.val = val
		self.rank = -1
		self.left = None
		self.right = None
		self.par = None
	



class OSTree:
	def __init__(self):
		self.root = None
		
		
	def insert(self , item):
		if self.root == None : 
			self.root = Node(item)
			self.root.rank = 1
		else:
			curr = self.root
			while(true):
				if curr.left != None and curr.val >= item:
					curr = curr.left
				elif curr.right != None and curr.val < item:
					curr = curr.right
				else:
					break
			newNode = Node(item)
			newNode.rank = 1
			if curr.val > item:
				curr.left = newNode
				newNode.par = curr
			else:
				curr.right = newNode
				newNode.par = curr
				
				
			while(true):
				if (curr.par == None):
					break
				else:
					curr.rank += 1
					curr = curr.par
			#make it balaced
			
	
	
	def OS_Select(self , nod , j):
		n = nod.left.rank + 1
		if (n == j):
			return curr
		elif n < j :
			self.OS_Select(nod.left , j)
		else:
			self.OS_Select(nod.right , j-nod.left.rank-1)
				
	def deleteNode(self , item):
		curr = self.root
		while(true):
			if curr.val == item:
				break
			elif curr.val < item:
				curr = curr.right
			else:
				curr = curr.left
		#if(curr.left == None):
		#elif (curr.right == None):
		#else:	
			
		
	def create(self , a):
		for item in a:
			T.insert(self.root , item)
	
	



def josephus(m , n):

	#k = n
	j = m
	myTree = OSTree()
	for i in range(0 , n):
		myTree.insert(i)
	for k in range(n , 1):
		j = ((j+m-2) % k) + 1
		x = myTree.OS_Select(j)
		print x
		myTree.deleteNode(j)
		
		
		
		
		
		
		
		
