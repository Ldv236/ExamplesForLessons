package org.example.Tree;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        // Вставляем узлы в дерево
        bst.insert(20); // Корневой узел
        bst.insert(10);
        bst.insert(30);
        bst.insert(5);
        bst.insert(15);
        bst.insert(25);
        bst.insert(35);

        // Печать значений всех узлов в отсортированном порядке
        bst.printInOrder();
    }

}