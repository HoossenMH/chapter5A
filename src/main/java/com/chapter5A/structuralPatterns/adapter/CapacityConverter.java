package com.chapter5A.structuralPatterns.adapter;

/**
 * MH_Hoossen 213223538
 */
public interface CapacityConverter
{
    public double getLiterWeight();
    public double getLiterCapacity();
    public void setLiterCapacity(double literCapacity);
    public void setLiterWeight(double literWeight);
}
