package com.google.android.exoplayer2.i;

import org.xmlpull.v1.XmlPullParser;

public final class u
{
  public static boolean b(XmlPullParser paramXmlPullParser, String paramString)
  {
    if (paramXmlPullParser.getEventType() == 2) {}
    for (int i = 1; (i != 0) && (paramXmlPullParser.getName().equals(paramString)); i = 0) {
      return true;
    }
    return false;
  }
  
  public static String c(XmlPullParser paramXmlPullParser, String paramString)
  {
    int j = paramXmlPullParser.getAttributeCount();
    int i = 0;
    while (i < j)
    {
      if (paramString.equals(paramXmlPullParser.getAttributeName(i))) {
        return paramXmlPullParser.getAttributeValue(i);
      }
      i += 1;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/i/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */