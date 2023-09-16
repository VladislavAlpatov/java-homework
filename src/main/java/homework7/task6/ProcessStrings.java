package homework7.task6;

import homework7.task5.StringUtils;

public class ProcessStrings implements StringUtils
{
    @Override
    public int countCharacters(String s)
    {
        return s.length();
    }

    @Override
    public String getOddPositionCharacters(String s)
    {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2)
        {
            result.append(s.charAt(i));
        }

        return result.toString();
    }

    @Override
    public String reverseString(String s)
    {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }
}