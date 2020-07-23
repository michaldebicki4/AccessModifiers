package com.javablop;
//1 the accessible interface jest widoczny w paczce com.javablop
//2 ins variable SOME_CONSTANT - wszystkie te variables są dostępne poza interfejs
//3 methoda jest publiczna
//4 methodaB i C są ciągle publiczne bo to jest interfejs
interface Accesable {
    int SOME_CONSTANT = 100;
    public void methodA();
    void  methodB();
    boolean methodC();
}
