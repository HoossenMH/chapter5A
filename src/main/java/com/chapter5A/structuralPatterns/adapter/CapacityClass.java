package com.chapter5A.structuralPatterns.adapter;

/**
 * MH_Hoossen 213223538
 */
public class CapacityClass extends Capacity implements CapacityConverter
{
    @Override
    public double getLiterCapacity()
    {
        return literCapacity;
    }

    @Override
    public double getLiterWeight()
    {
        return toKilograms(literCapacity);
    }

    @Override
    public void setLiterCapacity(double literCapacity)
    {
        this.literCapacity = literCapacity;
    }

    @Override
    public void setLiterWeight(double literW)
    {
        this.literCapacity = toKilograms(literW);
    }

    private double toLiters(double kg)
    {
        return kg;
    }

    private double toKilograms(double liters)
    {
        return liters;
    }
}
