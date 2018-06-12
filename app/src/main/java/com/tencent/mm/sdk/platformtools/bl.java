package com.tencent.mm.sdk.platformtools;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public final class bl
{
  private static ThreadLocal<XmlPullParser> sJK = new ThreadLocal();
  
  public static String b(Node paramNode)
  {
    StringWriter localStringWriter = new StringWriter();
    try
    {
      Transformer localTransformer = TransformerFactory.newInstance().newTransformer();
      localTransformer.setOutputProperty("omit-xml-declaration", "yes");
      localTransformer.transform(new DOMSource(paramNode), new StreamResult(localStringWriter));
      return localStringWriter.toString();
    }
    catch (TransformerException paramNode)
    {
      for (;;)
      {
        x.e("MicroMsg.SDK.XmlParser", "nodeToString: %s", new Object[] { paramNode.getMessage() });
      }
    }
  }
  
  public static Map<String, String> z(String paramString1, String paramString2)
  {
    if (paramString1 == null) {}
    for (int i = -1; i < 0; i = paramString1.indexOf("<" + paramString2))
    {
      x.e("MicroMsg.SDK.XmlParser", "can not find the tag <%s>", new Object[] { paramString2 });
      return null;
    }
    String str = paramString1;
    if (i > 0) {
      str = paramString1.substring(i);
    }
    try
    {
      paramString1 = new a(str, paramString2).cjl();
      return paramString1;
    }
    catch (Exception paramString1)
    {
      x.printErrStackTrace("MicroMsg.SDK.XmlParser", paramString1, "[ %s ]", new Object[] { str });
    }
    return null;
  }
  
  private static final class a
  {
    private XmlPullParser sJL;
    private String sJM;
    private StringBuilder sJN = new StringBuilder();
    private Map<String, String> sJO;
    private Map<Integer, Integer> sJP;
    
    public a(String paramString1, String paramString2)
    {
      this.sJM = paramString2;
      paramString2 = (XmlPullParser)bl.cjk().get();
      this.sJL = paramString2;
      if (paramString2 == null)
      {
        paramString2 = bl.cjk();
        XmlPullParser localXmlPullParser = XmlPullParserFactory.newInstance().newPullParser();
        this.sJL = localXmlPullParser;
        paramString2.set(localXmlPullParser);
      }
      this.sJL.setInput(new StringReader(paramString1));
      this.sJP = new HashMap();
      this.sJO = new HashMap();
    }
    
    public final Map<String, String> cjl()
    {
      int i = this.sJL.getEventType();
      for (;;)
      {
        if (i != 1)
        {
          i = this.sJL.next();
          String str;
          if (i == 2)
          {
            this.sJN.append('.').append(this.sJL.getName());
            str = this.sJN.toString();
            int j = str.hashCode();
            Integer localInteger = (Integer)this.sJP.get(Integer.valueOf(j));
            if (localInteger != null)
            {
              localInteger = Integer.valueOf(localInteger.intValue() + 1);
              this.sJN.append(localInteger);
              this.sJP.put(Integer.valueOf(j), localInteger);
              str = str + localInteger;
            }
            for (;;)
            {
              this.sJO.put(str, "");
              j = 0;
              while (j < this.sJL.getAttributeCount())
              {
                this.sJO.put(str + ".$" + this.sJL.getAttributeName(j), this.sJL.getAttributeValue(j));
                j += 1;
              }
              this.sJP.put(Integer.valueOf(j), Integer.valueOf(0));
            }
          }
          else if (i == 4)
          {
            str = this.sJL.getText();
            if (str != null) {
              this.sJO.put(this.sJN.toString(), str);
            }
          }
          else if (i == 3)
          {
            this.sJN = this.sJN.delete(this.sJN.lastIndexOf("."), this.sJN.length());
            if (this.sJN.length() != 0) {}
          }
        }
        else
        {
          return this.sJO;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */