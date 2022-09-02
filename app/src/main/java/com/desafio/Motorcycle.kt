package com.desafio

class Motorcycle: Transport()
{
    override var typeTransport: String = "Moto";
    override var quantityWheels: Int = 2;
    override var colorTransport: String = "Black";
    override var spaceTaken:Int = 1;
    override var licensePlate: String = "T23758DA";

    override fun showSpaceTaken(quantitySpace: String)
    {
        println("A $typeTransport ocupa $quantitySpace espacos");
    }
}