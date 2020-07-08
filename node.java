/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nttun
 */
public class node {

    node next;
    int value;

    public node(int value) {
        this.value = value;
    }

    void print() {
        System.out.println(this.value);
        if (this.next != null) {
            this.next.print();
        }
    }

    void reverse() {
        node next = this.next;
        node head = this;
        while (this.next != null) {
            this.next = next.next;
            next.next = head;
            head = next;
            next = this.next;
        }
    }
}
