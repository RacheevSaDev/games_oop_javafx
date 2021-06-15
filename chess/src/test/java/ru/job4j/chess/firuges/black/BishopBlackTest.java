package ru.job4j.chess.firuges.black;


import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest  {
    @Test
    public void positionTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        Cell result = bishopBlack.position();
        Cell expect = Cell.A3;
        assertThat(result, is(expect));
    }

    @Test
    public void copyTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        Cell result = bishopBlack.copy(Cell.B2).position();
        Cell expect = Cell.B2;
        assertThat(result, is(expect));
    }

    @Test
    public void wayTest() throws ImpossibleMoveException {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.G5);
        Cell[] expect = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(result, is(expect));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void wayImpossibleTest() throws ImpossibleMoveException {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.G6);
        Cell[] expect = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(result,  is(expect));
    }

}