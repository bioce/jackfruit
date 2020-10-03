package com.github.bioce.jackfruit.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author dingyu
 */
public class RegexUtils {

    private static Pattern PATTERN_GROUP_NAME = Pattern.compile("\\(\\?<([a-zA-Z][a-zA-Z0-9]*)>");

    public static boolean isMatch(String regex, String s) {
        return Pattern.matches(regex, s);
    }

    public static boolean isMatch(Pattern pattern, String s) {
        return pattern.matcher(s).matches();
    }

    /**
     * 获取正则表达式中的所有groupName
     * @param regex 正则表达式
     * @return groupName list
     */
    public static List<String> getNamedGroupCandidates(String regex) {
        List<String> namedGroups = new ArrayList<>();
        if (StringUtils.isEmpty(regex)) {
            return namedGroups;
        }

        Matcher m = PATTERN_GROUP_NAME.matcher(regex);
        while (m.find()) {
            namedGroups.add(m.group(1));
        }
        return namedGroups;
    }

}
