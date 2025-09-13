package com.example.practicaparaclaseskotlin

import kotlin.math.sqrt

class tda_Triangulo2
{
    private var _l1: Float=0f;
    var L1: Float
        get()=_l1
        set(value){_l1=value}
    private var _l2: Float=0f
    var L2:Float
        get() =_l2
        set(value) {_l2=value}

    private var _l3 :Float=0f
    var L3:Float
        get() =_l3
        set(value) {_l3=value}

    fun constructor(l1:Float,l2:Float, l3:Float){
        _l1=L1
        _l2=L2
        _l3=L3
    }
    fun Area():Float{
        var s=(_l1+_l2+_l3)/2
        return sqrt(x=s*(s-_l1)*(s-_l2)*(s-_l3))
    }
}