package com.aerotivelabs.memento;

import java.util.*;

public class Memento implements IMemento{
    private IStatus mementoObject;
    private List<OrderState> stateHistory;
    private int index;

    public Memento() {
        stateHistory=new ArrayList<>();
    }

    @Override
    public void listen(IStatus object) {
        mementoObject=object;
    }

    @Override
    public void onChange(OrderState state) {
        stateHistory.add(index,state);
        index++;
    }

    public void Undo(){
        mementoObject.setState(stateHistory.get(--index));
    }

    public void Redo()
    {
        mementoObject.setState(stateHistory.get(++index));
    }
}
