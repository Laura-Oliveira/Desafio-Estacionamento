package com.desafio

class Car: Transport()
{
    override var typeTransport: String = "Carro";
    override var quantityWheels: Int = 4;
    override var colorTransport: String = "Red";
    override var spaceTaken:Int = 1;
    override var licensePlate: String = "T56758DA";

    override fun showSpaceTaken(quantitySpace: String)
    {
        println("O $typeTransport ocupa $quantitySpace espacos");
    }
}