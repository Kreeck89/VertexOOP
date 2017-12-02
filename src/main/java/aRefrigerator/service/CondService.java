package aRefrigerator.service;

import aRefrigerator.model.Conditioner;

import java.util.List;

public interface CondService {

    List<Conditioner> getAllConditioner();
    void printAllConditioners(List<Conditioner> list);
    void turnOFF(int index, List<Conditioner> list);
    void turnON(int index, List<Conditioner> list);
    void tempIS(int index, int temperature, List<Conditioner> list);
}
