package org.patterns.adapter;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        VideoPlayer videoPlayer = new VideoPlayer();

        MediaAdapter mediaAdapter = new MediaAdapter(videoPlayer);
        mediaAdapter.play();

        String[] array = {"One", "Two", "Three"};
        System.out.println(Arrays.toString(array));

        List<String> strings = Arrays.asList(array);
//        strings.add("new");
        strings.set(0, "1");
        System.out.println(Arrays.toString(array));

    }
}