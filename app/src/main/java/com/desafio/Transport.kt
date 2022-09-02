package com.desafio

open class Transport
{
    protected open var typeTransport: String = "";
    protected open var quantityWheels: Int = 0;
    protected open var colorTransport: String = "";
    protected open var spaceTaken:Int = 0;
    protected open var licensePlate: String = "";

    open fun showSpaceTaken(quantitySpace: String)
    {
        println("$typeTransport ocupa $quantitySpace espacos");
    }
}