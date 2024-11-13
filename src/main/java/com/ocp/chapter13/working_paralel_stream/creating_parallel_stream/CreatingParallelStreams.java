package com.ocp.chapter13.working_paralel_stream.creating_parallel_stream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreatingParallelStreams {

    public static void main(String[] args) {

        Collection<Integer> collections = List.of(1);
        Stream<Integer> p1 = collections.stream().parallel();
        Stream<Integer> p2 = collections.parallelStream();
    }
}
