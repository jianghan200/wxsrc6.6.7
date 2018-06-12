package com.tencent.mm.c;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class f
{
  private static boolean bxy = false;
  
  private static void a(Map<String, String> paramMap, String paramString1, String paramString2, Node paramNode, int paramInt)
  {
    if (paramNode.getNodeName().equals("#text"))
    {
      paramMap.put(paramString1, paramNode.getNodeValue());
      paramMap.put(paramString2, paramNode.getNodeValue());
      return;
    }
    if (paramNode.getNodeName().equals("#cdata-section"))
    {
      paramMap.put(paramString1, paramNode.getNodeValue());
      paramMap.put(paramString2, paramNode.getNodeValue());
      return;
    }
    Object localObject = paramString1 + "." + paramNode.getNodeName();
    paramString1 = paramString2 + "." + paramNode.getNodeName();
    label224:
    label240:
    label271:
    Node localNode;
    Integer localInteger;
    if (paramInt > 0)
    {
      paramString2 = localObject + paramInt;
      paramMap.put(paramString2, paramNode.getNodeValue());
      paramString1 = paramString1 + "#" + paramInt;
      paramMap.put(paramString1, paramNode.getNodeValue());
      localObject = paramNode.getAttributes();
      if (localObject != null)
      {
        paramInt = 0;
        if (paramInt < ((NamedNodeMap)localObject).getLength()) {
          break label391;
        }
      }
      localObject = new HashMap();
      paramNode = paramNode.getChildNodes();
      paramInt = 0;
      if (paramInt < paramNode.getLength())
      {
        localNode = paramNode.item(paramInt);
        localInteger = (Integer)((HashMap)localObject).get(localNode.getNodeName());
        if (localInteger != null) {
          break label497;
        }
      }
    }
    label391:
    label497:
    for (int i = 0;; i = localInteger.intValue())
    {
      a(paramMap, paramString2, paramString1, localNode, i);
      ((HashMap)localObject).put(localNode.getNodeName(), Integer.valueOf(i + 1));
      paramInt += 1;
      break label271;
      break;
      paramMap.put(localObject, paramNode.getNodeValue());
      paramMap.put(paramString1, paramNode.getNodeValue());
      paramString2 = (String)localObject;
      break label224;
      localNode = ((NamedNodeMap)localObject).item(paramInt);
      paramMap.put(paramString2 + ".$" + localNode.getNodeName(), localNode.getNodeValue());
      paramMap.put(paramString1 + ".$" + localNode.getNodeName(), localNode.getNodeValue());
      paramInt += 1;
      break label240;
    }
  }
  
  private static void h(Map<String, String> paramMap)
  {
    if (paramMap.size() <= 0) {
      System.err.println("empty values");
    }
    for (;;)
    {
      return;
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        System.err.println("key=" + (String)localEntry.getKey() + " value=" + (String)localEntry.getValue());
      }
    }
  }
  
  /* Error */
  public static Map<String, String> z(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +19 -> 20
    //   4: iconst_m1
    //   5: istore_2
    //   6: iload_2
    //   7: ifge +23 -> 30
    //   10: getstatic 118	java/lang/System:err	Ljava/io/PrintStream;
    //   13: ldc -84
    //   15: invokevirtual 125	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   18: aconst_null
    //   19: areturn
    //   20: aload_0
    //   21: bipush 60
    //   23: invokevirtual 176	java/lang/String:indexOf	(I)I
    //   26: istore_2
    //   27: goto -21 -> 6
    //   30: aload_0
    //   31: astore_3
    //   32: iload_2
    //   33: ifle +31 -> 64
    //   36: getstatic 118	java/lang/System:err	Ljava/io/PrintStream;
    //   39: new 40	java/lang/StringBuilder
    //   42: dup
    //   43: ldc -78
    //   45: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   48: iload_2
    //   49: invokevirtual 60	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   52: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokevirtual 125	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   58: aload_0
    //   59: iload_2
    //   60: invokevirtual 182	java/lang/String:substring	(I)Ljava/lang/String;
    //   63: astore_3
    //   64: aload_3
    //   65: ifnull -47 -> 18
    //   68: aload_3
    //   69: invokevirtual 185	java/lang/String:length	()I
    //   72: ifle -54 -> 18
    //   75: new 74	java/util/HashMap
    //   78: dup
    //   79: invokespecial 76	java/util/HashMap:<init>	()V
    //   82: astore 4
    //   84: invokestatic 191	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   87: astore_0
    //   88: aload_0
    //   89: invokevirtual 195	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   92: astore_0
    //   93: aload_0
    //   94: ifnonnull +13 -> 107
    //   97: getstatic 118	java/lang/System:err	Ljava/io/PrintStream;
    //   100: ldc -59
    //   102: invokevirtual 125	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   105: aconst_null
    //   106: areturn
    //   107: aload_0
    //   108: new 199	org/xml/sax/InputSource
    //   111: dup
    //   112: new 201	java/io/ByteArrayInputStream
    //   115: dup
    //   116: aload_3
    //   117: invokevirtual 205	java/lang/String:getBytes	()[B
    //   120: invokespecial 208	java/io/ByteArrayInputStream:<init>	([B)V
    //   123: invokespecial 211	org/xml/sax/InputSource:<init>	(Ljava/io/InputStream;)V
    //   126: invokevirtual 217	javax/xml/parsers/DocumentBuilder:parse	(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
    //   129: astore_0
    //   130: aload_0
    //   131: invokeinterface 222 1 0
    //   136: aload_0
    //   137: ifnonnull +13 -> 150
    //   140: getstatic 118	java/lang/System:err	Ljava/io/PrintStream;
    //   143: ldc -32
    //   145: invokevirtual 125	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   148: aconst_null
    //   149: areturn
    //   150: aload_0
    //   151: invokeinterface 228 1 0
    //   156: astore_0
    //   157: aload_0
    //   158: ifnonnull +13 -> 171
    //   161: getstatic 118	java/lang/System:err	Ljava/io/PrintStream;
    //   164: ldc -26
    //   166: invokevirtual 125	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   169: aconst_null
    //   170: areturn
    //   171: aload_1
    //   172: ifnull +41 -> 213
    //   175: aload_1
    //   176: aload_0
    //   177: invokeinterface 233 1 0
    //   182: invokevirtual 27	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   185: ifeq +28 -> 213
    //   188: aload 4
    //   190: ldc -21
    //   192: ldc -21
    //   194: aload_0
    //   195: iconst_0
    //   196: invokestatic 95	com/tencent/mm/c/f:a	(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lorg/w3c/dom/Node;I)V
    //   199: getstatic 10	com/tencent/mm/c/f:bxy	Z
    //   202: ifeq +8 -> 210
    //   205: aload 4
    //   207: invokestatic 237	com/tencent/mm/c/f:h	(Ljava/util/Map;)V
    //   210: aload 4
    //   212: areturn
    //   213: aload_0
    //   214: aload_1
    //   215: invokeinterface 241 2 0
    //   220: astore_0
    //   221: aload_0
    //   222: invokeinterface 83 1 0
    //   227: ifgt +13 -> 240
    //   230: getstatic 118	java/lang/System:err	Ljava/io/PrintStream;
    //   233: ldc -13
    //   235: invokevirtual 125	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   238: aconst_null
    //   239: areturn
    //   240: aload_0
    //   241: invokeinterface 83 1 0
    //   246: iconst_1
    //   247: if_icmple +11 -> 258
    //   250: getstatic 118	java/lang/System:err	Ljava/io/PrintStream;
    //   253: ldc -11
    //   255: invokevirtual 125	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   258: aload 4
    //   260: ldc -21
    //   262: ldc -21
    //   264: aload_0
    //   265: iconst_0
    //   266: invokeinterface 87 2 0
    //   271: iconst_0
    //   272: invokestatic 95	com/tencent/mm/c/f:a	(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lorg/w3c/dom/Node;I)V
    //   275: goto -76 -> 199
    //   278: astore_0
    //   279: aconst_null
    //   280: areturn
    //   281: astore_0
    //   282: aconst_null
    //   283: areturn
    //   284: astore_0
    //   285: aconst_null
    //   286: areturn
    //   287: astore_0
    //   288: aconst_null
    //   289: areturn
    //   290: astore_0
    //   291: aconst_null
    //   292: astore_0
    //   293: goto -157 -> 136
    //   296: astore_3
    //   297: goto -161 -> 136
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	300	0	paramString1	String
    //   0	300	1	paramString2	String
    //   5	55	2	i	int
    //   31	86	3	str	String
    //   296	1	3	localDOMException	org.w3c.dom.DOMException
    //   82	177	4	localHashMap	HashMap
    // Exception table:
    //   from	to	target	type
    //   88	93	278	javax/xml/parsers/ParserConfigurationException
    //   107	130	281	java/lang/Exception
    //   130	136	281	java/lang/Exception
    //   107	130	284	java/io/IOException
    //   130	136	284	java/io/IOException
    //   107	130	287	org/xml/sax/SAXException
    //   130	136	287	org/xml/sax/SAXException
    //   107	130	290	org/w3c/dom/DOMException
    //   130	136	296	org/w3c/dom/DOMException
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */