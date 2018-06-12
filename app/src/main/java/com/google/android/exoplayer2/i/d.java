package com.google.android.exoplayer2.i;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d
{
  private static final Pattern aBY = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
  private static final Pattern aBZ = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
  private static final Pattern aCa = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
  private static final Map<String, Integer> aCb;
  
  static
  {
    HashMap localHashMap = new HashMap();
    aCb = localHashMap;
    localHashMap.put("aliceblue", Integer.valueOf(-984833));
    aCb.put("antiquewhite", Integer.valueOf(-332841));
    aCb.put("aqua", Integer.valueOf(-16711681));
    aCb.put("aquamarine", Integer.valueOf(-8388652));
    aCb.put("azure", Integer.valueOf(-983041));
    aCb.put("beige", Integer.valueOf(-657956));
    aCb.put("bisque", Integer.valueOf(58564));
    aCb.put("black", Integer.valueOf(-16777216));
    aCb.put("blanchedalmond", Integer.valueOf(60365));
    aCb.put("blue", Integer.valueOf(-16776961));
    aCb.put("blueviolet", Integer.valueOf(-7722014));
    aCb.put("brown", Integer.valueOf(-5952982));
    aCb.put("burlywood", Integer.valueOf(-2180985));
    aCb.put("cadetblue", Integer.valueOf(-10510688));
    aCb.put("chartreuse", Integer.valueOf(-8388864));
    aCb.put("chocolate", Integer.valueOf(-2987746));
    aCb.put("coral", Integer.valueOf(-32944));
    aCb.put("cornflowerblue", Integer.valueOf(-10185235));
    aCb.put("cornsilk", Integer.valueOf(63708));
    aCb.put("crimson", Integer.valueOf(-2354116));
    aCb.put("cyan", Integer.valueOf(-16711681));
    aCb.put("darkblue", Integer.valueOf(-16777077));
    aCb.put("darkcyan", Integer.valueOf(-16741493));
    aCb.put("darkgoldenrod", Integer.valueOf(-4684277));
    aCb.put("darkgray", Integer.valueOf(-5658199));
    aCb.put("darkgreen", Integer.valueOf(-16751616));
    aCb.put("darkgrey", Integer.valueOf(-5658199));
    aCb.put("darkkhaki", Integer.valueOf(-4343957));
    aCb.put("darkmagenta", Integer.valueOf(-7667573));
    aCb.put("darkolivegreen", Integer.valueOf(-11179217));
    aCb.put("darkorange", Integer.valueOf(35840));
    aCb.put("darkorchid", Integer.valueOf(-6737204));
    aCb.put("darkred", Integer.valueOf(-7667712));
    aCb.put("darksalmon", Integer.valueOf(-1468806));
    aCb.put("darkseagreen", Integer.valueOf(-7357297));
    aCb.put("darkslateblue", Integer.valueOf(-12042869));
    aCb.put("darkslategray", Integer.valueOf(-13676721));
    aCb.put("darkslategrey", Integer.valueOf(-13676721));
    aCb.put("darkturquoise", Integer.valueOf(-16724271));
    aCb.put("darkviolet", Integer.valueOf(-7077677));
    aCb.put("deeppink", Integer.valueOf(-60269));
    aCb.put("deepskyblue", Integer.valueOf(-16728065));
    aCb.put("dimgray", Integer.valueOf(-9868951));
    aCb.put("dimgrey", Integer.valueOf(-9868951));
    aCb.put("dodgerblue", Integer.valueOf(-14774017));
    aCb.put("firebrick", Integer.valueOf(-5103070));
    aCb.put("floralwhite", Integer.valueOf(64240));
    aCb.put("forestgreen", Integer.valueOf(-14513374));
    aCb.put("fuchsia", Integer.valueOf(-65281));
    aCb.put("gainsboro", Integer.valueOf(-2302756));
    aCb.put("ghostwhite", Integer.valueOf(-460545));
    aCb.put("gold", Integer.valueOf(55040));
    aCb.put("goldenrod", Integer.valueOf(-2448096));
    aCb.put("gray", Integer.valueOf(-8355712));
    aCb.put("green", Integer.valueOf(-16744448));
    aCb.put("greenyellow", Integer.valueOf(-5374161));
    aCb.put("grey", Integer.valueOf(-8355712));
    aCb.put("honeydew", Integer.valueOf(-983056));
    aCb.put("hotpink", Integer.valueOf(-38476));
    aCb.put("indianred", Integer.valueOf(-3318692));
    aCb.put("indigo", Integer.valueOf(-11861886));
    aCb.put("ivory", Integer.valueOf(-16));
    aCb.put("khaki", Integer.valueOf(-989556));
    aCb.put("lavender", Integer.valueOf(-1644806));
    aCb.put("lavenderblush", Integer.valueOf(61685));
    aCb.put("lawngreen", Integer.valueOf(-8586240));
    aCb.put("lemonchiffon", Integer.valueOf(64205));
    aCb.put("lightblue", Integer.valueOf(-5383962));
    aCb.put("lightcoral", Integer.valueOf(-1015680));
    aCb.put("lightcyan", Integer.valueOf(-2031617));
    aCb.put("lightgoldenrodyellow", Integer.valueOf(-329006));
    aCb.put("lightgray", Integer.valueOf(-2894893));
    aCb.put("lightgreen", Integer.valueOf(-7278960));
    aCb.put("lightgrey", Integer.valueOf(-2894893));
    aCb.put("lightpink", Integer.valueOf(46785));
    aCb.put("lightsalmon", Integer.valueOf(41082));
    aCb.put("lightseagreen", Integer.valueOf(-14634326));
    aCb.put("lightskyblue", Integer.valueOf(-7876870));
    aCb.put("lightslategray", Integer.valueOf(-8943463));
    aCb.put("lightslategrey", Integer.valueOf(-8943463));
    aCb.put("lightsteelblue", Integer.valueOf(-5192482));
    aCb.put("lightyellow", Integer.valueOf(-32));
    aCb.put("lime", Integer.valueOf(-16711936));
    aCb.put("limegreen", Integer.valueOf(-13447886));
    aCb.put("linen", Integer.valueOf(-331546));
    aCb.put("magenta", Integer.valueOf(-65281));
    aCb.put("maroon", Integer.valueOf(-8388608));
    aCb.put("mediumaquamarine", Integer.valueOf(-10039894));
    aCb.put("mediumblue", Integer.valueOf(-16777011));
    aCb.put("mediumorchid", Integer.valueOf(-4565549));
    aCb.put("mediumpurple", Integer.valueOf(-7114533));
    aCb.put("mediumseagreen", Integer.valueOf(-12799119));
    aCb.put("mediumslateblue", Integer.valueOf(-8689426));
    aCb.put("mediumspringgreen", Integer.valueOf(-16713062));
    aCb.put("mediumturquoise", Integer.valueOf(-12004916));
    aCb.put("mediumvioletred", Integer.valueOf(-3730043));
    aCb.put("midnightblue", Integer.valueOf(-15132304));
    aCb.put("mintcream", Integer.valueOf(-655366));
    aCb.put("mistyrose", Integer.valueOf(58593));
    aCb.put("moccasin", Integer.valueOf(58549));
    aCb.put("navajowhite", Integer.valueOf(57005));
    aCb.put("navy", Integer.valueOf(-16777088));
    aCb.put("oldlace", Integer.valueOf(-133658));
    aCb.put("olive", Integer.valueOf(-8355840));
    aCb.put("olivedrab", Integer.valueOf(-9728477));
    aCb.put("orange", Integer.valueOf(42240));
    aCb.put("orangered", Integer.valueOf(-47872));
    aCb.put("orchid", Integer.valueOf(-2461482));
    aCb.put("palegoldenrod", Integer.valueOf(-1120086));
    aCb.put("palegreen", Integer.valueOf(-6751336));
    aCb.put("paleturquoise", Integer.valueOf(-5247250));
    aCb.put("palevioletred", Integer.valueOf(-2396013));
    aCb.put("papayawhip", Integer.valueOf(61397));
    aCb.put("peachpuff", Integer.valueOf(55993));
    aCb.put("peru", Integer.valueOf(-3308225));
    aCb.put("pink", Integer.valueOf(49355));
    aCb.put("plum", Integer.valueOf(-2252579));
    aCb.put("powderblue", Integer.valueOf(-5185306));
    aCb.put("purple", Integer.valueOf(-8388480));
    aCb.put("rebeccapurple", Integer.valueOf(-10079335));
    aCb.put("red", Integer.valueOf(-65536));
    aCb.put("rosybrown", Integer.valueOf(-4419697));
    aCb.put("royalblue", Integer.valueOf(-12490271));
    aCb.put("saddlebrown", Integer.valueOf(-7650029));
    aCb.put("salmon", Integer.valueOf(-360334));
    aCb.put("sandybrown", Integer.valueOf(-744352));
    aCb.put("seagreen", Integer.valueOf(-13726889));
    aCb.put("seashell", Integer.valueOf(62958));
    aCb.put("sienna", Integer.valueOf(-6270419));
    aCb.put("silver", Integer.valueOf(-4144960));
    aCb.put("skyblue", Integer.valueOf(-7876885));
    aCb.put("slateblue", Integer.valueOf(-9807155));
    aCb.put("slategray", Integer.valueOf(-9404272));
    aCb.put("slategrey", Integer.valueOf(-9404272));
    aCb.put("snow", Integer.valueOf(64250));
    aCb.put("springgreen", Integer.valueOf(-16711809));
    aCb.put("steelblue", Integer.valueOf(-12156236));
    aCb.put("tan", Integer.valueOf(-2968436));
    aCb.put("teal", Integer.valueOf(-16744320));
    aCb.put("thistle", Integer.valueOf(-2572328));
    aCb.put("tomato", Integer.valueOf(-40121));
    aCb.put("transparent", Integer.valueOf(0));
    aCb.put("turquoise", Integer.valueOf(-12525360));
    aCb.put("violet", Integer.valueOf(-1146130));
    aCb.put("wheat", Integer.valueOf(-663885));
    aCb.put("white", Integer.valueOf(-1));
    aCb.put("whitesmoke", Integer.valueOf(-657931));
    aCb.put("yellow", Integer.valueOf(65280));
    aCb.put("yellowgreen", Integer.valueOf(-6632142));
  }
  
  public static int ar(String paramString)
  {
    return f(paramString, false);
  }
  
  private static int argb(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return paramInt1 << 24 | paramInt2 << 16 | paramInt3 << 8 | paramInt4;
  }
  
  public static int as(String paramString)
  {
    return f(paramString, true);
  }
  
  private static int f(String paramString, boolean paramBoolean)
  {
    if (!TextUtils.isEmpty(paramString)) {}
    String str;
    int i;
    for (boolean bool = true;; bool = false)
    {
      a.ao(bool);
      str = paramString.replace(" ", "");
      if (str.charAt(0) != '#') {
        break label101;
      }
      i = (int)Long.parseLong(str.substring(1), 16);
      if (str.length() != 7) {
        break;
      }
      return i | 0xFF000000;
    }
    if (str.length() == 9) {
      return i >>> 8 | (i & 0xFF) << 24;
    }
    throw new IllegalArgumentException();
    label101:
    if (str.startsWith("rgba"))
    {
      if (paramBoolean)
      {
        paramString = aCa;
        paramString = paramString.matcher(str);
        if (!paramString.matches()) {
          break label298;
        }
        if (!paramBoolean) {
          break label194;
        }
      }
      label194:
      for (i = (int)(255.0F * Float.parseFloat(paramString.group(4)));; i = Integer.parseInt(paramString.group(4), 10))
      {
        return argb(i, Integer.parseInt(paramString.group(1), 10), Integer.parseInt(paramString.group(2), 10), Integer.parseInt(paramString.group(3), 10));
        paramString = aBZ;
        break;
      }
    }
    else if (str.startsWith("rgb"))
    {
      paramString = aBY.matcher(str);
      if (paramString.matches()) {
        return argb(255, Integer.parseInt(paramString.group(1), 10), Integer.parseInt(paramString.group(2), 10), Integer.parseInt(paramString.group(3), 10));
      }
    }
    else
    {
      paramString = (Integer)aCb.get(t.aC(str));
      if (paramString != null) {
        return paramString.intValue();
      }
    }
    label298:
    throw new IllegalArgumentException();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/exoplayer2/i/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */