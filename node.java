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
        if (this.next == null) {
            System.out.println(this.value);
        } else {
            System.out.println(this.value);
            this.next.print();
        }
    }
}
