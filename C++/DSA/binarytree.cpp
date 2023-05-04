#include<iostream>
using namespace std;
 
class BSTNode
{
public:
    int Key;
    BSTNode * Left;
    BSTNode * Right;
    BSTNode * Parent;
};
BSTNode *BST :: Insert(BSTNode * node, int key)
{
    if(node == NULL)
    {
        node = new BSTNode;
        node->Key = key;
        node->Left = NULL;
        node->Right = NULL;
        node->Parent = NULL;
    }
    else if(node->key < key){
        node->Right = Insert(node->Right, key);
        node->Right->Parent = node;
    }
    else
    {
        node->Left = Insert(node->Left, key);
        node->Left->Parent = node;
    }
int main() {
	BSTNode* root = NULL;
    void BST::Insert(int key){
        root = Insert(root,15);	
        root = Insert(root,10);	
        root = Insert(root,20);
        root = Insert(root,25);
        root = Insert(root,8);
        root = Insert(root,12);
    }