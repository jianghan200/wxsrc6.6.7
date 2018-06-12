package com.tencent.tencentmap.mapsdk.a;

import com.tencent.map.lib.util.StringUtil;
import java.util.Locale;

public class ln
{
  static boolean a = false;
  static boolean b = "CN".equals(Locale.getDefault().getCountry());
  public static String c = "124.240000,39.863000:127.060000,41.420000:128.320000,41.340000:128.338164,41.966811:129.070015,42.006633:129.392187,42.394602:129.544000,42.337000:129.757733,42.443019:129.915455,42.958121:130.581000,42.411000:130.664000,42.409000:130.660000,42.750000:131.056800,42.832500:131.362267,43.147780:131.359097,44.050378:131.184574,44.758711:131.911825,45.219501:133.163642,44.937724:135.144366,48.211013:135.128000,48.597000:131.071828,47.811040:130.773650,49.035551:128.751969,49.726565:125.969075,53.154351:123.347269,53.704738:120.827269,53.390754:119.713597,52.637780:120.321762,52.210396:118.926328,50.226355:117.662701,49.700280:116.622716,49.956516:115.284508,48.000368:116.104389,47.451176:118.485448,47.755809:119.550866,46.911548:117.463642,46.804509:113.640000,45.105329:111.969090,45.243847:111.267254,44.465714:111.589045,43.737317:109.905388,42.763982:107.448179,42.614694:105.337313,41.946215:100.992746,42.800196:96.838239,42.914056:95.070866,44.957807:91.816477,45.242319:91.161836,46.742245:90.130007,47.948495:88.699097,48.336174:87.883642,49.202090:86.809933,49.172099:85.459963,48.255788:85.328157,47.119427:82.919985,47.328453:82.134523,45.619623:82.396343,45.291415:81.735685,45.446091:79.797183,45.018009:80.618157,43.259401:80.112694,42.868284:80.120896,42.260590:77.976351,41.282314:76.788172,41.096389:76.197254,40.491205:75.361880,40.846808:73.365418,39.794560:73.634523,38.503352:74.669067,38.423003:74.896815,37.310540:74.429528,37.294106:74.454501,36.972073:75.734530,36.578999:75.962701,35.784605:77.852731,35.299899:78.205470,34.574291:78.973568,32.910437:78.263619,32.582183:78.649985,30.992536:81.199112,29.930890:81.625396,30.231654:85.988179,27.769037:88.674612,27.787987:88.840910,27.047339:89.241858,27.247275:89.644552,28.077447:90.426358,28.002589:91.425425,27.605415:92.127284,26.721880:93.834582,26.907073:95.855604,28.198876:97.000074,27.593593:97.491836,27.849236:97.700896,28.296779:98.301769,27.394792:98.605433,27.417494:98.502702,26.026786:97.440895,25.088802:97.485448,23.745403:98.497224,24.030523:98.809985,23.174956:99.324515,22.945024:99.099993,22.084196:100.205485,21.391178:101.003735,21.463004:101.278198,21.122876:101.931836,21.129823:101.785481,22.197373:102.650063,22.558783:103.074619,22.382137:103.979093,22.474798:104.809933,22.767793:105.399978,23.049961:106.469971,22.704082:106.610899,21.787060:107.897261,21.372454:107.490036,19.305984:109.748489,14.674666:110.039063,11.480025:107.666016,6.271618:111.752930,3.281824:112.939454,3.413421:115.018257,6.054474:118.674316,10.790140:119.164223,12.212996:119.707031,18.020528:121.397269,20.720622:118.487770,21.778166:119.578789,24.089008:120.465831,25.121382:121.207406,25.815692:121.869972,25.849447:122.742859,25.209509:122.699226,23.809795:127.303391,24.447079:127.390663,31.568056:124.335754,32.823666";
  public static String d = "121.397269,20.720622:118.487770,21.778166:119.578789,24.089008:121.869972,25.849447:122.742859,25.209509:122.699226,23.809795:121.959229,21.677848";
  private static double[] e;
  private static double[] f;
  private static double[] g;
  private static double[] h;
  
  static
  {
    a(c);
    b(d);
  }
  
  public static void a(String paramString)
  {
    if (StringUtil.isEmpty(paramString)) {
      return;
    }
    paramString = c(paramString);
    e = paramString[0];
    f = paramString[1];
  }
  
  public static void a(boolean paramBoolean)
  {
    b = paramBoolean;
  }
  
  public static boolean a(double paramDouble1, double paramDouble2)
  {
    return a(paramDouble1, paramDouble2, e, f);
  }
  
  private static boolean a(double paramDouble1, double paramDouble2, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    int j = paramArrayOfDouble2.length - 1;
    int k = 0;
    int i = 0;
    if (i < paramArrayOfDouble2.length)
    {
      int m;
      if ((paramArrayOfDouble2[i] >= paramDouble2) || (paramArrayOfDouble2[j] < paramDouble2))
      {
        m = k;
        if (paramArrayOfDouble2[j] < paramDouble2)
        {
          m = k;
          if (paramArrayOfDouble2[i] < paramDouble2) {}
        }
      }
      else if (paramArrayOfDouble1[i] > paramDouble1)
      {
        m = k;
        if (paramArrayOfDouble1[j] > paramDouble1) {}
      }
      else
      {
        if (paramArrayOfDouble1[i] + (paramDouble2 - paramArrayOfDouble2[i]) / (paramArrayOfDouble2[j] - paramArrayOfDouble2[i]) * (paramArrayOfDouble1[j] - paramArrayOfDouble1[i]) >= paramDouble1) {
          break label162;
        }
      }
      label162:
      for (j = 1;; j = 0)
      {
        m = k ^ j;
        j = i;
        i += 1;
        k = m;
        break;
      }
    }
    return k;
  }
  
  public static void b(String paramString)
  {
    if (StringUtil.isEmpty(paramString)) {
      return;
    }
    paramString = c(paramString);
    g = paramString[0];
    h = paramString[1];
  }
  
  public static boolean b(double paramDouble1, double paramDouble2)
  {
    return a(paramDouble1, paramDouble2, g, h);
  }
  
  public static void c(double paramDouble1, double paramDouble2)
  {
    if (!a(paramDouble1, paramDouble2)) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  private static double[][] c(String paramString)
  {
    String[] arrayOfString = paramString.split(":");
    if (arrayOfString != null)
    {
      double[][] arrayOfDouble = new double[2][];
      arrayOfDouble[0] = new double[arrayOfString.length];
      arrayOfDouble[1] = new double[arrayOfString.length];
      int k = arrayOfString.length;
      int i = 0;
      int j = 0;
      for (;;)
      {
        paramString = arrayOfDouble;
        if (i >= k) {
          break;
        }
        paramString = arrayOfString[i].split(",");
        arrayOfDouble[0][j] = Double.parseDouble(paramString[0]);
        arrayOfDouble[1][j] = Double.parseDouble(paramString[1]);
        j += 1;
        i += 1;
      }
    }
    paramString = null;
    return paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ln.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */