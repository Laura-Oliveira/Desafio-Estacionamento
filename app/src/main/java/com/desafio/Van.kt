package com.desafio

class Van: Transport()
{
    override var typeTransport: String = "Van";
    override var quantityWheels: Int = 4;
    override var colorTransport: String = "White";
    override var spaceTaken:Int = 3;
    override var licensePlate: String = "T567589D";

    override fun showSpaceTaken(quantitySpace: String)
    {
        println("A $typeTransport ocupa $quantitySpace espacos");
    }
}