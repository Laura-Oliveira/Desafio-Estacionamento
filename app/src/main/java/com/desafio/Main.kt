package com.desafio

import java.util.*

class Main
{
    lateinit var typeTransport: String;
    lateinit var quantitySpace: String;
    private val reader = Scanner(System.`in`);

    fun buildCar()
    {
        val car: Car = Car();
        car.showSpaceTaken(quantitySpace);
    }

    fun buildMotorcycle()
    {
        val motorcycle: Motorcycle = Motorcycle();
        motorcycle.showSpaceTaken(quantitySpace);
    }

    fun buildVan()
    {
        val van: Van = Van();
        van.showSpaceTaken(quantitySpace);
    }

    fun main()
    {
        print("Qual transporte voce deseja utilizar no estacionamento?");
        typeTransport = reader.nextLine();

        if (typeTransport != null || typeTransport != "")
        {
            if(typeTransport == "Carro")
            {
                buildCar();
            }
            else if(typeTransport == "Moto")
            {
                buildMotorcycle();
            }
            else if(typeTransport == "Van")
            {
                buildVan();
            }
            else
            {
                println("Tipo de transporte invalido. Checar se a inicial da palavra esta maiuscula")
            }
        }
    }
}