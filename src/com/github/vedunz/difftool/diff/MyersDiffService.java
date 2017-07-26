package com.github.vedunz.difftool.diff;

import org.apache.commons.text.diff.*;

import java.util.ArrayList;
import java.util.Collection;

import java.util.List;

/**
 * Created by vedun on 24.07.2017.
 */
public class MyersDiffService extends MyersDiffServiceCommon implements DiffService {

    List<String> firstText = new ArrayList<>();
    List<String> secondText = new ArrayList<>();


    @Override
    public void uploadFirstText(Collection<String> lines) {
        firstText.clear();
        firstText.addAll(lines);
    }

    @Override
    public void uploadSecondText(Collection<String> lines) {
        secondText.clear();
        secondText.addAll(lines);

    }

    @Override
    public DiffResult getDiffResult() {
        return getDiffResult(firstText, secondText);
    }
}
