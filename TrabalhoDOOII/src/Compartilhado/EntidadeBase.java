package Compartilhado;

import java.util.Random;

public abstract class EntidadeBase {
    private Random rand = new Random();
    protected int id = rand.nextInt(0, 30);
}
