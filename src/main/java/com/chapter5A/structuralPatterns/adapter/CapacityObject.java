package com.chapter5A.structuralPatterns.adapter;

/**
 * MH_Hoossen 213223538
 */
public class CapacityObject implements CapacityConverter
{
    Capacity capacity;

    public CapacityObject()
    {
        capacity = new Capacity();
    }

    @Override
    public double getLiterCapacity()
    {
        return capacity.getLiterCapacity();
    }

    @Override
    public double getLiterWeight()
    {
        return toKilograms(capacity.getLiterCapacity());
    }

    @Override
    public void setLiterCapacity(double literWeight)
    {
        capacity.setLiterCapacity(literWeight);
    }

    @Override
    public void setLiterWeight(double literWeight)
    {
        capacity.setLiterCapacity(toKilograms(literWeight));
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
