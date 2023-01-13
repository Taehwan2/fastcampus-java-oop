package com.fastcampus.javeoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {
    @DisplayName("지비소트-리스트를 넣으면 정렬된 결과를 보여준디.")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList(){
        JavaSort<Integer> javaSort = new JavaSort<>();
        List<Integer> actual = javaSort.sort(List.of(3, 4, 5, 1,2));
        assertEquals(List.of(1,2,3,4,5),actual);
    }
}