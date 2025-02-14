package com.test.transactions;

import lombok.Getter;
import lombok.Setter;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.function.Consumer;

@Getter
@Setter
public class CreditCardTransaction<T> {

    private T value;

}
