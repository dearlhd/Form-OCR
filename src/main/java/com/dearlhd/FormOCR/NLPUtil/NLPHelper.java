package com.dearlhd.FormOCR.NLPUtil;

import com.huaban.analysis.jieba.JiebaSegmenter;
import com.huaban.analysis.jieba.SegToken;

import java.util.List;

/**
 * Created by dearlhd on 2018/5/2.
 */
public class NLPHelper {

    public static void test () {
        JiebaSegmenter segmenter = new JiebaSegmenter();
        String s = "";
        List<SegToken> tokens = segmenter.process(s, JiebaSegmenter.SegMode.INDEX);
    }


}
