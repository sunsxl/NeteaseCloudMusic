package com.imooc.imooc_voice.util;

import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;

/*
 *	搜索工具类
 */
public class SearchUtil {

	public static CharSequence getMatchingKeywords(String content, String keywords){

		if(content.contains(keywords)){
			int start = content.indexOf(keywords);
			int end = start + keywords.length();
			String resString = content;
			SpannableStringBuilder style = new SpannableStringBuilder(resString);
			style.setSpan(new ForegroundColorSpan(Color.parseColor("#2196f3")), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
			return style;
		}else{
			return content;
		}

	}

	public static String getCorresPondingString(int num){
		String text;
		if(num > 100000000){
			num = num / 100000000;
			text = num + "亿";
		}else if (num >= 10000) {
			num = num / 10000;
			text = num + "万";
		} else {
			text = num + "";
		}
		return text;
	}

	public static String getCorresPondingString(long num){
		return getCorresPondingString(((Long)num).intValue());
	}

}
